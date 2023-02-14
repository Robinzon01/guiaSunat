
package robin.com.guisunat.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import robin.com.guisunat.bean.ClienteBean;
import robin.com.guisunat.conexion.ConexionOracle;


public class ClienteDao {
    
    private EntityManager getEntityManager() {
      return ConexionOracle.getInstancia().getFabrica().createEntityManager();
    }
    
    public List<ClienteBean> listaCliente(String cia, String tipDocu, int longuitud,String campo, String valorCampo) {
      StringBuilder sql = new StringBuilder();
      sql.append("SELECT NO_CLIENTE , NOMBRE FROM CXC.ARCCMC ")
      .append("WHERE NO_CIA = ? AND ACTIVO = 'S' AND (TIPO_DOCUMENTO = ? OR LENGTH(NO_CLIENTE) = ? ) ")
      .append("AND "+campo+" LIKE '%"+valorCampo.trim().toUpperCase()+ "%' ")
      .append("ORDER BY NOMBRE ASC");
      
      List<ClienteBean> clientes = new ArrayList<>();
      
        try {
            Query query = this.getEntityManager().createNativeQuery(sql.toString(), ClienteBean.class);
            query.setParameter(1, cia);
            query.setParameter(2, tipDocu);
            query.setParameter(3, longuitud);
            clientes = query.getResultList();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return clientes;
      
    }
    
}
