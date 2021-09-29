package Assignment4;

import java.util.HashMap;
import java.util.Map;

public class Program1
{

	public static void main(String[] args)
	{
		String s="aabbbccdeeff";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < s.length(); i++) 
		{
		  char c = s.charAt(i);
		  if (map.containsKey(c)) 
		  {
		    int count = map.get(c);
		    map.put(c, ++count);
		  } 
		  else 
		  {
		    map.put(c, 1);
		  }
		 
		}
		 System.out.println("the values are" +map);
	}
	

}
