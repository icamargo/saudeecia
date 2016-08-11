package modelos;
//@author igor_

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue (value = "Medico")
public class Medico extends Pessoa{
    private int crm;

    public Medico(){
        this.codigo = null;
    }
    public Medico(int crm, int codigo, String nome) {
        super(codigo, nome);
        this.crm = crm;
    }
    public int getCrm() {
        return crm;
    }
    public void setCrm(int crm) {
        this.crm = crm;
    }
    @Override
    public Integer getCodigo() {
        return codigo;
    }
    @Override
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}
