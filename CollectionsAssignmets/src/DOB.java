import java.util.*; 
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DOB{ 
	
	
 public static void main(String args[]){  
  
  LinkedList<Date> aLinkedList=new LinkedList<Date>(); 
  
  Scanner s=new Scanner(System.in);
  
  System.out.println("Enter Your Date Of Birth in DD/MM/YYYY");
  String Date1=s.next();
  Date date = new Date();

	
	  try {
		  
		date = new SimpleDateFormat("dd/MM/yyyy").parse(Date1);
	  }
	  catch (ParseException e)
	  {
		
		e.printStackTrace();
	  }
	  
	  aLinkedList.add(date);
	  
  
  Iterator<Date> itr=aLinkedList.iterator();  
  while(itr.hasNext()){  

	  int year = itr.next().getYear();
  
	  if (year % 4 == 0) {
		  System.out.println("Your Date of birth is leap year");
	  }
	  else if (year % 4 != 0) {
		  System.out.println("Your Date of birth not a leap year");  
	  }
  }
 }  
}  