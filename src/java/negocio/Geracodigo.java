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
 * @author adm
 */
@Entity
@Table(name = "geracodigo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Geracodigo.findAll", query = "SELECT g FROM Geracodigo g")
    , @NamedQuery(name = "Geracodigo.findBySenha", query = "SELECT g FROM Geracodigo g WHERE g.senha = :senha")
    , @NamedQuery(name = "Geracodigo.findBySenhaA", query = "SELECT g FROM Geracodigo g WHERE g.senhaA = :senhaA")})
public class Geracodigo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "senha")
    private Integer senha;
    @Basic(optional = false)
    @Column(name = "senhaA")
    private String senhaA;

    public Geracodigo() {
    }

    public Geracodigo(Integer senha) {
        this.senha = senha;
    }

    public Geracodigo(Integer senha, String senhaA) {
        this.senha = senha;
        this.senhaA = senhaA;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public String getSenhaA() {
        return senhaA;
    }

    public void setSenhaA(String senhaA) {
        this.senhaA = senhaA;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (senha != null ? senha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Geracodigo)) {
            return false;
        }
        Geracodigo other = (Geracodigo) object;
        if ((this.senha == null && other.senha != null) || (this.senha != null && !this.senha.equals(other.senha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "negocio.Geracodigo[ senha=" + senha + " ]";
    }
    
}
