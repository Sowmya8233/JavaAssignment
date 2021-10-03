
import java.lang.*;
import java.lang.annotation.*;


public @interface Info{
	int AuthorId();
	String Author() default "String";
	String Supervisor() default "String";         // it is an optional field.
	String Date();                               //it is a mandatory field.
	String Time();
	double Version();
	String Description() default "String";

}

