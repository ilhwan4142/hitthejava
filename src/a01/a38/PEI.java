package a01.a38;

public enum PEI{
	PHYSICAL(23), EMOTIONAL(28), INTELLECTUAL(33);
	private final int peiValue; //상수 값을 굳이 선언 시에 초기화 해줄 필요 없이 생성자에서 초기화를 할 수 있다.
	PEI(int pie){
		this.peiValue=pie; //peiValue에 받아온 pie값을 저장
	}
	public int getPei(){ //peiValue는 프라이빗이기에 이 메소드를 이용해 값을 받아옴
		return peiValue; //peiValue 값 받아옴
	}
}
enum FRUIT{ //전에 썼던 enum(이번엔 안씀)
	APPLE, BANANA, MANGO
}