package a01;

//32번

public class a32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double latitude1=37.52;	
		double longitude1=127.01;
		double latitude2=35.13;	
		double longitude2=129.04;
		System.out.println(latitude1+"\t"+longitude1);
		//1차원 배열
		double[] latlon1= {latitude1,longitude1};
		double[] latlon2= {latitude2,longitude2};
		System.out.println(latlon1[0]+"\t"+latlon1[1]);
		//2차원 배열
		double[][] latlon= {{latitude1,longitude1},{latitude2,longitude2}};
		System.out.println(latlon[0][0]+"\t"+latlon[0][1]);
	}
}
