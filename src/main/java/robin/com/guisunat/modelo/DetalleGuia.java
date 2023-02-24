
package robin.com.guisunat.modelo;

public class DetalleGuia {
    
    private String item;
    private String codigo;
    private String cantidad;
    private String um;
    private String descripcion;

    public DetalleGuia() {
    }

    public DetalleGuia(String item, String codigo, String cantidad, String um, String descripcion) {
        this.item = item;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.um = um;
        this.descripcion = descripcion;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
