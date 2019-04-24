package one;
import java.util.*; 
import java.io.File;
import java.io.IOException;
//import java.io.*;
public class USha1 {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("PLease enter A value here");
		String A= sc.nextLine();
		System.out.println("PLease enter B value here");
		
		String B= sc.nextLine();
		
		
		String c= A+B;
		System.out.println("Total amount here it is"+c);
		sc.close();
		String  path = "E:\\today\\myfirstjava.txt";
		File fi= new File(path);
		try {
			fi.createNewFile();
			System.out.println("file created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file not ceated");
		}
	}

}
