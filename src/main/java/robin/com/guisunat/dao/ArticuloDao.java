
package robin.com.guisunat.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import robin.com.guisunat.bean.ArticuloBean;
import robin.com.guisunat.conexion.ConexionOracle;


public class ArticuloDao {
    
    private EntityManager getEntityManager() {
      return ConexionOracle.getInstancia().getFabrica().createEntityManager();
    }
    
    public List<ArticuloBean> listaArticulos(String cia, String descrip){
       StringBuilder sql = new StringBuilder();
       sql.append("SELECT NO_ARTI , DESCRIPCION , MEDIDA  FROM INVE.ARINDA1 ")
       .append("WHERE NO_CIA = ? AND TIPO_ARTI  = '1' ")
       .append("AND DESCRIPCION LIKE '%"+descrip.trim().toUpperCase()+ "%' ")
       .append("ORDER BY DESCRIPCION ASC");
       
       List<ArticuloBean> articulos = new ArrayList<>();
        try {
            Query query = this.getEntityManager().createNativeQuery(sql.toString(), ArticuloBean.class);
            query.setParameter(1, cia);
            articulos = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return articulos;
    }
    
    
}
