import java.util.Arrays;

public class Array{


public static void swap(Object[] a,int i,int  j)
{
	Object temp=a[i];
	a[i]=a[j];
	a[j]=temp;
}

public static void main(String[] args){

	String[] a={"8","9","0"};
	
	System.out.println("Before Swap: "+Arrays.toString(a));
	swap(a,1,0);
	System.out.println("After Swap: "+Arrays.toString(a));
	
	}
}
