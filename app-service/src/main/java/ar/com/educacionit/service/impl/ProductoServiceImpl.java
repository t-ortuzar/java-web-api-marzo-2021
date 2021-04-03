package ar.com.educacionit.service.impl;


import java.util.List;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.exceptions.ServiceException;
import ar.com.educacionit.repository.DuplicatedException;
import ar.com.educacionit.repository.GenericException;
import ar.com.educacionit.repository.ProductoRepository;
import ar.com.educacionit.repository.impl.ProductoRepositoryHibImpl;
import ar.com.educacionit.service.ProductoService;

//log4j2
//logback
//slf4
public class ProductoServiceImpl implements ProductoService{

	private ProductoRepository pr;
	
	public ProductoServiceImpl() {
		// IOC, DI
		this.pr = new ProductoRepositoryHibImpl();
	}

	@Override
	public Producto grabarProducto(Producto producto) throws ServiceException {		
		try {
			return this.pr.save(producto);
		} catch (DuplicatedException e) {
			//log
			throw new ServiceException("Producto duplicado", e);
		} catch (GenericException e) {
			//log
			throw new ServiceException("Error interno", e);
		}
	}
	
	@Override
	public List<Producto> obtenerTodos() throws ServiceException {		
		try {
			return this.pr.findAll();
		} catch (GenericException e) {
			//log
			throw new ServiceException("No se ha podido obtener la lista de productos", e);
		}
	}
}