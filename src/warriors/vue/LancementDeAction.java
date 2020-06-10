package warriors.vue;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class LancementDeAction extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ActionsJoueurUI fenetre;

	public LancementDeAction(ActionsJoueurUI fenetre, String texte){
		super(texte);
		this.fenetre = fenetre;
	}
	
	public void actionPerformed(ActionEvent e) { 
		
		int resultatDe = lancementDe();
		fenetre.getFenetre().getActions().setTexte1("Lancement du dé...");
		fenetre.getFenetre().getActions().setTexte2("Le dé à fait un " + resultatDe);
		fenetre.getFenetre().getActions().setImgObjet("De" + resultatDe);
		fenetre.getFenetre().repaint();
	} 
	
	private int lancementDe() {
		int de = (int) (Math.random() * 6) + 1;
		return de;
	}
}