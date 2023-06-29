package p04;

public class MethodTest {
	public static int getNum() {
		return 0;
	}
	
	public static String getStr() {
		return "리턴값";
	}
	
	public static void test() {
		return ;
	}
	
	public static void main(String[] args) {
		int a = 1;
		int b = getNum();
		System.out.println(b);
		
		String string = getStr();
		System.out.println(string);
		
		
	}
}
