package modelos;
//@author igor_

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue (value = "Sms")
public class Sms extends Mensagem{
    private String numeroCelular;

    public Sms(){
    }
    public Sms(String numeroCelular, String texto, int codigoPaciente) {
        super(texto, codigoPaciente);
        this.numeroCelular = numeroCelular;
    }
    public String getNumeroCelular() {
        return numeroCelular;
    }
    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
}
