package modelos;

import modelos.Alergia;
import modelos.Cirurgia;
import modelos.Consulta;
import modelos.DadosAdPaciente;
import modelos.Medico;
import modelos.Paciente;
import modelos.Prontuario;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author igor_
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            // loads configuration and mappings
            Configuration configuration = new Configuration().configure();
            
            configuration.addAnnotatedClass(Paciente.class);
            configuration.addAnnotatedClass(Prontuario.class);
            configuration.addAnnotatedClass(DadosAdPaciente.class);
            configuration.addAnnotatedClass(Cirurgia.class);
            configuration.addAnnotatedClass(Alergia.class);
            configuration.addAnnotatedClass(Consulta.class);
            configuration.addAnnotatedClass(Medico.class);
            
            ServiceRegistry serviceRegistry
                = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);           
        }
        return sessionFactory;
    }
}
