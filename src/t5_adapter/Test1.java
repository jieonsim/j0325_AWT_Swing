package t5_adapter;

import java.awt.*;
import java.awt.event.*;

public class Test1 extends Frame {
	Button btnExit;
	
	public Test1() {
		super("어뎁터를 활용한 종료");
		setBounds(300, 350, 300, 280);
		
		btnExit = new Button("Exit");
		add(btnExit);

		setVisible(true);

		// 어댑터를 이용한 윈도우 종료 (익명 이너 클래스)
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		// 버튼 클릭 시 익명 클래스를 이용한 종료
		btnExit.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new Test1();
	}
}
