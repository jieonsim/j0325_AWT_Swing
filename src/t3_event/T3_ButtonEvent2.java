package t3_event;

import java.awt.*;
import java.awt.event.*;

public class T3_ButtonEvent2 extends Frame implements WindowListener, ActionListener {
	Button btnPlay, btnstop, btnExit, btnMessage;
	Label lblMessage;
	
	public T3_ButtonEvent2() {
		super("버튼 이벤트 연습");
		setLayout(new FlowLayout());
		setBounds(350, 300, 300, 250);
		
		// 버튼 객체 생성 및 배치
		btnPlay = new Button("Start");
		btnstop = new Button("Stop");
		btnExit = new Button("Exit");
		btnMessage = new Button("Message");
		
		add(btnPlay);
		add(btnstop);
		add(btnExit);
		add(btnMessage);
		
		// 레이블 생성 및 배치
		lblMessage = new Label();
		lblMessage.setSize(150,20);
		lblMessage.setBackground(Color.ORANGE);
		add(lblMessage);

		setVisible(true);
		
		addWindowListener(this);
		btnPlay.addActionListener(this);
		btnstop.addActionListener(this);
		btnExit.addActionListener(this);
		
	}

	public static void main(String[] args) {
		new T3_ButtonEvent2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btnText = (Button) e.getSource();
		
		if (btnText.getLabel().equals("Start")) {
//			System.out.println("시작 버튼을 누르셨군요");
			lblMessage.setText("시작 버튼 클릭");
			btnMessage.setLabel("시작 버튼 클릭");
		}
		else if (btnText.getLabel().equals("Stop")) {
//			System.out.println("정지 버튼을 누르셨군요");
			lblMessage.setText("정지 버튼 클릭");
			btnMessage.setLabel("정지 버튼 클릭");
		} else {
//			System.out.println("종료 버튼을 누르셨군요.");
			System.exit(0);
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
}
