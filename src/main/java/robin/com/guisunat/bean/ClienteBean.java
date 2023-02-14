
package robin.com.guisunat.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClienteBean implements Serializable{
    
    @Id
    @Column(name = "NO_CLIENTE")
    private String noCliente;
    
    @Column(name = "NOMBRE")
    private String nombre;

    public String getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(String noCliente) {
        this.noCliente = noCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return noCliente+"-"+nombre;
    }
    
    
    
}
