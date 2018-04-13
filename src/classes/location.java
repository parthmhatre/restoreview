package classes;

public class location {
	private int pin;
	private String area; 
	public location(int id, String areas) {
		// TODO Auto-generated constructor stub
		pin=id;
		area=areas;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
}
