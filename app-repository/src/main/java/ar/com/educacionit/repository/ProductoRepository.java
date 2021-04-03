package ar.com.educacionit.repository;

import ar.com.educacionit.domain.Producto;

public interface ProductoRepository {

	public Producto save(Producto producto) throws DuplicatedException, GenericException;
}