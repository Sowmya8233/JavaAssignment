import java.util.Scanner;
public class Exp1
{
    public static void main(String args[])
    {
    	Scanner sc= new Scanner(System.in);
    	 
        try {
            int a,b;
          
            System.out.println("Enter a Number:");
            a=sc.nextInt();
            System.out.println("Enter b Number:");
            b=sc.nextInt();
            int c = a/b;
            System.out.println ("Result = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }
    }
}