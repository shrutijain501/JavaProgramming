import java.lang.reflect.*;
import java.util.*;
public class ReflectionOfDeclaredFields 
{	   public static void main(String[] args)throws Exception
	   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter class name!!!");
      String className=sc.next();

      Class c=Class.forName(className);
      Field f[]=c.getDeclaredFields();
      for (int i = 0; i < f.length; i++)
      {
          System.out.println(f[i]);
      }
   }
}
