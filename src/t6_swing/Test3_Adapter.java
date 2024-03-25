package t6_swing;

import java.awt.event.*;

import javax.swing.*;

// 어댑터를 이용한 스윙 종료
public class Test3_Adapter extends JFrame {

	public Test3_Adapter() {
		super("스윙 연습3");

		setBounds(300, 250, 300, 250);

		setVisible(true);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new Test3_Adapter();

	}
}