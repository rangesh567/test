package day3;

public class SplitString {
	public static void main(String[] args) {
		String sentence="This is a marker";
		String[] words=sentence.split("\\s ");
		System.out.println(words[0]+"\n"+words[1]+"\n"+ words[2]+ "\n"+ words[3]);
		
	}

}
