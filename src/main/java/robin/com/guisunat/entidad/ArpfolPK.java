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
public class ArpfolPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "NO_CIA")
    private String noCia;
    @Basic(optional = false)
    @Column(name = "NO_ORDEN")
    private String noOrden;
    @Basic(optional = false)
    @Column(name = "NO_ARTI")
    private String noArti;

    public ArpfolPK() {
    }

    public ArpfolPK(String noCia, String noOrden, String noArti) {
        this.noCia = noCia;
        this.noOrden = noOrden;
        this.noArti = noArti;
    }

    public String getNoCia() {
        return noCia;
    }

    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }

    public String getNoOrden() {
        return noOrden;
    }

    public void setNoOrden(String noOrden) {
        this.noOrden = noOrden;
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
        hash += (noOrden != null ? noOrden.hashCode() : 0);
        hash += (noArti != null ? noArti.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArpfolPK)) {
            return false;
        }
        ArpfolPK other = (ArpfolPK) object;
        if ((this.noCia == null && other.noCia != null) || (this.noCia != null && !this.noCia.equals(other.noCia))) {
            return false;
        }
        if ((this.noOrden == null && other.noOrden != null) || (this.noOrden != null && !this.noOrden.equals(other.noOrden))) {
            return false;
        }
        if ((this.noArti == null && other.noArti != null) || (this.noArti != null && !this.noArti.equals(other.noArti))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "robin.com.guisunat.entidad.ArpfolPK[ noCia=" + noCia + ", noOrden=" + noOrden + ", noArti=" + noArti + " ]";
    }
    
}
