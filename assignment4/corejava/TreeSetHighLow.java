package assignment4.corejava;
import java.util.TreeSet;
public class TreeSetHighLow {
	

	public static void main(String[] args) {
		TreeSet<String> tSet = new TreeSet<String>();
		tSet.add("6");
	    tSet.add("3");
	    tSet.add("2");
	    tSet.add("5");
	    tSet.add("4");
	  
	    System.out.println("Lowest value Stored in Java TreeSet is : " + tSet.first());
	    System.out.println("Highest value Stored in Java TreeSet is : " + tSet.last());
	 
	}
}
