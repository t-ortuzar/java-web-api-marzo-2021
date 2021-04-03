package ar.com.educacionit.service;

import java.util.List;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.exceptions.ServiceException;

public interface ProductoService {

	public Producto grabarProducto(Producto producto) throws ServiceException;

	public List<Producto> obtenerTodos() throws ServiceException;
}