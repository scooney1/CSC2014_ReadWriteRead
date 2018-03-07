/**
 * Author:	Sam Cooney
 * Project:	ReadWriteRead
 * Date:	Dec 6, 2017
 * I assert that the program I am submitting is the result of my own efforts.
 * General: 
 */

import java.util.Scanner;
import java.io.*;

public class ReadWriteRead {

	public static void main(String[] args) throws IOException {
		Box myBox = new Box(14.5);
		
		//--------------------------------Part 1--------------------------------
		
		Scanner fileScan = new Scanner(new File("C:/Users/Sam/Desktop/Data.txt"));	// Please change. Was having issues loading the file.
		int first, second, third;	// Declare integers.
		
		first = fileScan.nextInt();		// Read in first int.
		second = fileScan.nextInt();	// Read in second int.
		third = fileScan.nextInt();		// Read in third int.
		System.out.println("The following values have been read from the file:");
		System.out.println("First = " + first + "\tSecond = " + second + "\tThird = " + third);
		
		fileScan.close();	// Close scan.
		
		//--------------------------------Part 2--------------------------------
		
		String f2 = "test2.txt";					// Name file.
		PrintWriter outFile = new PrintWriter(f2);	// Instantiate object of class PrintWriter.
		
		outFile.print(15 + "    ");	//
		outFile.print(20 + "    ");	//
		outFile.println();			// Read Values into file.
		outFile.println(25);		//
		outFile.println(30);		//
		
		outFile.close();	// Close file.
		
		//--------------------------------Part 3--------------------------------
		
		Scanner fileScan2 = new Scanner(new File (f2));	// Instantiate object of class Scanner.
		String one, two, three, four;	// Declare strings.
		int w, x, y, z;					// Declare integers.
		
		one = fileScan2.next();			//
		two = fileScan2.next();			// Read in string values.
		three = fileScan2.next();		//
		four = fileScan2.next();		// 
		w = Integer.parseInt(one);		//
		x = Integer.parseInt(two);		// Change strings to ints.
		y = Integer.parseInt(three);	//
		z = Integer.parseInt(four);		//
		int sum = w + x + y + z;		// Declare and set value of sum.
		System.out.println("The sum is: " + sum);
		System.out.println();
		System.out.println(myBox);
		
		fileScan2.close();	// Close scan.
	}	// End main.

}	// End ReadWriteRead.java
