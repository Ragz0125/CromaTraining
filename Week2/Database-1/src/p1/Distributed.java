package p1;

public class Distributed extends DB {
	
	protected double users, costperuser;
	
	public static final double COST_FACTOR=1.1;

	public Distributed(String name, double cost, double storage, double users, double costperuser) {
		super(name, cost, storage);
		this.users = users;
		this.costperuser = costperuser;
	}

	public double getUsers() {
		return users;
	}

	public void setUsers(double users) {
		this.users = users;
	}

	public double getCostperuser() {
		return costperuser;
	}

	public void setCostperuser(double costperuser) {
		this.costperuser = costperuser;
	}
	
	public double userCost() {
		return(users*costperuser);
	}
	
	@Override
	public double monthlyCost() {
		return (cost+userCost()*COST_FACTOR);
	}
	
	@Override
	public String toString() {
		String s1=super.toString();
		String s2="Number of Users: " + users;
		String s3="Cost per User: "+String.format("$%,.2f", costperuser);
		String s4="User Cost: "+String.format("$%,.2f",userCost());
		String s5="Cost Factor: "+COST_FACTOR;
		return s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5;
	}
	
	
	
	
}
