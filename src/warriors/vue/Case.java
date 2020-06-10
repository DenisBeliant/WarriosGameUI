package warriors.vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Case extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private String type;
	private int number;
	private Image fond;
	private String path = "images\\";
	
	public Case(String type, String fondUrl, int number) {
		
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
	
	public void paint(int x, Graphics g) {
		
		ImageIcon imgIcon = new ImageIcon(this.fond);
		
		g.setColor(new Color(0,0,20));
		g.fillRect(10 + (x*110), 30, 100, 140);
		g.setColor(new Color(255,255,255));
		g.drawString("Case " + number, 16 + (x*110) , 42);
		g.drawImage(this.fond,20 + (x*110), 50, 80, 80, null);
		g.drawString(this.type, 24 + (x*110), 160);
	}

	public void joueur(String type, String fondUrl, int number, Graphics g) {
		
		
		try {
		//on récupère l'image à l'adresse où on l’a mise…

		fond=Toolkit.getDefaultToolkit().getImage((path + fondUrl));

		
		//fin chargement des images.
		}
		catch (Exception e)
		 {System.out.println("erreur dans le chargement des images:"+e);};
		
		 ImageIcon imgIcon = new ImageIcon(this.fond);
		g.setColor(new Color(0,0,20));
		g.fillRect(10, 30, 100, 140);
		g.setColor(new Color(255,255,255));
		g.drawString("Case " + number, 16, 42);
		g.drawImage(fond,20, 50, 80, 80, null);
		g.drawString(type,  24, 160);
		
	}
}
