package p09;

public class SortTest {
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 4;
		int n3 = 35;
		int n4 = 17;
		int n5 = 18;
		
		if(n1 > n2) {
			int tmp = n1;
			n1 = n2;
			n2 = tmp;
		}
		if(n1 > n3) {
			int tmp = n1;
			n1 = n3;
			n3 = tmp;
		}
		if(n1 > n4) {
			int tmp = n1;
			n1 = n4;
			n4 = tmp;
		}
		if(n1 > n5) {
			int tmp = n1;
			n1 = n5;
			n5 = tmp;
		}
		if(n2 > n3) {
			int tmp = n2;
			n2 = n3;
			n3 = tmp;
		}
		if(n2 > n4) {
			int tmp = n2;
			n2 = n4;
			n4 = tmp;
		}
		if(n2 > n5) {
			int tmp = n2;
			n2 = n5;
			n5 = tmp;
		}
		if(n3 > n4) {
			int tmp = n3;
			n3 = n4;
			n4 = tmp;
		}
		if(n3 > n5) {
			int tmp = n3;
			n3 = n5;
			n5 = tmp;
		}
		if(n4 > n5) {
			int tmp = n4;
			n4 = n5;
			n5 = tmp;
		}
		
		System.out.println(n1+", "+n2+", "+n3+", "+n4+", "+n5);
		
	}

}
