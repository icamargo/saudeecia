package modelos;
//@author igor_

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue (value = "Paciente")
public class Paciente extends Pessoa{
    private String cpf;
    private String rg;
    private String dataNascimento;
    private String endereco;
    private String celular;
    private String telefone;
    private String email;
    private String tipoConvenio;
    @OneToMany (cascade = CascadeType.ALL)
    private List<Prontuario> prontuarios;
    @OneToOne (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn (name = "codigoDadosAd")
    private DadosAdPaciente dadosAdPaciente;
    @OneToMany (cascade = CascadeType.ALL)
    private List<Cirurgia> cirurgias;
    @OneToMany (cascade = CascadeType.ALL)
    private List<Alergia> alergias;
    @OneToMany (cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Consulta> consultas;
    
    public Paciente(){
        this.codigo = null;
        this.prontuarios = new ArrayList();
        this.dadosAdPaciente = new DadosAdPaciente();
        this.cirurgias = new ArrayList();
        this.alergias = new ArrayList();
        this.consultas = new ArrayList();
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

    public String getTipoConvenio() {
        return tipoConvenio;
    }

    public void setTipoConvenio(String tipoConvenio) {
        this.tipoConvenio = tipoConvenio;
    }

    public List<Prontuario> getProntuarios() {
        return prontuarios;
    }

    public void setProntuarios(List<Prontuario> prontuarios) {
        this.prontuarios = prontuarios;
    }

    public DadosAdPaciente getDadosAdPaciente() {
        return dadosAdPaciente;
    }

    public void setDadosAdPaciente(DadosAdPaciente dadosAdPaciente) {
        this.dadosAdPaciente = dadosAdPaciente;
    }

    public List<Cirurgia> getCirurgias() {
        return cirurgias;
    }

    public void setCirurgias(List<Cirurgia> cirurgias) {
        this.cirurgias = cirurgias;
    }

    public List<Alergia> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<Alergia> alergias) {
        this.alergias = alergias;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
