import java.time.LocalDate;
import java.util.Scanner;

import com.sun.jmx.remote.util.EnvHelp;

public class Main {

	public static void main(String[] args) {
main1();

	}
	
	public static void main1() {
		
		
		Employee employee= new Employee("Cica", LocalDate.of(1995, 5,9));
		employee.displayEmployeeInfo();
		
		
		
		
//		Scanner scanner= new Scanner(System.in);
//		int numberOfEmployees= scanner.nextInt();
//		Employee[] employeeArray= new Employee[numberOfEmployees];
//		for (int i = 0; i < employeeArray.length; i++) {
//			System.out.println("Please enter the name of the employee!");
//			String employeeName=scanner.next();
//			System.out.println("Please enter the age of the employee!");
//			int employeeAge= scanner.nextInt();
//			
//			employeeArray[i]= new Employee(employeeName, employeeAge);	
//		}
//		
//		for (Employee employee : employeeArray) {
//			System.out.println(employee);
//		}
//		Employee.setPensionAge(72);
//		
//		for (Employee employee : employeeArray) {
//			System.out.println(employee);
//		}
//		
//		for (Employee employee : employeeArray) {
//			if (employee.getRemainingYearsUntilPension()<5) {
//				System.out.println(employee);
//			}
//		}
//		
//		for (int i = 0; i < employeeArray.length; i++) {
//			
//			int max=i;
//			for (int j = i+1; j < employeeArray.length; j++) {
//				if (employeeArray[max].getRemainingYearsUntilPension()<employeeArray[j].getRemainingYearsUntilPension()) {
//					max=j;
//				}
//
//				
//			Employee tempEmployee=new Employee(employeeArray[i].getName(), employeeArray[i].getAge());
//		employeeArray[i]= new Employee(employeeArray[max].getName(), employeeArray[max].getAge());
//		employeeArray[max]= new Employee(tempEmployee.getName(), tempEmployee.getAge());
//			}
//		}
//		
//	for (int i = 0; i < employeeArray.length; i++) {
//			
//			int min=i;
//			for (int j = i+1; j < employeeArray.length; j++) {
//				if (employeeArray[min].getRemainingYearsUntilPension()>employeeArray[j].getRemainingYearsUntilPension()) {
//					min=j;
//				}
//
//				
//			Employee tempEmployee=new Employee(employeeArray[i].getName(), employeeArray[i].getAge());
//		employeeArray[i]= new Employee(employeeArray[min].getName(), employeeArray[min].getAge());
//		employeeArray[min]= new Employee(tempEmployee.getName(), tempEmployee.getAge());
//			}
//		}
//		
//	 for (Employee employee : employeeArray) {
//		System.out.println(employee);
//	}
//	
//	}
//	public static void main2() {
////		Worker worker= new Worker();
////		worker.salary=1000;
////		worker.name="Paraszt";
////		worker.salary=worker.increaseSalary(worker.salary, 2000);
////		System.out.println(worker.displayInfo(worker.salary, worker.name));
//
////		worker.setName("Paraszt");
////		worker.setSalary(3000);
////		System.out.println(worker.displayInfo(worker.getSalary(), worker.getName()));
//		
//		
//		Employee[] employeeArray = new Employee[10];
//		
//		
//		
//		
//		for (int i = 0; i < employeeArray.length; i++) {
//			System.out.println("Please enter the name and salary of the "+(i+1)+". employee");
//			
//			employeeArray[i]= new Employee("kemeny", 21);	
//			
//			employeeArray[i].setSalary(i*2000+i*500);
//			 employeeArray[i].setName("MindlessWorker"+i);
//			 
//			
//		}
//		
//		
//		int max=0;
//		for (int i = 1; i < employeeArray.length-1; i++) {
//			if (employeeArray[max].getsMoreSalary(employeeArray[max].getSalary(), employeeArray[i])) {
//				max=i;
//			}
//		}
//		
//		int counter=0;
//		long salaryStart=4000;
//		long salaryEnd=10000;
//		for (Employee employee : employeeArray) {
//			if(employee.isInSalaryRange(salaryStart, salaryEnd, employee.getSalary()))
//				counter++;
//
//		}
//		
//		long sum=0;
//		
//		for (Employee employee : employeeArray) {
//			sum+=employee.getSalary();
//		}
//		sum/=employeeArray.length;
//		
//		long taxSum=0;
//		for (Employee employee : employeeArray) {
//			taxSum+=employee.returnTaxAmount(employee.getSalary());
//		}
//		System.out.println(max +"    "  +sum +"    "+ taxSum);
//		
//		
	}
	
	

}
