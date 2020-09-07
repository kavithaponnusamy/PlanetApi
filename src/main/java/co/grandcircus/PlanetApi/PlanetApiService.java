package co.grandcircus.PlanetApi;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class PlanetApiService {
	
	RestTemplate rt= new RestTemplate();
	
	public List<Planet> getAllPlanet(){
		String url="https://grandcircusco.github.io/demo-apis/planets.json";
		return Arrays.asList(rt.getForObject(url, Planet[].class));
	}
	

}
