package firstWeek;

import java.util.Scanner;

public class Form {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Full Name");
	String Name=sc.nextLine();
	System.out.println("Enter your Mobile No");
	long No=sc.nextLong();
	sc.nextLine();
	System.out.println("Enter your email");
	String email=sc.nextLine();
	System.out.println("Enter Username");
	String user=sc.nextLine();
	System.out.println("Enter password");
	String Password=sc.nextLine();
	System.out.println("Enter Confirm Password");
	String cfPassword=sc.nextLine();
	if(Password.equals(cfPassword)) {
		System.out.println("password is correct");
	}
	
}
}
