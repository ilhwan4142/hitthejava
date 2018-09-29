package a01;

//31번

public class a31 {
	
	public enum FRUIT{ //enum은 열거타입이다.
		APPLE,BANANA,MANGO
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FRUIT pear = FRUIT.APPLE; //enum은 자료형으로 사용할 수 있으면 enum 상수 값을 이런 방식으로 초기화 한다.
		FRUIT pear2 = FRUIT.MANGO;
		System.out.println(pear);
		System.out.println(pear.name());
		System.out.println(pear.ordinal());
		System.out.println(pear2.name());
		System.out.println(pear2.ordinal());
		FRUIT[] fruits = FRUIT.values();
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
	}
}
