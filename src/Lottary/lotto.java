package Lottary;

import java.awt.BorderLayout;
import java.util.Collections;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JEditorPane;

public class lotto extends JFrame {
	int num1, num2, num3, num4, num5, num6;
	 String q1 ="", q2 ="", q3="", q4="", q5="", q6="";
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lotto frame = new lotto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public lotto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
        JLabel lbl = new JLabel(" 1    2      3       4      5      6     7");
		lbl.setBounds(12, 80, 172, 31);
		contentPane.add(lbl);
		setPreferredSize(new Dimension(200,80));
		Border border = BorderFactory.createLineBorder(Color.black);
		lbl.setBorder(border);
		
		JLabel lblNewLabel = new JLabel(" 8    9     10    11    12    13   14");
		lblNewLabel.setBounds(12, 109, 172, 31);
		contentPane.add(lblNewLabel);
		setPreferredSize(new Dimension(150,50));
		Border border1 = BorderFactory.createLineBorder(Color.BLACK);
		lblNewLabel.setBorder(border1);
		
		JLabel lblNewLabel_1 = new JLabel(" 15   16   17   18    19    20   21");
		lblNewLabel_1.setBounds(12, 138, 172, 31);
		contentPane.add(lblNewLabel_1);
		setPreferredSize(new Dimension(150,50));
		Border border11 = BorderFactory.createLineBorder(Color.BLACK);
		lblNewLabel_1.setBorder(border11);
		
		JLabel lblNewLabel_2 = new JLabel(" 22   23   24   25    26    27   28");
		lblNewLabel_2.setBounds(12, 167, 172, 31);
		contentPane.add(lblNewLabel_2);
		setPreferredSize(new Dimension(150,50));
		Border border111 = BorderFactory.createLineBorder(Color.BLACK);
		lblNewLabel_2.setBorder(border111);
		
		JLabel lblNewLabel_3 = new JLabel(" 29   30   31   32    33    34   35");
		lblNewLabel_3.setBounds(12, 198, 172, 31);
		contentPane.add(lblNewLabel_3);
		setPreferredSize(new Dimension(150,50));
		Border border1111 = BorderFactory.createLineBorder(Color.BLACK);
		lblNewLabel_3.setBorder(border1111);
		
		JLabel lblNewLabel_4 = new JLabel(" 36   37   38   39    40    41   42");
		lblNewLabel_4.setBounds(12, 227, 172, 31);
		contentPane.add(lblNewLabel_4);
		setPreferredSize(new Dimension(150,50));
		Border border2 = BorderFactory.createLineBorder(Color.BLACK);
		lblNewLabel_4.setBorder(border2);
		
		JLabel lblNewLabel_5 = new JLabel(" 43   44   45   46    47    48   49");
		lblNewLabel_5.setBounds(12, 256, 172, 31);
		contentPane.add(lblNewLabel_5);
		setPreferredSize(new Dimension(150,50));
		Border border3 = BorderFactory.createLineBorder(Color.BLACK);
		lblNewLabel_5.setBorder(border3);
		
		JLabel label = new JLabel("\u0427\u0438\u0441\u043B\u0430\u0442\u0430 6/49");
		label.setBounds(26, 51, 91, 16);
		contentPane.add(label);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(382, 145, 56, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(498, 145, 56, 16);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(382, 182, 56, 16);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(498, 182, 56, 16);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(382, 221, 56, 16);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(498, 221, 56, 16);
		contentPane.add(lblNewLabel_11);
		
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_6.setText(q1="");
				num1 = 1 + (int)  (Math.random()*48);
				q1 += num1;
				lblNewLabel_6.setText(q1);
				
				lblNewLabel_7.setText(q2="");
				num2 = 1 + (int)  (Math.random()*48);
				q2 += num2;
				lblNewLabel_7.setText(q2);
				
				
            }});
		btnNewButton_2.setBounds(254, 141, 97, 31);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel_8.setText(q3="");
				num3 = 1 + (int)  (Math.random()*48);
				q3 += num3;
				lblNewLabel_8.setText(q3);
				
				lblNewLabel_9.setText(q4="");
				num4 = 1 + (int)  (Math.random()*48);
				q4 += num4;
				lblNewLabel_9.setText(q4);
				
				
			}
		});
		btnNewButton.setBounds(254, 178, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel_10.setText(q5="");
				num5 = 1 + (int)  (Math.random()*48);
				q5 += num5;
				lblNewLabel_10.setText(q5);
				
				lblNewLabel_11.setText(q6="");
				num6 = 1 + (int)  (Math.random()*48);
				q6 += num6;
				lblNewLabel_11.setText(q6);
				
			
			}
		});
		btnNewButton_1.setBounds(254, 217, 97, 25);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(272, 14, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(413, 14, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(272, 48, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(413, 48, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(272, 84, 116, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(413, 84, 116, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setBounds(278, 304, 181, 16);
		contentPane.add(lblNewLabel_12);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				int b = Integer.parseInt(textField_1.getText());
				int c = Integer.parseInt(textField_2.getText());
				int d = Integer.parseInt(textField_3.getText());
				int f = Integer.parseInt(textField_4.getText());
				int j = Integer.parseInt(textField_5.getText());
			if(num1 == a && num1 == b && num1 == c && num1 == d && num1 == f && num1 == j && num2 == a && num2 == b && num2 == c && num2 == d && num2 == f && num2 == j ){
					//num3 == a && num3 == b && num3 == c && num3 == d && num3 == f && num3 == j && num4 == a && num4 == b && num4 == c && num4 == d && num4 == f && num4 == j &&
					//num5 == a && num5 == b && num5 == c && num5 == d && num5 == f && num5 == j && num6 == a && num6 == b && num6 == c && num6 == d && num6 == f && num6 == j){
				lblNewLabel_12.setText("Имате всички познати числа печелите 90 000 000 лв!");
			}
				
					
				
					
				
			}
		});
		btnNewButton_3.setBounds(169, 300, 97, 25);
		contentPane.add(btnNewButton_3);
		
		
		
		
		
		
	}
}
