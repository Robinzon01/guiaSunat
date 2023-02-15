package robin.com.guisunat.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ArticuloBean implements Serializable {

    @Id
    @Column(name = "NO_ARTI")
    private String noArti;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "MEDIDA")
    private String medida;

    public String getNoArti() {
        return noArti;
    }

    public void setNoArti(String noArti) {
        this.noArti = noArti;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    @Override
    public String toString() {
        return noArti+","+medida+","+descripcion;
    }
    
    

}
