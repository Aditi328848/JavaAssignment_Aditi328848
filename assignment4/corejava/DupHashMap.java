package assignment4.corejava;
import java.util.HashMap;
import java.util.Map.Entry;
public class DupHashMap {
	

	

		public static void main(String[] args) {

			String a = "Chakravarthy is a good man";

			DupHashMap qc = new DupHashMap();
			qc.countusingHash(a);
		}

		private void countusingHash(String a) {

			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			char[] charArray = a.toCharArray();
			for (char c : charArray) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				}
				else {
					map.put(c, 1);
				}
			}
			for (Entry<Character, Integer> entry : map.entrySet()) {
	 
	           if (entry.getValue() > 1) {
	               System.out.println(entry.getKey() + " : "  + entry.getValue());
	           }
	       }

		}

}
