import java.util.Scanner;

public class Craps 
{

	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		Scanner in = new Scanner(System.in);
		boolean play = true;
		
		System.out.print("Press enter to roll your point: ");
		in.nextLine();
		int point = dice1.rollDice() + dice2.rollDice();
		System.out.print("Your point is " + point + "\n");
		
		if (point==7 || point==11)
		{
			System.out.print("You win!");
			play = false;
		}
		else if (point==2 || point==12)
		{
			System.out.print("You lose...");
			play = false;
		}
		
		while (play)
		{
			System.out.print("\nPress enter to roll: ");
			in.nextLine();
			int roll1 = dice1.rollDice();
			int roll2 = dice2.rollDice();
			int sumRoll = roll1 + roll2;
			System.out.print("You rolled:\n" + roll1 + Dice.dicePic(roll1) + Dice.dicePic(roll2) + sumRoll+ "\n");
			
			if (sumRoll==point)
			{
				System.out.print("You win!");
				play = false;
			}
			else if (sumRoll==7)
			{
				System.out.print("You lose...");
				play = false;
			}
			 
			
		}
		
		
	}

}
