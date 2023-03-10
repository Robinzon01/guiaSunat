/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robin.com.guisunat.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author User
 */
@Embeddable
public class ArpfflPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NO_CIA")
    private String noCia;
    @Basic(optional = false)
    @Column(name = "BODEGA")
    private String bodega;
    @Basic(optional = false)
    @Column(name = "NO_GUIA")
    private String noGuia;
    @Basic(optional = false)
    @Column(name = "NO_ARTI")
    private String noArti;

    public ArpfflPK() {
    }

    public ArpfflPK(String noCia, String bodega, String noGuia, String noArti) {
        this.noCia = noCia;
        this.bodega = bodega;
        this.noGuia = noGuia;
        this.noArti = noArti;
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

    public String getNoArti() {
        return noArti;
    }

    public void setNoArti(String noArti) {
        this.noArti = noArti;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noCia != null ? noCia.hashCode() : 0);
        hash += (bodega != null ? bodega.hashCode() : 0);
        hash += (noGuia != null ? noGuia.hashCode() : 0);
        hash += (noArti != null ? noArti.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArpfflPK)) {
            return false;
        }
        ArpfflPK other = (ArpfflPK) object;
        if ((this.noCia == null && other.noCia != null) || (this.noCia != null && !this.noCia.equals(other.noCia))) {
            return false;
        }
        if ((this.bodega == null && other.bodega != null) || (this.bodega != null && !this.bodega.equals(other.bodega))) {
            return false;
        }
        if ((this.noGuia == null && other.noGuia != null) || (this.noGuia != null && !this.noGuia.equals(other.noGuia))) {
            return false;
        }
        if ((this.noArti == null && other.noArti != null) || (this.noArti != null && !this.noArti.equals(other.noArti))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "robin.com.guisunat.entidad.ArpfflPK[ noCia=" + noCia + ", bodega=" + bodega + ", noGuia=" + noGuia + ", noArti=" + noArti + " ]";
    }
    
}
