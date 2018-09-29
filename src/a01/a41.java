package a01;

//41번

public class a41 {
	
	public boolean isIdjy(int year) { //부울형 메소드나 인자는 선언할 때 is(대문자)식으로 작성
		boolean isV = false;	//is -> ~이냐 라고 묻는 형식일 때 사용
		if (((year%4==0)&&(year%100!=0))||(year%400==0)){
			isV = true;
		}
		return isV;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a41 hc = new a41(); //a41 클래스의 부울리언 메소드 isIdjy를 사용하기 위한 객체 생성
		System.out.println(hc.isIdjy(2016)); //객체.메소드 형식으로 호출
		
	}

}