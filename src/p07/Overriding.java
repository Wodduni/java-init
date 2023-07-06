package p07;

class Coffee{
	public String name;
	public int price;
	
	public String toString() {
		return name +  "  : " + name + ", Price " + price;
	}
}

public class Overriding {
	public static void main(String[] args) {
		Coffee c1 = new Coffee();
		c1.name = "Ice Americano";
		c1.price = 2000;
		Coffee c2 = c1;
		Object object = c1;
		
		String string = c1.toString();
		System.out.println(" Menu : " + c1.name + ", Price " + c1.price);
		
	}
}
