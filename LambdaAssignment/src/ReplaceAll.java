import java.util.ArrayList;
import java.util.List;

public class ReplaceAll {
	
	
	
	public static void main(String args[]) {
		
		List<String> str1 = new ArrayList<String>();
		str1.add("Arundathi");
		str1.add("Bahubali");
		str1.add("Chatrapati");
		str1.add("Dolphin");
		
		str1.replaceAll(x->x.toUpperCase());
		
		str1.forEach(System.out::println);
     
}
}
