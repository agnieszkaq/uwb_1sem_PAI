package app.foodapplication.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import app.foodapplication.model.Forum_note;
import app.foodapplication.model.Forum_note;

@Repository
public class Forum_noteDAOImpl implements Forum_noteDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Forum_note> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Forum_note> query = currentSession.createQuery("from Forum_note", Forum_note.class);
		List<Forum_note> list = query.getResultList();
		return list;
	}

	@Override
	public Forum_note get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Forum_note forum_noteObj = currentSession.get(Forum_note.class, id);
		return forum_noteObj;
	}


	@Override
	public void save(Forum_note forum_note) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(forum_note);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Forum_note forum_noteObj = currentSession.get(Forum_note.class, id);
		currentSession.delete(forum_noteObj);
	}

}
