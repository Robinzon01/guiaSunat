
package robin.com.guisunat.dao;

import java.util.ArrayList;
import java.util.List;
import robin.com.guisunat.modelo.MotivoTraslado;

public class MotivoTrasladoDao {
    public List<MotivoTraslado> lista() {
       List<MotivoTraslado> motivoTraslados = new ArrayList<>();
       motivoTraslados.add(new MotivoTraslado("01","VENTA"));
       return motivoTraslados;
    }
}
