package app.foodapplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public List<Weight> get(){
		return weightService.get();
	}
}
 