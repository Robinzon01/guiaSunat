
package robin.com.guisunat.conexion;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexionOracle {
    private static ConexionOracle instancia = new ConexionOracle();
    private EntityManagerFactory fabrica;
    
    private ConexionOracle(){
      this.fabrica = Persistence.createEntityManagerFactory("celiaBD");
    }

    public static ConexionOracle getInstancia() {
        return instancia;
    }

    public static void setInstancia(ConexionOracle instancia) {
        ConexionOracle.instancia = instancia;
    }

    public EntityManagerFactory getFabrica() {
        return fabrica;
    }

    public void setFabrica(EntityManagerFactory fabrica) {
        this.fabrica = fabrica;
    }    
}
