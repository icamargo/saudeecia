package controle;

import java.io.IOException;
import java.util.Calendar;
import modelos.Consulta;
import modelos.ConsultaDAO;
import modelos.Medico;
import modelos.Paciente;
import modelos.PessoaDAO;

/**
 *
 * @author Igor
 */
public class ControleConsulta {
    private PessoaDAO pessoaDAO = new PessoaDAO();
    private ConsultaDAO consultaDAO = new ConsultaDAO();
    
    public void criarConsulta(Consulta consulta, int codMedico, int codPaciente, String strDataConsulta, String strHoraConsulta) throws IOException{
        Paciente paciente = null;
        Medico medico = null;
        
        int diaConsulta, mesConsulta, anoConsulta, horaConsulta, minutoConsulta, segundoConsulta;
        
        String[] bufferData = new String[3];
        String[] bufferHora = new String[2];
        
        Calendar dataHoraConsulta = Calendar.getInstance();
        
        paciente = pessoaDAO.getPacientePorCodigo(codPaciente);
        medico = pessoaDAO.getMedicoPorCodigo(codMedico);
        
        consulta.setPaciente(paciente);
        consulta.setMedico(medico);
        
        bufferData = strDataConsulta.split("/");
        bufferHora = strHoraConsulta.split(":");
        
        diaConsulta = Integer.parseInt(bufferData[0]);
        mesConsulta = (Integer.parseInt(bufferData[1]) - 1);
        anoConsulta = Integer.parseInt(bufferData[2]);
        
        horaConsulta = Integer.parseInt(bufferHora[0]);
        minutoConsulta = Integer.parseInt(bufferHora[1]);
        segundoConsulta = 0;
        
        dataHoraConsulta.set(anoConsulta, mesConsulta, diaConsulta, horaConsulta, minutoConsulta, segundoConsulta);
        
        consulta.setDataHora(dataHoraConsulta);
        paciente.getConsultas().add(consulta);
        
        consultaDAO.adicionarConsulta(consulta);
        
        pessoaDAO.atualizarPaciente(paciente);
    }
}
