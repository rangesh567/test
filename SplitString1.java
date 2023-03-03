package day3;

public class SplitString1 {
	public static void main(String[] args) {
		String sentence="onesoft#technologies#institution";
		String sentence1="satheesh,hari,rangesh";
		String[] word=sentence.split("#");
		String[] word1=sentence1.split(",");
		System.out.println(word[0]+"\n"+word[1]+"\n"+word[2]);
		System.out.println(word1[0]+"\n"+word1[1]+"\n"+word1[2]);
		
		
		
	}

}
