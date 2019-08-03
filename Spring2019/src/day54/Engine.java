package day54;

public class Engine {

	final String engineType;
	final int cylinder;
	
	public Engine(String engineType, int cylinder) {
		super();
		this.engineType = engineType;
		this.cylinder = cylinder;
	}
	
	public void start() {
		System.out.println();
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + 
	engineType + ", cylinder=" + 
				cylinder + "]";
	}
	
	
	
}
