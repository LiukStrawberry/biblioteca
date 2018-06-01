package it.newsoft.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.newsoft.model.Libro;
@Repository
public class LibroDaoImpl implements LibroDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	private Session session() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<Libro> listAll() {
		// TODO Auto-generated method stub
		return session().createCriteria(Libro.class).list();
	}

	@Override
	public Libro getLibroByIsbn(String isbn) {
		// TODO Auto-generated method stub
		return (Libro) session().createCriteria(Libro.class).add(Restrictions.eq("isbn", isbn));
	}

	@Override
	public List<Libro> getLibriByAutore(String autore) {
		// TODO Auto-generated method stub
		return session().createCriteria(Libro.class).add(Restrictions.eq("autore", autore)).list();
	}

	@Override
	public void saveOrUpdate(Libro libro) {
		session().saveOrUpdate(libro);		
	}

	@Override
	public void delete(String isbn) {
		session().delete(session().get(Libro.class, isbn));
	}

}
