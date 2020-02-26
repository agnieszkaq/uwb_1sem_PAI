
package app.foodapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
  @RequestMapping(value = "/calculator/bmi")
  public ModelAndView bmiPage() {
    return new ModelAndView("bmi");
  }
  
  @RequestMapping(value = "/calculator/ppm")
  public ModelAndView ppmPage() {
    return new ModelAndView("ppm");
  }
}