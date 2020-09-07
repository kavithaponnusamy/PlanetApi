package co.grandcircus.PlanetApi;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlanetController {
	
	@Autowired
	private PlanetApiService pas;
	
	@RequestMapping("/")
	public String showhome(Model model) {
		List<Planet> planets=pas.getAllPlanet();
		model.addAttribute("planets",planets);
		System.out.println(planets);
		return "homepage";		
	}
	
}
