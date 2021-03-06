package be.vdab.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import be.vdab.Persoon;


class PersoonDAOMeerdereRegels implements PersoonDAO {

	private final File bestand;
	
	PersoonDAOMeerdereRegels(File bestand) {	
		this.bestand = bestand;
	}

	@Override
	public List<Persoon> findAll() throws IOException {
		List<Persoon> personen = new ArrayList<>();
		try(Scanner scanner = new Scanner(bestand)){
			while(scanner.hasNext()){
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
