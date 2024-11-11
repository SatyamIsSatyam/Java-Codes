// 2. Create a class named ‘Animal’ which includes methods like eat() and sleep().
// Create a child class of Animal named ‘Bird’ and override the parent class methods.
// Add a new method named fly(). Create an instance of Animal class and invoke the eat and sleep methods using this object.
// Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.


class Animal{
	void eat() {
		System.out.println("ANimal is hungry");
	}
	void sleep(){
		System.out.println("ANimal is awake");
  }
}
class Bird extends Animal{
	void eat(){
	  System.out.println("Bird is eating");

   }
	void sleep(){
	  System.out.println("Bird is sleeping");

  }
	void fly(){
          System.out.println("Bird is flying");
  }
}
class Animal1{
	public static void main(String[] args){
	Animal a1= new Animal();
	a1.eat();
	a1.sleep();
	Bird b1= new Bird();
	b1.eat();
	b1.sleep();
	b1.fly();
 }
}	