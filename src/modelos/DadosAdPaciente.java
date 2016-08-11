package modelos;
//@author igor_

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "DadosAdicionais")
public class DadosAdPaciente implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer codigo;
    private boolean fumante;
    private boolean ingereBebidaAlcoolica;
    private String colesterol;
    private String diabetes;
    private boolean doencaCardiaca;

    public DadosAdPaciente(){
        this.fumante = false;
        this.ingereBebidaAlcoolica = false;
        this.colesterol = "Aceitavel";
        this.diabetes = "Aceitavel";
        this.doencaCardiaca = false;
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
    
    public boolean isDoencaCardiaca() {
        return doencaCardiaca;
    }
    public void setDoencaCardiaca(boolean doencaCardiaca) {
        this.doencaCardiaca = doencaCardiaca;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getColesterol() {
        return colesterol;
    }

    public void setColesterol(String colesterol) {
        this.colesterol = colesterol;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }
}
