package pojo;

import java.util.List;

public class ForecastDay {
	
	private String date;
	private int date_epoch;
	private Astro astro;
	private Day day;
	private List<Hour> hour;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getDate_epoch() {
		return date_epoch;
	}
	public void setDate_epoch(int date_epoch) {
		this.date_epoch = date_epoch;
	}
	public Astro getAstro() {
		return astro;
	}
	public void setAstro(Astro astro) {
		this.astro = astro;
	}
	public Day getDay() {
		return day;
	}
	public void setDay(Day day) {
		this.day = day;
	}
	public List<Hour> getHour() {
		return hour;
	}
	public void setHour(List<Hour> hour) {
		this.hour = hour;
	}
	
	

}
