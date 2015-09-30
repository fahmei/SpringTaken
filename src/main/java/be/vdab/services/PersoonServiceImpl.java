package be.vdab.services;

import java.io.IOException;
import java.util.List;

import be.vdab.Persoon;
import be.vdab.dao.PersoonDAO;

public class PersoonServiceImpl implements PersoonService {

	PersoonDAO persoonDAO;
	
	public PersoonServiceImpl(PersoonDAO persoonDAO) {
		this.persoonDAO = persoonDAO;
	}

	@Override
	public List<Persoon> findAll() {
		try{
			return persoonDAO.findAll();
		}catch(IOException ex){
			return null;
		}
	}

}
