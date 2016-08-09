package modelos;
//@author igor_

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue (value = "DadosAdicionais")
public class DadosAdPaciente implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int codigo;
    private boolean fumante;
    private boolean ingereBebidaAlcoolica;
    private boolean colesterol;
    private boolean diabetes;
    private boolean doencaCardiaca;

    public DadosAdPaciente(){
    }
    public boolean isFumante() {
        return fumante;
    }
    public void setFumante(boolean fumante) {
        this.fumante = fumante;
    }
    public boolean isIngereBebidaAlcoolica() {
        return ingereBebidaAlcoolica;
    }
    public void setIngereBebidaAlcoolica(boolean ingereBebidaAlcoolica) {
        this.ingereBebidaAlcoolica = ingereBebidaAlcoolica;
    }
    public boolean isColesterol() {
        return colesterol;
    }
    public void setColesterol(boolean colesterol) {
        this.colesterol = colesterol;
    }
    public boolean isDiabetes() {
        return diabetes;
    }
    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }
    public boolean isDoencaCardiaca() {
        return doencaCardiaca;
    }
    public void setDoencaCardiaca(boolean doencaCardiaca) {
        this.doencaCardiaca = doencaCardiaca;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
