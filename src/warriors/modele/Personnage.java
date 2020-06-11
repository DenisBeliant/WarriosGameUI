package warriors.modele;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import warriors.vue.GUI;

public abstract class Personnage extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type;
	protected String name;
	public Armes arme = new MainNues();
	private int health;
	private int maxStrength;
	private int strength;
	private int maxHealth = 100;
	private int position = 0;
	private int maxPlateau;
	protected Image img;
	private GUI frame;
	/**
	private String image; Commentée car non utilisée
	*/ 
	abstract public void draw();
	
	public Personnage() {

		this.type = "Inconnu";
	};
	
	public Personnage(String name, int health, int strength, GUI frame) {
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.frame = frame;
	}
	
	public Personnage(String name, int health, int strength) {
		this.name = name;
		this.health = health;
		this.strength = strength;
	}
	
	public void setMax(int MAX) {
		maxPlateau = MAX;
	}
	
	public Personnage(String type, String name, int health, int strength, int maxStrength, int maxHealth) {
		
		this.type = type;
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.maxHealth = maxHealth;
		this.maxStrength = maxHealth;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(health + this.health <= maxHealth) this.health += health;
		else this.health = maxHealth;
	}

	public int getPosition() {
		return position;
	}
	
	/** Setters qui vérifie si le personnage ne dépasse pas le plateau **/
	public void setPosition(int position) throws PersonnageHorsPlateauException {
		
			if(this.position + position >= this.maxPlateau || this.position + position <= 0) {
				
				
				if(this.position + position >= this.maxPlateau) { 
				
				this.position = maxPlateau;
				
				} else {
					this.position = 0;
				}
				
				throw new PersonnageHorsPlateauException();
			}
			else
			{
				this.position += position;
			}
	}
	

	public void setArme(Armes arme) {
		this.arme = arme;
	}

	public int getMaxStrength() {
		return maxStrength;
	}

	public int getMaxHealth() {
		return maxHealth;
	}
	
	public String drawLife(int health) {
		
		String heart = "";

		for(int i = 0; i < health; i++) {
			heart += "♥";
		}
		return heart;
	}
	
	public String drawStrength(int max) {
		
		String strength = "";

		for(int i = 0; i < max; i++) {
			strength += "☩";
		}
		return strength;
	}

	@Override
	public String toString() {
		return "Personnage Type: " + type + "\rNom: " + name + "\rAttaque: " + strength + "\rVie: " + health
				+ "\rForce Max: " + maxStrength + "\rVie Max: " + maxHealth + "\rPosition: " + position;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		if(this.img != null) {
			g2d.drawImage(this.img, 0, 0, Color.white, null);
		}
		if(this.arme != null) {
			if(this.arme.getImage() != null) {
				g2d.drawImage(this.arme.getImage(), 0, 0, null, null);
			}
		}
		
		g2d.setColor(Color.BLACK);
		g2d.setFont(new Font( "SansSerif", Font.BOLD, 20 ));
		g2d.drawString(this.name, 10, 20);

	}
	
