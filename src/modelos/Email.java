package modelos;
//@author igor_

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue (value = "Email")
public class Email extends Mensagem{
    private String enderecoEmail;

    public Email(){
    }
    public Email(String enderecoEmail, String texto, int codigoPaciente) {
        super(texto, codigoPaciente);
        this.enderecoEmail = enderecoEmail;
    }
    public String getEnderecoEmail() {
        return enderecoEmail;
    }
    public void setEnderecoEmail(String enderecoEmail) {
        this.enderecoEmail = enderecoEmail;
    }
    
}
