package eu.ensup.cabinet.service;

import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.domaine.Patient;

public class MedecinService {
	
	private Medecin pMed;
	
	public MedecinService(Medecin pMed) {
		this.pMed = pMed;
	}

	public void consulter (Patient p){
		System.out.println("le médecin consulte le patient... \nIl prend  sa tension,\nregarde ses amygdales,\net écoute sa respiration. ");
	}
}
