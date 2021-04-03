package ar.com.educacionit.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.domain.TipoProducto;
import ar.com.educacionit.hibernate.HibernateUtils;

public class HibernateUtilsTest {

	//@test
	public static void main(String[] args) {
		
		TipoProducto tp = new TipoProducto();
		tp.setDescripcion("cocina");
		
		Producto nuevoProducto = new Producto("mate", 1000f, "000001", tp);
		
		SessionFactory sf = HibernateUtils.getSessionFactory();
		
		Session session = sf.getCurrentSession();
		
		session.beginTransaction();
		
		session.save(tp);
		session.save(nuevoProducto);
		
		session.getTransaction().commit();
		
		System.out.println(nuevoProducto.getId());
	}
}
