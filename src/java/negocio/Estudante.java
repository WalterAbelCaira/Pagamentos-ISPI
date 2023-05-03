/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author CAIRA
 */
@Entity
@Table(name = "estudante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudante.findAll", query = "SELECT e FROM Estudante e")
    , @NamedQuery(name = "Estudante.findByCodigo", query = "SELECT e FROM Estudante e WHERE e.codigo = :codigo")
    , @NamedQuery(name = "Estudante.findByDatacriacao", query = "SELECT e FROM Estudante e WHERE e.datacriacao = :datacriacao")
    , @NamedQuery(name = "Estudante.findByDatanasc", query = "SELECT e FROM Estudante e WHERE e.datanasc = :datanasc")
    , @NamedQuery(name = "Estudante.findByDoc", query = "SELECT e FROM Estudante e WHERE e.doc = :doc")
    , @NamedQuery(name = "Estudante.findByEmail", query = "SELECT e FROM Estudante e WHERE e.email = :email")
    , @NamedQuery(name = "Estudante.findByNbi", query = "SELECT e FROM Estudante e WHERE e.nbi = :nbi")
    , @NamedQuery(name = "Estudante.findByNe", query = "SELECT e FROM Estudante e WHERE e.ne = :ne")
    , @NamedQuery(name = "Estudante.findByNome", query = "SELECT e FROM Estudante e WHERE e.nome = :nome")
    , @NamedQuery(name = "Estudante.findByNumero", query = "SELECT e FROM Estudante e WHERE e.numero = :numero")
    , @NamedQuery(name = "Estudante.findBySaldo", query = "SELECT e FROM Estudante e WHERE e.saldo = :saldo")
    , @NamedQuery(name = "Estudante.findBySenha", query = "SELECT e FROM Estudante e WHERE e.senha = :senha")
    , @NamedQuery(name = "Estudante.findBySexo", query = "SELECT e FROM Estudante e WHERE e.sexo = :sexo")
    , @NamedQuery(name = "Estudante.findBySobrenome", query = "SELECT e FROM Estudante e WHERE e.sobrenome = :sobrenome")
    , @NamedQuery(name = "Estudante.findByTelefone", query = "SELECT e FROM Estudante e WHERE e.telefone = :telefone")
    , @NamedQuery(name = "Estudante.findBySenhaA", query = "SELECT e FROM Estudante e WHERE e.senhaA = :senhaA")})
public class Estudante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Size(max = 255)
    @Column(name = "datacriacao")
    private String datacriacao;
    @Size(max = 255)
    @Column(name = "datanasc")
    private String datanasc;
    @Size(max = 255)
    @Column(name = "doc")
    private String doc;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    @Size(max = 255)
    @Column(name = "nbi")
    private String nbi;
    @Size(max = 255)
    @Column(name = "ne")
    private String ne;
    @Size(max = 255)
    @Column(name = "nome")
    private String nome;
    @Size(max = 255)
    @Column(name = "numero")
    private String numero;
    @Column(name = "saldo")
    private Integer saldo;
    @Size(max = 255)
    @Column(name = "senha")
    private String senha;
    @Size(max = 255)
    @Column(name = "sexo")
    private String sexo;
    @Size(max = 255)
    @Column(name = "sobrenome")
    private String sobrenome;
    @Size(max = 255)
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "senhaA")
    private String senhaA;
    @OneToMany(mappedBy = "destino")
    private List<Transferencia> transferenciaList;
    @OneToMany(mappedBy = "origem")
    private List<Transferencia> transferenciaList1;
    @OneToMany(mappedBy = "estudanteCodigo")
    private List<Deposito> depositoList;
    @OneToMany(mappedBy = "estudanteCodigo")
    private List<Pagamento> pagamentoList;

    public Estudante() {
    }
    

    public Estudante(Integer codigo) {
        this.codigo = codigo;
    }

    public Estudante(Integer codigo, String senhaA) {
        this.codigo = codigo;
        this.senhaA = senhaA;
    }

    public Estudante(Integer codigo, String datacriacao, String datanasc, String doc, String email, String nbi, String ne, String nome, String numero, Integer saldo, String senha, String sexo, String sobrenome, String telefone, String senhaA) {
        this.codigo = codigo;
        this.datacriacao = datacriacao;
        this.datanasc = datanasc;
        this.doc = doc;
        this.email = email;
        this.nbi = nbi;
        this.ne = ne;
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
        this.senha = senha;
        this.sexo = sexo;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.senhaA = senhaA;
       
    }

   
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDatacriacao() {
        return datacriacao;
    }

    public void setDatacriacao(String datacriacao) {
        this.datacriacao = datacriacao;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNbi() {
        return nbi;
    }

    public void setNbi(String nbi) {
        this.nbi = nbi;
    }

    public String getNe() {
        return ne;
    }

    public void setNe(String ne) {
        this.ne = ne;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenhaA() {
        return senhaA;
    }

    public void setSenhaA(String senhaA) {
        this.senhaA = senhaA;
    }

    @XmlTransient
    public List<Transferencia> getTransferenciaList() {
        return transferenciaList;
    }

    public void setTransferenciaList(List<Transferencia> transferenciaList) {
        this.transferenciaList = transferenciaList;
    }

    @XmlTransient
    public List<Transferencia> getTransferenciaList1() {
        return transferenciaList1;
    }

    public void setTransferenciaList1(List<Transferencia> transferenciaList1) {
        this.transferenciaList1 = transferenciaList1;
    }

    @XmlTransient
    public List<Deposito> getDepositoList() {
        return depositoList;
    }

    public void setDepositoList(List<Deposito> depositoList) {
        this.depositoList = depositoList;
    }

    @XmlTransient
    public List<Pagamento> getPagamentoList() {
        return pagamentoList;
    }

    public void setPagamentoList(List<Pagamento> pagamentoList) {
        this.pagamentoList = pagamentoList;
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
        if (!(object instanceof Estudante)) {
            return false;
        }
        Estudante other = (Estudante) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "negocio.Estudante[ codigo=" + codigo + " ]";
    }
    
}
