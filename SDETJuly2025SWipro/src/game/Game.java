package game;

 class Game {
	String gameName = "Cricket";
	int gameId = 203;
	String gameType = "Outdoor";
	Game(String name, int id, String type) {
	}
 void displayGameInfo() {
	System.out.println("Game name is " + gameName);
	System.out.println("Game id is " + gameId);
	System.out.println("Game type is " + gameType);
	
}
	public static void main(String[] args) {
		Game obj3 = new Game("Cricket", 203, "Outdoor");
		obj3.displayGameInfo();

	}

}
