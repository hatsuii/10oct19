package eu.ensup.cabinet.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*; //a rajouter
import org.junit.Test;

import eu.ensup.cabinet.dao.IMedecinDao;
import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.service.MedecinService;

public class TestMedecinDao {

	@Test
	public void test() {
		// 1: Mocker l'interface du dao
		IMedecinDao dao = mock(IMedecinDao.class);
		// 2: Créer le service
		MedecinService meds = new MedecinService(dao);
		// 3: imposer un comportement au mock
		when(dao.getById(1)).thenReturn(new Medecin(1,"herve","lambert","Stomatologue"));
		// 4: appeler une méthode du service
		Medecin medReturned = meds.LireInfoMedecin(1);
		// 5: Comparer le resultat réel avec le resultat attendu
		assertEquals(medReturned, new Medecin(1,"herve","lambert","Stomatologue"));
		
		
	}
	

}
