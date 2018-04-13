package MyFirstServlet;

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class MyFirstServlet
 */
//@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection _conn;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyFirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String userName = (String)request.getParameter("inputUsername");
		String password = (String)request.getParameter("inputPassword");
		
		String query = "select * from users where userid = '" + userName + "' and password = '" +password + "';";
		
		try {
			_conn = Conn.openDBConnection();
			Statement st = _conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			if(rs != null){
				request.getSession().setAttribute("resultData", userName);
				response.sendRedirect("search.jsp");
			}
		/*	if (rs.next()) {
			      String users = rs.getString("users");
			 }*/
			rs.close();
			st.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			PrintWriter out = response.getWriter();

		    out.println(e.toString());
		    out.close();
		}
		finally {
			try {
				_conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/*String result = "Credentials are "+ userName +" & "+password;
		
		*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
