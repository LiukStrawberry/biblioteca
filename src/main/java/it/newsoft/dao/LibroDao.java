package it.newsoft.dao;

import java.util.List;

import it.newsoft.model.Libro;

public interface LibroDao {
	
	public List<Libro> listAll();
	public Libro getLibroByIsbn(String isbn);
	public List<Libro> getLibriByAutore(String autore);
	public void saveOrUpdate(Libro libro);
	public void delete(String isbn);

}
