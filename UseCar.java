package day3;

public class UseCar {
	public static void main(String[] args) {
		Car c1=new Car();
		c1.brand="bmw";
		c1.model="XVI";
		c1.price=400000;
		c1.isPetrol=true;
		Car c2=new Car();
		c2.brand="tata";
		c2.model="IX";
		c2.price=300000;
		c2.isPetrol=true;
		Car c3=new Car();
		c3.brand="swift";
		c3.model="X2V";
		c3.price=200000;
		c3.isPetrol=true;
		int length1=c1.brand.length();
		int length2=c2.brand.length();
		int length3=c3.brand.length();
		int totalPrice=c1.price+c2.price+c3.price;
		String name1=c1.brand.toUpperCase();
		String name2=c2.brand.toUpperCase();
		String name3=c3.brand.toUpperCase();
		System.out.println(length1);
		System.out.println(length2);
		System.out.println(length3);
		System.out.println(totalPrice);
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		
		
		
		
	}

}
