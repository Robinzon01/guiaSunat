
package robin.com.guisunat.modelo;

public class TipoDocumentoCliente {
    
    private String codigo;
    private String descripcion;

    public TipoDocumentoCliente() {
    }

    public TipoDocumentoCliente(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return this.descripcion;
    }
    
}
