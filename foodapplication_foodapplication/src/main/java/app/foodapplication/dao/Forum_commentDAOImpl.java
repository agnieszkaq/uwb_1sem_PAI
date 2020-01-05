package app.foodapplication.dao;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import app.foodapplication.model.Forum_comment;

@Repository
public class Forum_commentDAOImpl implements Forum_commentDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Forum_comment> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Forum_comment> query = currentSession.createQuery("from Forum_comment", Forum_comment.class);
		List<Forum_comment> list = query.getResultList();
		return list;
	}

	@Override
	public Forum_comment get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Forum_comment forum_commentObj = currentSession.get(Forum_comment.class, id);
		return forum_commentObj;
	}


	@Override
	public void save(Forum_comment forum_comment) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(forum_comment);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Forum_comment forum_commentObj = currentSession.get(Forum_comment.class, id);
		currentSession.delete(forum_commentObj);
	}

}
