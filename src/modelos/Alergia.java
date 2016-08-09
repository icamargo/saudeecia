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
@Table (name = "Alergia")
public class Alergia implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int codigo;
    private String tipo;
    private String agenteCausador;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="codigoPaciente")
    private Paciente paciente;

    public Alergia(){
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getAgenteCausador() {
        return agenteCausador;
    }
    public void setAgenteCausador(String agenteCausador) {
        this.agenteCausador = agenteCausador;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
