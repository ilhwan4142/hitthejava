package a01.a33;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double latitude1=37.52;	
		double longitude1=127.01;
		double latitude2=35.13;	
		double longitude2=129.04;
		
		Geo Getgeo1 = new Geo();
		Getgeo1.latitude = latitude1;
		Getgeo1.longitude = longitude1;
		System.out.println(Getgeo1.latitude+"\t"+Getgeo1.longitude);
		
		Geo Getgeo2 = new Geo();
		Getgeo2.latitude = latitude2;
		Getgeo2.longitude = longitude2;
		System.out.println(Getgeo2.latitude+"\t"+Getgeo2.longitude);
		
	}
}
