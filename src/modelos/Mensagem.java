package modelos;
//@author igor_

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Mensagem")
public abstract class Mensagem implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String texto;
    private int codigoPaciente;

    public Mensagem(){
    }
    public Mensagem(String texto, int codigoPaciente) {
        this.texto = texto;
        this.codigoPaciente = codigoPaciente;
    }
    public int getCodigoPaciente() {
        return codigoPaciente;
    }
    public void setCodigoPaciente(int codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
}
