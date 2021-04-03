package ar.com.educacionit.wssoap.main;

import ar.com.educacionit.wssoap.impl.ProductoWsSoapServiceImpl;
import jakarta.xml.ws.Endpoint;

public class ProductoWSSoapMain {

	public static void main(String[] args) {
		System.out.println("Publicando Servicio Web de producto...");
		
		Endpoint.publish("http://localhost:8000/", new ProductoWsSoapServiceImpl());
		
		System.out.println("Servicio Web de producto iniciado en http://localhost:8000/");
		
		System.out.println("La direccion del wsdl es: http://localhost:8000/?wsdl");
	}
}
