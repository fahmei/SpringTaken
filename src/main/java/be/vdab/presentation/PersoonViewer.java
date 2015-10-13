package be.vdab.presentation;

import org.springframework.stereotype.Controller;

import be.vdab.Persoon;
import be.vdab.PersoonEigenschap;
import be.vdab.services.PersoonService;


@Controller
public class PersoonViewer {

	private final PersoonEigenschap[] persoonEigenschappen;
	private final PersoonService persoonService;

	public PersoonViewer(PersoonEigenschap[] persoonEigenschappen, PersoonService persoonService) {
		this.persoonEigenschappen = persoonEigenschappen;
		this.persoonService = persoonService;
	}

	
	public void afbeelden() {
		printArray();
		
		for (Persoon persoon : persoonService.findAll()){
			System.out.println(tooneigenschappen(persoon));
		}
	}

	private String tooneigenschappen(Persoon persoon) {

		StringBuilder resultaat = new StringBuilder();

		for (PersoonEigenschap eigenschap : persoonEigenschappen) {
			switch (eigenschap) {
			case PERSOON_NR:
				resultaat.append(persoon.getPersoonNr());
				break;

			case VOORNAAM:
				resultaat.append(persoon.getVoornaam());
				break;

			case FAMILIENAAM:
				resultaat.append(persoon.getFamilienaam());
				break;

			case AANTAL_KINDEREN:
				resultaat.append(persoon.getAantalKinderen());
				break;
			}
			
			resultaat.append(" ");
		}

		return resultaat.toString();
	}

	public PersoonEigenschap[] getPersoonEigenschappen() {
		return persoonEigenschappen;
	}
	
	private void printArray() {
		if(persoonEigenschappen != null){
			for(PersoonEigenschap eigenschap:persoonEigenschappen){
				System.out.println(eigenschap);
			}
		}else{
			System.out.println("Array is leeg");
		}
	}


}
