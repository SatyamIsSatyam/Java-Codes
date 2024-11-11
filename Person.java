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

