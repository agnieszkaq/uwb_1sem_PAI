package app.foodapplication.service;

import java.util.List;

import app.foodapplication.model.Forum_comment;

public interface Forum_commentService {

	List<Forum_comment> get();

	Forum_comment get(int id);

	void save(Forum_comment forum_comment);

	void delete(int id);

}
