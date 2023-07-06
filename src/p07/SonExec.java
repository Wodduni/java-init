package p07;
class Song{
	public int rank;
	public String title;
	public void printTitle() {
		System.out.println("Song's name : "+ title);
	}
	
}
public class SonExec {
	public static void main(String[] args) {
		Son son = new Son();
		son.name = "동동";
		son.job = "개발자";
		son.age = 30;
		son.hobby = "Game";
		son.printJob();
		son.printHobby();
//		Father father = new Son();
//		Son son2 = (Son)father;
//		son2.hobby = "toja";
		
		Song song = new Song();
		song.title = "OMG";
		song.printTitle();
		
		Father father = new Father();
		father.name = "동동이";
//		father.hobby = "낚시";

	}
}
