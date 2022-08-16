package p1;

public abstract class DB {
	
	protected String name;
	protected double cost, storage;
	static int count;
	
	DB(String name, double cost, double storage){
		setName(name);
		setCost(cost);
		setStorage(storage);
		count++;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public double getStorage() {
		return storage;
	}
	
	public void setStorage(double storage) {
		this.storage = storage;
	}
	
	public static void resetCount() {
		count=0;
	}
	
	public static int getCount() {
		return count;
	}
	
	public abstract double monthlyCost();

	@Override
	public String toString() {
		String s1=name+" monthly Cost: "+String.format("$%,.2f", monthlyCost());
		String s2="Storage: "+String.format("%.3f", getStorage())+"TB";
		String s3="Base Cost: "+String.format("$%,.2f", getCost());
		
		return s1+"/n"+s2+"/n"+s3;
	}
	
	
	

}
