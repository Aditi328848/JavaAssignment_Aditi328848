package assignment2.corejava;

public class SumOfDigits {
	public static void main(String[] args) {
		SumOfDigits sd = new SumOfDigits();
		sd.sumofDigits(9999);
		sd.sumofDigits(456732);

               sd.sumofDigits(56742211111);
	}

	private void sumofDigits(int i) {
		
		int r=0;
		int sum=0;
		while(i!=0) {
			r=i%10;
			sum=sum+r;
			i=i/10;
		}
		
		System.out.println(sum);
		
	}
}
