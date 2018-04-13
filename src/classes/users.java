package classes;

public class users {
 private String user_id;
 private String user_name;
 private String user_email;
 private String user_pass;
	public users(String id, String name, String email, String pass) {
		// TODO Auto-generated constructor stub
		user_id=id;
		user_name=name;
		user_email=email;
		user_pass=pass;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_pass() {
		return user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	
	

}
