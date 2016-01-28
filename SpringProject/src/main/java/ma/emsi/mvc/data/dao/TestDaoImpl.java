package ma.emsi.mvc.data.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ma.emsi.mvc.data.entities.Utilisateur;

@Repository("testDao")
public class TestDaoImpl implements TestDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveProduit(Utilisateur user) {
		// TODO Auto-generated method stub

		sessionFactory.getCurrentSession().save(user);
	}

}
