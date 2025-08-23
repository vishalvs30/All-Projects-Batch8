package firstWeek;

public class BuiltInMethods {

	public static void main(String[] args) {
      String st="Hello";
      System.out.println(st.charAt(2));
      System.out.println(st.codePointAt(1));//return Ascii value
      System.out.println(st.codePointBefore(1));
      System.out.println(st.codePointCount(0, 3));
      System.out.println(st.equals("hello"));
      System.out.println(st.equalsIgnoreCase("hello"));
      System.out.println(st.isBlank());
      System.out.println(st.isEmpty());
      System.out.println(st.lastIndexOf('l'));
      System.out.println(st.contains("lo"));
      
		
	}

}
