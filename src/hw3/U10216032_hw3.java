package hw3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class U10216032_hw3 extends JFrame {

	private JPanel contentPane;
	private JTextField txt;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U10216032_hw3 frame = new U10216032_hw3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}

	public double getBMI(){
		return ;
	}

	public String getStatus(){
		return ;
	}	
	
	/**
	 * Create the frame.
	 */
	public U10216032_hw3() {
		
		String name;
		int age;
		double weight;
		double height;
		final double KILOGRAMS_PER_PPOUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		// push the button to calculate result and print it
		JButton btnCalculate = new JButton("calculate");
		btnCalculate.setBounds(169, 198, 87, 23);
		contentPane.add(btnCalculate);
		
		
		// Input weight (pound)
		txt = new JTextField();
		txt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		txt.setBounds(20, 59, 96, 21);
		contentPane.add(txt);
		txt.setColumns(10);
		

		
		// Input height
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setBounds(155, 59, 96, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		// print BMI
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_1.setBounds(251, 137, 96, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
		// print status
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		textField_2.setBounds(70, 137, 96, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
		// input age
		textField_3 = new JTextField();
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_3.setBounds(289, 59, 96, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		
		// print hints
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setBounds(249, 113, 46, 15);
		contentPane.add(lblBmi);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(70, 113, 46, 15);
		contentPane.add(lblStatus);
				
		JLabel lblAge = new JLabel("age");
		lblAge.setBounds(289, 34, 46, 15);
		contentPane.add(lblAge);
		
		JLabel lblInputWeightpound = new JLabel("Input weight (pound)");
		lblInputWeightpound.setBounds(20, 34, 111, 15);
		contentPane.add(lblInputWeightpound);
		
		JLabel lblInputHeight = new JLabel("Input height (inch)");
		lblInputHeight.setBounds(155, 34, 95, 15);
		contentPane.add(lblInputHeight);		
	}
}
