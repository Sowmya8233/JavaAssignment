import java.util.Arrays;
import java.util.List;
  
public class OperationException {
    public static void main(String[] args)
    {
        String str[] = { "Dog", "cat" };
        List<String> l = Arrays.asList(str);
        System.out.println(l);
  
   
        l.add("Rabbit");// operation Exception
        
    }
}