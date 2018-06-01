package it.newsoft.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.newsoft.dao.LibroDao;
import it.newsoft.model.Libro;

@Service
@Transactional
public class LibroServiceImpl implements LibroService {
	
	@Autowired
	LibroDao libroDao;

	@Override
	public List<Libro> listAll() {
		// TODO Auto-generated method stub
		return libroDao.listAll();
	}

	@Override
	public Libro getLibroByIsbn(String isbn) {
		// TODO Auto-generated method stub
		return libroDao.getLibroByIsbn(isbn);
	}

	@Override
	public List<Libro> getLibriByAutore(String autore) {
		// TODO Auto-generated method stub
		return libroDao.getLibriByAutore(autore);
	}

	@Override
	public void saveOrUpdate(Libro libro) {
		// TODO Auto-generated method stub
		libroDao.saveOrUpdate(libro);
		
	}

	@Override
	public void delete(String isbn) {
		// TODO Auto-generated method stub
		libroDao.delete(isbn);
		
	}

}
