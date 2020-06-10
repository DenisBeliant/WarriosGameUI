package warriors.modele;

/** <p> Exception pour afficher si le joueur va plus loin que <strong>la dernière case</strong></p> **/  
public class PersonnageHorsPlateauException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PersonnageHorsPlateauException() {
		System.out.println("Tu es sorti du plateau !");
	}
}
