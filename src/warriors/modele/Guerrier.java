package warriors.modele;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Guerrier extends Personnage{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static String type = "Guerrier";
	private final static int HEALTH = 5;
	private final static int STRENGTH = 5;
	private final static int MAX_HEALTH = 10;
	private final static int MAX_STRENGTH = 10;
	
	public Guerrier(String name) {
		super(type, name, HEALTH, STRENGTH, MAX_HEALTH, MAX_STRENGTH);
	}
	
	public void draw() {
		System.out.println("\r\n" + 
				"\r\n" + 
				"                           __.--|~|--.__                               ,,;/;\r\n" + 
				"                         /~     | |    ;~\\                          ,;;;/;;'\r\n" + 
				"                        /|      | |    ;~\\\\                      ,;;;;/;;;'\r\n" + 
				"                       |/|      \\_/   ;;;|\\                    ,;;;;/;;;;'\r\n" + 
				"                       |/ \\          ;;;/  )                 ,;;;;/;;;;;'\r\n" + 
				"                   ___ | ______     ;_____ |___....__      ,;;;;/;;;;;'\r\n" + 
				"             ___.-~ \\\\(| \\  \\.\\ \\__/ /./ /:|)~   ~   \\   ,;;;;/;;;;;'\r\n" + 
				"         /~~~    ~\\    |  ~-.     |   .-~: |//  _.-~~--,;;;;/;;;;;'\r\n" + 
				"        (.-~___     \\.'|    | /-.__.-\\|::::| //~     ,;;;;/;;;;;'\r\n" + 
				"        /      ~~--._ \\|   /          `\\:: |/      ,;;;;/;;;;;'\r\n" + 
				"     .-|             ~~|   |  /V\"\"\"\"V\\ |:  |     ,;;;;/;;;;;' \\\r\n" + 
				"    /                   \\  |  ~`^~~^'~ |  /    ,;;;;/;;;;;'    ;\r\n" + 
				"   (        \\             \\|`\\._____./'|/    ,;;;;/;;;;;'      '\\\r\n" + 
				"  / \\        \\                             ,;;;;/;;;;;'     /    |\r\n" + 
				" |            |                          ,;;;;/;;;;;'      |     |\r\n" + 
				"|`-._          |                       ,;;;;/;;;;;'              \\\r\n" + 
				"|             /                      ,;;;;/;;;;;'  \\              \\__________\r\n" + 
				"(             )                 |  ,;;;;/;;;;;'      |        _.--~\r\n" + 
				" \\          \\/ \\              ,  ;;;;;/;;;;;'       /(     .-~_..--~~~~~~~~~~\r\n" + 
				" \\__         '  `       ,     ,;;;;;/;;;;;'    .   /  \\   / /~\r\n" + 
				" /          \\'  |`._______ ,;;;;;;/;;;;;;'    /   :    \\/'/'       /|_/|   ``|\r\n" + 
				"| _.-~~~~-._ |   \\ __   .,;;;;;;/;;;;;;' ~~~~'   .'    | |       /~ (/\\/    ||\r\n" + 
				"/~ _.-~~~-._\\    /~/   ;;;;;;;/;;;;;;;'          |    | |       / ~/_-'|-   /|\r\n" + 
				"(/~         \\| /' |   ;;;;;;/;;;;;;;;            ;   | |       (.-~;  /-   / |\r\n" + 
				"|            /___ `-,;;;;;/;;;;;;;;'            |   | |      ,/)  /  /-   /  |\r\n" + 
				" \\            \\  `-.`---/;;;;;;;;;' |          _'   |T|    /'('  /  /|- _/  //\r\n" + 
				"   \\           /~~/ `-. |;;;;;''    ______.--~~ ~\\  |u|  ,~)')  /   | \\~-==//\r\n" + 
				"     \\      /~(   `-\\  `-.`-;   /|    ))   __-####\\ |a|   (,   /|    |  \\\r\n" + 
				"       \\  /~.  `-.   `-.( `-.`~~ /##############'~~)| |   '   / |    |   ~\\\r\n" + 
				"        \\(   \\    `-._ /~)_/|  /############'       |X|      /  \\     \\_\\  `\\\r\n" + 
				"        ,~`\\  `-._  / )#####|/############'   /     |i|  _--~ _/ | .-~~____--'\r\n" + 
				"       ,'\\  `-._  ~)~~ `################'           |o| ((~>/~   \\ (((' -_\r\n" + 
				"     ,'   `-.___)~~      `#############             |n|           ~-_     ~\\_\r\n" + 
				" _.,'        ,'           `###########              |g|            _-~-__    (\r\n" + 
				"|  `-.     ,'              `#########       \\       | |          ((.-~~~-~_--~\r\n" + 
				"`\\    `-.;'                  `#####\"                | |           \"     ((.-~~\r\n" + 
				"  `-._   )               \\     |   |        .       |  \\                 \"\r\n" + 
				"      `~~  _/                  |    \\               |   `---------------------\r\n" + 
				"        |/~                `.  |     \\        .     |  O    __.---------------\r\n" + 
				"         |                   \\ ;      \\             |   _.-~\r\n" + 
				"         |                    |        |            |  /  |\r\n" + 
				"          |                   |         |           |/'  |");
	}
	
	public Image getImage() {
		try {
			img = ImageIO.read(new File("C:\\Users\\belia\\eclipse-workspace\\warriosGame\\src\\img\\guerrierUI.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return img;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		if(this.img != null) {
			g2d.drawImage(this.img, 0, 0, Color.white, null);
		}
		if(this.arme != null) {
			if(this.arme.getImage() != null) {
				g2d.drawImage(this.arme.getImage(), 0, 0, null, null);
			}
		}
		
		g2d.setColor(Color.BLACK);
		g2d.setFont(new Font( "SansSerif", Font.BOLD, 20 ));
		g2d.drawString(this.name, 10, 20);

	}
}
