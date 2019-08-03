package day42;

public class F_CopyingA_VariableValue {

	public static void main(String[] args) {

		GDog d1 = new GDog();
		d1.name = "puppy";
		d1.breed = "pitbull";
		
		GDog yumak = d1;
	GDog d2 =d1;
	d2.name = "yumak";
	
	System.out.println(d1.name);
	
	d2 = new GDog();
	d2.name= "Mila";
	
	System.out.println(d1.name);
	}

}
