package ar.com.educacionit.wssoap;


public interface ProductoWsSoapService extends java.rmi.Remote {
    public ar.com.educacionit.wssoap.Producto crearProducto(ar.com.educacionit.wssoap.CreateProductoDTO arg0) throws java.rmi.RemoteException, ar.com.educacionit.wssoap.WSSoapException;
    public ar.com.educacionit.wssoap.Producto[] obtenerProductos() throws java.rmi.RemoteException, ar.com.educacionit.wssoap.WSSoapException;
}