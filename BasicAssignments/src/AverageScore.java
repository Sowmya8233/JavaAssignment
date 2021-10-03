import java.util.Scanner;

public class AverageScore {

	public static void main(String[] args) {
		
       int A,B,C;
      
       Scanner s=new Scanner(System.in);
       
       System.out.println("Enter A Subject marks");
       A=s.nextInt();
       
       System.out.println("Enter B Subject marks");
       B=s.nextInt();
       
       System.out.println("Enter C Subject marks");
       C=s.nextInt();
       
       int total=A+B+C;
	   int avarage=total/3;
      
       System.out.println("Total is:" +total);
     System.out.println("Avarage is:" +avarage);
	}

}