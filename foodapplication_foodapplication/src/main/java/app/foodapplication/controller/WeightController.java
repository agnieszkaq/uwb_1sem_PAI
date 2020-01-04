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

import app.foodapplication.model.Weight;
import app.foodapplication.service.WeightService;

@RestController
@RequestMapping("/api")
public class WeightController {

	@Autowired
	private WeightService weightService;

	@GetMapping("/weight")
	public List<Weight> get() {
		return weightService.get();
	}

	@GetMapping("/weight/{id}")
	public Weight get(@PathVariable int id) {
		Weight weightObj = weightService.get(id);
		if (weightObj == null) {
			throw new RuntimeException("The weight with id:" + id + " doesn't exist!");
		}
		return weightObj;
	}

	@PostMapping("/weight")
	public Weight save(@RequestBody Weight weightObj) {
		weightService.save(weightObj);
		return weightObj;
	}
	
	@DeleteMapping("/weight/{id}")
	public String delete(@PathVariable int id) {
		weightService.delete(id);
		return "The weight has been deleted with id:" + id;
	}
}