public void interactions(String type) {
		
	System.out.println(type);
		switch (type) {
		case "Joueur": break;
		case "Vide":
			break;
		case "Ennemi":
			combat();
			break;
		case "Arme":
			porterArme();
			break;
		case "Potion":
			prendrePotion();
			break;
		case "Surprise":
			prendrePotion();
			break;
		case "Arrivee":
			arrivee();
			break;
		}
	}

	public void arrivee() {
		this.frame.getActions().setTexte1("Bravo " + name + " !");
		this.frame.getActions().setTexte2("Tu as gagné !");
		this.frame.getActions().setImgObjet("Arrivee");
		this.frame.getActions().repaint();
	}
	public void porterArme() {

		int random = (int) (Math.random() * 4) + 1;
		Armes porte;

		switch (random) {
		case 1:
			porte = new Epee();
			System.out.println("Epee");
			this.frame.getActions().setTexte1("Tu as trouvé une épée !");
			break;
		case 2:
			porte = new Massue();
			System.out.println("Massue");
			this.frame.getActions().setTexte1("Tu as trouvé une massue !");
			break;
		case 3:
			porte = new Eclair();
			System.out.println("Eclair");
			this.frame.getActions().setTexte1("Tu as trouvé un éclair !");
			break;
		case 4:
			porte = new BouleDeFeu();
			System.out.println("Boule");
			this.frame.getActions().setTexte1("Tu as trouvé une boule de feu !");
			break;
		default:
			porte = new BouleDeFeu();
			System.out.println("Defaut");
			break;
		}

		if (this.type == porte.getFOR() && porte.getStrenth() >= arme.getStrenth()) {
			
			setArme(porte);
			this.frame.getInfo().getArme().setText("Arme : " + porte.getName() + " (" + porte.getStrenth() + ")");
			this.frame.getInfo().repaint();
		}
		else if (porte.getStrenth() < arme.getStrenth())
			this.frame.getActions().setTexte2("Cette arme est moins bien que la tienne !");
		else
			this.frame.getActions().setTexte2("Cette arme n'est pas pour toi !");
		
		this.frame.getActions().setImgObjet(porte.getName());
		this.frame.getActions().repaint();
	}

	public void prendrePotion() {
		int random = (int) (Math.random() * 1);
		Potions potion;

		if (random == 1)
			potion = new PetitePotion();
		else
			potion = new GrandePotion();

		this.frame.getActions().setTexte1("Une " + potion.getName() + " apparait");
		this.frame.getActions().setImgObjet(potion.getName());
		this.frame.getActions().setTexte2("Elle te regénère de " + potion.getHeal() + " points de vie");
		this.frame.getActions().repaint();
		setHealth(potion.getHeal());
		this.frame.getInfo().getVie().setText("Vie : " + drawLife(health));
		this.frame.getInfo().repaint();
		
	}

	public void combat() {

		/** Choisi l'ennemi de manière aléatoire */
		int random = (int) (Math.random() * 3) + 1;
		Personnage ennemi;
		switch (random) {
		case 1:
			ennemi = new Sorcier();
			break;
		case 2:
			ennemi = new Gobelin();
			break;
		case 3:
			ennemi = new Dragon();
			break;
		default:
			ennemi = new Gobelin();
			break;
		}
		
		this.frame.getActions().setTexte1("Un " + ennemi.getName() + " apparait");
		this.frame.getActions().setImgObjet(ennemi.getName());
		this.frame.getActions().setTexte2("Il a " + ennemi.getStrength() + " de force");

		this.frame.getActions().repaint();
		/** Continu tant que l'ennemi et le joueur ont de la vie */
//		while (ennemi.getHealth() > 0 && player.getHealth() > 0) {

			/** Si le joueur décide de se battre, on lance les combats */
			if (JOptionPane.showConfirmDialog(this.frame,
		             "Lancer le combat ?", 
		             "Se battre ou fuir ?",
		             JOptionPane.OK_CANCEL_OPTION) == 0) {

				System.out.println(getName() + " : " + drawLife(getHealth()));
				System.out.println("||			VS			||");
				System.out.println(ennemi.getName() + " : " + ennemi.drawLife(ennemi.getHealth()));
				/** Attaque du player */
				if (reussi()) {

					int total = this.strength + arme.getStrenth();
					this.frame.getActions().setTexte1(getName() + " frappe le " + ennemi.getName() + " avec " + total
							+ " points de force.");
					
					ennemi.setHealth(-(this.strength+ arme.getStrenth()));
					
				} else
					this.frame.getActions().setTexte1("Ton attaque a raté..");

				
				/** Attaque de l'ennemi */
				if (ennemi.getHealth() > 0) {

					if (reussi()) {

						this.frame.getActions().setTexte1(ennemi.getName() + " te frappe");
						setHealth(-(ennemi.getStrength()));
						this.frame.getActions().setTexte2("Il te retire " + ennemi.getStrength() + " points");
						this.frame.getInfo().getVie().setText("Vie : " +drawLife(health));
						this.frame.getInfo().repaint();
					}

					else
						this.frame.getActions().setTexte2("Son attaque a raté..");

				}

				else
					this.frame.getActions().setTexte1("Le " + ennemi.getName());
				this.frame.getActions().setTexte2("est mort..");

			}

			/** Sinon on recule d'un nombre de cases random */
			else {
				try {
					int recule = (int) (Math.random() * 6) + 1;
					setPosition(recule);
					this.frame.getActions().setTexte1("Tu as choisi de fuir !");
					this.frame.getActions().setTexte2("Tu recules donc de " + recule + " cases");
				} catch (PersonnageHorsPlateauException e) {

					try {

						setPosition(0);
					} catch (PersonnageHorsPlateauException r) {
					}
				}
			}
			if(this.health < 1) {
				this.frame.getActions().setTexte1(name);
				this.frame.getActions().setTexte2("est mort..");
				this.frame.getActions().setImgObjet("Mort");

				if (JOptionPane.showConfirmDialog(this.frame,
			             "Fin de partie", 
			             "Recommencer ?",
			             JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.frame.restart();
				}
				else System.exit(0);
				
				this.frame.getActions().repaint();
			}

	}

	public boolean reussi() {
		int random = (int) (Math.random() * 10) + 1;
		if (random > 4)
			return true;
		else
			return false;
	}

	public void setFrame(GUI frame) {
		this.frame = frame;
	}

}

