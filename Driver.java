/** Sondos Ahmad Abbed
 */
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
 
public class Driver {
	public static void main(String []args) { 
		//SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		//"12/11/2020" 
		Employee e1 = new ProductionWorker("Sondos Aabed", "000-A", new Date(12/11/2003), new Adress("jabal taweel St.","Al-Bireh", "Al-Bireh", "0123"),1, 10.00, 160);
		Employee e2 = new ProductionWorker("Suad Ahmad", "010-B", new Date(23/9/2008),new Adress("islamia St.","Al-Bireh", "Al-Bireh", "0120"), 2, 10.00, 155);
		Employee e3 = new ShiftSupervisor("Saed Saed", "013-O", new Date(13/7/2009),new Adress("sooq St.","Silwad", "Ramallah", "2310"), 2300.0, 150.0, 35, 33);
		Employee e4 = new ShiftSupervisor("Husam Hamad", "016-G", new Date(8/10/2011),new Adress("sweet St.","der jreer", "Ramallah", "0111"), 3750.0, 150.0, 35, 37);
		Employee e5 = new TeamLeader("Sameha Sameeh", "014-C", new Date(12/5/2007),new Adress("istiqlal St.","taybeh", "Ramallah", "8731"),2, 40.0, 40,100, 35, 35);
		Employee e6 = new TeamLeader("Mohamad Hamad", "010-Z", new Date(30/3/2002),new Adress("jinan St.","Silwad", "Ramallah", "8951"),1, 40.0, 40,100, 35, 37);
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		
		jobDiscription(employees,"Sondos Aabed");//finds the job discripton of the employee
		
		listGreaterThanAverage(employees);//list employees with salary greater than average 
		
		System.out.println(searchEmployee(employees,e5));//find e5
		
		printall( employees);//print all
	}
	
	public static double getTotalPaied(ArrayList<Employee> employees) {
//this method is added by me , to get the total amount that the factory pays	
		double totalPaied= 0;// the total paied salaries
		 
		 for(int i=0;i< employees.size(); i++) {
			 totalPaied=totalPaied+employees.get(i).getTotalSalary();
		 }
		 
		return totalPaied;
	}
	
	public static void listGreaterThanAverage(ArrayList<Employee> employees) {
 /**this  method that will list all employee info who is greater than 
 * average of all employees
 */
		 double sum;// the sum of salaries
		 double avg;

		 sum=getTotalPaied(employees);
		 if(sum==0) {
			 System.out.println("Math error division by zero");// division by zero
		 }else {
			 avg= sum/employees.size();
			 System.out.println("\\n This is a list of the employees who have a salary greater than Average: ");	 
			 for(int i=0;i< employees.size(); i++) {
				 if(employees.get(i).getTotalSalary()>=avg) {
					 System.out.println(employees.get(i).toString());
				 }
			 }
		 } 
	}

	public static String searchEmployee(ArrayList<Employee> employees, Employee e) {
/**this method is added by me , to search for an employee by it's given number
 * and this name is printed by the compnay to their cards 
 */
		String no= "This employee doesn't work here";
		if (employees.contains(e)) {
			return e.toString();
		}
		else {
			return no;
		} 
	} 

public static void jobDiscription(ArrayList<Employee> employees, String  namee){
//this is a method added by me to find the jobdescripton of a specific Employee	
	for(int i=0;i< employees.size(); i++) {
		if(namee==employees.get(i).getName()) {
			//is object an instance of ProductionWorker?
			if(employees.get(i) instanceof ProductionWorker)
				System.out.println("\n"+ namee +" is a Production Worker");
			//is object an instance of ShiftSupervisor?
			else if(employees.get(i) instanceof ShiftSupervisor)
				System.out.println("\n"+namee+" is a Shift Supervisor ");
			//else object is an instance of TeamLeader
			else if(employees.get(i) instanceof TeamLeader)
				System.out.println("\n"+ namee+" is a Team Leader");
			else System.out.println("\n"+ namee + " isn't an Employee in our factory");
		}
		
		}  
	}

public static void printall(ArrayList<Employee> employees) {
//this is a method added by me to print all the employees 
	System.out.println("\n This is all the information about all our employees");
	for(int i=0;i< employees.size(); i++) {
		System.out.println(employees.get(i).toString());
		}
	}
}
