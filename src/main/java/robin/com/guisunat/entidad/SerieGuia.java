
package robin.com.guisunat.entidad;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SerieGuia implements Serializable{
    
    private static final long serialVersionUID = 7221007051484322830L;
    
    @Id
    @Column(name = "SERIE")
    private String serie;
    
    @Column(name = "CONS_DESDE")
    private Long consDesde;

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Long getConsDesde() {
        return consDesde;
    }

    public void setConsDesde(Long consDesde) {
        this.consDesde = consDesde;
    }
    
    public String toString() {
        int width = 7;
        String formatted = String.format("%0" + width + "d", this.consDesde);
        return this.serie+"-"+formatted;
    }
    
}
