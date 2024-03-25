package t1_awt_baisc;

import java.awt.*;

// Frame 객체를 상속받아 작업 처리
public class Test2 extends Frame{
	
	// 기본 생성자, 객체를 생성 시에 UI설계 처리를 한다.
	public Test2() {
		// super("AWT 프레임"); 부모를 상속받았기 때문에 이렇게도 처리 가능
		setTitle("AWT 프레임");
		setSize(300, 250); // 프레임의 크기(폭, 높이) : 픽셀 단위
		
		setVisible(true);	// awt 프레임이라는 타이틀로 300,250크기의 창을 보여줘
	}
	
	
	
	public static void main(String[] args) {
		new Test2(); // 본인을 호출시키기
		
		
	}
}
