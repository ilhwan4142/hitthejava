package a01;

//31��

public class a31 {
	
	public enum FRUIT{ //enum�� ����Ÿ���̴�.
		APPLE,BANANA,MANGO
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FRUIT pear = FRUIT.APPLE; //enum�� �ڷ������� ����� �� ������ enum ��� ���� �̷� ������� �ʱ�ȯ �Ѵ�.
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
