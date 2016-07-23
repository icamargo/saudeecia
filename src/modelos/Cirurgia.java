package modelos;
//@author igor_

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Cirurgia")
public class Cirurgia implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int codigo;
    private String parteCorpo;
    private int medico;
    private int paciente;
    private int diasRecuperacao;

    public Cirurgia(){
    }
    public Cirurgia(int codigo, String parteCorpo, int medico, int paciente, int diasRecuperacao) {
        this.codigo = codigo;
        this.parteCorpo = parteCorpo;
        this.medico = medico;
        this.paciente = paciente;
        this.diasRecuperacao = diasRecuperacao;
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
    public int getMedico() {
        return medico;
    }
    public void setMedico(int medico) {
        this.medico = medico;
    }
    public int getPaciente() {
        return paciente;
    }
    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }
    public int getDiasRecuperacao() {
        return diasRecuperacao;
    }
    public void setDiasRecuperacao(int diasRecuperacao) {
        this.diasRecuperacao = diasRecuperacao;
    }
}
