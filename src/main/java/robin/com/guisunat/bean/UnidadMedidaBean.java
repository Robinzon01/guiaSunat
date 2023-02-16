package robin.com.guisunat.bean;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UnidadMedidaBean implements Serializable {

    @Id
    @Column(name = "UNIDAD")
    private String unidad;

    @Column(name = "COD_SUNAT1")
    private String codSunat;

    @Column(name = "NOM")
    private String nombre;

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getCodSunat() {
        return codSunat;
    }

    public void setCodSunat(String codSunat) {
        this.codSunat = codSunat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return codSunat+"-"+ nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UnidadMedidaBean other = (UnidadMedidaBean) obj;
        if (!Objects.equals(this.unidad, other.unidad)) {
            return false;
        }
        if (!Objects.equals(this.codSunat, other.codSunat)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
}
