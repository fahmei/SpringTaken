package be.vdab;

import be.vdab.services.PersoonService;

public class PersoonViewer {

	private final PersoonEigenschap[] persoonEigenschappen;
	private final PersoonService persoonService;

	public PersoonViewer(PersoonEigenschap[] persoonEigenschappen, PersoonService persoonService) {
		this.persoonEigenschappen = persoonEigenschappen;
		this.persoonService = persoonService;
	}

	public void afbeelden() {
		for (Persoon persoon : persoonService.findAll())
			System.out.println(tooneigenschappen(persoon));
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

}
