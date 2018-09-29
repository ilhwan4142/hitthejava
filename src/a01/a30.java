package a01;

//30

public class a30 {

public static final int PHYSICAL = 23;
	
	public double GetVal(long days,int index,int max) {
		return max * Math.sin((days%index) * 2 * Math.PI / index);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days = 1200;
		a30 bio = new a30();
		double phyval = bio.GetVal(days, PHYSICAL, 100);
		System.out.printf("나의 신체지수 %1$.2f 입니다.\n",phyval); //$1은 첫번째 인자를 지칭한다.	
	}
}
