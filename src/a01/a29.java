package a01;

//29

public class a29 {

	public static final int PHYSICAL = 23;
	
	public static double GetVal(long days,int index,int max) {
		return max * Math.sin((days%index) * 2 * Math.PI / index);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days = 1200;
		double phyval = GetVal(days,PHYSICAL,100);
		System.out.printf("���� ��ü���� %1$.2f �Դϴ�.\n",phyval); //$1�� ù��° ���ڸ� ��Ī�Ѵ�.	
	}
}
