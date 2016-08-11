package controle;

import modelos.PessoaDAO;
import java.io.IOException;
import java.util.List;
import modelos.Medico;
import modelos.Paciente;

/**
 *
 * @author igor_
 */
public class ControlePessoa {
    private PessoaDAO pessoaDAO = new PessoaDAO();
    private Paciente paciente = null;
    List pessoas;
    
    public void adicionarPaciente(Paciente paciente) throws IOException{
        pessoaDAO.adicionarPaciente(paciente);
    }
    public void adicionarMedico(Medico medico) throws IOException{
        pessoaDAO.adicionarMedico(medico);
    }
    public Paciente buscarPacientePorCodigo(int codigo){
        paciente = pessoaDAO.getPacientePorCodigo(codigo);
        return paciente;
    }
    public List buscarPacientesPorNome(String nome){
        pessoas = pessoaDAO.getPessoasPorNome(nome);
        return pessoas;
    }
}
