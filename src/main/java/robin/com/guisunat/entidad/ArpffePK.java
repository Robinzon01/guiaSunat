
package robin.com.guisunat.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class ArpffePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NO_CIA")
    private String noCia;
    @Basic(optional = false)
    @Column(name = "BODEGA")
    private String bodega;
    @Basic(optional = false)
    @Column(name = "NO_GUIA")
    private String noGuia;

    public ArpffePK() {
    }

    public ArpffePK(String noCia, String bodega, String noGuia) {
        this.noCia = noCia;
        this.bodega = bodega;
        this.noGuia = noGuia;
    }

    public String getNoCia() {
        return noCia;
    }

    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }

    public String getBodega() {
        return bodega;
    }

    public void setBodega(String bodega) {
        this.bodega = bodega;
    }

    public String getNoGuia() {
        return noGuia;
    }

    public void setNoGuia(String noGuia) {
        this.noGuia = noGuia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noCia != null ? noCia.hashCode() : 0);
        hash += (bodega != null ? bodega.hashCode() : 0);
        hash += (noGuia != null ? noGuia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArpffePK)) {
            return false;
        }
        ArpffePK other = (ArpffePK) object;
        if ((this.noCia == null && other.noCia != null) || (this.noCia != null && !this.noCia.equals(other.noCia))) {
            return false;
        }
        if ((this.bodega == null && other.bodega != null) || (this.bodega != null && !this.bodega.equals(other.bodega))) {
            return false;
        }
        if ((this.noGuia == null && other.noGuia != null) || (this.noGuia != null && !this.noGuia.equals(other.noGuia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "robin.com.guisunat.entidad.ArpffePK[ noCia=" + noCia + ", bodega=" + bodega + ", noGuia=" + noGuia + " ]";
    }
    
}
