package a01;

import java.util.List; //awt 클래스에서 List를 받아오면 아래의 List형식 선언으로 사용할 수가 없다. util로 하도록
import java.util.ArrayList;

//56번
public class a56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ilist = new ArrayList<>();
		for(int i=1;i<11;i++) {
			ilist.add(i);
		}
		System.out.println(ilist);
	}
}
