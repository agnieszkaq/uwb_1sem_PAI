package app.foodapplication.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.foodapplication.dao.Forum_noteDAO;
import app.foodapplication.model.Forum_note;

@Service
public class Forum_noteServiceImpl implements Forum_noteService {

	@Autowired
	Forum_noteDAO forum_noteDAO;

	@Transactional
	@Override
	public List<Forum_note> get() {
		return forum_noteDAO.get();
	}

	@Transactional
	@Override
	public Forum_note get(int id) {
		return forum_noteDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Forum_note forum_note) {
		forum_noteDAO.save(forum_note);
	}

	@Transactional
	@Override
	public void delete(int id) {
		forum_noteDAO.delete(id);

	}

}
