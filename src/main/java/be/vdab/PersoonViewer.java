package be.vdab;

import java.util.List;

public class PersoonViewer {

	private final PersoonEigenschap[] persoonEigenschappen;

	public PersoonViewer(PersoonEigenschap[] persoonEigenschappen) {
		this.persoonEigenschappen = persoonEigenschappen;
	}

	public void afbeelden(List<Persoon> personen) {
		for (Persoon persoon : personen)
			System.out.println(tooneigenschappen(persoon));
	}

	private String tooneigenschappen(Persoon persoon) {

		StringBuilder resultaat = new StringBuilder();

		for (PersoonEigenschap eigenschap : persoonEigenschappen) {
			switch (eigenschap) {
			case PERSOON_NR:
				resultaat.append(persoon.getPersoonNr()).append(" ");
				break;

			case VOORNAAM:
				resultaat.append(persoon.getVoornaam()).append(" ");
				break;

			case FAMILIENAAM:
				resultaat.append(persoon.getFamilienaam()).append(" ");
				break;

			case AANTAL_KINDEREN:
				resultaat.append(persoon.getAantalKinderen()).append(" ");
				break;
			}
		}

		return resultaat.toString();
	}

	public PersoonEigenschap[] getPersoonEigenschappen() {
		return persoonEigenschappen;
	}

}
