package codekeeperJavaCode;

import java.util.List;


import br.com.caelum.vraptor.ioc.Component;
import org.hibernate.Session;
import org.hibernate.Query;

@Component
public class codekeeperDao {
	private Session session;
	public codekeeperDao(Session session) {
        this.session = session;
        //this.session=HibernateControl.getSession();
    }
	public List<code> find(String codePiece) {
		@SuppressWarnings("unchecked")
		List<code> allCode=session.createCriteria(code.class).list();
		for (code code:allCode)
		{
			if(!code.getText().contains(codePiece))
				allCode.remove(code);
		}
		return allCode;
	}
	public void add(code code) {
		session.save(code);
	}
	@SuppressWarnings("unchecked")
	public List<code> listAll() {
		return session.createCriteria(code.class).list();
	}


}
