package t8_insa;

import java.util.*;

public class SecondMinute {
	public static void main(String[] args) {
		Scanner scnaner = new Scanner(System.in);
		System.out.println("[시간 hour, 분 minute, 초 second 간 데이터 변환 실시]");

		/*
		 * [설 명] 1. type 매개변수 - 시간(H), 분(M), 초(S) 인지 타입을 정한다 2. 시간 타입은 24시간 형태로 정한다 -
		 * 오후1시는 13시
		 */
		int hour = 1;
		int min = 10;
		int sec = 60;
		
		

//		System.out.println(hour + "시간 > 초 : " + getSec("H", hour));
		System.out.println(min + "분 > 초 : " + getSec("M", min));
//		System.out.println(sec + "초 > 초 : " + getSec("S", sec));

		System.out.println();

		System.out.println(hour + "시간 > 분 : " + getMin("H", hour));
		System.out.println(min + "분 > 분 : " + getMin("M", min));
		System.out.println(sec + "초 > 분 : " + getMin("S", sec));

		System.out.println();

		System.out.println(hour + "시간 > 시 : " + getHour("H", hour));
		System.out.println(min + "분 > 시 : " + getHour("M", min));
		System.out.println(sec + "초 > 시 : " + getHour("S", sec));

	}

	// === 초 단위를 얻는 메소드 ===
	public static String getSec(String type, int data) {
		double value = 0.0;
		if (type.equals("H")) { // 시간일경우
			value = (double) data * 3600;
		} else if (type.equals("M")) { // 분일경우
			value = (double) data * 60;
		} else if (type.equals("S")) { // 초일경우
			// 초에서 초로 변환은 그대로 출력
			value = data;
		}
		return String.valueOf(value);
	}

	// === 분 단위를 얻는 메소드 ===
	public static String getMin(String type, int data) {
		double value = 0.0;
		if (type.equals("H")) { // 시간일경우
			value = (double) data * 60;
		} else if (type.equals("M")) { // 분일경우
			// 분에서 분으로 변환은 그대로 출력
			value = data;
		} else if (type.equals("S")) { // 초일경우
			value = (double) data / 60;
		}
		return String.valueOf(value);
	}

	// === 시간 단위를 얻는 메소드 ===
	public static String getHour(String type, int data) {
		double value = 0.0;
		if (type.equals("H")) { // 시간일경우
			// 시간에서 시간으로 변환은 그대로 출력
			value = data;
		} else if (type.equals("M")) { // 분일경우
			value = (double) data / 60;
		} else if (type.equals("S")) { // 초일경우
			value = (double) data / 3600;
		}
		return String.valueOf(value);
	}

}
