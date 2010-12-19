package codekeeperJavaCode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;


@ApplicationScoped
@Component
public class HibernateControl  {

  private static SessionFactory factory;
  @SuppressWarnings("static-access")
  public  HibernateControl() {
      this.factory = new AnnotationConfiguration().configure().buildSessionFactory();
  }
 
  public static Session getSession() {
      return factory.openSession();
  }
 
}