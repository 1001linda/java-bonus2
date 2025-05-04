
public class SalaryEmployee extends Employee{
	private double avgSalary;
	private double raiseRate;
	public SalaryEmployee(String name, int onboardYear, double avgSalary) {
		super(name, onboardYear);
		this.avgSalary = avgSalary;
	}
	
	public void setSalary() {
		salary = raiseRate * avgSalary;
	}
	public void setRaiseRate() {
		//100.0確保會是小數型態
		this.raiseRate = (1 + getSeniority()/100.0);
	}
	

	

}
