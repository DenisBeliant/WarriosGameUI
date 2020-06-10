package warriors.vue;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

public class QuitterAction extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GUI fenetre;

	public QuitterAction(GUI fenetre, String texte){
		super(texte);
		this.fenetre = fenetre;
	}
	
	public void actionPerformed(ActionEvent e) { 
		if(JOptionPane.showConfirmDialog(this.fenetre,
	             "La partie ne sera pas sauvegardée.", 
	             "Quitter la partie",
	             JOptionPane.OK_CANCEL_OPTION) == 0) System.exit(0);
	} 
}