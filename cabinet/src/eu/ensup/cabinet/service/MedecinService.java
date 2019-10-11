package eu.ensup.cabinet.service;

import eu.ensup.cabinet.dao.IMedecinDao;
import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.domaine.Patient;

public class MedecinService implements IMedecinService{

	private Medecin pMed;
	private IMedecinDao iMed;

	public MedecinService(Medecin pMed) {
		this.pMed = pMed;
	}

	public MedecinService(IMedecinDao iMed) {
		super();
		this.iMed = iMed;
	}


	@Override
	public boolean engagerMedecin(Medecin pMed) {
		return iMed.create(pMed);
	}
	@Override
	public Medecin LireInfoMedecin(int idMedecin) {
		return iMed.getById(idMedecin);

	}


	@Override
	public void consulter (Patient p){
		System.out.println("le médecin "+pMed.getPrenom()+" dont la spécialité est: "+pMed.getSpecialite()+" consulte le patient "+p.getPrenom()+" pour traiter le symptome: "+p.getSymptome());
	}
}
