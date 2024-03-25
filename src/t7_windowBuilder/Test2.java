package t7_windowBuilder;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

public class Test2 extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public Test2() {
		super("회원가입");
		setSize(600,480);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(12, 10, 560, 55);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회 원 가 입");
		lblNewLabel.setBounds(192, 10, 132, 38);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 27));
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(12, 82, 560, 286);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setBounds(101, 83, 116, 21);
		pn2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(207, 5, 116, 21);
		pn2.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(328, 5, 116, 21);
		pn2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setBounds(449, 8, 24, 15);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		pn2.add(lblNewLabel_1);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(12, 378, 560, 53);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(231, 5, 97, 23);
		pn3.add(btnNewButton);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Test2();

	}
}
