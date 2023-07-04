package p06;

class Car{
	public String name;
	public static String type;
}
public class InstanceTest {
	public static void main(String[] args) {
		Car.type = "승용차";
		Car sonata = new Car();
		sonata.name = "sonata";
		
	}
}

