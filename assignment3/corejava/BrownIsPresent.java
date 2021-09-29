package assignment3.corejava;

public class BrownIsPresent {
	public static void main(String[] args) {
		String fromText = "A brown fox ran away fast" ;
		BrownIsPresent iT = new BrownIsPresent();
		iT.getText(fromText,"Brown");
		iT.getText(fromText,"Bexteno");
		iT.getText(fromText,"brown");
		iT.getText(fromText,"ran");

	}

	private void getText(String string, String isText) {
		
		String givenText = string;
		String findText = isText;
		int count=0;
		String[] split = givenText.split(" ");
		for (String splitString : split) {
			if(splitString.equals(findText)) {
				System.out.println(findText + " is present in the given string \""+ givenText+"\"");
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println(findText + " is not present in the given string \"" + givenText +"\"" );
		}
	}

}
