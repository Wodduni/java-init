package p07;

public class GameExe {
	public static void runGame(Game game) {
		game.start();
		game.playing();
		game.stop();
	}
	public static void main(String[] args) {
		KOF kof = new KOF();
		kof.name = "The King Of Fighters";
		LeagueOfLegend leagueOfLegend = new LeagueOfLegend();
		leagueOfLegend.name = "League Of Legend";
		
		runGame(leagueOfLegend);
		runGame(kof);
	}
}
