class StringMethods 
{
	public static void main(String[] args) 
	{
		//String class methods are immutable
		String str=new String("Hello World");
		String str2=new String("Hello World");
		
		str.toLowerCase();
		System.out.println("String="+str); 
		
		System.out.println("indexOf="+str.indexOf('o'));
		System.out.println("Length="+str.length());
		System.out.println("lastIndexOf="+str.lastIndexOf('o'));
		
		int i;
		System.out.println("String character by character");
		for(i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		
		System.out.println("toLowerCase="+str.toLowerCase());
		System.out.println("toUpperCase="+str.toUpperCase());
		System.out.println("StartWith="+str.startsWith("H"));
		System.out.println("SubString="+str.substring(0, 5));
		
		System.out.println("Equals="+str.equals(str2));
		System.out.println("Equals="+str.equalsIgnoreCase(str2));
		System.out.println("ASCII Value="+str.codePointAt(1));
		System.out.println("ASCII Value="+str.codePointBefore(1));
		System.out.println("Count="+str.codePointCount(5, 11));
		
		String str3="   C-DAC    ";
		System.out.println("Trim="+str3.trim());
		
		System.out.println("compareTo="+"ABC".compareTo("ABC"));
		System.out.println("compareTo="+"abc".compareTo("ABC"));
		System.out.println("compareTo="+"ABC".compareTo("abc"));
		
		System.out.println("compareToIgnoreCase="+"DBC".compareToIgnoreCase("abc"));
		System.out.println("Concat="+str.concat(" Program"));
		System.out.println("String="+str);
		System.out.println("Empty="+str.isEmpty());
		System.out.println("Contains="+str.contains("Hello"));
		
		char[]ch=str.toCharArray();
		System.out.println("Character Arrays");
		for(char c : ch)
		{
			System.out.println(c);
		}
		System.out.println("Splitted Array");
		String [] s=str.split(" ");
		for(String s1 : s)
		{
			System.out.println(s1);
		}
	}
}