import java.util.Date;

public class ProductionWorker extends Employee { 
    
	protected int shift;
	protected double hourlyPayRate;
	protected int hoursPerMonth;  
	
	public ProductionWorker() {
		super();
	}
	
	public ProductionWorker(String name, String number, Date hireDate, Adress adress,int shift, double hourlyPayRate, int hoursPerMonth) {
		super(name, number, hireDate, adress);
		this.shift=shift;
		this.hourlyPayRate=hourlyPayRate;
		this.hoursPerMonth=hoursPerMonth; 
	}
	
	@Override
	public String toString() {
		return "ProductionWorker [shift=" + shift + ", hourlyPayRate=" + hourlyPayRate + ", hoursPerMonth="
				+ hoursPerMonth + ", name=" + name + ", number=" + number + ", hireDate=" + hireDate + ", adress="
				+ adress + ", getTotalSalary()=" + getTotalSalary() + "]";
	}
	
    public double getTotalSalary() {
    	
    	double y=hoursPerMonth/26; 
    	// hours per day because month has 26 days/work
		switch (shift) {
		  case 1:
			//shift day is 1	
				if (y==8) {
					//case works 8 hours, 
					super.totalSalary = hourlyPayRate*8;
				}
				else if (y>8) {
					//case extra hours
					double extraHours=(y-8)*1.25 ;//extraHoursget 1.25 hours instead 
					super.totalSalary= hourlyPayRate*(8+extraHours)*26;
				} 
			    break;
		  
		  case 2:
			    //shift night is 2	
				if (y==7) {
					//case works 7 hours, 
					super.totalSalary= hourlyPayRate*7;
				}
				else if (y>7) {
					//case extra hours
					double extraHours=(y-7)*1.5  ;//extraHoursget 1.5  hours instead 
					super.totalSalary= hourlyPayRate*(7+extraHours)*26;
				}
			    break;
		  default:
			  System.out.println("Shift is either day (1) or night (2)");//not allowed  
		}  
		
    	return totalSalary; 
	} 
	
	public int getShift() {
		return shift;
	}
	
	public double getHourlyPayRate() {
		return hourlyPayRate;
	}
	
	public int getHoursPerMonth() {
		return hoursPerMonth;
	}
	
	public void setShift(int shift) {
		this.shift= shift;
	}
	
	public void setHourlyPayRate(double hourlyPayRate) {
		this.hourlyPayRate= hourlyPayRate; 
	}
	
	public void setHoursPerMonth(int hoursPerMonth) {
		this.hoursPerMonth= hoursPerMonth;
	}
}
