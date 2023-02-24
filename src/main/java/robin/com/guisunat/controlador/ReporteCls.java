
package robin.com.guisunat.controlador;

import java.awt.Frame;
import java.io.InputStream;
import java.util.Collection;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class ReporteCls {
    
  private static final String JASPER_DIRECTORY = "/jaspers/"; 
  
  public void llamarGuia(String jasperName, Map parametros, Collection beanCollection) {
      try {
            String urlPlantilla = JASPER_DIRECTORY + jasperName + ".jasper";
            InputStream is = getClass().getResourceAsStream(urlPlantilla);

            JRBeanCollectionDataSource data = new JRBeanCollectionDataSource(beanCollection);
            JasperPrint jasperPrint = JasperFillManager.fillReport(is, parametros, data);

            JasperViewer view = new JasperViewer(jasperPrint,false);
            view.setTitle("GUÍA DE REMSIÓN");
            view.setExtendedState(Frame.MAXIMIZED_BOTH);
            view.setVisible(true);
      } catch (Exception e) {
          e.printStackTrace();
      }
  }    
}
