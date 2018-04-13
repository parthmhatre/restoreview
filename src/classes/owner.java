package classes;

public class owner {
	private int own_id;
	private String name;
	private int year;
	public owner(int id, String o_name, int o_year) {
		// TODO Auto-generated constructor stub
		own_id=id;
		name=o_name;
		year=o_year;
		
	}
	public int getOwn_id() {
		return own_id;
	}
	public void setOwn_id(int own_id) {
		this.own_id = own_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
