package p1;

public class Centralized extends DB{
	
	private double license;

	public Centralized(String name, double cost, double storage, double license) {
		super(name, cost, storage);
		setLicense(license);
	}

	public double getLicense() {
		return license;
	}

	public void setLicense(double license) {
		this.license = license;
	}
	
	@Override
	public double monthlyCost() {
		return (cost+license);
	}
	
	@Override
	public String toString() {
		String s1 = super.toString();
		String s2 = "License" + String.format("$%,.2f",getLicense());
		return s1+s2;
	}
	
	

}
