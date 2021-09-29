package assignment2.corejava;

public class SumOfDigits {
	public static void main(String[] args) {
		SumOfDigits sd = new SumOfDigits();
		sd.sumofDigits(1234);
		sd.sumofDigits(222222222);


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
