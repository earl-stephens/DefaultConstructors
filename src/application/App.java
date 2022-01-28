package application;

public class App {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.greet();
		
		person.greet("Joe");
		
		person.greet(186);
		
		person.greet("Sally", 160);
		
		/* This is method overloading.  The methods differ in the
		 * arguments that are supplied.  Java picks the method that 
		 * uses the same data type of argument.
		 */

	}

}
