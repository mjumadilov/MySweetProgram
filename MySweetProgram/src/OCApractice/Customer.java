package OCApractice;    // what is the correct answer?

public class Customer{

	ElectricAccount acct = new ElectricAccount();

	public void useelectricity(double kWh) {

	acct.addKWh(kWh);

	}

	}

	public class ElectricAccount {

	private double kWh;

	private double rate = 0.7;

	private double bill;

	//line n1
	public void addKWh(double kWh) {

		if (kWh > 0){

		this.kWh += kWh;

		this.bill = this.kWh * this.rate;

		}

		}
	}