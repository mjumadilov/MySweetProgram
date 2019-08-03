package repl;

import java.util.Scanner;

public class ExLaoptop {

	public static void main(String[] args) {
		 String storageType, screenType, cpu, resolution;
	        int ram = 0 ;
	        int memory=0 ;
	        double price=0;
	        Scanner scan = new Scanner(System.in);

	        System.out.println("Select screen size:");
	        screenType=scan.nextLine();
	        switch (screenType) {
	            case "13.3" :
	                price+=200;
	                break;
	            case "15.0" :
	                price+=300;
	                break;
	            case "17.3" :
	                price+=400;
	                break;
	            default:
	        }
	        System.out.println("Select CPU type:");
	        cpu=scan.nextLine();
	        switch (cpu) {
	            case "i3" :
	                price+=150;
	                break;
	        
	            case "i5" :
	               price+=250;
	               break;
	           case "i7" :
	               price+=350;
	               break;
	           default:
	        }
	       
	        System.out.println("Select RAM size:");
	        ram=scan.nextInt();
	       
	        price=price+((ram/4)*50);
	        scan.nextLine();
	       
	        System.out.println("Select storage type:");
	        storageType=scan.nextLine();
	        
	        System.out.println("Enter memory size:");
	        memory=scan.nextInt();
	        scan.nextLine();
	        switch (storageType) {
	        case "HDD" :
	            price=+((memory/500)*50);
	            break;
	        case "SSD" :
	            price=+((memory/500)*100);
	            break;
	        default:
	        }
	    
	        System.out.println("Enter screen resolution:");
	        resolution=scan.nextLine();
	        switch (resolution) {
	        case "FULLHD" :
	            price=+100;
	            break;
	        case "4K" :
	            price=+200;
	            break;
	        default:
	        }
	        


	        System.out.println("Laptop price is: "+"$"+price);
	        
	        scan.close();
	    }

	}