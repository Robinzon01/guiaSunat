
package robin.com.guisunat.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DireccionCia implements Serializable {
    
    @Id
    @Column(name = "COD_SUCURSAL")
    private String codSucursal;
    
    @Column(name = "DIRECCION")
    private String direccion;
    
    @Column(name = "UBIGEO")
    private String ubigeo;
    
    public String getCodSucursal() {
        return codSucursal;
    }

    public void setCodSucursal(String codSucursal) {
        this.codSucursal = codSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    } 
    
}
