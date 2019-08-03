package day44Akbar;


public class AJob {

	private String title;
	private String company;
	private double annualSalary;
	
	public AJob() {
		
		//System.out.println("Message from : Job()");
		title = "undefined";
		company = "unknown";
	}
	public AJob(String title) {
		this.title = title;
	//	System.out.println("Message from : Job(String title)");

	}
	
	public AJob(String title, String company, double annualSalary) {
	//	System.out.println("Message from : Job(String title, String company, long annualSalary)");

		this.title = title;
		this.company= company;
		this.annualSalary = annualSalary;
	}
	
	
	/*public String toString() {

		String allFields = "Title: "+ this.title + 
		" | Company: "+ this.company+" | Annual Salary : "
		+ this.annualSalary;  
		return allFields;
	}
	*/
	
	
	public String getTitle() {
		return title;
	}
	@Override
	public String toString() {
		return "AJob [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	
}