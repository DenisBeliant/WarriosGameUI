package warriors.modele;

public class PetitePotion extends Potions {
	
	private final static int GIVE = 3;
	
	public PetitePotion() {
		super("Petite-Potion", GIVE);
	}
	
	public void draw() {
		System.out.println("      _____\r\n" + 
				"     `.___,'\r\n" + 
				"      (___)\r\n" + 
				"      <   >\r\n" + 
				"       ) (\r\n" + 
				"      /`-.\\\r\n" + 
				"     /     \\\r\n" + 
				"    / _    _\\\r\n" + 
				"   :,' `-.' `:\r\n" + 
				"   |         |\r\n" + 
				"   :         ;\r\n" + 
				"    \\       /\r\n" + 
				"     `.___.' ");
	}
}
