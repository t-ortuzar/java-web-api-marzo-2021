package ar.com.educacionit.wssoap.impl;


public class ProductoWsSoapServiceImplServiceLocator extends org.apache.axis.client.Service implements ar.com.educacionit.wssoap.impl.ProductoWsSoapServiceImplService {

    public ProductoWsSoapServiceImplServiceLocator() {
    }


    public ProductoWsSoapServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProductoWsSoapServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProductoWsSoapServiceImplPort
    private java.lang.String ProductoWsSoapServiceImplPort_address = "http://localhost:8000/";

    public java.lang.String getProductoWsSoapServiceImplPortAddress() {
        return ProductoWsSoapServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProductoWsSoapServiceImplPortWSDDServiceName = "ProductoWsSoapServiceImplPort";

    public java.lang.String getProductoWsSoapServiceImplPortWSDDServiceName() {
        return ProductoWsSoapServiceImplPortWSDDServiceName;
    }

    public void setProductoWsSoapServiceImplPortWSDDServiceName(java.lang.String name) {
        ProductoWsSoapServiceImplPortWSDDServiceName = name;
    }

    public ar.com.educacionit.wssoap.ProductoWsSoapService getProductoWsSoapServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProductoWsSoapServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProductoWsSoapServiceImplPort(endpoint);
    }

    public ar.com.educacionit.wssoap.ProductoWsSoapService getProductoWsSoapServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ar.com.educacionit.wssoap.impl.ProductoWsSoapServiceImplPortBindingStub _stub = new ar.com.educacionit.wssoap.impl.ProductoWsSoapServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getProductoWsSoapServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProductoWsSoapServiceImplPortEndpointAddress(java.lang.String address) {
        ProductoWsSoapServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ar.com.educacionit.wssoap.ProductoWsSoapService.class.isAssignableFrom(serviceEndpointInterface)) {
                ar.com.educacionit.wssoap.impl.ProductoWsSoapServiceImplPortBindingStub _stub = new ar.com.educacionit.wssoap.impl.ProductoWsSoapServiceImplPortBindingStub(new java.net.URL(ProductoWsSoapServiceImplPort_address), this);
                _stub.setPortName(getProductoWsSoapServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ProductoWsSoapServiceImplPort".equals(inputPortName)) {
            return getProductoWsSoapServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.wssoap.educacionit.com.ar/", "ProductoWsSoapServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.wssoap.educacionit.com.ar/", "ProductoWsSoapServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProductoWsSoapServiceImplPort".equals(portName)) {
            setProductoWsSoapServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}