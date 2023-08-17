package Numbers;

public class AutomorphicOrNot {
	public static void main(String[] args) {
		int num=76;
		boolean b=isAutomorphic(num);
		if(b)
			System.out.println(num+" Is Automorphic Number......");
		else
			System.out.println(num+" Is Not Automorphic Number.....");
	}
	public static boolean isAutomorphic(int n)
	{
		int s=n*n;
		while(n>0)
		{
			if(n%10 != s%10)
				return false;
			n=n/10;
			s=s/10;
		}
		return true;
	}
}
