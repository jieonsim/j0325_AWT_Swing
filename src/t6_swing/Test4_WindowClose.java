package t6_swing;

import javax.swing.*;

// 어댑터를 이용한 스윙 종료
public class Test4_WindowClose extends JFrame {

	public Test4_WindowClose() {
		super("스윙 연습4");

		setBounds(300, 250, 300, 250);

		setVisible(true);

		// 윈도우 창 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Test4_WindowClose();

	}
}