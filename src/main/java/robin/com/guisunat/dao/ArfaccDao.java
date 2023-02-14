
package robin.com.guisunat.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import robin.com.guisunat.conexion.ConexionOracle;
import robin.com.guisunat.entidad.SerieGuia;

public class ArfaccDao {
    
    private EntityManager getEntityManager() {
      return ConexionOracle.getInstancia().getFabrica().createEntityManager();
    }
    
    public List<SerieGuia> listaSerieGuia() {
      StringBuilder sql = new StringBuilder();
      sql.append("SELECT SERIE, (CONS_DESDE + 1) CONS_DESDE FROM FACTU.ARFACC ")
      .append("WHERE no_cia = ? and centro = ? and tipo_doc = ? and activo = ? and substr(serie,0,2) = ? ");
      List<SerieGuia> guias = new ArrayList<>();
        try {
            Query query = this.getEntityManager().createNativeQuery(sql.toString(), SerieGuia.class);
            query.setParameter(1, "01");
            query.setParameter(2, "33");
            query.setParameter(3, "G");
            query.setParameter(4, "S");
            query.setParameter(5, "00");
            guias = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return guias;
    }
    
    
    
}
