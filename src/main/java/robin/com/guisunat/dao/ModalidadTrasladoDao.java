
package robin.com.guisunat.dao;

import java.util.ArrayList;
import java.util.List;
import robin.com.guisunat.modelo.ModalidadTraslado;

public class ModalidadTrasladoDao {
    
    public List<ModalidadTraslado> lista() {
       List<ModalidadTraslado> modalidadTraslado = new ArrayList<>();
       modalidadTraslado.add(new ModalidadTraslado("01","Transporte público"));
       modalidadTraslado.add(new ModalidadTraslado("02","Transporte privado"));
       return modalidadTraslado;
    }
    
}
