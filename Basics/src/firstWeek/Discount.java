package firstWeek;

public class Discount {
public static void main(String[] args) {
	int age=13;
	 boolean hasIdCard=true;
	 boolean isStudent=true;
	 
	 if (age >= 18 && hasIdCard) {
         System.out.println("Entry is Allowed.");
     } 

     
     if (age < 18 || isStudent) {
         System.out.println("Eligible for student discount.");
     } else {
         System.out.println("Not eligible for student discount.");
     }
	 
}
 
}
