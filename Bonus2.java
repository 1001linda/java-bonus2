import java.util.ArrayList;

public class Bonus2 {

	public static void main(String[] args) {
		Employee John = new SalaryEmployee("John", 2016, 45000);
		Employee Peter = new SalaryEmployee("Peter", 2020, 55000);
		Employee Jason = new HourlyEmployee("Jason", 2017, 400, 80);
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(John);
		employees.add(Peter);
		employees.add(Jason);
		
		
		for(Employee e : employees) {
			System.out.print(presentResult(e, 2021));
		}
		System.out.println();
		for(Employee e : employees) {
			System.out.print(presentResult(e, 2022));
		}

	}
	public static String presentResult(Employee e, int year) {
		String s = "";
		//檢查e是哪一種employee 再downcast
		if(e instanceof SalaryEmployee) {
			SalaryEmployee em = (SalaryEmployee) e;
			em.setSeniority(year - em.getOnboardYear());
			em.setRaiseRate();
			em.setSalary();
			
			s = String.format("%s's salary for %d: %.0f%n", em.getName(), year, em.getSalary());
		}else {
			HourlyEmployee em = (HourlyEmployee) e;
			em.setSalary();
			s = String.format("%s's salary for %d: %.0f%n", em.getName(), year, em.getSalary());
		}
		
		return s;
		
		
	}

}
