/**
 * 
 * @author Julia Hu
 * Craps
 *
 */
import java.util.Scanner;

public class Craps 
{

	public static void main(String[] args) 
	{
		//creates two dice objects
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		//creates scanner object for user inputs
		Scanner in = new Scanner(System.in);

		//creates boolean variable — becomes false when player has won/lost
		boolean play = true;
		//creates boolean variable — becomes false if player wishes to stop playing
		boolean playAgain = true;
		while (playAgain)
		{	
			//rolls for and displays point
			System.out.print("=======================\nPress enter to roll your point: ");
			in.nextLine();
			int roll1 = dice1.rollDice();
			int roll2 = dice2.rollDice();
			int point = roll1 + roll2;
			System.out.print(Dice.dicePic(roll1) + Dice.dicePic(roll2));
			
			//evaluates if player wins/loses/continues
			if (point==7 || point==11)
			{
				System.out.print("=======================\nYou rolled " + point +" — you win!");
				play = false;
			}
			else if (point==2 || point==12)
			{
				System.out.print("=======================\nYou rolled " + point +" — you lose...");
				play = false;
			}
			else
			{
				System.out.print("Your point is " + point + ".\n");
			}
			
			//game continues if player does not win or lose on point roll
			while (play)
			{
				//rolls two dice and displays each roll
				System.out.print("=======================\nPress enter to roll two dice: ");
				in.nextLine();
				roll1 = dice1.rollDice();
				roll2 = dice2.rollDice();
				int sumRoll = roll1 + roll2;
				System.out.print("You rolled:\n" + Dice.dicePic(roll1) + Dice.dicePic(roll2) + "for a total of " + sumRoll+ ".\n");
	
				if (sumRoll==point)
				{
					System.out.print("=======================\nYou rolled your point — you win!");
					play = false;
				}
				else if (sumRoll==7)
				{
					System.out.print("=======================\nYou rolled 7 — you lose...");
					play = false;
				}	
			}
			
			//asks if player wants to replay game and only accepts "yes" or "no" as an answer
			System.out.print("\nReplay? (yes/no) ");
			String response = in.next();
			in.nextLine();
			
			while (!(response.equals("yes") || response.equals("no")))
			{
				System.out.print("Error: please input either 'yes' or 'no': ");
				response = in.next();
				in.nextLine();
			}
			if (response.equals("yes"))
			{
				play = true;
			}
			else if (response.equals("no"))
			{
				System.out.print("seeya uwu");
				playAgain = false;
			}
		
		}
	}

}
