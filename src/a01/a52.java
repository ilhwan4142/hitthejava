package a01;
//52번
public class a52 {

	public static String shifts(int n) {
		String s = "";
		int BITMASK = 1;
		for(int i=0; i<=31;i++) {
			s = (n & BITMASK) + s;
			n>>=1;
		}
		return s.substring(s.indexOf('1'));
		//substring(a) : a번째 값부터 반환
		//indexOf(a) : 내용이 a인 위치를 반환
		//s.substring(s.indexOf('1')) : 내용이 '1'인 위치를 알려주고 거기서 부터 출력
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		num1=123;
		num2=-123;
		System.out.println(" "+num1+" : "+ shifts(num1));
		System.out.println(num2+" : "+ shifts(num2));
	}

}
