package p07;

class Mother{
	public void work() {
		System.out.println("Mother is working");
	}
}
class Dauther extends Mother{
	public void work() {
		System.out.println("Dauther is going company");
	}
	public void work(String job) {
		System.out.println("Dauther is " + job + "ing");
	}
}
public class Overriding2 {
	public static void work(Mother[] ms) {
		for (int i = 0; i < ms.length; i++) {
			Mother m = ms[i];
			if(m instanceof Dauther) {
				Dauther dauther = (Dauther)m;
				dauther.work("develop");
				
			}
		}
	}
	public static void main(String[] args) {
		Mother m = new Mother();
		Dauther d = new Dauther();
//		Dauther mother = new Dauther();
//		mother.work();
		
//		System.out.println(d instanceof Mother);//~라고 불러도 되니?, Boolean
//		System.out.println(m instanceof Mother);
		
//		System.out.println(d instanceof Dauther);
//		System.out.println(m instanceof Dauther);
		
		Mother[] ms = new Mother[2];
		ms[0] = d;
		ms[1] = m;
		
		
	}
}
