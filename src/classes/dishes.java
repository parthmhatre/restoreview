package classes;

public class dishes {
	private int price;
	private String dish_name;
	private int rest_id;
	private String dish_desc;
	
	public dishes(int p, String name, int r_id, String desc ) {
		// TODO Auto-generated constructor stub
		price=p;
		dish_name=name;
		rest_id=r_id;
		dish_desc=desc;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDish_name() {
		return dish_name;
	}

	public void setDish_name(String dish_name) {
		this.dish_name = dish_name;
	}

	public int getRest_id() {
		return rest_id;
	}

	public void setRest_id(int rest_id) {
		this.rest_id = rest_id;
	}

	public String getDish_desc() {
		return dish_desc;
	}

	public void setDish_desc(String dish_desc) {
		this.dish_desc = dish_desc;
	}
	
}
