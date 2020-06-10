package warriors.modele;

public class Nain extends Personnage {
	
	private final static String type = "Nain";
	private final static int health = 8;
	private final static int strength = 1;
	
	public Nain(String name) {
		super(type, name, health, strength, 10, 10);
	}
	
	public void draw() {
		System.out.println("                                                  ___I___\r\n" + 
				"                                                 /=  |  #\\\r\n" + 
				"                                                /.__-| __ \\\r\n" + 
				"                                                |/ _\\_/_ \\|\r\n" + 
				"                                                (( __ \\__))\r\n" + 
				"                                             __ ((()))))()) __\r\n" + 
				"                                           ,'  |()))))(((()|# `.\r\n" + 
				"                                          /    |^))()))))(^|   =\\\r\n" + 
				"                                         /    /^v^(())()()v^\\'  .\\\r\n" + 
				"                                         |__.'^v^v^))))))^v^v`.__|\r\n" + 
				"                                        /_ ' \\______(()_____(   |\r\n" + 
				"                                   _..-'   _//_____[xxx]_____\\.-|\r\n" + 
				"                                  /,_#\\.=-' /v^v^v^v^v^v^v^v^| _|\r\n" + 
				"                                  \\)|)      v^v^v^v^v^v^v^v^v| _|\r\n" + 
				"                                   ||       :v^v^v^v^v^v`.-' |#  \\,\r\n" + 
				"                                   ||       v^v^v^v`_/\\__,--.|\\_=_/\r\n" + 
				"                                   ><       :v^v____|  \\_____|_\r\n" + 
				"                                ,  ||       v^      /  \\       /\r\n" + 
				"                               //\\_||_)\\    `/_..-._\\   )_...__\\\r\n" + 
				"                              ||   \\/  #|     |_='_(     |  =_(_\r\n" + 
				"                              ||  _/\\_  |    /     =\\    /  '  =\\\r\n" + 
				"                               \\\\/ \\/ )/ gnv |=____#|    '=....#|\r\n" + 
				"                                `");
	}
}
