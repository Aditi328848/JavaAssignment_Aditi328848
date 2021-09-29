package assignment2.corejava;

public class DuplicatesInArray {
public static void main(String[] args) {
		
		String[] a = {"Raghu", "Rama", "Rama" , "Chakri","Chakri"};
		int[] b = {12, 32, 12, 45, 65, 93, 0, 23, 45, 6};
		DuplicatesInArray dup = new DuplicatesInArray();
		dup.findDupes(a);
		dup.findDupes(b);
	}

	private void findDupes(int[] b) {
		
		for (int i = 0; i < b.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				if(b[i]==b[j]) {
					System.out.println("Duplocate element is "+ b[i]);
				}
			} 
	}
	
	}

	private void findDupes(String[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
				System.out.println("Dup found " + a[i]) ;
				
				}
			
		}
			
	}
		
		
	}
}
