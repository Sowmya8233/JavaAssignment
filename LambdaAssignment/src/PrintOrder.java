import java.util.List;  
import java.util.ArrayList;
import java.util.stream.Collectors;


class order{
	
	int Id;
	int price;
	String Status;
	public order(int Id,int price,String Status) {
		this.Id = Id;         
        this.price = price;
        this.Status=Status;
	
    }
}

class PrintOrder 
{
	
public static void main(String[] args) 
{
	List<order> orderslist = new ArrayList<order>();  
    
	orderslist.add(new order(10,20000,"ACCEPTED"));   
	orderslist.add(new order(20,2085,"COMPLETED"));
	orderslist.add(new order(30,30654,"INITIATED"));  
	orderslist.add(new order(40,20235,"ACCEPTED")); 
	orderslist.add(new order(50,157654,"COMPLETED"));
    
	orderslist.stream().filter(i -> i.price > 10000).mapMulti((s, c) -> {
	    c.accept(s.Id);
	    c.accept(s.Status);
	  })
	.forEach(System.out::println);
	
	System.out.println();

	orderslist.stream().filter(i -> i.Status == "COMPLETED" || i.Status == "ACCEPTED" ).mapMulti((s, c) -> {
	    c.accept(s.Id);
	    c.accept(s.Status);
	  })
	.forEach(System.out::println);
	
	
}
}