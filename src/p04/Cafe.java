package p04;

public class Cafe {
	public static String getCoffee(String order, int price) {
		int coffeePrice = 5000;
		String change;
		if(price < coffeePrice) {
			return "plz give me "+ (coffeePrice-price) +" more money";
		}
		String str = "";
		if(coffeePrice < price) {
			str = (price - coffeePrice) + "잔돈";
		}return coffeePrice + " 원짜리" + order + " 가 나왔습니다" + str;
		
	}
	public static void main(String[] args) {
		String coffee = getCoffee("Ice americano", 10000);
		System.out.println(coffee);
	}
}
