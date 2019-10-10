package eu.ensup.cabinet.domaine;

public class Patient {
	
	private String nom;
	private String prenom;
	private Medecin medecin;
	
	public Patient(){
		
	}

	public Patient(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	
}
