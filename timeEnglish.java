import java.util.Scanner;
public class timeEnglish {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter a numerical valule for time IE: 11 40");
	int time = in.nextInt();
	int timeTwo = in.nextInt();
	String kms = getTimeName( time, timeTwo);
	System.out.println(kms);
	}
	public static String getTimeName(int hours, int minutes){
	String kms;
		kms =  "It is " + minutes + " minutes past " + hours;
	return kms; 
	
	
	
	
	}
	}


