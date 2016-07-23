package modelos;
//@author igor_

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Alergia")
public class Alergia implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int codigo;
    private int paciente;
    private String tipo;
    private String agenteCausador;

    public Alergia(){
    }
    public Alergia(int codigo, int paciente, String tipo, String agenteCausador) {
        this.codigo = codigo;
        this.paciente = paciente;
        this.tipo = tipo;
        this.agenteCausador = agenteCausador;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getPaciente() {
        return paciente;
    }
    public void setPaciente(int paciente) {
        this.paciente = paciente;
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
}
