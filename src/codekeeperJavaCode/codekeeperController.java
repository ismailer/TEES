package codekeeperJavaCode;
import java.util.List;

import br.com.caelum.vraptor.*;

@Resource
public class codekeeperController {
	private codekeeperDao dao;
	//private Result result;

	public codekeeperController(codekeeperDao dao/*, Result result*/) {
        this.dao = dao;
       // this.result = result;
    	}
	public void addCode(code code) {
	    dao.add(code);
		//result.redirectTo(codekeeperController.class).list();
		}
	@Path("/")
	public List<code> list() {
        return dao.listAll();
    	}
	public List<code> searchCode(String codePiece)
	{
		return dao.find(codePiece);
	}
}
