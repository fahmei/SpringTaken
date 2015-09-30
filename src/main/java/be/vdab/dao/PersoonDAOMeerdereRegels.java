package be.vdab.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import be.vdab.Persoon;

public class PersoonDAOMeerdereRegels implements PersoonDAO {

	private final File bestand;
	
	
	public PersoonDAOMeerdereRegels(File bestand) {	//TODO in container.xml de path aangeven
		this.bestand = bestand;
	}

	@Override
	public List<Persoon> findAll() throws IOException {
		List<Persoon> personen = new ArrayList<>();
		try(Scanner scanner = new Scanner(bestand)){
			while(scanner.hasNextLine()){
				scanner.nextLine(); // TODO mogelijks te verwijderen
				int nummer = scanner.nextInt();
				scanner.nextLine();
				String voornaam = scanner.nextLine();
				String familienaam = scanner.nextLine();
				int aantalKinderen = scanner.nextInt();
				personen.add(new Persoon(nummer, voornaam, familienaam, aantalKinderen));
			}
		}
		return personen;
	}

}
