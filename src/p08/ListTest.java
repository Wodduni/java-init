package p08;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {
	public static void main(String[] args) {
		String str = "Hi ";
		String str2 = "introduce ";
		String str3 = "my self ";
		String str4 = "my job is ";
		
		
		String[] strs = new String[5];
		strs[0] = str;
		strs[1] = str2;
		strs[2] = str3;
		strs[3] = str4;
		strs[4] = "Developer";
		for (int i = 0; i < strs.length; i++) {
			System.out.print(strs[i]);
			
		}
		
		ArrayList<String> strList = new ArrayList<String>(); // ArrayList는 add()로 데이터 추가, remove()로 삭제 가능 인덱스 값 입력
		strList.add("1");
		System.out.println(strList.size());
		strList.add("2");
		strList.add("3");
		strList.add("4");
		System.out.println(strList.size());
		strList.remove(0);
		System.out.println(strList.size());
		
		ArrayList<Integer>intList = new ArrayList<Integer>();
		intList.add(1);
		
		
		
	}
}
