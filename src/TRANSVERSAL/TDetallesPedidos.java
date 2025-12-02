
package TRANSVERSAL;


public class TDetallesPedidos {
    
    private int id_pedido;
    private int id_producto;
    private int id_pedido_id_producto;
    private int cantidad;
    private double precio_unit;
    private IVA iva;
    private double descuento;
    
    public enum IVA {normal, reducido, super_reducido;}
    
    public IVA getIva() {
        return iva;
    }

    public void setIva(IVA iva) {
        this.iva = iva;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }
    
     public int getId_pedido_id_producto() {
        return id_pedido_id_producto;
    }

    public void setId_pedido_id_producto(int id_pedido_id_producto) {
        this.id_pedido_id_producto = id_pedido_id_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_unit() {
        return precio_unit;
    }

    public void setPrecio_unit(double precio_unit) {
        this.precio_unit = precio_unit;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
    
}
