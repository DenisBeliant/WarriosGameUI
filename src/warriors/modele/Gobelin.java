package warriors.modele;

public class Gobelin extends Personnage {
	private static int STRENGTH = 4;
	private static int LIFE = 8;
	private static String name = "Gobelin";
	
	public Gobelin() {
		super(name, LIFE, STRENGTH);
	}
	
	public int getSTRENGTH() {
		return STRENGTH;
	}
	public int getLIFE() {
		return LIFE;
	}
	
	public void draw() {
		System.out.println("             ,      ,\r\n" + 
				"            /(.-\"\"-.)\\\r\n" + 
				"        |\\  \\/      \\/  /|\r\n" + 
				"        | \\ / =.  .= \\ / |\r\n" + 
				"        \\( \\   o\\/o   / )/\r\n" + 
				"         \\_, '-/  \\-' ,_/\r\n" + 
				"           /   \\__/   \\\r\n" + 
				"           \\ \\__/\\__/ /\r\n" + 
				"         ___\\ \\|--|/ /___\r\n" + 
				"       /`    \\      /    `\\\r\n" + 
				"  jgs /       '----'       \\");
	}
	
}
