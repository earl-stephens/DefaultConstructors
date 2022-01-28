package application;

public class Person {
	public void greet() {
		System.out.println("Hello");
	}
	
	public void greet(String nameToGreet) {
		System.out.println("Hello " + nameToGreet);
	}
	
	public void greet(int height) {
		if(height > 185) {
			System.out.println("You are very tall!");
		}
	}
	
	public void greet(String name, int height) {
		System.out.println("Hello " + name + ", you are " + height + "cm tall.");
	}
}
