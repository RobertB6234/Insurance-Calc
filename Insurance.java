import java.util.Scanner;

public class Insurance
{
	public static void main(String[] args)
	{
		int currYear;  | 
		int birthYear;  
		int premium;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the current year >> ");
		currYear = input.nextInt();
		
		System.out.print("Enter your birth year >> ");
		birthYear = input.nextInt();
		
		premium = calculate(currYear, birthYear);
		System.out.println("Your premium comes out to be $" + premium);	
	}
	
	public static int calculate(int year, int birth)
	{
		final int ADDITION = 15;
		final int MULTIPLY = 20;
		int age = year - birth;
		int decade = age / 10;
		int premium = (decade + ADDITION) * MULTIPLY;
		return premium;
	} 
}