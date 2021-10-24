import java.lang.reflect.*;
import java.util.*;

public class ReflectionOfDeclaredMethods 
{	   public static void main(String[] args)throws Exception
	   {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter class name!!!");
		String className=sc.next();
		
		Class c=Class.forName(className);
		Method m[]=c.getDeclaredMethods();
		for (int i = 0; i < m.length; i++)
			{
					System.out.println(m[i]);
			}
	   
	   }
}
