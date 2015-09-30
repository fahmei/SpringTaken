package be.vdab.dao;

import java.io.IOException;
import java.util.List;

import be.vdab.Persoon;

public interface PersoonDAO {

	public List<Persoon> findAll() throws IOException;
	
}
