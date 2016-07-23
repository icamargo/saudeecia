package modelos;
//@author igor_

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table (name = "Consulta")
public class Consulta implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int codigo;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataHora;
    private int medico;
    private int paciente;
    @Enumerated (EnumType.STRING)
    private TipoConsulta tipoConsulta;
    
    public Consulta(){
    }
    public Consulta(int codigo, Calendar dataHora, int medico, int paciente, TipoConsulta tipoConsulta) {
        this.codigo = codigo;
        this.dataHora = dataHora;
        this.medico = medico;
        this.paciente = paciente;
        this.tipoConsulta = tipoConsulta;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Calendar getDataHora() {
        return dataHora;
    }
    public void setDataHora(Calendar dataHora) {
        this.dataHora = dataHora;
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
    public TipoConsulta getTipoConsulta() {
        return tipoConsulta;
    }
    public void setTipoConsulta(TipoConsulta tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }
}
