package CreateUser;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import classes.Conn;
import classes.users;

/**
 * Servlet implementation class CreateUser
 */
//@WebServlet("/CreateUser")
public class CreateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection _conn;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = (String)request.getParameter("inputName");
		String username = (String)request.getParameter("inputUsername");
		String email = (String)request.getParameter("inputEmail");
		String password = (String)request.getParameter("inputPassword");
		
		String query = "insert into users (name,userid,email,password) values ('"  + 
						name + "', '" + username + "', '" + email + "', '" + password + "');";
		 
		//request.getSession().setAttribute("resultData", query);
		//response.sendRedirect("credentials.jsp");
		try {
			_conn = Conn.openDBConnection();
			Conn.executeUpdate(_conn, query);
			/*Statement st = _conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			    
			if (rs.next()) {
			      String users = rs.getString("users");
			 }
			rs.close();
			st.close();*/
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				_conn.close();
				response.sendRedirect("index.html");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public static Connection getDBConnection(){
		 return _conn;
	}
}
