package warriors.vue;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

public class AideAction extends AbstractAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GUI fenetre;

	public AideAction(GUI fenetre, String texte){
		super(texte);
		
		this.fenetre = fenetre;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(fenetre, "Déroulement du jeu :\r\n Ce jeu se déroule en mode tour par tour. À chaque tour, le joueur va lancer un dé\r\n" + 
				"virtuel à 6 faces afin de connaître le nombre de cases duquel il avance :\r\n" + 
				"● Si la nouvelle case atteinte est vide : on passe au tour suivant.\r\n" + 
				"● Si la nouvelle case contient une caisse surprise :\r\n" + 
				"○ Équipement : l’équipement est rajouté au personnage si et seulement:\r\n" + 
				"■ Le personnage est compatible avec cet équipement\r\n" + 
				"■ L’équipement actuel est moins avantageux que le nouveau.\r\n" + 
				"○ Potions : Le personnage récupère le nombre de points de vie défini par\r\n" + 
				"le type de potion.\r\n" + 
				"● Si la nouvelle case atteinte contient un ennemi, le combat s’engage.\r\n" + 
				"");
	}
	
}