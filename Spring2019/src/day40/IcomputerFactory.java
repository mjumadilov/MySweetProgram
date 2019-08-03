package day40;

public class IcomputerFactory {

	public static void main(String[] args) {

		
		
		HComputer iMac = new HComputer();
		HComputer MacBookPro = new HComputer();
		HComputer dell = new HComputer();
		
		System.out.println(iMac == MacBookPro);
		System.out.println("-----IMAC-----");
		
		iMac.color = "Silver";
		System.out.println(iMac.type);
		iMac.type = "IMAC 27'"; 
		System.out.println(iMac.type);
		
	}

}
