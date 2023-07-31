public class BiggestValue {
public static void main(String[] args) {
	int a=6;
	int b=2;
	int c=3;
	int big=a;
	if(big<b)
		big=b;
	if(big<c)
		big=c;
	System.out.println(big);
}
}
