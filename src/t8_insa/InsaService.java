package t8_insa;

import java.util.*;

public class InsaService {
	InsaVO vo = null;

	// 오늘 날짜를 구하기
	public InsaVO getDefaultDate() {
		vo = new InsaVO();

		Calendar cal = Calendar.getInstance();
		vo.setCbYY(cal.get(Calendar.YEAR) + ""); // "" : 문자화 (toString 안올라올때는 이렇게 하면됨)
		vo.setCbMM((cal.get(Calendar.MONTH) + 1) + ""); // 월은 0월부터 나오기때문에 1을 더함
		vo.setCbDD(cal.get(Calendar.DATE) + "");

		return vo;
	}

}
