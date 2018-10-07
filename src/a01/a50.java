package a01;
//50번
public class a50 {
	
	public static String shifts(int n) {
		String s = "";
		for(int i=0; i<=31;i++) {
			int nn = n%2;
			s=(nn>=0)?nn+s:(-nn)+s;
			n>>=1; //나누기가 아니라 비트 이동이기 때문에 포문이 2번째 돌때는 나누는 수가 둘이 달라짐
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
