
package TRANSVERSAL;

import java.time.LocalDate;


public class TPedido {
    
    private int id_pedido; // Lo necesito para hacer el where en update 
    private String num_factura;
    private LocalDate  fecha_factura;
    private LocalDate  fecha_venta;
    private int id_cliente;
    private TipoPago tipo_pago;
    private LocalDate  fecha_entrega;
    private EstadoPedido estado_pedido;
    
    // Me defino mis datos de tipo enum 
    public enum TipoPago {efectivo, tarjeta, domiciliacion_bancaria;}
    public enum EstadoPedido {encargado, facturado, anulado;}
    
    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getNum_factura() {
        return num_factura;
    }

    public void setNum_factura(String num_factura) {
        this.num_factura = num_factura;
    }

    public LocalDate getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(LocalDate fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

    public LocalDate getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(LocalDate fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public TipoPago getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(TipoPago tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public LocalDate getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(LocalDate feha_entrega) {
        this.fecha_entrega = feha_entrega;
    }

    public EstadoPedido getEstado_pedido() {
        return estado_pedido;
    }

    public void setEstado_pedido(EstadoPedido estado_pedido) {
        this.estado_pedido = estado_pedido;
    }
    
    
    
}
