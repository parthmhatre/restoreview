package classes;

public class ratings {
 private int rest_id;
 private int rate;
 private String user_id;
	public ratings(int r_id, int rates, String u_id) {
		// TODO Auto-generated constructor stub
		rest_id=r_id;
		rate=rates;
		user_id=u_id;
	}
	public int getRest_id() {
		return rest_id;
	}
	public void setRest_id(int rest_id) {
		this.rest_id = rest_id;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	

}
