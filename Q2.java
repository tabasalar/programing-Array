import java.util.Scanner;

public class Q2 {
	private static Scanner sc;
	public static void main(String[] args) {

		String taba_str;
		int i,alph;
		alph  = 0;
		char ch;

		sc= new Scanner(System.in);
		System.out.print("\nnawek daxll bka =  ");
		taba_str = sc.nextLine();

		for(i = 0; i < taba_str.length(); i++)
		{
			ch = taba_str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alph++;

			}
		}
		System.out.println("\nzhmaray petakan  =  " + alph);


	}
}

