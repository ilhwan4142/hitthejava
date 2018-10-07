package a01;
//51번
public class a51 {

	public static String shifts(int n) {
		String s = "";
		int BITMASK = 1;
		for(int i=0; i<=31;i++) {
			s = (n & BITMASK) + s; //비트 연산자가 1번째 칸의 수와만 비교하는 사실에 대해 인지함 
			n>>=1;
		}
		return s;
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
