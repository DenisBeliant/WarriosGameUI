package warriors.vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import warriors.modele.LancementDeAction;

public class ActionsJoueurUI extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SpringLayout layout = new SpringLayout();
	private GUI fenetre;
	private JButton lancer;
	private JButton action;
	private JButton quitter;
	

	public ActionsJoueurUI(GUI fenetre) {
		
		this.fenetre = fenetre;
		this.setPreferredSize(new Dimension(220,300));
		this.setLayout(layout);
		lancer = new JButton(new LancementDeAction(this, "Lancer dé"));
		action = new JButton("Action");
		quitter = new JButton(new QuitterAction(fenetre,"Quitter"));
		lancer.setEnabled(false);
		action.setEnabled(false);
		
		Dimension dimensionsBoutons = new Dimension(100,40);
		lancer.setPreferredSize(dimensionsBoutons);
		action.setPreferredSize(dimensionsBoutons);
		quitter.setPreferredSize(dimensionsBoutons);
		lancer.setBackground(Color.GRAY);
		action.setBackground(Color.GRAY);
		quitter.setBackground(Color.GRAY);
		lancer.setForeground(Color.WHITE);
		action.setForeground(Color.WHITE);
		quitter.setForeground(Color.WHITE);
		
		layout.putConstraint(SpringLayout.NORTH, lancer, 70, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, lancer, 60, SpringLayout.WEST, this);
		
		layout.putConstraint(SpringLayout.NORTH, action, 10, SpringLayout.SOUTH, lancer);
		layout.putConstraint(SpringLayout.WEST, action, 60, SpringLayout.WEST, this);
		
		layout.putConstraint(SpringLayout.NORTH, quitter, 10, SpringLayout.SOUTH, action);
		layout.putConstraint(SpringLayout.WEST, quitter, 60, SpringLayout.WEST, this);
		
		this.add(lancer);
		this.add(action);
		this.add(quitter);
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(5, 5, this.getWidth(), this.getHeight());
	}
	
	public GUI getFenetre() {
		return this.fenetre;
	}
	
	public JButton getLancer() {
		return lancer;
	}

	public JButton getAction() {
		return action;
	}
	
}