package eu.ensup.cabinet.service;

import eu.ensup.cabinet.dao.IMedecinDao;
import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.domaine.Patient;

public class MedecinService implements IMedecinService{
	
	private Medecin pMed;
	private IMedecinDao iMed;
	//mettre interface en parametre des méthodes
	public MedecinService(Medecin pMed) {
		this.pMed = pMed;
	}
	
	public boolean engagerMedecin(Medecin pMed,IMedecinDao iMed){
		iMed.create(pMed);
		return true;
	}
	public Medecin LireInfoMedecin(int idMedecin,IMedecinDao iMed){
		return iMed.getById(idMedecin);

	}
 

	public void consulter (Patient p){
		System.out.println("le médecin "+pMed.getPrenom()+" dont la spécialité est: "+pMed.getSpecialite()+" consulte le patient "+p.getPrenom()+" pour traiter le symptome: "+p.getSymptome());
	}
}
