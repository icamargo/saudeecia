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
@Table (name = "Cirurgia")
public class Cirurgia implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int codigo;
    private String parteCorpo;
    private int diasRecuperacao;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="codigoPaciente")
    private Paciente paciente;

    public Cirurgia(){
    }
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getParteCorpo() {
        return parteCorpo;
    }
    public void setParteCorpo(String parteCorpo) {
        this.parteCorpo = parteCorpo;
    }
    public int getDiasRecuperacao() {
        return diasRecuperacao;
    }
    public void setDiasRecuperacao(int diasRecuperacao) {
        this.diasRecuperacao = diasRecuperacao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
