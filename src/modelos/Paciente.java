package modelos;
//@author igor_

import java.util.Calendar;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;

@Entity
@DiscriminatorValue (value = "Paciente")
public class Paciente extends Pessoa{
    protected String cpf;
    protected String rg;
    @Temporal(javax.persistence.TemporalType.DATE)
    protected Calendar dataNascimento;
    protected String endereco;
    protected String celular;
    protected String telefone;
    protected String email;
    @Enumerated (EnumType.STRING)
    protected TipoConvenio tipoConvenio;
    
    public Paciente(){
    }
    public Paciente(String nome, String cpf, String rg, Calendar dataNascimento, String endereco, String celular, String telefone, String email, TipoConvenio tipoConvenio) {
        super(nome);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.celular = celular;
        this.telefone = telefone;
        this.email = email;
        this.tipoConvenio = tipoConvenio;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public Calendar getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public TipoConvenio getTipoConvenio() {
        return tipoConvenio;
    }
    public void setTipoConvenio(TipoConvenio tipoConvenio) {
        this.tipoConvenio = tipoConvenio;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
