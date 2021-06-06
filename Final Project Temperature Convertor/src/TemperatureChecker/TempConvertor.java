package TemperatureChecker;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class TempConvertor
{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					TempConvertor window = new TempConvertor();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TempConvertor()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame =  new JFrame();
		frame.setBounds(100, 100, 515, 318);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Temperature Convertor");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 30));
		lblNewLabel.setBounds(92, 31, 363, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select Temp. Type ");
		lblNewLabel_1.setBounds(10, 79, 133, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Degree Celsius", "Fahrenheit"}));
		comboBox.setBounds(167, 79, 158, 25);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s =" " +comboBox.getItemAt(comboBox.getSelectedIndex());
				textField.setText(s);
			}
		});
		btnNewButton.setBounds(335, 79, 53, 18);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Selected temperature  is ");
		lblNewLabel_2.setBounds(10, 120, 147, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setBounds(167, 115, 161, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Enter theTemperature ");
		lblNewLabel_3.setBounds(10, 161, 130, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(167, 156, 161, 25);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Result:");
		lblNewLabel_4.setBounds(57, 191, 86, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(167, 188, 161, 25);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Double a=Double.parseDouble(textField_1.getText());
				if (textField.getText().equals("Degree Celsius")) {
					
					double x=(9*a)/5+32;
					textField_2.setText(x+"F");
					
				}else { 
					double y=(a-32)/9*5;
					textField_2.setText(y+"C"); 
				}
				}catch(Exception e) {
					JOptionPane.showMessageDialog(frame, "Please Enter A Valid Number");
				}
			}
		});
		btnNewButton_1.setBounds(188, 230, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
