import java.util.Scanner;

class LeapYear
{
	static boolean leapYear(int x)
	{
		if(x%400==0)
			return true;
		else 
			if(x%100==0)
				return false;
		else 
			if(x%4==0)
				return true;
		else 
			return false;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		if(leapYear(x))
			System.out.println(x + " is leap Year");
		else 
			System.out.println(x + " is not an leap Year");
	}
}
