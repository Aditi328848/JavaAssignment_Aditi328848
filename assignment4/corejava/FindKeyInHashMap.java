package assignment4.corejava;

import java.util.HashMap;

public class FindKeyInHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Sahitya");
		hm.put(2, "ganesh");
		hm.put(3, "farida");
		
		
		FindKeyInHashMap fk = new FindKeyInHashMap();
		System.out.println("Key - 1  value is present in hashmap ?" + fk.findkey(hm,1));
		System.out.println("Key - 2 value is present in hashmap ?" + fk.findkey(hm,2));
		System.out.println("Key - 5 value is present in hashmap ?" + fk.findkey(hm,5));
		
	}

	private boolean findkey(HashMap<Integer, String> hm, int key) {
		boolean keystat = hm.containsKey(key);
		return keystat;
		
	}
}
