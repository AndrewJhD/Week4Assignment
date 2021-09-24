package model;

public class TimeConverter {
	private int seconds;
	private int minutes;
	private int hours;
	
	public TimeConverter() {
		super();
	}
	public TimeConverter(int hours) {
		super();
		this.hours = hours;
		setConversion(hours);
		
	}
	
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public void setConversion(int hours) {
		final int SECONDS = 60;
		final int MINUTES = 60;
		int hourResult;
		
		hourResult = hours * MINUTES;
		setMinutes(hourResult);
		
		hourResult = hourResult * SECONDS;
		setSeconds(hourResult);
		
	}
	
	@Override
	public String toString() {
		return " Time Converter [hours=" + hours + "minutes =" + minutes +  "seconds=" + seconds + "]";
		
	}
}

