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
 * @author adm
 */
@Entity
@Table(name = "transferencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transferencia.findAll", query = "SELECT t FROM Transferencia t")
    , @NamedQuery(name = "Transferencia.findByCodigo", query = "SELECT t FROM Transferencia t WHERE t.codigo = :codigo")
    , @NamedQuery(name = "Transferencia.findByData", query = "SELECT t FROM Transferencia t WHERE t.data = :data")
    , @NamedQuery(name = "Transferencia.findByHora", query = "SELECT t FROM Transferencia t WHERE t.hora = :hora")
    , @NamedQuery(name = "Transferencia.findByValor", query = "SELECT t FROM Transferencia t WHERE t.valor = :valor")})
public class Transferencia implements Serializable {

    @Size(max = 45)
    @Column(name = "valor")
    private String valor;

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
    @JoinColumn(name = "destino", referencedColumnName = "codigo")
    @ManyToOne
    private Estudante destino;
    @JoinColumn(name = "origem", referencedColumnName = "codigo")
    @ManyToOne
    private Estudante origem;

    public Transferencia() {
    }

    public Transferencia(Integer codigo) {
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

   

    public Estudante getDestino() {
        return destino;
    }

    public void setDestino(Estudante destino) {
        this.destino = destino;
    }


    public Estudante getOrigem() {
        return origem;
    }

    public void setOrigem(Estudante origem) {
        this.origem = origem;
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
        if (!(object instanceof Transferencia)) {
            return false;
        }
        Transferencia other = (Transferencia) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Transferencia{" + "codigo=" + codigo + ", data=" + data + ", hora=" + hora + ", valor=" + valor + ", destino=" + destino + ", origem=" + origem + '}';
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

   
    
}
