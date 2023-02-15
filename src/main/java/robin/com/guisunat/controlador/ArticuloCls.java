
package robin.com.guisunat.controlador;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import robin.com.guisunat.bean.ArticuloBean;
import robin.com.guisunat.dao.ArticuloDao;

public class ArticuloCls {
     public void cargarArticulos(JTextField txtDescripProducto, JList Thelist,
            JScrollPane SUBIRYBAJAR, DefaultListModel modelolista, JPopupMenu jPopupMenu1) {

        SUBIRYBAJAR.setViewportView(Thelist);
        jPopupMenu1.add(SUBIRYBAJAR);
         try {
             ArticuloDao dao = new ArticuloDao();
             String descripcion = txtDescripProducto.getText();
             List<ArticuloBean> articulos = dao.listaArticulos("01", descripcion);
             
             Thelist.removeAll();
             modelolista.removeAllElements();
             int contadorlista = 0;
             
             for (ArticuloBean articulo : articulos) {
                 modelolista.addElement(articulo.toString());
             }
             
             Thelist.setModel(modelolista);

            jPopupMenu1.setLocation(txtDescripProducto.getLocationOnScreen().x + 0, txtDescripProducto.getLocationOnScreen().y + 25);
            if (txtDescripProducto.getText().trim().length() == 0 || Thelist.getModel().getSize() == 0) {
                jPopupMenu1.setVisible(false);
            } else {
                jPopupMenu1.setVisible(true);
            }

            Thelist.setSelectedIndex(contadorlista);
             
         } catch (Exception e) {
             e.printStackTrace();
         }
        
    }    
}
