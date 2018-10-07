
public class a49 {
	public static Boolean isPrime(int a) { //에라토스테네스의 체 법칙을 알게 되었다.
		boolean isI = true;
		for(int i=2;i<=(int)Math.sqrt(a);i++) {
			if(a%i==0) {
				isI = false;
				break;
			}
		}
		return isI;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234567;
		boolean isV;
		isV = isPrime(num);
		if(isV)
			System.out.println("소수입니다.");
		else
			System.out.println("소수가 아닙니다.");
	}
}
