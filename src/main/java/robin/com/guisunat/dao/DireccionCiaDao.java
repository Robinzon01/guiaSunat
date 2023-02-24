
package robin.com.guisunat.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import robin.com.guisunat.bean.DireccionCia;
import robin.com.guisunat.conexion.ConexionOracle;

public class DireccionCiaDao {
    
    private EntityManager getEntityManager() {
      return ConexionOracle.getInstancia().getFabrica().createEntityManager();
    }
    
    public DireccionCia getDireccionDao(String cia, String sucursal) {
       StringBuilder sql = new StringBuilder();
       sql.append("SELECT Z.COD_SUCURSAL, Z.DIRECCION, W.UBIGEO||'-'||W.DESC_DIST||'-'||V.DESC_PROV||'-'||X.DESC_DEPA||'-'||'PERÚ' AS UBIGEO ")
       .append("FROM FACTU.SUCURSAL_PTOVTA Z, ARCCDP X, arccpr V, ARCCDI W ")
       .append("WHERE Z.NO_CIA = ? AND Z.COD_SUCURSAL = ? ")
       .append("AND X.NO_CIA = Z.NO_CIA AND X.CODI_DEPA = Z.CODI_DEPA AND V.NO_CIA = Z.NO_CIA AND V.CODI_DEPA = X.CODI_DEPA ")
       .append("AND V.CODI_PROV = Z.CODI_PROV AND W.NO_CIA = Z.NO_CIA AND W.CODI_DEPA = Z.CODI_DEPA AND W.CODI_PROV = Z.CODI_PROV AND W.CODI_DIST = Z.CODI_DIST");
       DireccionCia direccionCia = null;
        try {
            Query query = this.getEntityManager().createNativeQuery(sql.toString(), DireccionCia.class);
            query.setParameter(1, cia);
            query.setParameter(2, sucursal);
            direccionCia = (DireccionCia) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return direccionCia;
    }
    
}
