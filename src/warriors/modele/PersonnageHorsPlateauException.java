package warriors.modele;

/** <p> Exception pour afficher si le joueur va plus loin que <strong>la derni�re case</strong></p> **/  
public class PersonnageHorsPlateauException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PersonnageHorsPlateauException() {
		System.out.println("Tu es sorti du plateau !");
	}
}
