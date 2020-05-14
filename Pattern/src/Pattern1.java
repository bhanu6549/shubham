import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		String str;
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		str=str.toUpperCase();
		char[] strch=new char[str.length()];
		strch=str.toCharArray();
		int k=0;
		for (int i = 0; i < strch.length; i++) {
			for (int j = 0; j < strch.length; j++) {
				if(i==j)
				{
					System.out.print(strch[k++]);
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
