
package robin.com.guisunat.dao;

import java.util.ArrayList;
import java.util.List;
import robin.com.guisunat.modelo.TipoDocumentoCliente;


public class TipoDocumentoClienteDao {
    
    public List<TipoDocumentoCliente> getListaDocumentos() {
        List<TipoDocumentoCliente> tipoDocumentos = new ArrayList<>();
        tipoDocumentos.add(new TipoDocumentoCliente("0","DOC.TRIB.NO.DOM.SIN.RUC"));
        tipoDocumentos.add(new TipoDocumentoCliente("1","DNI-Documento Nacional de Identidad"));
        tipoDocumentos.add(new TipoDocumentoCliente("4","Carnet de extranjería"));
        tipoDocumentos.add(new TipoDocumentoCliente("6","RUC-Registro Unico de Contributentes"));
        tipoDocumentos.add(new TipoDocumentoCliente("7","Pasaporte"));
        tipoDocumentos.add(new TipoDocumentoCliente("A","Cédula Diplomática de identidad"));
        tipoDocumentos.add(new TipoDocumentoCliente("B","DOC.IDENT.PAIS.RESIDENCIA-NO.D"));
        tipoDocumentos.add(new TipoDocumentoCliente("C","Tax Identification Number - TIN – Doc Trib PP.NN"));
        tipoDocumentos.add(new TipoDocumentoCliente("D","Identification Number - IN – Doc Trib PP. JJ"));
        tipoDocumentos.add(new TipoDocumentoCliente("E","TAM- Tarjeta Andina de Migración "));
        return tipoDocumentos;
    }
    
}
