/**
 * 
 * @author Julia Hu
 * Dice
 *
 */
public class Dice 
{
	
	//Methods
	
	/**
	 * 
	 * @return int (int)(Math.random()*6)+1
	 * returns an integer between and including 1 and 6
	 */
	public int rollDice()
	{	
		return (int)(Math.random()*6)+1;
	}
	
	/**
	 * 
	 * @param int roll
	 * @return String pic
	 * returns a string which displays a picture representation of the roll
	 */
	public static String dicePic(int roll)
	{
		String pic = "if you see this string then something is terribly wrong";
		if (roll==1)
		{
			pic =      "---------  \n"
					+  "|       |  \n"
					+  "|   *   | 1\n"
					+  "|       |  \n"
				    +  "---------  \n";
		}
		else if (roll==2)
		{
			pic =      "---------  \n"
					+  "| *     |  \n"
					+  "|       | 2\n"
					+  "|     * |  \n"
					+  "---------  \n";
		}
		else if (roll==3)
		{
			pic =      "---------  \n"
					+  "| *     |  \n"
					+  "|   *   | 3\n"
					+  "|     * |  \n"
					+  "---------  \n";
		}
		else if (roll==4)
		{
			pic =      "---------  \n"
					+  "| *   * |  \n"
					+  "|       | 4\n"
					+  "| *   * |  \n"
					+  "---------  \n";
		}
		else if (roll==5)
		{
			pic =      "---------  \n"
					+  "| *   * |  \n"
					+  "|   *   | 5\n"
					+  "| *   * |  \n"
					+  "---------  \n";
		}
		else if (roll==6)
		{
			pic =      "---------  \n"
					+  "| *   * |  \n"
					+  "| *   * | 6\n"
					+  "| *   * |  \n"
					+  "---------  \n";
		}
		return pic;
	}
}