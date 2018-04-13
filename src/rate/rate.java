package rate;
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
 * Servlet implementation class rate
 */
//@WebServlet("/rate")
public class rate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection _conn;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public rate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int user = Integer.parseInt(request.getParameter("user"));
		int resto = Integer.parseInt(request.getParameter("resto"));
		int rates = Integer.parseInt(request.getParameter("rates"));
				String query = "insert into rating(rest_id, user_id, rate) values ('"  + 
				resto + "', '" + user + "', '" + rates + "'');";
		 try {
			_conn = Conn.openDBConnection();
			Conn.executeUpdate(_conn, query);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				_conn.close();
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

}
