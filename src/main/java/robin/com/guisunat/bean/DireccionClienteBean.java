
package robin.com.guisunat.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DireccionClienteBean {
    @Id
    @Column(name = "NO_CLIENTE")
    private String noCliente;
    
    @Column(name = "DIRECCION")
    private String direccion;
    
    @Column(name = "DIREC2")
    private String direc2;

    public String getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(String noCliente) {
        this.noCliente = noCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDirec2() {
        return direc2;
    }

    public void setDirec2(String direc2) {
        this.direc2 = direc2;
    }
    
}
