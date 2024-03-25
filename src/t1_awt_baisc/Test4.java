package t1_awt_baisc;

import java.awt.*;
import java.awt.event.*;

// 인터페이스를 이용한 종료 버튼 처리
public class Test4 extends Frame implements WindowListener, ActionListener {
// 클래스명에 컨트롤 + 1 하여 add unimplemented methods 하면 오버라이딩이 된다

	// 기본 생성자, 객체를 생성 시에 UI설계 처리를 한다.
	public Test4() {
		// super("AWT 프레임"); 부모를 상속받았기 때문에 이렇게도 처리 가능
		setTitle("AWT 프레임");
		setBounds(300, 200, 350, 250); // 프레임의 위치 / 크기(x축, y축, 폭, 높이) : 픽셀 단위

		// 레이블 컴포넌트 (레이블 테스트입니다 라는 문구를 출력하도록)
		Label lbl1 = new Label("레이블 테스트 입니다.");
		// this.add(lbl1);
		add(lbl1); // 메소드명 앞에 나오는 this는 생략 가능
		
		// 종료 버튼 클릭 시 종료되도록
		Button btnExit = new Button("종료");
		add(btnExit);
		
		setVisible(true); // 보여달라는 명령까지해야함

		// 리스너(윈도우 감지 부분 처리)
		addWindowListener(this);
		btnExit.addActionListener(this);

	}

	public static void main(String[] args) {
		new Test4();

	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0); // 실행 종료. (jvm 완전히 종료, 윈도우 창 닫기)
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
