package a01;

//28번

public class a01 {

	public static final int PHYSICAL = 23;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = PHYSICAL;
		int days = 1200;
		double phyval = 100 * Math.sin((days%index) * 2 * Math.PI / index);
		System.out.printf("나의 신체지수 %1$.2f 입니다.",phyval); //$1은 첫번째 인자를 지칭한다.
		
	}
}