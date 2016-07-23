package modelos;
//@author igor_

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Prontuario")
public class Prontuario implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int codigo;
    private String sintomas;
    private int paciente;
    private int medico;
    private String diagnostico;
    private String tratamento;
    
    public Prontuario(){
    }
    public Prontuario(int codigoPaciente){
        this.paciente = codigoPaciente;
    }
    public Prontuario(int codigo, String sintomas, int paciente, int medico, String diagnostico, String tratamento) {
        this.codigo = codigo;
        this.sintomas = sintomas;
        this.paciente = paciente;
        this.medico = medico;
        this.diagnostico = diagnostico;
        this.tratamento = tratamento;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getSintomas() {
        return sintomas;
    }
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
    public int getPaciente() {
        return paciente;
    }
    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }
    public String getDiagnostico() {
        return diagnostico;
    }
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public String getTratamento() {
        return tratamento;
    }
    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public int getMedico() {
        return medico;
    }
    public void setMedico(int medico) {
        this.medico = medico;
    }
}
