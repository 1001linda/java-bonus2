# Employee Salary Calculation
This Java project implements a simple employee management system that calculates monthly salaries for two types of employees: **SalaryEmployee** and **HourlyEmployee**. The program demonstrates class inheritance, encapsulation, and basic salary computation based on seniority and wage rate.

## Features
- Implements 4 classes:
  - `Employee` (base class)
  - `SalaryEmployee` (inherits `Employee`)
  - `HourlyEmployee` (inherits `Employee`)
  - `Bonus2` (main class with output logic)
- Demonstrates:
  - Use of constructors, setters/getters
  - Overridden salary calculation methods
  - ArrayList to store employee objects
  - Static method to present salary results
  - For-each loop for result display
 
  ## Salary Rules
  - **SalaryEmployee**:  
  - `raiseRate = 1 + (seniority / 100)`  
  - `salary = raiseRate × avgSalary`

- **HourlyEmployee**:  
  - `salary = wagePerHour × workingHours`
