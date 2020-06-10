package warriors.modele;

public class Dragon extends Personnage{
	private static int STRENGTH = 4;
	private static int LIFE = 15;
	private static String name = "Dragon";
	
	public Dragon() {
		super(name, LIFE, STRENGTH);
	}
	
	public int getSTRENGTH() {
		return STRENGTH;
	}
	public int getLIFE() {
		return LIFE;
	}
	
	public void draw() {
		System.out.println("	\r\n" + 
				"                                _/|__\r\n" + 
				"            _,-------,        _/ -|  \\_     /~>.\r\n" + 
				"         _-~ __--~~/\\ |      (  \\   /  )   | / |\r\n" + 
				"      _-~__--    //   \\\\      \\ *   * /   / | ||\r\n" + 
				"   _-~_--       //     ||      \\     /   | /  /|\r\n" + 
				"  ~ ~~~~-_     //       \\\\     |( \" )|  / | || /\r\n" + 
				"          \\   //         ||    | VWV | | /  ///\r\n" + 
				"    |\\     | //           \\\\ _/      |/ | ./|\r\n" + 
				"    | |    |// __         _-~         \\// |  /\r\n" + 
				"   /  /   //_-~  ~~--_ _-~  /          |\\// /\r\n" + 
				"  |  |   /-~        _-~    (     /   |/ / /\r\n" + 
				" /   /           _-~  __    |   |____|/\r\n" + 
				"|   |__         / _-~  ~-_  (_______  `\\\r\n" + 
				"|      ~~--__--~ /  _     \\        __\\)))\r\n" + 
				" \\               _-~       |     ./  \\\r\n" + 
				"  ~~--__        /         /    _/     |\r\n" + 
				"        ~~--___/       _-_____/      /\r\n" + 
				"         _____/     _-_____/      _-~\r\n" + 
				"      /^<  ___       -____         -____\r\n" + 
				"         ~~   ~~--__      ``\\--__       ``\\\r\n" + 
				"                    ~~--\\)\\)\\)   ~~--\\)\\)\\)");
		
	}
}
