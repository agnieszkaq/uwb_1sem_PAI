package app.foodapplication.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.foodapplication.dao.Forum_commentDAO;
import app.foodapplication.model.Forum_comment;

@Service
public class Forum_commentServiceImpl implements Forum_commentService {

	@Autowired
	Forum_commentDAO forum_commentDAO;

	@Transactional
	@Override
	public List<Forum_comment> get() {
		return forum_commentDAO.get();
	}

	@Transactional
	@Override
	public Forum_comment get(int id) {
		return forum_commentDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Forum_comment forum_comment) {
		forum_commentDAO.save(forum_comment);
	}

	@Transactional
	@Override
	public void delete(int id) {
		forum_commentDAO.delete(id);
	}

}
