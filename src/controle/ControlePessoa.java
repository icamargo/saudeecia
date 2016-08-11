package controle;

import modelos.PessoaDAO;
import java.io.IOException;
import modelos.Medico;
import modelos.Paciente;

/**
 *
 * @author igor_
 */
public class ControlePessoa {
    PessoaDAO pessoaDAO = new PessoaDAO();
    
    public void adicionarPaciente(Paciente paciente) throws IOException{
        pessoaDAO.adicionarPaciente(paciente);
    }
    public void adicionarMedico(Medico medico) throws IOException{
        pessoaDAO.adicionarMedico(medico);
    }
}
