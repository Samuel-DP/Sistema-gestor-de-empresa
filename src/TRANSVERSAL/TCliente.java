package TRANSVERSAL;


import java.io.Serializable;


public class TCliente implements Serializable {
    
    private int id_cliente;
    private String razon_social;
    private String nombre_comercial;
    private TipoPago tipo_pago;
    private String nombre_calle;
    private int codigo_postal;
    private String ciudad;
    private String provincia;
    private String pais;
    private String correo;
    private String telefono;
    private String nif;

    public enum TipoPago {efectivo, tarjeta, domiciliacion_bancaria;}
    
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getNombre_comercial() {
        return nombre_comercial;
    }

    public void setNombre_comercial(String nombre_comercial) {
        this.nombre_comercial = nombre_comercial;
    }

    public TipoPago getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(TipoPago tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public String getNombre_calle() {
        return nombre_calle;
    }

    public void setNombre_calle(String nombre_calle) {
        this.nombre_calle = nombre_calle;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   
    
}
