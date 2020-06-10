package warriors.modele;

public class Sorcier extends Personnage {
	
	private static int STRENGTH = 8;
	private static int LIFE = 4;
	private static String name = "Sorcier";
	
	public Sorcier() {
		super(name, LIFE, STRENGTH);
	}
	
	public int getSTRENGTH() {
		return STRENGTH;
	}
	public int getLIFE() {
		return LIFE;
	}
	
	public void draw() {
		System.out.println("                    ____ \r\n" + 
				"                  .'* *.'\r\n" + 
				"               __/_*_*(_\r\n" + 
				"              / _______ \\\r\n" + 
				"             _\\_)/___\\(_/_ \r\n" + 
				"            / _((\\- -/))_ \\\r\n" + 
				"            \\ \\())(-)(()/ /\r\n" + 
				"             ' \\(((()))/ '\r\n" + 
				"            / ' \\)).))/ ' \\\r\n" + 
				"           / _ \\ - | - /_  \\\r\n" + 
				"          (   ( .;''';. .'  )\r\n" + 
				"          _\\\"__ /    )\\ __\"/_\r\n" + 
				"            \\/  \\   ' /  \\/\r\n" + 
				"             .'  '...' ' )\r\n" + 
				"              / /  |  \\ \\\r\n" + 
				"             / .   .   . \\\r\n" + 
				"            /   .     .   \\\r\n" + 
				"           /   /   |   \\   \\\r\n" + 
				"         .'   /    b    '.  '.\r\n" + 
				"     _.-'    /     Bb     '-. '-._ \r\n" + 
				" _.-'       |      BBb       '-.  '-. \r\n" + 
				"(________mrf\\____.dBBBb.________)____)");
	}
}
