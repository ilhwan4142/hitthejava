package a01;

//28��

public class a01 {

	public static final int PHYSICAL = 23;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = PHYSICAL;
		int days = 1200;
		double phyval = 100 * Math.sin((days%index) * 2 * Math.PI / index);
		System.out.printf("���� ��ü���� %1$.2f �Դϴ�.",phyval); //$1�� ù��° ���ڸ� ��Ī�Ѵ�.
		
	}
}
