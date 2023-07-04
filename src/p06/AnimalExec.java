package p06;

public class AnimalExec {
	
	public static void printAnimals(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			if ("새".equals(animal.type)) {
				animal.fly();
			}
			
			if(!animal.name.equals("냥이")) {
				animal.hunt();
			}
				animal.run();
				animal.eat();
		}
	}
	
	public static void main(String[] args) {
		Animal tiger = new Animal();
		tiger.name = "호돌이";
		tiger.type = "호랑이";
	
//		tiger.eat();
//		tiger.run();
//		tiger.hunt();
		
		Animal cat = new Animal();
		cat.name = "냥이";
//		cat.type = "고양이";
//		catAnimal.eat();
//		catAnimal.run();
//		catAnimal.hunt();
		
		Animal bird = new Animal();
		bird.name = "구구";
		bird.type = "새";
		
		Animal[] animals = new Animal[3];
		animals[0] = tiger;
		animals[1] = cat;
		animals[2] = bird;
		
		printAnimals(animals);
		
		
	}
}
