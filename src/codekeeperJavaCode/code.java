package codekeeperJavaCode;
import javax.persistence.*; 

@Entity
public class code {
    @Id
    @GeneratedValue
    private Long id;
   
    private String name;
    private String language;
    private String text;
    private String [] tags;
   
    String getName()
    {
    	return this.name;
    }
    String getText()
    {
    	return this.text;
    }

}



   
    