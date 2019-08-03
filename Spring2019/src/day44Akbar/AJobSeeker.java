package day44Akbar;

import java.util.ArrayList;
import java.util.List;

public class AJobSeeker {

	public static void main(String[] args) {

		AJob j1 = new AJob();
		AJob j2 = new AJob("Senior Sdet");
		AJob j3 = new AJob("Scrum Master", "Oracle", 130000);
		AJob j4 = new AJob("Sdet", "Santander", 125000);
		AJob j5 = new AJob("Tester", "Google", 100000.0);
		AJob j6 = new AJob("Programmer", "Apple", 2000000);

	//	System.out.println(j1.getAnnualSalary());
	//	System.out.println(j1.getTitle());
	//	System.out.println(j1.toString());
	//	System.out.println(j2.toString());
	//	System.out.println(j3.toString());
	//	System.out.println(j4.toString());
	//	System.out.println(j5.toString());
// if we print out any reference variable directly, it will by default call j6.toString()
	//	System.out.println(j6);

		List<AJob> jobs = new ArrayList<>();
		jobs.add(new AJob("Programmer", "Apple", 2000000));
		jobs.add(j1);
		jobs.add(j2);
		jobs.add(j3);
		jobs.add(j4);
		jobs.add(j5);
		//jobs.add(j6);
		//System.out.println(jobs);
		//System.out.println(jobs.get(0));
		
		for(AJob each:jobs) {
			System.out.println(each);
		}

		System.out.println("--------------------");
		for (int i = 0; i < jobs.size(); i++) {
			System.out.println(jobs.get(i));
		}
	}

}