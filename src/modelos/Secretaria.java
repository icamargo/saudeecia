package modelos;
//@author igor_

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue (value = "Secretaria")
public class Secretaria extends Pessoa{
    @Enumerated (EnumType.STRING)
    private TurnoTrabalho turno;

    public Secretaria(){
    }
    public Secretaria(TurnoTrabalho turno, int codigo, String nome) {
        super(codigo, nome);
        this.turno = turno;
    }
    public TurnoTrabalho getTurno() {
        return turno;
    }
    public void setTurno(TurnoTrabalho turno) {
        this.turno = turno;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
