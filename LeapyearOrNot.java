import java.util.Scanner;
public class LeapyearOrNot {
public static void main(String[] args) 
  {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the year here...");
	int n=s.nextInt();
	if(n%400==0||n%4==0&&100!=0)
		System.out.println("leap year");
	else
		System.out.println("not leap year");
  }
}
