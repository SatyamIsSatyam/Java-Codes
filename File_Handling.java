//File Handling
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
	class File_Handling{
	    public static void main(String args[]){
		File n = new File("hi.txt");
			if(!n.exists()){
				try{
					n.createNewFile();
				}catch (IOException io){
					System.out.println("IO Exception Occured");
				}
			}
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter something you wish to");
			String line= sc.nextLine();
			try{
			    FileWriter file = new FileWriter("hi.txt");
			     file.write(line);
			     file.close();
			}catch(IOException io){
			    System.out.println("I/o Exception occured!");
			}
				

			try{
				Scanner fi = new Scanner(n);
				System.out.println("The written file contents are: " + fi.nextLine());
				fi.close();
				}catch(FileNotFoundException fnfe){
					 System.out.println("I/o Exception occured!");

			}
}
}				

			
			