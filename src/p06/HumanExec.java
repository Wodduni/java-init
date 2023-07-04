package p06;

public class HumanExec {
	public static void main(String[] args) {
		Human human1 = new Human();
		Human human2 = new Human();
		Human human3 = new Human();
		Human human4 = new Human();
		Human human5 = new Human();
		
		human1.name = "Lee";
		human1.age = 25;
		
		human2.name = "Bo";
		human2.age = 20;
		
		human3.name = "Wang";
		human3.age = 15;
		
		human4.name = "Kee";
		human4.age = 30;
		
		human5.name = "Dding";
		human5.age = 50;
		
		Human[] humans = new Human[5];
		humans[0] = human1;
		humans[1] = human2;
		humans[2] = human3;
		humans[3] = human4;
		humans[4] = human5;
		
		Human max = humans[0];
		Human min = humans[0];
		
		int minIdx = 0;
		int maxIdx = 0;
		
		
		for (int i = 1; i < humans.length; i++) {
			
			if (max.age < humans[i].age) {
				max = humans[i];
			
			}
			if (min.age > humans[i].age) {
				min = humans[i];
				
			}
			
		}
		
		System.out.println("최고령 : " + max.age);
		System.out.println("최연소 : " + min.age);
		
		int ageSum = 0;
		
		for (int i = 0; i < humans.length; i++) {
			ageSum += humans[i].age;
		}
		
		int ageAverage = ageSum / humans.length;
		
		System.out.println("모든 나이의 합 : " + ageSum);
		System.out.println("나이 평균 : " + ageSum / humans.length);
		
		for (int i = 0; i < humans.length; i++) {
			int fritsAverage = Math.abs(ageAverage - humans[i].age);
		}
//		
//		int[] bestAverage = new int[5];
//		
//		for (int i = 0; i < humans.length; i++) {
//			
//			if (ageAverage < humans[i].age) {
//				bestAverage[i] = humans[i].age - ageAverage;
//			}else if (ageAverage > humans[i].age) {
//				bestAverage[i] =ageAverage - humans[i].age;
//			}
//		}
//		
//		int minAverage = bestAverage[0];
//		int minAverageIdx = 0;
//		
//		for (int i = 0; i < bestAverage.length; i++) {
//			if (minAverage > bestAverage[i]) {
//				minAverage = bestAverage[i];
//				minAverageIdx = i;
//			}
//		}
//		System.out.println("평군에서 가장 근접한 사람 : " + humans[minAverageIdx].name);
		
		
	}
}
