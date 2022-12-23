package net.mcreator.galaxyrpmod.client;

public class ClientChakraData {
	private static int playerChakra;
	private static int playerMaxChakra;
	
	public static void set(int chakra, int maxChakra) {
		ClientChakraData.playerChakra = chakra;
		ClientChakraData.playerMaxChakra = maxChakra;
	}
	
	public static int getPlayerChakra() {
		return playerChakra;
	}
	
	public static int getPlayerMaxChakra() {
		return playerMaxChakra;
	}

}
