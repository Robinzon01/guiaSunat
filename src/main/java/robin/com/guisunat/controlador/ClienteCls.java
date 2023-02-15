package robin.com.guisunat.controlador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import robin.com.guisunat.bean.ClienteBean;
import robin.com.guisunat.bean.DireccionClienteBean;
import robin.com.guisunat.dao.ClienteDao;

public class ClienteCls {

    private ClienteDao clienteDao = new ClienteDao();

    public void cargarClientes(String tipDocu, String campo, JTextField txtUno, JList Thelist,
            JScrollPane SUBIRYBAJAR, DefaultListModel modelolista, JPopupMenu jPopupMenu1) {

        SUBIRYBAJAR.setViewportView(Thelist);
        jPopupMenu1.add(SUBIRYBAJAR);

        try {
            List<ClienteBean> clientes = new ArrayList<>();
            switch (tipDocu) {
                case "1":
                    clientes = clienteDao.listaCliente("01", "DNI", 8, campo, txtUno.getText());
                    break;
                case "6":
                    clientes = clienteDao.listaCliente("01", "RUC", 11, campo, txtUno.getText());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No tiene permitido está busqueda. Verifica si el tipo de documento del cliente es el correcto.");
                    break;
            }

            Thelist.removeAll();
            modelolista.removeAllElements();
            int contadorlista = 0;

            for (ClienteBean cliente : clientes) {
                modelolista.addElement(cliente.toString());
            }
            Thelist.setModel(modelolista);

            jPopupMenu1.setLocation(txtUno.getLocationOnScreen().x + 0, txtUno.getLocationOnScreen().y + 25);
            if (txtUno.getText().trim().length() == 0 || Thelist.getModel().getSize() == 0) {
                jPopupMenu1.setVisible(false);
            } else {
                jPopupMenu1.setVisible(true);
            }

            Thelist.setSelectedIndex(contadorlista);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void cargarDirecionCliente(String campo, JTextField txtDirecCliente, JTextField txtUbigeoCliente) {
        DireccionClienteBean direccionCli = this.clienteDao.getDirecCliente("01", campo);
        txtDirecCliente.setText(direccionCli.getDireccion());
        txtUbigeoCliente.setText(direccionCli.getDirec2());
    }

}
