package warriors.vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ActionsUI extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String texte1 = null;
	private String texte2 = null;
	private String imgObjet = "Porte";
	private String imgAdresse="images\\";
	private Image img;
	
	public ActionsUI() {
		this.setPreferredSize(new Dimension(1000,400));
	}
	
	public ActionsUI(String texte1) {
		this.setPreferredSize(new Dimension(1000,400));
		this.texte1 = texte1;
	}
	
	public ActionsUI(String texte1, String texte2) {
		this.setPreferredSize(new Dimension(1000,400));
		this.texte1 = texte1;
		this.texte2 = texte2;
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		//on charge les images
		try {
		//on r�cup�re l'image � l'adresse o� on l�a mise�
			String imgObjet = this.imgObjet + ".png";
		this.img=Toolkit.getDefaultToolkit().getImage(imgAdresse + imgObjet);
		
		//fin chargement des images.
		}
		catch (Exception e)
		 {System.out.println("Erreur dans le chargement des images:"+e);};
		
		g2d.setColor(Color.GRAY);
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		int sizeWidth = 550;
		int sizeHeight = 300;
		
		ImageIcon imgIcon = new ImageIcon(this.img);
		g2d.drawImage(this.img, this.getWidth()/2 - (sizeWidth/2),this.getHeight() / 2 - (sizeHeight/2),sizeWidth,sizeHeight, this);
		
		g.setColor(Color.WHITE);
		g.setFont(new Font("Courier New", Font.ITALIC, 20));
		
		if(texte1 != null) g.drawString(texte1, 5, 20);
		
		if(texte2 != null) g.drawString(texte2, 640, 380);
		
	}

	public void setImgObjet(String imgObjet) {
		this.imgObjet = imgObjet;
	}

	public void setTexte1(String texte1) {
		this.texte1 = texte1;
	}

	public void setTexte2(String texte2) {
		this.texte2 = texte2;
	}
	
	
	
}
