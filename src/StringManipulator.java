/**
 * 
 * @author Julia Hu
 * StringManipulator
 *
 */
public class StringManipulator 
{
	public static String noVowels(String str)
	{	
		str = str.toLowerCase();
		String newStr = "";
		for (int i = 0; i < (str.length()); i++)
		{
			if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				newStr+="*";
			}
			else
			{
				newStr += str.charAt(i);
			}
		}
		return newStr;
	}
	
	public static String reverse(String str)
	{
		String newStr = "";
		for (int i = str.length()-1; i > -1; i--)
		{
			newStr += "" + str.charAt(i);
		}
		return newStr;
	}
}