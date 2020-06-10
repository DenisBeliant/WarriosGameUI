package warriors.vue;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SpringLayout;

import warriors.modele.AideAction;
import warriors.modele.CreatePlayer;
import warriors.modele.Personnage;

public class GUI extends JFrame {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SpringLayout layout = new SpringLayout();
	private InfosJoueurUI infos;
	private ActionsUI actions;
	private ActionsJoueurUI actionsJoueur;
	private PlateauUI plateau;
	private JMenuItem creerPerso;


	public GUI() {
		this.setSize(1280,720);
		
		this.setLayout(this.layout);
		Container contentPane = this.getContentPane();
		this.setTitle("Warrriors Game !");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setBackground(Color.BLACK);
		actions = new ActionsUI("Lance une partie,", "Pour entrer dans le donjon..");
		infos = new InfosJoueurUI();
		actionsJoueur = new ActionsJoueurUI(this);
		plateau = new PlateauUI();
		plateau.createPlateau();
		
		layout.putConstraint(SpringLayout.NORTH, actions, 5, SpringLayout.NORTH, contentPane);
		
		layout.putConstraint(SpringLayout.NORTH, infos, 5, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.EAST, infos, -30, SpringLayout.EAST, contentPane);
		
		layout.putConstraint(SpringLayout.NORTH, actionsJoueur, 20, SpringLayout.SOUTH, infos);
		layout.putConstraint(SpringLayout.EAST, actionsJoueur, -30, SpringLayout.EAST, contentPane);
		
		layout.putConstraint(SpringLayout.SOUTH, plateau, -40, SpringLayout.SOUTH, contentPane);
		
		menu();
		this.getContentPane().add(infos);
		this.getContentPane().add(actions);
		this.getContentPane().add(actionsJoueur);
		this.getContentPane().add(plateau);
		
		this.setVisible(true);
	}
	

	public ActionsUI getActions() {
		return actions;
	}


	public InfosJoueurUI getInfo() {
		return this.infos;
	}
	
	public ActionsJoueurUI getActionsJoueur() {
		return actionsJoueur;
	}

	public PlateauUI getPlateau() {
		return this.plateau;
	}
	private void menu() {
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Warriors");
		//JMenu config = new JMenu("Configurations");
		JMenu aide = new JMenu("?");
		
		JMenuItem regles = new JMenuItem(new AideAction(this, "> Règles du jeu"));
		
		JMenuItem partieRapide = new JMenuItem(new QuickGame(this, "> Partie rapide"));
		creerPerso = new JMenuItem(new CreatePlayer(this, "> Création du personnage"));
		JMenuItem quitter = new JMenuItem(new QuitterAction(this, "> Quitter"));
		
		menuBar.add(menu);
		//menuBar.add(config);
		menuBar.add(aide);
		
		aide.add(regles);
		
		menu.add(partieRapide);
		menu.add(creerPerso);
		menu.add(quitter);
		
		setJMenuBar(menuBar);
}
	
	public void restart() {
		creerPerso.doClick();;
	}

}