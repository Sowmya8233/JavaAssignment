import java.lang.*;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
public @interface Test{

}
class AnnotationsEg{ 
    @Test                // here we are using above created annotation on the test method..
	public void test(){

	}

    public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

}