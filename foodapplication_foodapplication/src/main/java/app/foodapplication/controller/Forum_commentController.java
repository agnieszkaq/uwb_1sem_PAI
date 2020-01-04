package app.foodapplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
