package repl;


import java.util.Scanner;


public class Laptop {

	public static void main(String[] args) {
		double screenSize, price=0;
		String storageType, screenType, cpu, resolution;
		int memory, ram;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Select screen size:");
		screenSize = scan.nextDouble();
		if(screenSize == 13.3) {
			price+=200;
		}else if (screenSize == 15.0) {
			price+=300;
		}else if (screenSize == 17.3) {
			price+=400;
		}
		
		System.out.println("Select CPU size: ");
		cpu = scan.next();
		if(cpu.equals("i3")) {
			price+=150;
		}else if (cpu.equals("i5")){
				price+=250;
			}else if (cpu.equals("i7"))
				price+=350;{				
			}
				
		System.out.println("Select RAM size");
		ram = scan.nextInt();
		price+=((ram/4)*50);
		
		
		
		System.out.println("Select storage type:");
			storageType = scan.next();
	
		System.out.println("Enter memory size:");
	        memory=scan.nextInt();
	    if(storageType.equalsIgnoreCase("HDD")) {
		price+=((memory/500)*50);
	    }else if (storageType.equalsIgnoreCase("SSD")) {
		price+=((memory/500)*100);
	}
	      		
	    System.out.println("Enter screen resolution ");
	    resolution = scan.next(); 
	    if(resolution.equalsIgnoreCase("4k")) {
		price+=200;
	    }else if(resolution.equalsIgnoreCase("FULLHD")) {
		price+=100;
	}
	
		        
	    System.out.println("Laptop price is: " + price);		
		}
	
	}
		
		
	





