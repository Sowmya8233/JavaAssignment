public class ArithmeticOperations {
	
	public interface arith {
		public int arithmetic(int a,int b);
	}
	public static void main(String[] args) {
		
     arith add=(a,b) -> a+b;
     arith sub=(a,b) -> a-b;
     arith mult=(a,b) -> a*b;
     arith div=(a,b) -> a/b;
     
     System.out.println("Addition is " + add.arithmetic(3, 5));
     System.out.println("Subtraction is " + sub.arithmetic(9, 5));
     System.out.println("multiplication is " + mult.arithmetic(5, 5));
     System.out.println("division is " + div.arithmetic(6, 5));
     
}
}