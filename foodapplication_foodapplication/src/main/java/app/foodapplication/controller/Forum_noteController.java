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

	@GetMapping("/forum_note/{id}")
	public Forum_note get(@PathVariable int id) {
		Forum_note forum_noteObj = forum_noteService.get(id);
		if (forum_noteObj == null) {
			throw new RuntimeException("The forum_note with id:" + id + " doesn't exist!");
		}
		return forum_noteObj;
	}

	@PostMapping("/forum_noted")
	public Forum_note save(@RequestBody Forum_note forum_noteObj) {
		forum_noteService.save(forum_noteObj);
		return forum_noteObj;
	}

	@DeleteMapping("/forum_note/{id}")
	public String delete(@PathVariable int id) {
		forum_noteService.delete(id);
		return "The forum_note has been deleted with id:" + id;
	}
}