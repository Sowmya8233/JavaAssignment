import java.util.HashMap;
import java.util.*;
import java.util.concurrent.*;

public class TreeMapImplementation {

	static TreeMap<Long, String> tree_map;

	static void create()
	{
		tree_map = new TreeMap<Long, String>();

		System.out.println("TreeMap successfully" + " created");
	}

	static void insert()
	{
		
		tree_map.put((long) 10002,"9988877665");
		tree_map.put((long) 10001,"9876765438");
		tree_map.put((long) 10003,"9678564553");
		
		System.out.println("\nElements successfully" + " inserted in the TreeMap");
	}

	static void search(String value)
	{

		System.out.println("\nIs value \""+ value + "\" present? " + tree_map.containsValue(value));
	}

	static void display()
	{
		System.out.println("\nDisplaying the TreeMap:");

		System.out.println("TreeMap: " + tree_map);
		
	}

	
	public static void main(String[] args)
	{

		create();

		insert();

		display();

	}
}

