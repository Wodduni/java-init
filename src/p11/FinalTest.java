package p11;

class Test{//클래스에 파이널이 붙을 경우 상속(확장) 불가!!
	public final void test() {//메소드에 파이널이 붙을 경우 오버라이딩 불가...
		System.out.println("난 TEST꺼");
	}
}

public class FinalTest extends Test {
//	public void test() {
//		System.out.println("난 finalTest꺼");
//	}
	public static void main(String[] args) {
		int num = 1;
		num = 2;
		
	}
}
