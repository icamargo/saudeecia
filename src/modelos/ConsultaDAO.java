package modelos;
//@author igor_

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ConsultaDAO {
    private Session session;
    private Transaction trans;
    
    private void preparaSessao(){
        try{
            session = HibernateUtil.getSessionFactory().getCurrentSession();
        }catch(HibernateException e){
            session = HibernateUtil.getSessionFactory().openSession(); 
        }
        trans = session.beginTransaction();
    }
    
    public void adicionarConsulta(Consulta consulta){
        this.preparaSessao();
        session.save(consulta);
        trans.commit();
        session.close();
    }
}
