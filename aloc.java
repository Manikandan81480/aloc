import java.util.*;
public class alphetornot
{
	public static void main(String args[])
	{
Scanner x=new Scanner(System.in);
char c=x.next().charAt(0);
boolean s=Character.isDigit(c);
	if(s)
	{
	System.out.println("not alphet");
	}
		
                else
		{
		System.out.println("alphet");
		}
	}
}
