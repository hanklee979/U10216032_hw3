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
import java.lang.NumberFormatException;

public class U10216032_hw3 extends JFrame {
	
	
	String name;
	int age;
	double weight;
	double height;	
	final double KILOGRAMS_PER_PPOUND = 0.45359237;
	final double METERS_PER_INCH = 0.0254;	
	private JPanel contentPane;
	
	
	private JTextField txt;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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

	// calculate BMI
	public double getBMI(){
		return weight / (height * height);
	}

	// get states of Underweight, Normal, Overweight or Obese by BMI
	public String getStatus(){
		double bmi = getBMI();
		if(bmi < 18.5){
			return "Underweight";
		}
		else if(bmi < 25){
			return "Normal";
		}
		else if(bmi < 30){
			return "Overweight";			
		}
		else {
			return "Obese";			
		}
	
	}	
	
	
	
	/**
	 * Create the frame.
	 */
	public U10216032_hw3() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		// push the button to calculate result and print it
		JButton btnCalculate = new JButton("calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				weight = Double.valueOf(txt.getText()) * KILOGRAMS_PER_PPOUND; // get weight(kilogram) , and turn it to double 
				height = Double.valueOf(textField.getText()) * METERS_PER_INCH; // get height(meter) , and turn it to double 
				age = Integer.valueOf(textField_3.getText()); // get age , and turn it to int 
				name = textField_4.getText(); // get name
			
				// show result
				System.out.println("name: " + name);
				System.out.println("age: " + age);		
				System.out.println("weight(kilogram): " + weight);		
				System.out.println("height(meter): " + height);					
				System.out.println("BMI: " + getBMI());				
				System.out.println("Status: " + getStatus() );				
			
				textField_1.setText( String.valueOf( getBMI() ) ); // turn BMI to string and print it on the interface
				textField_2.setText( getStatus() ); // print status on the interface 
			}
		});
		btnCalculate.setBounds(169, 198, 87, 23);
		contentPane.add(btnCalculate);
		
		
		// Input weight (pound)
		txt = new JTextField();
		txt.setBounds(20, 59, 96, 21);
		contentPane.add(txt);
		
		// Input height (inch)
		textField = new JTextField();
		textField.setBounds(155, 59, 96, 21);
		contentPane.add(textField);
		
		// print BMI
		textField_1 = new JTextField();
		textField_1.setBounds(289, 137, 135, 21);
		contentPane.add(textField_1);

		// print status
		textField_2 = new JTextField();
		textField_2.setBounds(289, 59, 135, 21);
		contentPane.add(textField_2);
		
		// Input age
		textField_3 = new JTextField();
		textField_3.setBounds(155, 137, 96, 21);
		contentPane.add(textField_3);
		
		// Input name
		textField_4 = new JTextField();
		textField_4.setBounds(20, 137, 96, 21);
		contentPane.add(textField_4);

		
		
		// print hints
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setBounds(289, 113, 46, 15);
		contentPane.add(lblBmi);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(289, 34, 46, 15);
		contentPane.add(lblStatus);
				
		JLabel lblAge = new JLabel("age");
		lblAge.setBounds(155, 113, 46, 15);
		contentPane.add(lblAge);
		
		JLabel lblInputWeightpound = new JLabel("Input weight (pound)");
		lblInputWeightpound.setBounds(20, 34, 125, 15);
		contentPane.add(lblInputWeightpound);
		
		JLabel lblInputHeight = new JLabel("Input height (inch)");
		lblInputHeight.setBounds(155, 34, 124, 15);
		contentPane.add(lblInputHeight);		
		
		JLabel lblName = new JLabel("name");
		lblName.setBounds(20, 113, 46, 15);
		contentPane.add(lblName);
		

	}
}
