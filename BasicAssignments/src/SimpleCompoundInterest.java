   
import java.util.Scanner;

public class SimpleCompoundInterest {

	public static void main(String[] args) {
	
     double rate,time,amount,SI,CI;
     Scanner S=new Scanner(System.in);
     
     System.out.println("Enter Amount:");
     amount=S.nextDouble();
     
     System.out.println("Enter Rate:");
     
     rate=S.nextDouble();
     
     System.out.println("Enter Time:");
     time=S.nextDouble();
     
     SI=(amount*rate*time)/100;
     
     CI=amount*Math.pow(1.0+rate/100,time)-amount;
     
     System.out.println("Simple Interest is " +SI);
     System.out.println("Compound Interest is " +CI);
	}

}
