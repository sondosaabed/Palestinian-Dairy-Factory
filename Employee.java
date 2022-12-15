import java.util.Date;
 
public class Employee { 
	protected String name;
	protected String number;
	protected Date hireDate= new Date();
	protected Adress adress= new Adress(); 
	protected double totalSalary;

	public Employee(String name, String number, Date hireDate, Adress adress) {
		this.name=name; 
		setNumber(number);
		this.hireDate= hireDate;
		this.adress=adress; 
	}
	
	public double getTotalSalary() {
		return this.totalSalary;
	}
	
	public boolean isEmpNumberValid(String number) {
		/**this method is to check if the Employee Number in the format XXX–L, 
		 where: X is within the range 0–9 
		 	  :L is within the range A–M*/
		boolean x =true;
		if (number.contains("-")) {
			//checks if Number contains "-"	 
			String[] formats= number.split("-");
			String format01= formats[0];//XXX
			String format02= formats[1];//L

			if(format01.length()<=3) {
				//checks x is with 3 digits
				int format1 =Integer.parseInt(format01);//convert from String to int
				if(format1>=0 && format1<=999) {
					//checks if X is a digit within the range 0–9
					char[] format2= new char[1];
					format2[0]= format02.charAt(0); 
					
					if((format2[0] >= 'A' && format2[0] <='M')) {
						//checks if the char L is within the range A–M
						//using ASCII code
					}
					else x=false;
				}
				else x=false;
			} 
			else x=false;
		} 
		else x=false;

		return x;
	} 
 
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", hireDate=" + hireDate + ", adress=" + adress
				+ ", getTotalSalary()=" + getTotalSalary() + "]";
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setName(String name) {
		this.name= name;
	}

	public void setNumber(String number) {
		if (isEmpNumberValid(number)==true)
			this.number= number;
		else 
			System.out.println(number+" is not a valid number for Employee "+ this.name);
	}

	public void setHireDate(Date hireDate) {
		this.hireDate= hireDate;
	}

	public void setAdress(Adress adress) {
		this.adress= adress;
	}
}
