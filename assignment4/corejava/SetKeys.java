package assignment4.corejava;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
public class SetKeys {
public static void main(String[] args) {
		Hashtable<String,String> ht = new Hashtable<String,String>();
		ht.put("1","One");
		ht.put("2","Two");
		ht.put("3","Three");

		Set<String> st = ht.keySet();

		System.out.println("Set created from Hashtable Keys contains :");
		Iterator<String> itr = st.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
