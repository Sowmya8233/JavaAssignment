import java.util.*;  
public class RandomValues{ 
	
 public static void main(String args[]){ 
	 
   HashMap<Integer,Double> map=new HashMap<Integer,Double>();
   
   map.put(1,101.9);    
   map.put(2,298.38);    
   map.put(3,321.9);   
   map.put(4,495.0);  
   map.put(5,609.8);
   map.put(6,879.10);
   map.put(7,879.40);
   map.put(8,49.0);
   map.put(9,459.2);
   map.put(10,890.43);
       
   
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+": "+m.getValue());    
   }  
}  
}  
