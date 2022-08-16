package p1;

public class Homogeneous extends Distributed{
	
	public static final double COST_FACTOR=1.2;

	public Homogeneous(String name, double cost, double storage, double users, double costperuser){
		super(name, cost, storage, users, costperuser);
	}
	
	@Override
	public double monthlyCost() {
		
		return(cost + userCost()*COST_FACTOR);
	}
	
}
