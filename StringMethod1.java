package day3;

public class StringMethod1 {
	public static void main(String[] args) {
		String name="Hari";
		String lastname="haran";
		String fullname=name.concat(lastname);
		System.out.println(fullname);
		int lenght=name.length();
		System.out.println(lenght);
		int index=name.indexOf("i");
		System.out.println(index);
		char letter=lastname.charAt(1);
		System.out.println(letter);
		int len=lastname.length();
		char lastletter=lastname.charAt(len-1);
		System.out.println(lastletter);
		
	}

}
