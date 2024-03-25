package t5_adapter;

import java.awt.*;
import java.awt.event.*;

public class Test2 extends Frame {
	Button btnPlayStop; // 토글 이용. 한번 누르면 play. 다시 누르면 stop 되도록
	Button btnExit;
	
	public Test2() {
		super("어뎁터 연습");
		setLayout(new FlowLayout());
		setBounds(300, 350, 300, 280);
		
		btnPlayStop = new Button("Play");
		btnExit = new Button("Exit");
		add(btnPlayStop);
		add(btnExit);

		setVisible(true);

		btnPlayStop.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Button btnLabel = (Button) e.getSource();
				// getsource는 object니까 다운캐스팅 해야함
				
				// ↓ 토글 처리
				if (btnLabel.getLabel().equals("Play")) {
					btnLabel.setLabel("Stop");
					System.out.println("출발");
				}
				else if (btnLabel.getLabel().equals("Stop")) {
					btnLabel.setLabel("Play");
					System.out.println("정지");
				}
			}
		});
		
		
		
		// 종료는 가장 마지막에 위치하도록
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
		new Test2();
	}
}
