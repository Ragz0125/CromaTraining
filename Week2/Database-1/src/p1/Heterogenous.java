package p1;

public class Heterogenous extends Distributed {
	
	public static final double COST_FACTOR=1.3;

	public Heterogenous(String name, double cost, double storage, double users, double costperuser){
		super(name, cost, storage, users, costperuser);
	}
	
	@Override
	public double monthlyCost() {
		
		return(cost + userCost()*COST_FACTOR);
	}
}
