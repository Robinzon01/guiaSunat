
package robin.com.guisunat.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import robin.com.guisunat.bean.UnidadMedidaBean;
import robin.com.guisunat.conexion.ConexionOracle;

public class UnidadMedidaDao {
    
    private EntityManager getEntityManager() {
      return ConexionOracle.getInstancia().getFabrica().createEntityManager();
    }
    
    public List<UnidadMedidaBean> listaUnidadMedida(String cia) {
       StringBuilder sql = new StringBuilder();
       sql.append("SELECT UNIDAD , COD_SUNAT1, NOM ")
       .append("FROM INVE.ARINUM WHERE NO_CIA = ? ORDER BY NOM ASC");
       List<UnidadMedidaBean> unidadesMedidas = new ArrayList<>();
        try {
            Query query = this.getEntityManager().createNativeQuery(sql.toString(), UnidadMedidaBean.class);
            query.setParameter(1, cia);
            unidadesMedidas = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return unidadesMedidas;
    }
    
    public UnidadMedidaBean getUnidadMedida(String cia, String um) {
       StringBuilder sql = new StringBuilder();
       sql.append("SELECT UNIDAD , COD_SUNAT1, NOM ")
       .append("FROM INVE.ARINUM WHERE NO_CIA = ? AND UNIDAD = ? ");
       
       UnidadMedidaBean unidadMedidaBean = null;
       
        try {
            Query query = this.getEntityManager().createNativeQuery(sql.toString(), UnidadMedidaBean.class);
            query.setParameter(1, cia);
            query.setParameter(2, um);
            unidadMedidaBean = (UnidadMedidaBean) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return unidadMedidaBean;
    }
    
}
