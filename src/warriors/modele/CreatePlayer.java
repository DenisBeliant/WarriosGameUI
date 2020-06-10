package warriors.modele;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import warriors.vue.GUI;

public class CreatePlayer extends AbstractAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GUI fenetre;

	public CreatePlayer(GUI fenetre, String texte){
		super(texte);
		
		this.fenetre = fenetre;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String[] type = {"Guerrier", "Magicien", "Elfe", "Nain"};
		
		String name = (String) JOptionPane.showInputDialog(fenetre, "Choississez le nom du joueur :", "Nom du joueur", JOptionPane.INFORMATION_MESSAGE);
		String reponseType = (String) JOptionPane.showInputDialog(fenetre, "Salut à toi " + name + " !", "Type de joueur", JOptionPane.QUESTION_MESSAGE, null, type, type[0]);
		
		fenetre.getInfo().getPseudo().setText(name + "Type : " + reponseType);
		fenetre.getInfo().setType(reponseType);
		fenetre.getActionsJoueur().getLancer().setEnabled(true);
		fenetre.repaint();
	}
	
}