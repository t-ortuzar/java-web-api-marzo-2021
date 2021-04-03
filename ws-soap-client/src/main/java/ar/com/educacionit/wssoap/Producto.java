package ar.com.educacionit.wssoap;

public class Producto  implements java.io.Serializable {
    private java.lang.String codigo;

    private java.lang.Long id;

    private java.lang.Float precio;

    private ar.com.educacionit.wssoap.TipoProducto tipoProducto;

    private java.lang.String titulo;

    public Producto() {
    }

    public Producto(
           java.lang.String codigo,
           java.lang.Long id,
           java.lang.Float precio,
           ar.com.educacionit.wssoap.TipoProducto tipoProducto,
           java.lang.String titulo) {
           this.codigo = codigo;
           this.id = id;
           this.precio = precio;
           this.tipoProducto = tipoProducto;
           this.titulo = titulo;
    }


    /**
     * Gets the codigo value for this Producto.
     * 
     * @return codigo
     */
    public java.lang.String getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this Producto.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the id value for this Producto.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Producto.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the precio value for this Producto.
     * 
     * @return precio
     */
    public java.lang.Float getPrecio() {
        return precio;
    }


    /**
     * Sets the precio value for this Producto.
     * 
     * @param precio
     */
    public void setPrecio(java.lang.Float precio) {
        this.precio = precio;
    }


    /**
     * Gets the tipoProducto value for this Producto.
     * 
     * @return tipoProducto
     */
    public ar.com.educacionit.wssoap.TipoProducto getTipoProducto() {
        return tipoProducto;
    }


    /**
     * Sets the tipoProducto value for this Producto.
     * 
     * @param tipoProducto
     */
    public void setTipoProducto(ar.com.educacionit.wssoap.TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }


    /**
     * Gets the titulo value for this Producto.
     * 
     * @return titulo
     */
    public java.lang.String getTitulo() {
        return titulo;
    }


    /**
     * Sets the titulo value for this Producto.
     * 
     * @param titulo
     */
    public void setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Producto)) return false;
        Producto other = (Producto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.precio==null && other.getPrecio()==null) || 
             (this.precio!=null &&
              this.precio.equals(other.getPrecio()))) &&
            ((this.tipoProducto==null && other.getTipoProducto()==null) || 
             (this.tipoProducto!=null &&
              this.tipoProducto.equals(other.getTipoProducto()))) &&
            ((this.titulo==null && other.getTitulo()==null) || 
             (this.titulo!=null &&
              this.titulo.equals(other.getTitulo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPrecio() != null) {
            _hashCode += getPrecio().hashCode();
        }
        if (getTipoProducto() != null) {
            _hashCode += getTipoProducto().hashCode();
        }
        if (getTitulo() != null) {
            _hashCode += getTitulo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Producto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wssoap.educationit.com.ar/", "producto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "precio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoProducto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoProducto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wssoap.educationit.com.ar/", "tipoProducto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titulo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", id=" + id + ", precio=" + precio + ", tipoProducto=" + tipoProducto
				+ ", titulo=" + titulo + "]";
	}

    //alt+shit+s
}