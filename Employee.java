
public class Employee {
	private String name;
	private int onboardYear;
	private int seniority;
	protected double salary;
	public Employee(String name, int onboardYear){
		this.name = name;
		this.onboardYear = onboardYear;
	}
	public String getName() {
		return name;
	}
	public int getOnboardYear() {
		return onboardYear;
	}
	public int getSeniority() {
		return seniority;
	}
	public double getSalary() {
		return salary;
	}
	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}
	
	
	
}
