package t1_awt_baisc;

import java.awt.*;
import java.awt.event.*;

// 인터페이스를 이용한 종료 버튼 처리
public class Test5 extends Frame implements WindowListener { // 리스너의 도움 받기
// Test3에 컨트롤 + 1 하여 add unimplement 하면 오버라이딩이 된다

	// 기본 생성자, 객체를 생성 시에 UI설계 처리를 한다.
	public Test5() {
		// super("AWT 프레임"); 부모를 상속받았기 때문에 이렇게도 처리 가능
		setTitle("AWT 프레임");
		setBounds(300, 200, 350, 250); // 프레임의 위치 / 크기(x축, y축, 폭, 높이) : 픽셀 단위

		setVisible(true); // awt 프레임이라는 타이틀로 300,250크기의 창을 보여줘

		addWindowListener(this); // 감지기
		// 나를 감시해줘. 아래 오버라이딩 메소드를 동작하는지 감시해줘

	}

	public static void main(String[] args) {
		new Test5(); // 본인을 호출시키기

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
}
