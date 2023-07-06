package p07;

import java.security.PublicKey;


public class OverLoading {
	public void test() {
		System.out.println("test() 호출");
	}
	public void test(String strNum) {
		System.out.println("test(Stirng ) 호출");
	}
	public void test(char ca) {
		System.out.println("test(char ) 호출");
	}
	public void test(byte bt) {
		System.out.println("test(byte ) 호출");
	}
	public void test(short st) {
		System.out.println("test(short ) 호출");
	}
	public void test(int num) {
		System.out.println("test(int ) 호출");
	}
	public void test(long lg) {
		System.out.println("test(long ) 호출");
	}
	public void test(double db) {
		System.out.println("test(Stirng ) 호출");
	}
	public void test(float fl) {
		System.out.println("test(float ) 호출");
	}

	public void test(boolean bool) {
		System.out.println("test(boolean strNum) 호출");
	}
	
	public static void main(String[] args) {
		OverLoading overLoading = new OverLoading();
		long lg = 10;
		overLoading.test();
		overLoading.test("a");
		overLoading.test("String");
		overLoading.test((byte)0);
		overLoading.test((short)0);
		overLoading.test(0);
		overLoading.test(lg);
		overLoading.test((float)2.2);
		overLoading.test(2.2);
		
		System.out.println();
		
		
	}
}
