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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASK KAPAMBA
 */
@Entity
@Table(name = "agente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agente.findAll", query = "SELECT a FROM Agente a")
    , @NamedQuery(name = "Agente.findByCodigo", query = "SELECT a FROM Agente a WHERE a.codigo = :codigo")
    , @NamedQuery(name = "Agente.findByBi", query = "SELECT a FROM Agente a WHERE a.bi = :bi")
    , @NamedQuery(name = "Agente.findByFoto", query = "SELECT a FROM Agente a WHERE a.foto = :foto")
    , @NamedQuery(name = "Agente.findByNivel", query = "SELECT a FROM Agente a WHERE a.nivel = :nivel")
    , @NamedQuery(name = "Agente.findByNome", query = "SELECT a FROM Agente a WHERE a.nome = :nome")
    , @NamedQuery(name = "Agente.findBySenha", query = "SELECT a FROM Agente a WHERE a.senha = :senha")
    , @NamedQuery(name = "Agente.findBySobrenome", query = "SELECT a FROM Agente a WHERE a.sobrenome = :sobrenome")})
public class Agente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Column(name = "bi")
    private String bi;
    @Column(name = "foto")
    private String foto;
    @Column(name = "nivel")
    private String nivel;
    @Column(name = "nome")
    private String nome;
    @Column(name = "senha")
    private String senha;
    @Column(name = "sobrenome")
    private String sobrenome;

    public Agente() {
    }

    public Agente(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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
        if (!(object instanceof Agente)) {
            return false;
        }
        Agente other = (Agente) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Agente[ codigo=" + codigo + " ]";
    }
    
}
