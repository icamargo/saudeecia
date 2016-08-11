package controle;

import modelos.PessoaDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modelos.Medico;
import modelos.Paciente;

/**
 *
 * @author igor_
 */
public class ControlePessoa {
    private PessoaDAO pessoaDAO = new PessoaDAO();
    List pacientes;
    
    public void adicionarPaciente(Paciente paciente) throws IOException{
        pessoaDAO.adicionarPaciente(paciente);
    }
    public void adicionarMedico(Medico medico) throws IOException{
        pessoaDAO.adicionarMedico(medico);
    }
    public List buscarPacientePorCodigo(int codigo){
        pacientes = new ArrayList();
        pacientes.add(pessoaDAO.getPacientePorCodigo(codigo)); 
        return pacientes;
    }
    public List buscarPacientesPorNome(String nome){
        pacientes = pessoaDAO.getPacientesPorNome(nome);
        return pacientes;
    }
    public List buscarPacientes(){
        pacientes = pessoaDAO.getPacientes();
        return pacientes;
    }
        
}
