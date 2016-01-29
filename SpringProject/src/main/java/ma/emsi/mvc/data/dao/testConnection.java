package ma.emsi.mvc.data.dao;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.emsi.mvc.data.entities.Utilisateur;
import ma.emsi.mvc.data.services.TestService;




public class testConnection {

//	@Autowired
//	private TestService testService;

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestService ts = (TestService) context.getBean("testService");	
		
		
		Utilisateur user = new Utilisateur();
		user.setEmail("email");
		user.setNom("nom");
		user.setPrénom("prenom");
		
		ts.saveProduit(user);
	}

}
