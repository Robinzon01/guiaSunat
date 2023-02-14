
package robin.com.guisunat.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import robin.com.guisunat.bean.ClienteBean;
import robin.com.guisunat.bean.DireccionClienteBean;
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
    
    public DireccionClienteBean getDirecCliente(String cia, String noCliente) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT W.NO_CLIENTE , W.DIRECCION, Z.DESC_DEPA||' - '||F.DESC_PROV||' - '||X.DESC_DIST DIREC2 ")
        .append("FROM CXC.ARCCTDA W, CXC.ARCCDP Z, CXC.arccpr F, CXC.ARCCDI X ")
        .append("WHERE W.NO_CIA = ? AND W.ACTIVO = 'S' AND W.NO_CLIENTE = ? ")
        .append("AND Z.NO_CIA = W.NO_CIA AND Z.CODI_DEPA = W.CODI_DEPA AND F.NO_CIA = W.NO_CIA AND F.CODI_DEPA = W.CODI_DEPA ")
        .append("AND F.CODI_PROV = W.CODI_PROV AND X.NO_CIA = W.NO_CIA AND X.CODI_DEPA = W.CODI_DEPA AND X.CODI_PROV = W.CODI_PROV AND X.CODI_DIST = W.CODI_DIST");
        
        DireccionClienteBean direccion = null;
        
        try {
            Query query = this.getEntityManager().createNativeQuery(sql.toString(), DireccionClienteBean.class);
            query.setParameter(1, cia);
            query.setParameter(2, noCliente);
            direccion   = (DireccionClienteBean) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return direccion;
    }
    
}
