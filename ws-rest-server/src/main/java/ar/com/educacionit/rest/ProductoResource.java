package ar.com.educacionit.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.impl.ProductoServiceImpl;

@Path("productos")
public class ProductoResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAllProductos() {
		
		ProductoService ps = new ProductoServiceImpl();
		
		try {
			List<Producto> productos = ps.obtenerTodos();
			//200
			//json
			return Response.ok(productos).build();
		}catch (Exception e) {
			return Response.status(Status.INTERNAL_SERVER_ERROR).build();
		}		
	}
}