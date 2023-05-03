/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dao.EstudanteDao;
import dao.PagamentoDao;
import dao.ServicoDao;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import util.DataUtil;

/**
 *
 * @author adm
 */
@Entity
@Table(name = "pagamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagamento.findAll", query = "SELECT p FROM Pagamento p")
    ,
    @NamedQuery(name = "Pagamento.findByCodigo", query = "SELECT p FROM Pagamento p WHERE p.codigo = :codigo")
    ,
    @NamedQuery(name = "Pagamento.findByData", query = "SELECT p FROM Pagamento p WHERE p.data = :data")
    ,
    @NamedQuery(name = "Pagamento.findByHora", query = "SELECT p FROM Pagamento p WHERE p.hora = :hora")})
public class Pagamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "data")
    private String data;
    @Column(name = "hora")
    private String hora;
    @JoinColumn(name = "estudante_codigo", referencedColumnName = "codigo")
    @ManyToOne
    private Estudante estudanteCodigo;
    @JoinColumn(name = "servico_codigo", referencedColumnName = "codigo")
    @ManyToOne
    private Servico servicoCodigo;

    public Pagamento() {
    }

    public Pagamento(Integer codigo) {
        this.codigo = codigo;
    }

    public Pagamento(Integer codigo, String data, String hora, Estudante estudanteCodigo, Servico servicoCodigo) {
        this.codigo = codigo;
        this.data = data;
        this.hora = hora;
        this.estudanteCodigo = estudanteCodigo;
        this.servicoCodigo = servicoCodigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Estudante getEstudanteCodigo() {
        return estudanteCodigo;
    }

    public void setEstudanteCodigo(Estudante estudanteCodigo) {
        this.estudanteCodigo = estudanteCodigo;
    }

    public Servico getServicoCodigo() {
        return servicoCodigo;
    }

    public void setServicoCodigo(Servico servicoCodigo) {
        this.servicoCodigo = servicoCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagamento)) {
            return false;
        }
        Pagamento other = (Pagamento) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "codigo=" + codigo + ", data=" + data + ", hora=" + hora + ", estudanteCodigo=" + estudanteCodigo + ", servicoCodigo=" + servicoCodigo + '}';
    }

  
    

}
