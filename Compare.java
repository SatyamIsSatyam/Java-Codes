// Write a program in Java with class Rectangle with the data fields width, length, area and color.
// The length, width and area are of double type and color is of string type.
// The methods are set_length() , set_width() , set_color(), and find_area().
//  Create two object ofRectangle and compare their area and color.
// If area and color same for the objects then display “Matching Rectangles” otherwise display “Non Matching Rectangle”.


class Rectangle{
	double width;
	double length;
	double area;
	String color;
	
	void set_length(double length){
		this.length= length;

	}
	void set_width(double widhth){
		this.width= width;

	}
	void set_color(string length){
		this.color= color;

	}
	double find_area(){
	area= length*width;
	return area;
	}
}
class Compare{
	public static void main(String[] args){
	Rectangle r1= new Rectangle();
	Rectangle r2= new Rectangle();
	r1.set_length(2);
	r2.set_length(2);
	r1.set_width(4);
	r2.set_width(4);
	r1.set_color("blue");
	r2.set_color("blue");
	r1.find_area();
	r2.find_area();

	if(r1.area==r2.area&& r1.color==r2.color){
	System.out.print("MAtching ones!!");
	else{
	System.out.print("Non-MAtching ones!!");
	}
    }
}



	
	
	