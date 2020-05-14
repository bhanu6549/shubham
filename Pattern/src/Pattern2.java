import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		String str;
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		str=str.toUpperCase();
		char[] strch=new char[str.length()];
		strch=str.toCharArray();
		char[] strrev=new char[str.length()];
		int k=0;
		for (int i =strch.length-1; i >=0; i--) {
			
			strrev[k++]=strch[i];
		}
		for (int i = 0; i < strch.length; i++) {
			for (int j = 0; j < strch.length; j++) {
				if(j<=i)
				{
					System.out.print(strrev[j]);
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println("");
			
		}
	}
}
