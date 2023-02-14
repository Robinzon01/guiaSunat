
package robin.com.guisunat.controlador;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import robin.com.guisunat.bean.DireccionCia;
import robin.com.guisunat.dao.ArfaccDao;
import robin.com.guisunat.dao.DireccionCiaDao;
import robin.com.guisunat.dao.TipoDocumentoClienteDao;
import robin.com.guisunat.entidad.SerieGuia;
import robin.com.guisunat.modelo.TipoDocumentoCliente;

public class InicioCls {
    
    public void llenarSerieCorreGuia(JComboBox<SerieGuia> cbxSerieGuia) {
      try {
          ArfaccDao arfaccDao = new ArfaccDao();
          List<SerieGuia> guias = arfaccDao.listaSerieGuia();
          
          for (SerieGuia guia : guias) {
               cbxSerieGuia.addItem(guia);
          }
          
      }catch (Exception e) {
	e.printStackTrace();
      }
    }
    
    public void llenarTipoDocumento(JComboBox<TipoDocumentoCliente> cbxTipoDocumento) {
      try {
          TipoDocumentoClienteDao dao = new TipoDocumentoClienteDao();
          List<TipoDocumentoCliente> tipoDocumentos = dao.getListaDocumentos();
          
          for (TipoDocumentoCliente tipoDocumento : tipoDocumentos) {
               cbxTipoDocumento.addItem(tipoDocumento);
          }
          
      }catch (Exception e) {
	e.printStackTrace();
      }
    }
    
    public void getDireccionCia(JTextField txtDireCia, JTextField txtUbigeoCia) {
        try {
            DireccionCiaDao direccionDao = new DireccionCiaDao();
            DireccionCia direcCia = direccionDao.getDireccionDao("01", "001");
            txtDireCia.setText(direcCia.getDireccion());
            txtUbigeoCia.setText(direcCia.getUbigeo());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
       
}
