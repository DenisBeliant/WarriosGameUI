package warriors.vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Case extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private String type;
	private int x;
	private int number;
	private Image fond;
	private String path = "images\\";
	
	public Case(int x, String type, String fondUrl, int number) {
		
		this.x = x;
		this.type = type;
		this.number = number;
		
		
		try {
		//on récupère l'image à l'adresse où on l’a mise…

		fond=Toolkit.getDefaultToolkit().getImage((path + fondUrl));

		
		//fin chargement des images.
		}
		catch (Exception e)
		 {System.out.println("erreur dans le chargement des images:"+e);};
		 
	}
	
	public void paint(Graphics g) {
		
		g.setColor(new Color(0,0,20));
		g.fillRect(10 + this.x, 30, 100, 140);
		g.setColor(new Color(255,255,255));
		g.drawString("Case " + number, 16 + this.x, 42);
		g.drawImage(this.fond,20 + this.x, 50, 80, 80, null);
		g.drawString(this.type, this.x + 24, 160);
	}
}
