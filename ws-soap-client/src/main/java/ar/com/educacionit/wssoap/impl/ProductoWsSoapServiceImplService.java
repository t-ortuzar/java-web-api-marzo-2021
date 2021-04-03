package ar.com.educacionit.wssoap.impl;

public interface ProductoWsSoapServiceImplService extends javax.xml.rpc.Service {
    public java.lang.String getProductoWsSoapServiceImplPortAddress();

    public ar.com.educacionit.wssoap.ProductoWsSoapService getProductoWsSoapServiceImplPort() throws javax.xml.rpc.ServiceException;

    public ar.com.educacionit.wssoap.ProductoWsSoapService getProductoWsSoapServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}