package modelos;

import java.io.IOException;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author igor_
 */
public class PessoaDAO {
    private Session session;
    private Transaction trans;
    private List<Pessoa> pacientes;
    
    private void preparaSessao(){
        try{
            session = HibernateUtil.getSessionFactory().getCurrentSession();
        }catch(HibernateException e){
            session = HibernateUtil.getSessionFactory().openSession(); 
        }
        trans = session.beginTransaction();
    }
    
    public void adicionarPaciente(Paciente paciente) throws IOException{
        this.preparaSessao();
        session.persist(paciente);
        trans.commit();
        session.close();
    }
    public void adicionarMedico(Medico medico) throws IOException{
        this.preparaSessao();
        session.persist(medico);
        trans.commit();
        session.close();
    }
    public void atualizarPaciente(Paciente paciente){
        this.preparaSessao();
        session.merge(paciente);
        trans.commit();
        session.close();
    }
    public Paciente getPacientePorCodigo(int codigoPaciente){
        Paciente paciente = null;
        
        this.preparaSessao();
        Criteria criteria = session.createCriteria(Paciente.class);
        criteria.add(Restrictions.eq("codigo", codigoPaciente));
        criteria.setMaxResults(1);
        paciente = (Paciente) criteria.uniqueResult();
       
        trans.commit();
        session.close();
        return paciente;
    }
    public Medico getMedicoPorCodigo(int codigoMedico){
        Medico medico = null;
        
        this.preparaSessao();
        Criteria criteria = session.createCriteria(Pessoa.class);
        criteria.add(Restrictions.eq("codigo", codigoMedico));
        criteria.setMaxResults(1);
        medico = (Medico) criteria.uniqueResult();
        
        trans.commit();
        session.close();
        return medico;
    }
    
    public List<Pessoa> getPacientesPorNome(String nome){
        this.preparaSessao();
        Criteria criteria = session.createCriteria(Paciente.class);
        criteria.add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE));
        pacientes = criteria.list();
        
        trans.commit();
        session.close();
        return pacientes;
    }
    
    public List<Pessoa> getPacientes(){
        this.preparaSessao();
        Criteria criteria = session.createCriteria(Paciente.class);
        pacientes = criteria.list();
        
        trans.commit();
        session.close();
        return pacientes;
    }
}
