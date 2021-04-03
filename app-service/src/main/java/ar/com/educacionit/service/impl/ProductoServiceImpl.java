package ar.com.educacionit.service.impl;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.repository.ProductoRepository;
import ar.com.educacionit.repository.impl.ProductoRepositoryHibImpl;
import ar.com.educacionit.service.ProductoService;

public class ProductoServiceImpl implements ProductoService{

	private ProductoRepository pr;
	
	public ProductoServiceImpl() {
		// IOC, DI
		this.pr = new ProductoRepositoryHibImpl();
	}

	@Override
	public Producto grabarProducto(Producto producto) throws Exception {		
		return this.pr.save(producto);
	}
	
	
}