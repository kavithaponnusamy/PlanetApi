package co.grandcircus.PlanetApi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Planet {
	
	private String name;
	private List<String> colors;
	@JsonProperty("million-miles-from-sun")
	private MilesFromSun milesFromSun;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getColors() {
		return colors;
	}
	public void setColors(List<String> colors) {
		this.colors = colors;
	}
	
	
	public MilesFromSun getMilesFromSun() {
		return milesFromSun;
	}
	public void setMilesFromSun(MilesFromSun milesFromSun) {
		this.milesFromSun = milesFromSun;
	}
	@Override
	public String toString() {
		return "Planet [name=" + name + ", colors=" + colors + ", milesFromSun=" + milesFromSun + "]";
	}
	
	

}
