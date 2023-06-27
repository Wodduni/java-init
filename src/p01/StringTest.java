package p01;

public class StringTest {
	public static void main(String[] args) {
		String str = "1234567890";
		char c = str.charAt(0);
		System.out.print(c);
		
		String s1 = "1";
		String s2 = "1";
		System.out.print(s1 == s2);
		String s3 = new String("1");
		System.out.println(s1.equals(s3));
		
		int idx = str.indexOf("3");
		System.out.println(idx);
		int idx2 = str.indexOf("6");
		System.out.println(idx2);
		String str2 = str.substring(idx);
		System.out.println(str2);
		str2 = str.substring(idx, idx2);
		str2 = str.replace("1", "one");
		System.out.print(str2);
		
		String name = "Lee";
		name = name.toUpperCase();
		System.out.println(name);
		name = name.toLowerCase();
		System.out.println(name);
		

		

		
	}
}
 