package eu.ensup.cabinet.service;

import eu.ensup.cabinet.dao.MedecinDao;
import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.domaine.Patient;

public class MedecinService {
	
	private Medecin pMed;
	//mettre interface en parametre des méthodes
	public MedecinService(Medecin pMed) {
		this.pMed = pMed;
	}
	
	public boolean engagerMedecin(Medecin pMed){
		new MedecinDao().create(pMed);
		return true;
	}
	public Medecin LireInfoMedecin(int idMedecin){
		return new MedecinDao().getById(idMedecin);

	}


	public void consulter (Patient p){
		System.out.println("le médecin "+pMed.getPrenom()+" dont la spécialité est: "+pMed.getSpecialite()+" consulte le patient "+p.getPrenom()+" pour traiter le symptome: "+p.getSymptome());
	}
}
