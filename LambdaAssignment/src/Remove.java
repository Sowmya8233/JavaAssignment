import java.util.stream.Collectors;
import java.util.List;  
import java.util.ArrayList; 
import java.util.Comparator;


class Remove
{
	
public static void main(String[] args) 
{
   
	List<String> str1 = new ArrayList<String>();
	str1.add("Arundathi");
	str1.add("Bahubali");
	str1.add("Chatrapati");
	str1.add("Dolphin");


	str1.removeIf(x -> x.length() % 2 == 0 ); 

	str1.forEach(System.out::println);
}
}


