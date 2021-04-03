package ar.com.educacionit.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.hibernate.HibernateUtils;
import ar.com.educacionit.repository.DuplicatedException;
import ar.com.educacionit.repository.GenericException;
import ar.com.educacionit.repository.ProductoRepository;

public class ProductoRepositoryHibImpl implements ProductoRepository{

	@Override
	public Producto save(Producto producto) throws DuplicatedException, GenericException {
		
		SessionFactory sf = null;
		try {
			sf = HibernateUtils.getSessionFactory();
		}catch (Exception e) {
			throw new GenericException("No se ha podido crear session factory", e);
		}
		
		Session session = null;
		try {
			session = sf.getCurrentSession();
		}catch (Exception e) {
			throw new GenericException("No se ha podido crear session", e);
		}
			
		
		session.beginTransaction();
			
		//logica
		
		try {
			session.saveOrUpdate(producto);
		}catch (org.hibernate.exception.ConstraintViolationException e) {			
			throw new DuplicatedException("Prducto duplicado: " +e.getMessage(), e);
		}
		//
		
		session.getTransaction().commit();
				
		session.close();
		
		return producto;
	}

}