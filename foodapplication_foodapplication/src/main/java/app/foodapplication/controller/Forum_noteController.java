package app.foodapplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.foodapplication.model.Forum_note;
import app.foodapplication.service.Forum_noteService;

@RestController
@RequestMapping("/api")
public class Forum_noteController {
	@Autowired
	private Forum_noteService forum_noteService;

	@GetMapping("/forum_note")
	public List<Forum_note> get() {
		return forum_noteService.get();
	}
}