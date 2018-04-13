package classes;

public class cuisine {
private int cuisine_id;
private String type;
	public cuisine(int id, String c_type) {
		// TODO Auto-generated constructor stub
		cuisine_id=id;
		type=c_type;
	}
	public int getCuisine_id() {
		return cuisine_id;
	}
	public void setCuisine_id(int cuisine_id) {
		this.cuisine_id = cuisine_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
