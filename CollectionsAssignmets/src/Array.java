import java.util.*;  
import java.util.Collections;
class JavaExample{  
   public static void main(String args[]){  
      ArrayList<String> alist=new ArrayList<String>();  
      alist.add("Product1");
      alist.add("Product2");
      alist.add("Product3");
      alist.add("Product4");
      alist.add("Product5");
      alist.add("Product6");
      alist.add("Product7");
      alist.add("Product8");
      alist.add("Product9");
      alist.add("Product10");
      
      //displaying elements
      System.out.println(alist);
      Scanner s=new Scanner(System.in);
     
     System.out.println("Enter a new product");
     String  ans=s.next();
      for (int i=0; i< alist.size();i++) {
    	  
    	
          // Checking if the element is already present or
          // not
          if (!alist.contains(ans)) {
              // Adding the element to the ArrayList if it
              // is not present
        	  alist.add(ans);
          }
      }
      System.out.println(alist);
   }  
}