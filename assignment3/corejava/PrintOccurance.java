package assignment3.corejava;

public class PrintOccurance 
{
	/*
	 * Write a program to print the occurrence of each character in the String
“DevLabs Alliance Training”
	 */
	public static PrintOccurance ch ;
	public static String s;
	public static void main(String[] args) {
		s= "DevLabs Alliance Training";
		ch= new PrintOccurance();
		ch.characterOcuuerence(s);
	}

	private void characterOcuuerence(String s) {
		char[] chararray=s.toCharArray();
		
		for (int i = 0; i < chararray.length; i++) {
			ch.eachChar(chararray[i]);
		}
		
		
	}

	private void eachChar(char c) {
		int withchar=s.length();
		String withoutchar = s.replace(String.valueOf(c), "");
		int withoutcount=withoutchar.length();
		int count = withchar-withoutcount;
		System.out.println(c + " occured " + count );
		
	}
	
	
	
}
