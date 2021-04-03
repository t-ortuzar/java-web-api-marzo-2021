package ar.com.educacionit.wssoap;

import java.util.List;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.faults.WSSoapException;
import ar.com.educacionit.wssoap.dto.CreateProductoDTO;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface ProductoWsSoapService {

	@WebMethod
	public Producto crearProducto(CreateProductoDTO request) throws WSSoapException;
	
	@WebMethod
	public List<Producto> obtenerProductos() throws WSSoapException;
}