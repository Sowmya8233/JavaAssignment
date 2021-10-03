import java.util.Scanner;
public class Arrayelement{    
	 
		public static void main(String args[]){
		boolean IsFound = false;
			
		int a[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		  
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<a.length;i++){    
            if(a[i] == n){    
            	System.out.println("Number "+n+" Found"); 
            	IsFound = true;
            	break;
            }
            
		}
		
		if(!IsFound) {
        	System.out.println("Number not found");
        }
	}
}