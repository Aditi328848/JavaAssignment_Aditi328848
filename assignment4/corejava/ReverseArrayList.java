package assignment4.corejava;
import java.util.ArrayList;

public class ReverseArrayList {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Mandira");
		arrayList.add("Nakshatra");
		arrayList.add("Sahitya");
		arrayList.add("Aekansh");
		ReverseArrayList arrayrev = new ReverseArrayList();
		arrayrev.ReverseArrayList(arrayList);
		System.out.println("Before Reversing");
		for (String string : arrayList) {
			System.out.println(string);
		}

	}

	private void ReverseArrayList(ArrayList<String> arrayList) {

		ArrayList<String> revArrayList = new ArrayList<String>();
		for (int i = arrayList.size() - 1; i >= 0; i--) {
			revArrayList.add(arrayList.get(i));
		}
		System.out.println("Post Reversal");
		for (String string : revArrayList) {
			System.out.println(string);
		}
	}
}