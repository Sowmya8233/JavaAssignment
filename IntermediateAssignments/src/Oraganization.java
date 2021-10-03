class Employee{
	double  basicSalary =5000.00;
}

class Manager extends Employee{
	double incentive=0;
	
	public void setIncentive(int Inc) {
		
		incentive=incentive+ Inc;
	}
	
	public void disply() {
		
		double total = super.basicSalary+incentive;
		
		System.out.println(total);
	
	}
}

class Worker extends Employee{
	
	double overtime=0;
	public void setOvertime(double d) {
		overtime= overtime+d;
	}
	
	public void disply() {
		double total=super.basicSalary+overtime*100;
		System.out.println(total);
	}
	
}
public class Oraganization {

	public static void main(String[] args) {
		
  Manager objmanager = new Manager();
  
  Worker objworker=new Worker();
  objmanager.setIncentive(8);
  objmanager.disply();
  objworker.setOvertime(4.5);
  objworker.disply();
	}

}

