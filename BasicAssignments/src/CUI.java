import java.util.Scanner;

public class CUI{
	
    public static void main(String[] args) {
    	
    	String Name="";
        int Password =1234;
    	int failureCount = 0;
    	Scanner sc=new Scanner(System.in);
    	
        System.out.println("Enter user name");
          Name=sc.nextLine();
          System.out.println("Enter Password");
        	 Password=sc.nextInt();
        	 
        	
    	 for(int i = 0;i<=3;i++) {
    	   if(i<3) {
    		   
    	          
    	       if(Password==1234) {
    	    	   
    	    	   System.out.println("Welcome to the page "+Name);
    	    	   break;
    	    	   }
    	       else {
    	    	   
    	    	   if(failureCount<3) {
    	    		   System.out.println("Enter the correct password");
    	    	   failureCount++;
    	    	   
    	    	   System.out.println("Enter Password");
 	        	 	Password=sc.nextInt();
    	    	   }
    	       }
    		   }
    	   
    	   else if(failureCount==3 )
    		   System.out.println("Contact admin for password");
    	 }
       
    } 
    	     			
}
                
   
              

            
            
       
        
   

    
       
        
        
        
     