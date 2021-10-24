import java.lang.reflect.*;
import java.util.*;
public class ReflectionOfDeclaredConstructors 
{	   
  public static void main(String[] args)throws Exception
	   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter class name!!!");
      String className=sc.next();
      Class c=Class.forName(className);
      Constructor con[]=c.getDeclaredConstructors();
      for (int i = 0; i < con.length; i++)
      {
          System.out.println(con[i]);
      }
   }
}

