import java.util.Scanner;

public class StringManipulatorMain 
{

	public static void main(String[] args)
	{
		boolean tryAgain = true;
		while (tryAgain)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("\nWould you like to run a method? (y/n): ");
			String tryDecision = (in.next()).toLowerCase();
			in.nextLine();
			if (tryDecision.charAt(0) == 'y')
			{
				System.out.println("Which method would you like to run?\n1. noVowels \n2. reverse \nEnter '1' or '2': ");
				int choice = in.nextInt();
				in.nextLine();
				
				if (choice == 1)
				{
					System.out.println("Enter a string to be devoweled: ");
					String str = in.next();
					in.nextLine();
					System.out.println(StringManipulator.noVowels(str));
				}
				
				else if (choice == 2)
				{
					System.out.println("Enter a string to be reversed: ");
					String str = in.next();
					in.nextLine();
					System.out.println(StringManipulator.reverse(str));
				}
			}
			else if (tryDecision.charAt(0) == 'n')
			{
				System.out.print("k");
				tryAgain = false;
			}
			else
			{
				System.out.println("lol enter a valid input nerd");
			}
		}
	}
}
