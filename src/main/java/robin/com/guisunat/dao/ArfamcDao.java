
package robin.com.guisunat.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import robin.com.guisunat.conexion.ConexionOracle;
import robin.com.guisunat.entidad.Arfamc;

public class ArfamcDao {
    
    private EntityManager getEntityManager() {
      return ConexionOracle.getInstancia().getFabrica().createEntityManager();
    }
    
    public Arfamc getCia(String cia) {
      StringBuilder sql = new StringBuilder();
      sql.append("SELECT * FROM FACTU.ARFAMC WHERE NO_CIA = ? ");
      Arfamc arfamc = null;
      try {
          Query query = this.getEntityManager().createNativeQuery(sql.toString(), Arfamc.class);
          query.setParameter(1, cia);
          arfamc = (Arfamc) query.getSingleResult();
      } catch (Exception e) {
        e.printStackTrace();
      }
      return arfamc;
    }
    
}
