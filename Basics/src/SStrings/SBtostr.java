package SStrings;

public class SBtostr {

	public static void main(String[] args) {

		String str="Hello";
		//convert String to StringBuffer/StringBuilder
		//immutable to mutable string
		StringBuffer sb = new StringBuffer(str);
		//Ssb.append(", Dear");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.substring(0,3));
		
		
	}

}
