


class StringWithFirstLetter
{
	public interface LetterWord {
		public StringBuffer firstLetterWord(String str);
	}
	
	public static void main(String[] args)
	{
		String str = "program to calculate simple and compund interest";
		
		
		LetterWord firstLetter = (strin) -> {
			StringBuffer SBresult = new StringBuffer();

			boolean v = true;
			for (int i = 0; i < str.length(); i++)
			{
				if (str.charAt(i) == ' ')
				{
					v = true;
				}
				
				else if (str.charAt(i) != ' ' && v == true)
				{
					SBresult.append(str.charAt(i));
					v = false;
				}
			}

			return SBresult;
		};
		
		System.out.println(firstLetter.firstLetterWord(str));
	}
}

