import java.util.Scanner;
class SubString
{
public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String Name");
	
		String s1="";
		s1=sc.nextLine();
		
		 for(int i=0; i<s1.length(); i++)
		 {
			 for(int j=i+1; j<=s1.length(); j++)
			 {
				System.out.println(s1.substring(i, j));
			 }
		 }
	 }
}