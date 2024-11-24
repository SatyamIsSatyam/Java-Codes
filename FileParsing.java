//Red 95:Green 25:Blue 16


//Red = 95
//Green = 25
//Blue = 16


import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the contents you wish to print");
        String line = sc.nextLine();
        StringTokenizer line2 = new StringTokenizer(line, ":");

        while (line2.hasMoreTokens()) {
            String result = line2.nextToken();
            StringTokenizer line3 = new StringTokenizer(result);

            while (line3.hasMoreTokens()) {
                String Color = line3.nextToken();
                String Result2 = line3.nextToken();
                File f = new File("colors.txt");
                try {
                    FileWriter fc = new FileWriter(f, true);
                    fc.write(Color + "=" + Result2 + "\n");
                    fc.close();
                } catch (IOException io) {
                    System.out.println("IO Exception Occured");
                }

            }
	
	  }

        }
    }