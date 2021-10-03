
public class str2 {

	public static void main(String args[])
	{
	String s1;
    String s="Java String pool refer a collection of string which are store in heap memory";
    s1=s.toLowerCase();
    System.out.println(s1);
    
    s1=s.toUpperCase();
    System.out.println(s1);
    
    s1=s1.replace('A','S') ;
    System.out.println(s1);
    
    System.out.println(s.contains("COLLECTION"));
    System.out.println(s1.matches(s));
    if(s1==s)
    {
    	System.out.println(s1.equals(s));
    }
    else
    {
    	System.out.println("s1 is not equalto s");
    }
    
    
	}
}
