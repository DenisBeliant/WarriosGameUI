package warriors.vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class InfosJoueurUI extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SpringLayout layout = new SpringLayout();
	private Image Img;
	private JLabel pseudo;
	private String type = "Default";
	private String imgAdresse="images\\";
	

	public InfosJoueurUI() {
		
		 // adresse de l’image
		
		
		
		this.setPreferredSize(new Dimension(220,300));
		this.setLayout(layout);
		pseudo = new JLabel("Pseudo du joueur");
		JLabel vie = new JLabel("Vie :");
		JLabel force = new JLabel("Force :");
		JLabel arme = new JLabel("Arme :");
		
		layout.putConstraint(SpringLayout.NORTH, pseudo, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, pseudo, 50, SpringLayout.WEST, this);
		
		layout.putConstraint(SpringLayout.WEST, arme, 30, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.WEST, force, 30, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.WEST, vie, 30, SpringLayout.WEST, this);
		
		layout.putConstraint(SpringLayout.SOUTH, arme, -20, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.SOUTH, force,-20, SpringLayout.SOUTH, arme);
		layout.putConstraint(SpringLayout.SOUTH, vie,-20, SpringLayout.SOUTH, force);
		
		this.add(pseudo);
		this.add(vie);
		this.add(force);
		this.add(arme);
		
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(5, 5, this.getWidth(), this.getHeight());
		
		//on charge les images
		try {
		//on récupère l'image à l'adresse où on l’a mise…
			String imgPerso = this.type + ".png";
		Img=Toolkit.getDefaultToolkit().getImage(imgAdresse + imgPerso);
		
		//fin chargement des images.
		}
		catch (Exception e)
		 {System.out.println("Erreur dans le chargement des images:"+e);};
		 
		g.drawImage(Img, 60, 40, 100, 150, null);

	}
	

	public JLabel getPseudo() {
		return this.pseudo;
	}
	
	public void setType(String type) {
		this.type = type;
	}

}
