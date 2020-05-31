import java.util.Calendar;
//Calendar클래스
//달력을 표현한 클래스로 추상 클래스이므로 new 연산자를 사용해서 인스턴스를 생성할 수 없음
//Calendar 클래스의 정적 메소드인 getInstance()메소드를 이용하여 현재 운영체제에 설정되어 있는 시간대를 기준으로한 Calendar 하위 객체를 얻을 수 있음
public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY :
				strWeek = "월";
				break;
			case Calendar.TUESDAY :
				strWeek = "화";
				break;
			case Calendar.WEDNESDAY :
				strWeek = "수";
				break;
			case Calendar.THURSDAY :
				strWeek = "목";
				break;
			case Calendar.FRIDAY :
				strWeek = "금";
				break;
			case Calendar.SATURDAY :
				strWeek = "토";
				break;
			default :
				strWeek = "일";
				break;
		}//switch()
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}//if
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + month + "월 "+ day + "일");
		System.out.println(strWeek + "요일 " + strAmPm );
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}//main()
}//Class
