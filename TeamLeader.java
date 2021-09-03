import java.util.Date;

public class TeamLeader extends ProductionWorker {
	private double monthlyBonus; 
	private int rtHours;//Required Training Hours
	private int atHours;//Training Hours Attended
	
	public TeamLeader() {
		super();
	}
	
	public TeamLeader(String name, String number, Date hireDate, Adress adress,int shift, double hourlyPayRate, int hoursPerMonth,double monthlyBonus, int rtHours, int atHours) {
		super(name, number, hireDate, adress, shift, hourlyPayRate, hoursPerMonth);
		this.monthlyBonus=monthlyBonus;
	    this.rtHours=rtHours;
	    this.atHours=atHours;
	}
 
	@Override
	public String toString() {
		return "TeamLeader [monthlyBonus=" + monthlyBonus + ", rtHours=" + rtHours + ", atHours=" + atHours
				+ ", hourlyPayRate=" + hourlyPayRate + ", hoursPerMonth=" + hoursPerMonth + ", name=" + name
				+ ", number=" + number + ", hireDate=" + hireDate + ", adress=" + adress + ", getTotalSalary()="
				+ getTotalSalary() + "]";
	}

	public double getTotalSalary() {
		if(atHours>=rtHours) { 
			double bonusAch = (monthlyBonus*atHours)/rtHours; //bonus Achieved
			return super.getTotalSalary() +bonusAch; 
		}
		else return super.getTotalSalary();//no bonus case
	}
	
	public double getMonthlyBonus() {
		return monthlyBonus;
	}
	
	public int getRtHours() {
		return rtHours;
	}
	
	public int getAtHours() {
		return atHours;
	}
	
	public void setMonthlyBonus(double monthlyBonus) {
		this.monthlyBonus= monthlyBonus;
	}
	
	public void setRtHours(int rtHours) {
		this.rtHours= rtHours;
	}
	
	public void setAtHours(int atHours) {
		this.atHours= atHours;
	}
}
