// Write a program to accept name and age of a person from the command prompt (passed as arguments when you execute the class)
// and ensure that the age entered is >=18 and < 60.
// Display proper error messages. The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
// (Hint : Create a user defined exception class for handling errors.)


import java.util.Scanner;

class InvalidAgeException extends Exception{
	InvalidAgeException(String msg) {
		super(msg);
	}
}

class Person {
	public static void main(String[] args){
	String name;
	int age;
	if(args.length!=2){
	System.out.print("Wrong format");
	return;
       }
	name= args[0];

	try {
		age= Integer.parseInt(args[1]);
		if( age< 18 || age>= 60){
			throw new InvalidAgeException("Age is not in limit");
		}
	} catch (NumberFormatException nfe) {
		System.out.print("Wrong age format!");
	return;
	} catch(InvalidAgeException iae){
		System.out.print(iae);
		return;
	}
	System.out.println("You entered the name " + name);
	System.out.println("You entered the age " + age);

    }
}

