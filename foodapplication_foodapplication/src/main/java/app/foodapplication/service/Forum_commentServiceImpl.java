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
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public void save(Forum_comment forum_comment) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
