package pojo;

public class Day {

	private double maxtemp_c;
	private double maxtemp_f;
	private double mintemp_c;
	private double mintemp_f;
	private double avgtemp_c;
	private double avgtemp_f;
	private int maxwind_mph;
	private double maxwind_kph;
	private int totalprecip_mm;
	private int totalprecip_in;
	private int avgvis_km;
	private int avgvis_miles;
	private int avghumidity;
	private int daily_will_it_rain;
	private int daily_chance_of_rain;
	private int daily_will_it_snow;
	private int daily_chance_of_snow;
	private Condition condition;
	private int uv;
	
	
	
	
	public double getMaxtemp_c() {
		return maxtemp_c;
	}
	public void setMaxtemp_c(double maxtemp_c) {
		this.maxtemp_c = maxtemp_c;
	}
	public double getMaxtemp_f() {
		return maxtemp_f;
	}
	public void setMaxtemp_f(double maxtemp_f) {
		this.maxtemp_f = maxtemp_f;
	}
	public double getMintemp_f() {
		return mintemp_f;
	}
	public void setMintemp_f(double mintemp_f) {
		this.mintemp_f = mintemp_f;
	}
	public double getAvgtemp_c() {
		return avgtemp_c;
	}
	public void setAvgtemp_c(double avgtemp_c) {
		this.avgtemp_c = avgtemp_c;
	}
	public int getMaxwind_mph() {
		return maxwind_mph;
	}
	public void setMaxwind_mph(int maxwind_mph) {
		this.maxwind_mph = maxwind_mph;
	}
	public double getMaxwind_kph() {
		return maxwind_kph;
	}
	public void setMaxwind_kph(double maxwind_kph) {
		this.maxwind_kph = maxwind_kph;
	}
	public double getMintemp_c() {
		return mintemp_c;
	}
	public void setMintemp_c(double mintemp_c) {
		this.mintemp_c = mintemp_c;
	}
	public double getAvgtemp_f() {
		return avgtemp_f;
	}
	public void setAvgtemp_f(double avgtemp_f) {
		this.avgtemp_f = avgtemp_f;
	}
	public int getTotalprecip_mm() {
		return totalprecip_mm;
	}
	public void setTotalprecip_mm(int totalprecip_mm) {
		this.totalprecip_mm = totalprecip_mm;
	}
	public int getAvghumidity() {
		return avghumidity;
	}
	public void setAvghumidity(int avghumidity) {
		this.avghumidity = avghumidity;
	}
	public int getAvgvis_miles() {
		return avgvis_miles;
	}
	public void setAvgvis_miles(int avgvis_miles) {
		this.avgvis_miles = avgvis_miles;
	}
	public int getAvgvis_km() {
		return avgvis_km;
	}
	public void setAvgvis_km(int avgvis_km) {
		this.avgvis_km = avgvis_km;
	}
	public int getTotalprecip_in() {
		return totalprecip_in;
	}
	public void setTotalprecip_in(int totalprecip_in) {
		this.totalprecip_in = totalprecip_in;
	}
	public int getDaily_will_it_snow() {
		return daily_will_it_snow;
	}
	public void setDaily_will_it_snow(int daily_will_it_snow) {
		this.daily_will_it_snow = daily_will_it_snow;
	}
	public int getDaily_chance_of_rain() {
		return daily_chance_of_rain;
	}
	public void setDaily_chance_of_rain(int daily_chance_of_rain) {
		this.daily_chance_of_rain = daily_chance_of_rain;
	}
	public int getDaily_chance_of_snow() {
		return daily_chance_of_snow;
	}
	public void setDaily_chance_of_snow(int daily_chance_of_snow) {
		this.daily_chance_of_snow = daily_chance_of_snow;
	}
	public int getDaily_will_it_rain() {
		return daily_will_it_rain;
	}
	public void setDaily_will_it_rain(int daily_will_it_rain) {
		this.daily_will_it_rain = daily_will_it_rain;
	}
	public Condition getCondition() {
		return condition;
	}
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	public int getUv() {
		return uv;
	}
	public void setUv(int uv) {
		this.uv = uv;
	}
}
