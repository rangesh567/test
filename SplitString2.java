package day3;

public class SplitString2 {
	public static void main(String[] args) {
		String sentence="ram$dhivya$shiva";
		String[] word=sentence.split("[$]");
		System.out.println(word[0]+"\n"+word[1]+"\n"+word[2]);
	}

}
