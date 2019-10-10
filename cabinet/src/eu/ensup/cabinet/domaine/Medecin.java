package eu.ensup.cabinet.domaine;

public class Medecin {

	private String nom;
	private String prenom;
	private Patient patient;
	
	public Medecin(){
		
	}
	public Medecin(String nom, String prenom) {
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

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}


}
