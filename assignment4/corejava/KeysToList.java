package assignment4.corejava;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class KeysToList {


	/*
	 * Convert keys of a map to a list.
	 */
		public static void main(String[] args) {
				
			Map<Integer,String> hm = new HashMap<Integer,String>();
			hm.put(1, "Ram");
			hm.put(2, "Akbar");
			hm.put(3, "Anthony");
			hm.put(4,"Deepika");
			
			KeysToList k2L= new KeysToList();
			k2L.convertKeytoList(hm);

		}

		private void convertKeytoList(Map<Integer, String> hm) {
			List<Integer> keylist = new ArrayList<Integer>();
		//	keylist.addAll(hm.keySet());
			
			for (Integer integer : hm.keySet()) {
				keylist.add(integer);
			}
			
			System.out.println(keylist);
			
		}
}
