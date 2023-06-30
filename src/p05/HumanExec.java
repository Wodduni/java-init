package p05;

public class HumanExec {
	public static void printHumans(Human[] humans){
		for (int i = 0; i < humans.length; i++) {
			System.out.println("이름 : " + humans[i].name);
			System.out.println("가진 돈 : " +  humans[i].money);
			System.out.println();
		}
	}
	
	public static void  sumMoney(Human[] humans) {
		int sumMoney = 0;
		for (int i = 0; i < humans.length; i++) {
			Human money = humans[i];
			sumMoney += humans[i].money;
		}
		System.out.println("돈 총합 : " + sumMoney);
		moneyAverage(humans,sumMoney);
		
	}
	
	public static void moneyAverage(Human[] humans,int sumMoney) {
		System.out.println("평균 : " + sumMoney/humans.length);
		for (int i = 0; i < humans.length; i++) {
			if (humans[i].money > sumMoney/humans.length) {
				System.out.println("평균 이상 돈을 가진 사람 : "+humans[i].name);
			}
		}
	}
	public static void main(String[] args) {
		Human[] humans = new Human[5];
		
		humans[0] = new Human();
		humans[1] = new Human();
		humans[2] = new Human();
		humans[3] = new Human();
		humans[4] = new Human();
		
		humans[0].name = "이보성";
		humans[0].money = 10000;
		
		humans[1].name = "이왕균";
		humans[1].money = 0;
		
		humans[2].name = "이원기";
		humans[2].money = 14000;
		
		humans[3].name = "김용준";
		humans[3].money = 7000;
		
		humans[4].name = "이명관";
		humans[4].money = 9000;
		
		printHumans(humans);
		sumMoney(humans);
		
		
		
	}
}
