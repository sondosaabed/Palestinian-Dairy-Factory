import java.util.Date;

public class ShiftSupervisor extends Employee { 
	private double monthlySalary;
	private double bonus;//monthly production bonus that a shift supervisor has earned.
	private int nByTeam;//Number of products that produced by team that he/she supervised.
	private int nMust;//Number of products must produced under his/her supervision.
 
	public ShiftSupervisor() {
		super();
	}
	
	public ShiftSupervisor(String name, String number, Date hireDate, Adress adress,double monthlySalary, double bonus, int nByTeam, int nMust) {
		super(name, number, hireDate, adress);
		this.monthlySalary=monthlySalary;
		this.bonus=bonus;
		this.nByTeam=nByTeam;
		this.nMust=nMust; 
	}
 
	@Override
	public String toString() {
		return "ShiftSupervisor [monthlySalary=" + monthlySalary + ", bonus=" + bonus + ", nByTeam=" + nByTeam
				+ ", nMust=" + nMust + ", name=" + name + ", number=" + number + ", hireDate=" + hireDate + ", adress="
				+ adress + ", getTotalSalary()=" + getTotalSalary() + "]";
	}

	public double getTotalSalary() { 
		if(nByTeam>=nMust) {
			totalSalary= monthlySalary+bonus;
		}//get the goal get the bonus
		else {
			totalSalary= monthlySalary;	
		};//no bonus
		
		return totalSalary; 
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public int getNmyTeam() {
		return nByTeam;
	}
	
	public int getNMust() {
		return nMust;
	}
	public void setMonthlySalay(double monthlySalary) {
		this.monthlySalary= monthlySalary;
	}
	
	public void setBonus(double bonus) {
		this.bonus= bonus;
	}
	
	public void setNbyTeam(int nByTeam) {
		this.nByTeam= nByTeam;
	}
	
	public void setNmust(int nMust) {
		this.nMust= nMust;
	}
}
