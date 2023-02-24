
package robin.com.guisunat.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "ARFAMC")
public class Arfamc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NO_CIA")
    private String noCia;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "ANO_PROCE")
    private Short anoProce;
    @Column(name = "MES_PROCE")
    private Short mesProce;
    @Column(name = "CLAVE")
    private String clave;
    @Column(name = "DOC_GUIA")
    private String docGuia;
    @Column(name = "COD_DIARIOM")
    private String codDiariom;
    @Column(name = "COD_DIARIOD")
    private String codDiariod;
    @Column(name = "BOD_ESPECIAL")
    private String bodEspecial;
    @Column(name = "DOC_TRASLADO_E")
    private String docTrasladoE;
    @Column(name = "DOC_TRASLADO_S")
    private String docTrasladoS;
    @Column(name = "CLASE_CAMBIO")
    private String claseCambio;
    @Column(name = "RESERVA_AUTOMATICA")
    private String reservaAutomatica;
    @Column(name = "RESERVA")
    private String reserva;
    @Column(name = "ISC")
    private String isc;
    @Column(name = "CTA_PROMOCION")
    private String ctaPromocion;
    @Column(name = "CTA_DEGUSTACION")
    private String ctaDegustacion;
    @Column(name = "DOC_DEVOL_GUIA")
    private String docDevolGuia;
    @Column(name = "COD_INSTIT")
    private String codInstit;
    @Column(name = "DOC_GUIA_REASIGNADA")
    private String docGuiaReasignada;
    @Column(name = "VERIFICA_STOCK")
    private String verificaStock;
    @Column(name = "COD_INTERES")
    private String codInteres;
    @Column(name = "CTA_FLETE")
    private String ctaFlete;
    @Column(name = "CTA_SEGURO")
    private String ctaSeguro;
    @Column(name = "NOMBRE_ANO")
    private String nombreAno;
    @Column(name = "RUBRO_CLAVE")
    private String rubroClave;
    @Column(name = "RUBRO_ISC")
    private String rubroIsc;
    @Column(name = "CORR_PEDIDO")
    private String corrPedido;
    @Column(name = "CORR_LIQPV")
    private String corrLiqpv;
    @Column(name = "CORR_LIQSU")
    private String corrLiqsu;
    @Column(name = "VENTA_NAC")
    private String ventaNac;
    @Column(name = "IND_PEDIDO")
    private String indPedido;
    @Column(name = "IND_STOCK_NEG")
    private String indStockNeg;
    @Column(name = "CLIENTE_CIA")
    private String clienteCia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_UITS")
    private BigDecimal valorUits;
    @Column(name = "COD_BOLETA_CIA")
    private String codBoletaCia;
    @Column(name = "COD_FACTURA_CIA")
    private String codFacturaCia;
    @Column(name = "TIPO_SUNAT")
    private String tipoSunat;
    @Column(name = "PLAZO_MAX_CREDITO")
    private Short plazoMaxCredito;
    @Column(name = "TIPO_TASA_IGV")
    private String tipoTasaIgv;
    @Column(name = "TIPO_TASA_ISC")
    private String tipoTasaIsc;
    @Column(name = "SERIE_GR_FICTA")
    private String serieGrFicta;
    @Column(name = "VALOR_MAX_BOL")
    private BigDecimal valorMaxBol;
    @Column(name = "TRANS_PTO_VENTA")
    private String transPtoVenta;
    @Column(name = "TIPO_PRECIO_PTO_VENTA")
    private String tipoPrecioPtoVenta;
    @Column(name = "TIPO_LISTA")
    private String tipoLista;
    @Column(name = "COD_DIARIO_PV")
    private String codDiarioPv;
    @Column(name = "CTA_EXTORNO_CDO")
    private String ctaExtornoCdo;
    @Column(name = "CLASE_CAMBIO_PIZARRA")
    private String claseCambioPizarra;
    @Column(name = "CUENTA_LIQFERIAS_SOL")
    private String cuentaLiqferiasSol;
    @Column(name = "CUENTA_LIQFERIAS_DOL")
    private String cuentaLiqferiasDol;
    @Column(name = "CENTRO_ONLINE")
    private String centroOnline;
    @Column(name = "BODEGA_ONLINE")
    private String bodegaOnline;
    @Column(name = "TOPE_GASTOS_ADM")
    private BigDecimal topeGastosAdm;
    @Column(name = "COSTO_GASTOS_ADM")
    private BigDecimal costoGastosAdm;
    @Column(name = "NO_CLIENTE_ONLINE")
    private String noClienteOnline;
    @Column(name = "SERIE_FACTU_FICTA")
    private String serieFactuFicta;
    @Column(name = "SERIE_NC_FICTA")
    private String serieNcFicta;
    @Column(name = "TELEFONOS")
    private String telefonos;
    @Column(name = "DETRACCION_BN")
    private String detraccionBn;
    /*
    @Lob
    @Column(name = "LOGO")
    private Serializable logo;
    */
    @Column(name = "LOGO")
    private byte[] logo;
    
    @Column(name = "RAZON_SOCIAL")
    private String razonSocial;
    @Column(name = "BANCO")
    private String banco;
    @Column(name = "CUENTA_SOL")
    private String cuentaSol;
    @Column(name = "CUENTA_DOL")
    private String cuentaDol;
    @Column(name = "DESC1")
    private String desc1;
    @Column(name = "DESC2")
    private String desc2;
    @Column(name = "DESC3")
    private String desc3;

    public Arfamc() {
    }

    public Arfamc(String noCia) {
        this.noCia = noCia;
    }

    public String getNoCia() {
        return noCia;
    }

    public void setNoCia(String noCia) {
        this.noCia = noCia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Short getAnoProce() {
        return anoProce;
    }

    public void setAnoProce(Short anoProce) {
        this.anoProce = anoProce;
    }

    public Short getMesProce() {
        return mesProce;
    }

    public void setMesProce(Short mesProce) {
        this.mesProce = mesProce;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDocGuia() {
        return docGuia;
    }

    public void setDocGuia(String docGuia) {
        this.docGuia = docGuia;
    }

    public String getCodDiariom() {
        return codDiariom;
    }

    public void setCodDiariom(String codDiariom) {
        this.codDiariom = codDiariom;
    }

    public String getCodDiariod() {
        return codDiariod;
    }

    public void setCodDiariod(String codDiariod) {
        this.codDiariod = codDiariod;
    }

    public String getBodEspecial() {
        return bodEspecial;
    }

    public void setBodEspecial(String bodEspecial) {
        this.bodEspecial = bodEspecial;
    }

    public String getDocTrasladoE() {
        return docTrasladoE;
    }

    public void setDocTrasladoE(String docTrasladoE) {
        this.docTrasladoE = docTrasladoE;
    }

    public String getDocTrasladoS() {
        return docTrasladoS;
    }

    public void setDocTrasladoS(String docTrasladoS) {
        this.docTrasladoS = docTrasladoS;
    }

    public String getClaseCambio() {
        return claseCambio;
    }

    public void setClaseCambio(String claseCambio) {
        this.claseCambio = claseCambio;
    }

    public String getReservaAutomatica() {
        return reservaAutomatica;
    }

    public void setReservaAutomatica(String reservaAutomatica) {
        this.reservaAutomatica = reservaAutomatica;
    }

    public String getReserva() {
        return reserva;
    }

    public void setReserva(String reserva) {
        this.reserva = reserva;
    }

    public String getIsc() {
        return isc;
    }

    public void setIsc(String isc) {
        this.isc = isc;
    }

    public String getCtaPromocion() {
        return ctaPromocion;
    }

    public void setCtaPromocion(String ctaPromocion) {
        this.ctaPromocion = ctaPromocion;
    }

    public String getCtaDegustacion() {
        return ctaDegustacion;
    }

    public void setCtaDegustacion(String ctaDegustacion) {
        this.ctaDegustacion = ctaDegustacion;
    }

    public String getDocDevolGuia() {
        return docDevolGuia;
    }

    public void setDocDevolGuia(String docDevolGuia) {
        this.docDevolGuia = docDevolGuia;
    }

    public String getCodInstit() {
        return codInstit;
    }

    public void setCodInstit(String codInstit) {
        this.codInstit = codInstit;
    }

    public String getDocGuiaReasignada() {
        return docGuiaReasignada;
    }

    public void setDocGuiaReasignada(String docGuiaReasignada) {
        this.docGuiaReasignada = docGuiaReasignada;
    }

    public String getVerificaStock() {
        return verificaStock;
    }

    public void setVerificaStock(String verificaStock) {
        this.verificaStock = verificaStock;
    }

    public String getCodInteres() {
        return codInteres;
    }

    public void setCodInteres(String codInteres) {
        this.codInteres = codInteres;
    }

    public String getCtaFlete() {
        return ctaFlete;
    }

    public void setCtaFlete(String ctaFlete) {
        this.ctaFlete = ctaFlete;
    }

    public String getCtaSeguro() {
        return ctaSeguro;
    }

    public void setCtaSeguro(String ctaSeguro) {
        this.ctaSeguro = ctaSeguro;
    }

    public String getNombreAno() {
        return nombreAno;
    }

    public void setNombreAno(String nombreAno) {
        this.nombreAno = nombreAno;
    }

    public String getRubroClave() {
        return rubroClave;
    }

    public void setRubroClave(String rubroClave) {
        this.rubroClave = rubroClave;
    }

    public String getRubroIsc() {
        return rubroIsc;
    }

    public void setRubroIsc(String rubroIsc) {
        this.rubroIsc = rubroIsc;
    }

    public String getCorrPedido() {
        return corrPedido;
    }

    public void setCorrPedido(String corrPedido) {
        this.corrPedido = corrPedido;
    }

    public String getCorrLiqpv() {
        return corrLiqpv;
    }

    public void setCorrLiqpv(String corrLiqpv) {
        this.corrLiqpv = corrLiqpv;
    }

    public String getCorrLiqsu() {
        return corrLiqsu;
    }

    public void setCorrLiqsu(String corrLiqsu) {
        this.corrLiqsu = corrLiqsu;
    }

    public String getVentaNac() {
        return ventaNac;
    }

    public void setVentaNac(String ventaNac) {
        this.ventaNac = ventaNac;
    }

    public String getIndPedido() {
        return indPedido;
    }

    public void setIndPedido(String indPedido) {
        this.indPedido = indPedido;
    }

    public String getIndStockNeg() {
        return indStockNeg;
    }

    public void setIndStockNeg(String indStockNeg) {
        this.indStockNeg = indStockNeg;
    }

    public String getClienteCia() {
        return clienteCia;
    }

    public void setClienteCia(String clienteCia) {
        this.clienteCia = clienteCia;
    }

    public BigDecimal getValorUits() {
        return valorUits;
    }

    public void setValorUits(BigDecimal valorUits) {
        this.valorUits = valorUits;
    }

    public String getCodBoletaCia() {
        return codBoletaCia;
    }

    public void setCodBoletaCia(String codBoletaCia) {
        this.codBoletaCia = codBoletaCia;
    }

    public String getCodFacturaCia() {
        return codFacturaCia;
    }

    public void setCodFacturaCia(String codFacturaCia) {
        this.codFacturaCia = codFacturaCia;
    }

    public String getTipoSunat() {
        return tipoSunat;
    }

    public void setTipoSunat(String tipoSunat) {
        this.tipoSunat = tipoSunat;
    }

    public Short getPlazoMaxCredito() {
        return plazoMaxCredito;
    }

    public void setPlazoMaxCredito(Short plazoMaxCredito) {
        this.plazoMaxCredito = plazoMaxCredito;
    }

    public String getTipoTasaIgv() {
        return tipoTasaIgv;
    }

    public void setTipoTasaIgv(String tipoTasaIgv) {
        this.tipoTasaIgv = tipoTasaIgv;
    }

    public String getTipoTasaIsc() {
        return tipoTasaIsc;
    }

    public void setTipoTasaIsc(String tipoTasaIsc) {
        this.tipoTasaIsc = tipoTasaIsc;
    }

    public String getSerieGrFicta() {
        return serieGrFicta;
    }

    public void setSerieGrFicta(String serieGrFicta) {
        this.serieGrFicta = serieGrFicta;
    }

    public BigDecimal getValorMaxBol() {
        return valorMaxBol;
    }

    public void setValorMaxBol(BigDecimal valorMaxBol) {
        this.valorMaxBol = valorMaxBol;
    }

    public String getTransPtoVenta() {
        return transPtoVenta;
    }

    public void setTransPtoVenta(String transPtoVenta) {
        this.transPtoVenta = transPtoVenta;
    }

    public String getTipoPrecioPtoVenta() {
        return tipoPrecioPtoVenta;
    }

    public void setTipoPrecioPtoVenta(String tipoPrecioPtoVenta) {
        this.tipoPrecioPtoVenta = tipoPrecioPtoVenta;
    }

    public String getTipoLista() {
        return tipoLista;
    }

    public void setTipoLista(String tipoLista) {
        this.tipoLista = tipoLista;
    }

    public String getCodDiarioPv() {
        return codDiarioPv;
    }

    public void setCodDiarioPv(String codDiarioPv) {
        this.codDiarioPv = codDiarioPv;
    }

    public String getCtaExtornoCdo() {
        return ctaExtornoCdo;
    }

    public void setCtaExtornoCdo(String ctaExtornoCdo) {
        this.ctaExtornoCdo = ctaExtornoCdo;
    }

    public String getClaseCambioPizarra() {
        return claseCambioPizarra;
    }

    public void setClaseCambioPizarra(String claseCambioPizarra) {
        this.claseCambioPizarra = claseCambioPizarra;
    }

    public String getCuentaLiqferiasSol() {
        return cuentaLiqferiasSol;
    }

    public void setCuentaLiqferiasSol(String cuentaLiqferiasSol) {
        this.cuentaLiqferiasSol = cuentaLiqferiasSol;
    }

    public String getCuentaLiqferiasDol() {
        return cuentaLiqferiasDol;
    }

    public void setCuentaLiqferiasDol(String cuentaLiqferiasDol) {
        this.cuentaLiqferiasDol = cuentaLiqferiasDol;
    }

    public String getCentroOnline() {
        return centroOnline;
    }

    public void setCentroOnline(String centroOnline) {
        this.centroOnline = centroOnline;
    }

    public String getBodegaOnline() {
        return bodegaOnline;
    }

    public void setBodegaOnline(String bodegaOnline) {
        this.bodegaOnline = bodegaOnline;
    }

    public BigDecimal getTopeGastosAdm() {
        return topeGastosAdm;
    }

    public void setTopeGastosAdm(BigDecimal topeGastosAdm) {
        this.topeGastosAdm = topeGastosAdm;
    }

    public BigDecimal getCostoGastosAdm() {
        return costoGastosAdm;
    }

    public void setCostoGastosAdm(BigDecimal costoGastosAdm) {
        this.costoGastosAdm = costoGastosAdm;
    }

    public String getNoClienteOnline() {
        return noClienteOnline;
    }

    public void setNoClienteOnline(String noClienteOnline) {
        this.noClienteOnline = noClienteOnline;
    }

    public String getSerieFactuFicta() {
        return serieFactuFicta;
    }

    public void setSerieFactuFicta(String serieFactuFicta) {
        this.serieFactuFicta = serieFactuFicta;
    }

    public String getSerieNcFicta() {
        return serieNcFicta;
    }

    public void setSerieNcFicta(String serieNcFicta) {
        this.serieNcFicta = serieNcFicta;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getDetraccionBn() {
        return detraccionBn;
    }

    public void setDetraccionBn(String detraccionBn) {
        this.detraccionBn = detraccionBn;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCuentaSol() {
        return cuentaSol;
    }

    public void setCuentaSol(String cuentaSol) {
        this.cuentaSol = cuentaSol;
    }

    public String getCuentaDol() {
        return cuentaDol;
    }

    public void setCuentaDol(String cuentaDol) {
        this.cuentaDol = cuentaDol;
    }

    public String getDesc1() {
        return desc1;
    }

    public void setDesc1(String desc1) {
        this.desc1 = desc1;
    }

    public String getDesc2() {
        return desc2;
    }

    public void setDesc2(String desc2) {
        this.desc2 = desc2;
    }

    public String getDesc3() {
        return desc3;
    }

    public void setDesc3(String desc3) {
        this.desc3 = desc3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noCia != null ? noCia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arfamc)) {
            return false;
        }
        Arfamc other = (Arfamc) object;
        if ((this.noCia == null && other.noCia != null) || (this.noCia != null && !this.noCia.equals(other.noCia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "robin.com.guisunat.entidad.Arfamc[ noCia=" + noCia + " ]";
    }
    
}
