/**
 * 
 * @author Julia Hu
 * Dice
 *
 */
public class Dice 
{
	//Fields
	private int numRolls;
	
	//Constructors
	public Dice()
	{
		numRolls = 0;
	}
	
	//Methods
	public int rollDice()
	{
		
		numRolls++;
		return (int)(Math.random()*6)+1;
	}
	
	public int getNumRolls()
	{
		return numRolls;
	}
	
	public static String dicePic(int roll)
	{
		String pic = "placeholder";
		if (roll==1)
		{
			pic =      "--------- \n"
					+  "|       | \n"
					+  "|   *   | \n"
					+  "|       | \n"
				    +  "--------- \n";
		}
		else if (roll==2)
		{
			pic =      "--------- \n"
					+  "| *     | \n"
					+  "|       | \n"
					+  "|     * | \n"
					+  "--------- \n";
		}
		else if (roll==3)
		{
			pic =      "--------- \n"
					+  "| *     | \n"
					+  "|   *   | \n"
					+  "|     * | \n"
					+  "--------- \n";
		}
		else if (roll==4)
		{
			pic =      "--------- \n"
					+  "| *   * | \n"
					+  "|       | \n"
					+  "| *   * | \n"
					+  "--------- \n";
		}
		else if (roll==5)
		{
			pic =      "--------- \n"
					+  "| *   * | \n"
					+  "|   *   | \n"
					+  "| *   * | \n"
					+  "--------- \n";
		}
		else if (roll==6)
		{
			pic =      "--------- \n"
					+  "| *   * | \n"
					+  "| *   * | \n"
					+  "| *   * | \n"
					+  "--------- \n";
		}
		return pic;
	}
}