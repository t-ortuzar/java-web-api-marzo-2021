package ar.com.educacionit.wssoap.impl;

import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.domain.TipoProducto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.faults.WSSoapException;
import ar.com.educacionit.service.impl.ProductoServiceImpl;
import ar.com.educacionit.wssoap.ProductoWsSoapService;
import ar.com.educacionit.wssoap.dto.CreateProductoDTO;
import jakarta.jws.WebService;

@WebService(endpointInterface = "ar.com.educationit.wssoap.ProductoWsSoapService")
public class ProductoWsSoapServiceImpl implements ProductoWsSoapService {

	@Override
	public Producto crearProducto(CreateProductoDTO request) throws WSSoapException {
		
		//acceder a nuestra capa de servicios!
		TipoProducto tp = new TipoProducto();
		tp.setId(request.getTipoProducto());
		
		Producto nuevoProducto = new Producto(request.getTitulo(), request.getPrecio(), request.getCodigo(), tp);
		
		ProductoService ps = new ProductoServiceImpl();
		
		try {
			return ps.grabarProducto(nuevoProducto);
		} catch (Exception e) {
			throw new WSSoapException(e.getMessage());
		}
	}

	@Override
	public List<Producto> obtenerProductos() throws WSSoapException {
		
		ProductoService ps = new ProductoServiceImpl();
		
		List<Producto> productos = new ArrayList<Producto>();
		try {
			productos = ps.obtenerTodos();
		}catch (Exception e) {
			throw new WSSoapException(e.getMessage());
		}
		
		return productos;
	}
}