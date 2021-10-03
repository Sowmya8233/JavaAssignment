package corejava.compare;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


class Emp implements Comparable<Emp>{
	int id;
    String name,Deparment;
    int Salary;
    
    public Emp(int id,String name,String Deparment,int Salary)
    {
        this.id = id;
        this.name = name;
        this.Deparment = Deparment;
        this.Salary = Salary;
    }
    
    public String getName()
    {
        return name;
    }
     
    public int getid()
    {
        return id;
    }
    public String getDeparment()
    {
        return Deparment;
    }
     
    public int getSalary()
    {
        return Salary;
    }

   

	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

class IdComparator implements Comparator<Emp>
{
   
    public int compare(Emp s1, Emp s2)
    {
        return s1.getid()-s2.getid();
    }
}
 
class NameComparator implements Comparator<Emp>
{
    public int compare(Emp s1, Emp s2)
    {
        return s1.getName().compareTo(s2.getName());
    }
}

class DepartmentComparator implements Comparator<Emp>
{
    public int compare(Emp s1, Emp s2)
    {
        return s1.getDeparment().compareTo(s2.getDeparment());
    }
}

class SalaryComparator implements Comparator<Emp>
{
    public int compare(Emp s1, Emp s2)
    {
    	return s1.getSalary()-s2.getSalary();
    }
}

class Employee{
public static void main (String[] args){
	Scanner s=new Scanner(System.in);
        System.out.println("Select from below a/b/c/d");
        
      System.out.println("a)ID");
      System.out.println("b)Name");
      System.out.println("c)Department");
      System.out.println("d)Salary");
      String X;
      X=s.next();
      
      System.out.println(X);
//     TreeSet<Emp> set =new TreeSet<Emp>();
      
      if(X.equals("a")) {
    	  
    	  System.out.println("Selectd a");
    	  TreeSet<Emp> set = new TreeSet<Emp>(new IdComparator());

           set.add(new Emp(450,"Sam","abc",213));
           set.add(new Emp(341,"Ronaldo","abc",123));
           set.add(new Emp(134,"Daniel","bc",233));
           set.add(new Emp(590,"George","cab",416));
           
           for(Emp ele: set)
           {
               System.out.println(ele.getName()+" "+ele.getid()+" "+ele.getDeparment()+" "+ele.getSalary());
               
           }
      }
      else if(X.equals("b")) {
    	  
    	  System.out.println("Selectd b");
    	  TreeSet<Emp> set = new TreeSet<Emp>(new NameComparator()); 
    	 

           set.add(new Emp(450,"Sam","abc",213));
           set.add(new Emp(341,"Ronaldo","abc",123));
           set.add(new Emp(134,"Daniel","bc",233));
           set.add(new Emp(590,"George","cab",416));
           
           for(Emp ele: set)
           {
               System.out.println(ele.getName()+" "+ele.getid()+" "+ele.getDeparment()+" "+ele.getSalary());
               
           }
    	   
      }
      else if(X.equals("c")) {
    	  
    	  System.out.println("Selectd c");
    	  TreeSet<Emp> set = new TreeSet<Emp>(new DepartmentComparator()); 

           set.add(new Emp(450,"Sam","abc",213));
           set.add(new Emp(341,"Ronaldo","abc",123));
           set.add(new Emp(134,"Daniel","bc",233));
           set.add(new Emp(590,"George","cab",416));
           
           for(Emp ele: set)
           {
               System.out.println(ele.getName()+" "+ele.getid()+" "+ele.getDeparment()+" "+ele.getSalary());
               
           }
    	 
      }
      else if(X.equals("d")) {
    	  
    	  System.out.println("Selectd d");
    	  TreeSet<Emp> set = new TreeSet<Emp>(new SalaryComparator()); 

           set.add(new Emp(450,"Sam","abc",213));
           set.add(new Emp(341,"Ronaldo","abc",123));
           set.add(new Emp(134,"Daniel","bc",233));
           set.add(new Emp(590,"George","cab",416));
           
           for(Emp ele: set)
           {
               System.out.println(ele.getName()+" "+ele.getid()+" "+ele.getDeparment()+" "+ele.getSalary());
               
           }
    	 
      }
        //TreeSet<Emp> 
    /*  set = new TreeSet<Emp>(new NameComparator());
        
        set.add(new Emp(450,"Sam","abc",213));
        set.add(new Emp(341,"Ronaldo","abc",123));
        set.add(new Emp(134,"Daniel","bc",233));
        set.add(new Emp(590,"George","cab",416));*/
        
        //System.out.println("1234");
        //System.out.println(set);
       /* for(Emp ele: set)
        {
            System.out.println(ele.getName()+" "+ele.getid());
            
        }*/
        
}
}
