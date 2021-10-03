import java.util.stream.Collector;
import java.util.stream.Collectors;  
import java.util.List;  
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class Fruits{
	String Name;
	int Calories;
	int price;
	String color;
	public Fruits(String Name,int Calories,int price,String color) {
		this.Name = Name;    
        this.Calories = Calories;         
        this.price = price;
        this.color=color;
	
    }
}
class News{
	int  NewsId;
	String PostedByUser;
	String CommentsByUser;
	String Comments;
	public News(int NewsId,String PostedByUser,String CommentsByUser,String Comments) {
		this.NewsId = NewsId;    
        this.PostedByUser = PostedByUser;         
        this.CommentsByUser = CommentsByUser;
        this.Comments = Comments;
	}

}

class Trader{
	String Name;
	String City;
	public Trader(String Name,String City) {
		this.Name = Name;    
        this.City = City;         
	}
	
}

class Transaction{
	String Trader;
	int year;
	int value;
	
	public Transaction(String Trader,int year,int value) {
		this.Trader =Trader;    
        this.year=year;
        this.value=value;
        
        
	}
}
public class API {
	public static void main(String[] args) {  
	     List<Fruits> Fruitslist = new ArrayList<Fruits>();  
	      
	      Fruitslist.add(new Fruits("Apple",1000,20,"RED"));   
	      Fruitslist.add(new Fruits("Banana",100,25,"Yellow"));
	      Fruitslist.add(new Fruits("kiwi",120,30,"Brown"));  
	      Fruitslist.add(new Fruits("Grapes",50,20,"Purle")); 
	      Fruitslist.add(new Fruits("Watermelon",60,15,"RED"));
	      
	      List<News> Newslist = new ArrayList<News>();
	      Newslist.add(new News(100,"User1","CommentedByUser1","Comments1"));
	      Newslist.add(new News(101,"User2","CommentedByUser2","The Budget is Good"));
	      Newslist.add(new News(102,"User3","CommentedByUser2","The Budget is Higher"));
	      Newslist.add(new News(102,"User1","CommentedByUser1 ","The Budget is lower"));
	      
	      List<Transaction> TransactionList = new ArrayList<Transaction>();
	      TransactionList.add(new Transaction("Trader2",2011,1500));
	      TransactionList.add(new Transaction("Trader5",2011,18000));
	      TransactionList.add(new Transaction("Trader4",2015,12000));
	      TransactionList.add(new Transaction("Trader4",2016,25000));
	      

	      List<Trader> TraderList = new ArrayList<Trader>();
	      TraderList.add(new Trader("Trader5","bangolre"));
	      TraderList.add(new Trader("Trader2","pune"));
	      TraderList.add(new Trader("Trader3","hyderabad"));
	      TraderList.add(new Trader("Trader4","Delhi"));
	      
	       Fruitslist.stream().filter(c ->c.Calories < 100).map(f ->f.Name)
	      .forEach(System.out::println);  //calories less than 100 
	      
	      
	      Fruitslist.stream().mapMulti((s, c) -> {
	    	    c.accept(s.color);
	    	    c.accept(s.Name);
	    	  })
	      .forEach(System.out::println); //getting colors of fruits 
	      
	        Fruitslist.stream().sorted(Comparator.comparingInt(Fruits->Fruits.price))
	        .filter(c ->c.color=="RED").map(f ->f.Name)
	        .forEach(System.out::println); // getting name by color  
	        
	    
	      
	      var newsCount = Newslist.stream().collect(Collectors.groupingBy(i -> i.NewsId, Collectors.counting()));
	      System.out.println(newsCount);	// getting Count by news comments  
	      
	      
	      Newslist.stream().filter(b -> b.Comments.contains("Budget")).mapMulti((s, c) -> {
	    	    c.accept(s.NewsId);
	    	    c.accept(s.Comments);
	    	  })
	      .forEach(System.out::println);	// getting Comments Contains Budget  
	      
	      var CommentsCount = Newslist.stream().collect(Collectors.groupingBy(i -> i.PostedByUser, 
	    		  Collectors.counting()));
	      System.out.println(CommentsCount);	// getting Count of comments by PostedByUser   
	      

	      var CommentsByUserCount = Newslist.stream().collect(Collectors.groupingBy(i -> i.CommentsByUser, 
	    		  Collectors.counting()));
	      System.out.println(CommentsByUserCount);	// getting Count of comments by CommentsByUser   
	      
	      TransactionList.stream().sorted(Comparator.comparingInt(Transaction->Transaction.value))
	        .filter(c ->c.year== 2011).mapMulti((s, c) -> {
	    	    c.accept(s.Trader);
	    	    c.accept(s.value);
	    	    c.accept(s.year);
	    	  })
	        .forEach(System.out::println); // getting transaction in 2011 
	      
	      TraderList.stream().map(f ->f.City).distinct()
	        .forEach(System.out::println); // getting unique cities where the traders work  
	      
	      TraderList.stream().sorted(Comparator.comparing(Trader->Trader.Name))
	      .filter(c-> c.City == "pune").map(f ->f.Name)
	      .forEach(System.out::println);	// getting Traders from pune city 
	      
	      TraderList.stream().sorted(Comparator.comparing(Trader->Trader.Name))
	      .map(f ->f.Name)
	      .forEach(System.out::println);	// getting all traders' names sorted alphabetically 
	      
	      
	      System.out.println(TraderList.stream().anyMatch(c-> c.City == "indore"));  // getting Traders match from indore city 
	      
	      System.out.println(TransactionList.stream().max(Comparator.comparingInt(Transaction->Transaction.value))
	        .map( c -> c.value)); // getting highest value of all the transactions 
	      

	      System.out.println(TransactionList.stream().min(Comparator.comparingInt(Transaction->Transaction.value))
	        .map( c -> c.value)); // getting smallest value of all the transactions 
	}      
	}