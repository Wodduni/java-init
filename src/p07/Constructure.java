package p07;

//생정자는 데이터 타입이 없다
//오버로딩 가능

public class Constructure {
	Constructure() {
		// TODO Auto-generated constructor stub
		System.out.println("Hi");
	}
	
	public Constructure(int num) {
		System.out.println("Hi I'm int num");
		
	}
	public static void main(String[] args) {
		Constructure constructure = new Constructure();
	}
}
