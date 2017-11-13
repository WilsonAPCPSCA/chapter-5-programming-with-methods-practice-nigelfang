import java.util.Scanner;
public class romanNumerals {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int n = in.nextInt();
		String romanOne = romanDigit( n%10, "I", "V", "X");
		n=n/10;
		String romanTen = romanDigit( n%10, "X", "L", "C");
		n= n/10;
		System.out.print(romanTen + romanOne);
	}
	public static String romanDigit(int n ,String one, String five, String ten){
	String what = "";
	if ( n%5 ==0)
	{
		System.out.print(five);
	}
	else if ( n < 10 && n > 0)
			for ( int wtf=1; wtf <= n; wtf++ )
			{
				System.out.print(one);
			}
		else if ( n >= 5)
			for (int wtf=1; wtf <=(n)- 5; wtf++)
			{
				System.out.print(five);
			}
		return what;
}
	}
