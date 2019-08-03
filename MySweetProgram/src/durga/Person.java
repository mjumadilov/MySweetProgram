package durga;

class Vehicle
{
	int x;
	Vehicle()
	{
		this(10);// line-1
	}
	Vehicle(int x)
	{
		this.x=x;
	}
}
class Car extends Vehicle
{
	int y;
	Car()
	{
		super();
		this(20);//line-2
	}
	Car(int y)
	{
		this.y= y;
	}
	public String toString()
	{
		return super.x+":"+this.y;
	}

Vehicle v= new Car();
System.out.println(v);
}
