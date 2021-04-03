package ar.com.educacionit.wssoap;

public class ProductoWsSoapServiceProxy implements ar.com.educacionit.wssoap.ProductoWsSoapService {
  private String _endpoint = null;
  private ar.com.educacionit.wssoap.ProductoWsSoapService productoWsSoapService = null;
  
  public ProductoWsSoapServiceProxy() {
    _initProductoWsSoapServiceProxy();
  }
  
  public ProductoWsSoapServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initProductoWsSoapServiceProxy();
  }
  
  private void _initProductoWsSoapServiceProxy() {
    try {
      productoWsSoapService = (new ar.com.educacionit.wssoap.impl.ProductoWsSoapServiceImplServiceLocator()).getProductoWsSoapServiceImplPort();
      if (productoWsSoapService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)productoWsSoapService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)productoWsSoapService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (productoWsSoapService != null)
      ((javax.xml.rpc.Stub)productoWsSoapService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ar.com.educacionit.wssoap.ProductoWsSoapService getProductoWsSoapService() {
    if (productoWsSoapService == null)
      _initProductoWsSoapServiceProxy();
    return productoWsSoapService;
  }
  
  public ar.com.educacionit.wssoap.Producto crearProducto(ar.com.educacionit.wssoap.CreateProductoDTO arg0) throws java.rmi.RemoteException, ar.com.educacionit.wssoap.WSSoapException{
    if (productoWsSoapService == null)
      _initProductoWsSoapServiceProxy();
    return productoWsSoapService.crearProducto(arg0);
  }
  
  public ar.com.educacionit.wssoap.Producto[] obtenerProductos() throws java.rmi.RemoteException, ar.com.educacionit.wssoap.WSSoapException{
    if (productoWsSoapService == null)
      _initProductoWsSoapServiceProxy();
    return productoWsSoapService.obtenerProductos();
  }
  
  
}