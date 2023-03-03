package day3;

public class StringMethods {
	public static void main(String[] args) {
		String name= "Rangesh";
		String nameUpper=name.toUpperCase();
		System.out.println(nameUpper);
		String nameLower=name.toLowerCase();
		System.out.println(nameLower);
		boolean equals=name.equals("RANGESH");
		System.out.println(equals);
		boolean equalsIgnore=name.equalsIgnoreCase("RANGESH");
		System.out.println(equalsIgnore);
		boolean startsWith=name.startsWith("RAN");
		System.out.println(startsWith);
		boolean endsWith=name.endsWith("esh");
		System.out.println(endsWith);
		boolean contains=name.contains("ges");
		System.out.println(contains);
		 
		
		
		
	}

}
