package modelos;
//@author igor_

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@DiscriminatorColumn (name = "tipoPessoa")
@Table (name = "Pessoa")
public abstract class Pessoa implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    protected Integer codigo;
    protected String nome;
    @Column(insertable=false, updatable=false)
    private String tipoPessoa;

    public Pessoa(){
    }
    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}
