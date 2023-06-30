package p05;

public class SongExec {
	
	public static void printSong(Song[] song) {
		for (int i = 0; i < song.length; i++) {
			System.out.println("제목 : " + song[i].name);
			System.out.println("가수 : " + song[i].singer);
			System.out.println("순위 : " + song[i].rank);
			System.out.println("");
		}	
	}
	
	public static void rankOfSong(Song[] song) {
		Song fSong = song[0];
		Song lSong = song[0];
		
		for (int i = 0; i < song.length; i++) {
			if (fSong.rank < song[i].rank) {
				fSong.rank = song[i].rank;
			}
			if (lSong.rank > song[i].rank) {
				lSong.rank = song[i].rank;
			}
		}
		System.out.println("1등 가수는 " + lSong.singer );
		System.out.println("꼴지 가수는 " + fSong.singer );
		
	}
	public static void main(String[] args) {
		
		
	Song[] songArray = new Song[5];
	
	songArray[0] = new Song();
	songArray[1] = new Song();
	songArray[2] = new Song();
	songArray[3] = new Song();
	songArray[4] = new Song();
		
		songArray[0].name = "OMG";
		songArray[0].singer = "NewJeans";
		songArray[0].rank = 1;
		
		songArray[1].name = "Attention";
		songArray[1].singer = "NewJeans";
		songArray[1].rank = 2;
		
		songArray[2].name = "Ditto";
		songArray[2].singer = "NewJeans";
		songArray[2].rank = 3;
		
		songArray[3].name = "AquaMan";
		songArray[3].singer = "BeenZino";
		songArray[3].rank = 6;
		
		songArray[4].name = "Always Awake";
		songArray[4].singer = "BeenZino";
		songArray[4].rank = 10;
		
//		printSong(song);
//		printSong(song1);
//		printSong(song2);
//		printSong(song3);
//		printSong(song4);
		
	
		
		printSong(songArray);
		rankOfSong(songArray);
		
 		
	}
}
