package p01;

public class StringCondition {
	public static void main(String[]args) {
		String s1 = "123";
		if(s1 == "123") {
			System.out.println("s1 is 123");
		}else {
			System.out.println("s1 is not 123");
		}
		String s2 = new String("123");
		if(s2 == "123") {
			System.out.print("s2 is 123");
		}else {
			System.out.println("s2 is not 123");
		}
		
		String s3 = "";
		System.out.println(s3.equals(" "));
		
		String s4 = "    123  ";
		System.out.println(s4.trim());
		
		String s5 = new String("1");
		System.out.println("1".equals(s5));
		System.out.println(s5.equals("1"));//지양하는 방법
		
		String s6 = null;
		System.out.println(s6.equals("1"));
		
	}
}
