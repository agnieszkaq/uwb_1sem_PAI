package app.foodapplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.foodapplication.model.Forum_comment;
import app.foodapplication.service.Forum_commentService;

@RestController
@RequestMapping("/api")
public class Forum_commentController {

	@Autowired
	private Forum_commentService forum_commentService;

	@GetMapping("/forum_comment")
	public List<Forum_comment> get() {
		return forum_commentService.get();
	}

	@GetMapping("/forum_comment/{id}")
	public Forum_comment get(@PathVariable int id) {
		Forum_comment forum_commentObj = forum_commentService.get(id);
		if (forum_commentObj == null) {
			throw new RuntimeException("The forum_comment with id:" + id + " doesn't exist!");
		}
		return forum_commentObj;
	}

	@PostMapping("/forum_comment")
	public Forum_comment save(@RequestBody Forum_comment forum_commentObj) {
		forum_commentService.save(forum_commentObj);
		return forum_commentObj;
	}

	@DeleteMapping("/forum_comment/{id}")
	public String delete(@PathVariable int id) {
		forum_commentService.delete(id);
		return "The forum_comment has been deleted with id:" + id;
	}
}
