package it.indoor.navigation.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author pasqualecozzupoli
 *
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@Controller
@RequestMapping("/indoor")
public class NavigationController {
	
	@GetMapping()
	public String home() {
		return "forward:/index.html";
	}

}
