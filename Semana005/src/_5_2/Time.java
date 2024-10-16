package _5_2;

public class Time {
	
	private int minutes;
	private int seconds;
	
	// 5_2_1
	public Time(int mm, int ss) {
		this.minutes = mm;
		this.seconds = ss;
	}
	
	// 5_2_1
	public Time(String timeText) {
		
		String[] partes = timeText.split(":");
		int m = Integer.parseInt(partes[0]);
        int s = Integer.parseInt(partes[1]);
		
        this.minutes = m;
        this.seconds = s;
		
	}
	
	// 5_2_2
	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	public int getTotalSeconds(){
		return (getMinutes() * 60) + getSeconds();
	}
	
	// 5_2_3
	public Time add(Time t) {
		int newTime = this.getTotalSeconds() + t.getTotalSeconds();
		int newMin = newTime / 60;
		int newSec = newTime % 60;
		Time finalTime = new Time(newMin, newSec);
		
		return finalTime;
	}
	
	// 5_2_4
	public Time sub(Time t) {
		int newTime = this.getTotalSeconds() - t.getTotalSeconds();
		int newMin = newTime / 60;
		int newSec = newTime % 60;
		Time finalTime = new Time(newMin, newSec);
		
		return finalTime;
	}
	
	// 5_2_5
	public boolean isLessThan(Time t) {
		return this.getTotalSeconds() < t.getTotalSeconds();
	}
	
	// 5_2_6
	public boolean isGreaterThan(Time t) {
		return this.getTotalSeconds() > t.getTotalSeconds();
	}
	
	@Override
	public String toString() {
		return "Time : " + getMinutes() + ":" + getSeconds();
	}
}