package eu.ensup.cabinet.presentation;

import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.domaine.Patient;
import eu.ensup.cabinet.service.MedecinService;

public class Launcher {

	public static void main(String[] args) {

		Medecin med = new Medecin("herve","lambert");
		Patient pat = new Patient("pierre","leblond");
		
		MedecinService meds = new MedecinService(med);
		meds.consulter(pat);
		
	}

}
