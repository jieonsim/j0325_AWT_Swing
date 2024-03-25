package t6_swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Test7_BorderLayout extends JFrame {
	JPanel pn1;
	JButton btn1, btn2, btn3, btn4, btn5;

	public Test7_BorderLayout() {
		super("BorderLayout 연습");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setResizable(false);

		pn1 = new JPanel();
		pn1.setLayout(null); // setlayout을 사용자 정의 지정하겠다

		btn1 = new JButton("북");
		btn2 = new JButton("남");
		btn3 = new JButton("서");
		btn4 = new JButton("동");
		btn5 = new JButton("중앙(종료)");

		setLayout(new BorderLayout());

		btn5.setBounds(10, 50, 150, 30);
		pn1.add(btn5);

		add(btn1, BorderLayout.NORTH);
		add(btn2, BorderLayout.SOUTH);
		add(btn3, BorderLayout.WEST);
		add(btn4, BorderLayout.EAST);
//		add(btn5, BorderLayout.CENTER);
		add(pn1, BorderLayout.CENTER);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new Test7_BorderLayout();
	}
}
