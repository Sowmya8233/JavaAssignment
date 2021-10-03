
import java.util.*;
import java.util.stream.*;

class ListItems {

	private Integer key;

	private String value;

	public ListItems(Integer id, String name)
	{

		this.key = id;
		this.value = name;
	}

	public Integer getkey() { return key; }

	public String getvalue() { return value; }
}
class Conversion {
	public static void main(String[] args)
	{
		
		HashMap<Integer,String> list = new HashMap<Integer,String>();

		list.put(1, "Items");
		list.put(2, "Apple");
		list.put(3, "America");
		list.put(4, "India");
		list.put(5, "You");

		
		String result = list.entrySet()
	            .stream()
	            .map(entry -> entry.getKey() + " - " + entry.getValue())
	            .collect(Collectors.joining(" "));
	        System.out.println(result);
		
	}
}
