package classes;

public class restaurant {
	  private String r_name;
	  private String r_address;
	  private String r_contact;
	  private int r_id;
	  private int r_pin;
	  private int r_own;
	  private int r_cuisine1;
	  private int r_cuisine2;
	  private int r_cuisine3;
	  

	
public restaurant(String name,int id, String address, String contact, int pin, int own, int c1) {
		// TODO Auto-generated constructor stub 
		r_name=name;
		r_id=id;
		r_address=address;
		r_contact=contact;
		r_pin=pin;
		r_own=own;
		r_cuisine1=c1;
		
		
		
	}
	public restaurant() {
		// TODO Auto-generated constructor stub 
		
		
		
	}

	public String getR_contact() {
		return r_contact;
	}


	public void setR_contact(String r_contact) {
		this.r_contact = r_contact;
	}


	public String getR_name() {
		return r_name;
	}


	public void setR_name(String r_name) {
		this.r_name = r_name;
	}


	public String getR_address() {
		return r_address;
	}


	public void setR_address(String r_address) {
		this.r_address = r_address;
	}


	public int getR_id() {
		return r_id;
	}


	public void setR_id(int r_id) {
		this.r_id = r_id;
	}


	public int getR_pin() {
		return r_pin;
	}


	public void setR_pin(int r_pin) {
		this.r_pin = r_pin;
	}


	public int getR_own() {
		return r_own;
	}


	public void setR_own(int r_own) {
		this.r_own = r_own;
	}


	public int getR_cuisine1() {
		return r_cuisine1;
	}


	public void setR_cuisine1(int r_cuisine1) {
		this.r_cuisine1 = r_cuisine1;
	}


}
