package app.foodapplication.dao;

import java.util.List;
import app.foodapplication.model.Forum_note;

public interface Forum_noteDAO {

	List<Forum_note> get();

	Forum_note get(int id);

	void save(Forum_note forum_note);

	void delete(int id);
}
