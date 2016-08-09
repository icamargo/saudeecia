package modelos;
//@author igor_

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Prontuario")
public class Prontuario implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int codigo;
    private String sintomas;
    private String diagnostico;
    private String tratamento;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="codigoPaciente")
    private Paciente paciente; 
    
    public Prontuario(){
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
