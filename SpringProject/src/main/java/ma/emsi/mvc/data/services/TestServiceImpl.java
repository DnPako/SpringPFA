package ma.emsi.mvc.data.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.emsi.mvc.data.dao.TestDao;
import ma.emsi.mvc.data.entities.Utilisateur;

@Service("testService")
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestDao dao;

	@Override
	@Transactional
	public void saveProduit(Utilisateur user) {
		dao.saveProduit(user);

	}

}
