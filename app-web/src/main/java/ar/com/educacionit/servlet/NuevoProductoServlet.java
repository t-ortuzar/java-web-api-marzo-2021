package ar.com.educacionit.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.educacionit.domain.Producto;
import ar.com.educacionit.domain.TipoProducto;
import ar.com.educacionit.exceptions.ServiceException;
import ar.com.educacionit.service.ProductoService;
import ar.com.educacionit.service.impl.ProductoServiceImpl;
@WebServlet("/NuevoProductoServlet")
public class NuevoProductoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//sin validaciones!
		String titulo = req.getParameter("titulo");		
		Float precio = Float.parseFloat(req.getParameter("precio"));
		String codigo = req.getParameter("codigo");
		Long tipoProducto = Long.parseLong(req.getParameter("tipoProducto"));
		
		TipoProducto tp = new TipoProducto();
		tp.setId(tipoProducto);
		
		//producto
		Producto producto = new Producto(titulo, precio, codigo, tp);
		
		//service 
		ProductoService	ps = new ProductoServiceImpl();
		try {
			producto = ps.grabarProducto(producto);
			resp.getWriter().write(producto.toString());
		} catch (ServiceException e) {
			resp.getWriter().write(e.getMessage());
		}				
		//escribir 
	}
}