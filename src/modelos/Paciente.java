package modelos;
//@author igor_

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue (value = "Paciente")
public class Paciente extends Pessoa{
    private String cpf;
    private String rg;
    @Temporal(TemporalType.DATE)
    private Calendar dataNascimento;
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
    
    public Paciente(){
        this.prontuarios = new ArrayList<>();
        this.dadosAdPaciente = null;
        this.cirurgias = new ArrayList();
        this.alergias = new ArrayList<>();
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
    
}
