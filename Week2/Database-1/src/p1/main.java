package p1;

public class main {
	
	public static void main(String args[]) {
	
	Centralized c1 = new Centralized("Database one", 1400.00, 5.00, 1000.00);
	c1.toString();
	
	Distributed d1 = new Distributed("Database 2", 1400.00, 5.00, 1000.00, 12.1);
	d1.toString();
	
	Homogeneous h1 = new Homogeneous("Database 2", 1400.00, 5.00, 1000.00, 13.1);
	h1.toString();
	
	Heterogenous h2 = new Heterogenous("Database 2", 1400.00, 5.00, 1000.00, 13.1);
	h2.toString();
	
	System.out.println(h2.getCount());

	}
	
}
