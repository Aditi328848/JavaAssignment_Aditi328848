package assignment3.corejava;

public class StringToCharArray {
public static void main(String[] args) {
		
	StringToCharArray scs= new StringToCharArray();
		
		String s2c = "CHITTAR";
		char[] c2s = {'c','a','r','i','n','a'};
		
		scs.tocharArray(s2c);
		scs.toArraytoString(c2s);
	}

	private void toArraytoString(char[] c2s) {
		String s = " ";
		for (int i = 0; i < c2s.length; i++) {
			s=s+c2s[i];
			
		}
		System.out.println(s);
	}

	private void tocharArray(String s2c) {
		char[] a = s2c.toCharArray();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}
