package p04;

public class MethodTest3 {
	/*static*/ int  i =1;
	
	public static void test() {
		
	}
	
	public static int  getNum() {
		return 1;
	}
	public static void main(String[] args) {
//		System.out.println(i);
//		int i = test();
//		String string = test();
		int num = getNum();
		System.out.println(num);
	}
}
