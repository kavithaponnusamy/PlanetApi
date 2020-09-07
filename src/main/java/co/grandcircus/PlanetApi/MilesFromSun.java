package co.grandcircus.PlanetApi;

public class MilesFromSun {
	private Integer min;
	private Integer average;
	private Integer max;
	public Integer getMin() {
		return min;
	}
	public void setMin(Integer min) {
		this.min = min;
	}
	public Integer getAverage() {
		return average;
	}
	public void setAverage(Integer average) {
		this.average = average;
	}
	public Integer getMax() {
		return max;
	}
	public void setMax(Integer max) {
		this.max = max;
	}
	@Override
	public String toString() {
		return "MilesFromSun [min=" + min + ", average=" + average + ", max=" + max + "]";
	}
	

}
