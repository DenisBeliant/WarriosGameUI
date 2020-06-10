package warriors.vue;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

public class QuickGame extends AbstractAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GUI fenetre;

	public QuickGame(GUI fenetre, String texte){
		super(texte);
		
		this.fenetre = fenetre;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(fenetre, "Vous avez choisi de faire une partie rapide.", "Partie Rapide", JOptionPane.INFORMATION_MESSAGE);
		
		String[] type = {"Guerrier", "Magicien", "Elfe", "Nain"};
		int r = (int) (Math.random() * type.length);
		
		fenetre.getInfo().getPseudo().setText("Butters Type : " + type[r]);
		fenetre.getInfo().setType(type[r]);
		fenetre.getActionsJoueur().getLancer().setEnabled(true);
		fenetre.repaint();
	}
	
}