import java.time.LocalDate;

public class Employee {

	private String name;
	private long salary;
	private LocalDate birthday;
   private static int PensionAge=65;
	
	

	public Employee(String name, long salary, LocalDate age) {
		super();
		this.name = name;
		this.salary = salary;
		this.birthday = age;
	}
	
	public Employee(String name, LocalDate age) {
		super();
		this.name = name;
		this.birthday = age;
		this.salary = age.getYear()*10000;
	}

	
	public int getRemainingYearsUntilPension(){
		return LocalDate.now().getYear()-PensionAge-birthday.getYear();
	}
	 
	
	public static Employee getYoungerEmployee(Employee employee1, Employee employee2) {
		if (employee1.getRemainingYearsUntilPension()>employee2.getRemainingYearsUntilPension()) {
			return employee1;
		}
		else return employee2;
	}
	
	 private String convertToHungarianMonthName(int MonthValue) {
		 
		 String[] monthNames= new String[13];
		 monthNames[0]="Nothing";
		 monthNames[1]="Január";
		 monthNames[2]="Február";
		 monthNames[3]="Március"; 
		 monthNames[4]="Április";
		 monthNames[5]="Május";
		 monthNames[6]="Június";
		 monthNames[7]="Július";
		 monthNames[8]="Augusztus";
		 monthNames[9]="Szeptember";
		 monthNames[10]="Október";
		 monthNames[11]="November";
		 monthNames[12]="December";
		 
		 
		 
		 return monthNames[MonthValue];
	 }
	
	
	public void displayEmployeeInfo() {
		 System.out.println(name+", "+ getAge()+" : "+ convertToHungarianMonthName(birthday.getMonthValue())+" "+birthday.getDayOfMonth() );
	 }
	
	public int getAge() {
		return LocalDate.now().getYear()-birthday.getYear();
				}

	public void setAge(LocalDate age) {
		this.birthday = age;
	}

	public static int getPensionAge() {
		return PensionAge;
	}

	public static void setPensionAge(int pensionAge) {
		PensionAge = pensionAge;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", age=" + birthday + ", getRemainingYearsUntilPension()="
				+ getRemainingYearsUntilPension() + "]";
	}
	
	

	public String displayInfo(long salary, String name) {
	return "salary: "+salary+"name: "+name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public long getSalary() {
		return salary;
	}
	
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public boolean isInSalaryRange(long salaryStart, long salaryEnd, long employeeSalary) {
		
		if ((salaryStart <=employeeSalary)&& employeeSalary<salaryEnd) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public long returnTaxAmount(long employeeSalary) {
		return (long) (employeeSalary*0.16);
	}
	
	public boolean getsMoreSalary(long salary, Employee employee) {
		if (salary> employee.getSalary()) {
			return true;
		}
		else return false;
	}
	
	
	
	
}
