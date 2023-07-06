package p07;

public class Game {
	public String name;
	public int price;
	public String genre;
	
	public void start() {
		System.out.println(name + " is Start!!");
	}
	public void playing() {
		System.out.println(name + " is playing~~");
	}
	public void stop() {
		System.out.println(name + " is End...");
	}
}
