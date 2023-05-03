/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author CAIRA
 */
@Entity
@Table(name = "deposito")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Deposito.findAll", query = "SELECT d FROM Deposito d")
    , @NamedQuery(name = "Deposito.findByCodigo", query = "SELECT d FROM Deposito d WHERE d.codigo = :codigo")
    , @NamedQuery(name = "Deposito.findByData", query = "SELECT d FROM Deposito d WHERE d.data = :data")
    , @NamedQuery(name = "Deposito.findByHora", query = "SELECT d FROM Deposito d WHERE d.hora = :hora")
    , @NamedQuery(name = "Deposito.findByValor", query = "SELECT d FROM Deposito d WHERE d.valor = :valor")})
public class Deposito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Size(max = 255)
    @Column(name = "data")
    private String data;
    @Size(max = 255)
    @Column(name = "hora")
    private String hora;
    @Size(max = 255)
    @Column(name = "valor")
    private String valor;
    @JoinColumn(name = "estudante_codigo", referencedColumnName = "codigo")
    @ManyToOne
    private Estudante estudanteCodigo;

    public Deposito() {
    }

    public Deposito(Integer codigo) {
        this.codigo = codigo;
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Estudante getEstudanteCodigo() {
        return estudanteCodigo;
    }

    public void setEstudanteCodigo(Estudante estudanteCodigo) {
        this.estudanteCodigo = estudanteCodigo;
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
        if (!(object instanceof Deposito)) {
            return false;
        }
        Deposito other = (Deposito) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "negocio.Deposito[ codigo=" + codigo + " ]";
    }
    
}
