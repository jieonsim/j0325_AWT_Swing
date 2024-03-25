package t6_swing;

import java.awt.event.*;

import javax.swing.*;

public class Test6_Button extends JFrame {
	JButton btnExit;

	public Test6_Button() {
		super("컴포넌트 연습");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setResizable(false);

		btnExit = new JButton("종료");
		add(btnExit);
		// ↑ 디자인
		
		setVisible(true); // 이걸 기준으로 위로는 UI 디자인, 아래는 메소드 명령어
		
		// ↓ 명령 코드
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnExit.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new Test6_Button();
	}
}
