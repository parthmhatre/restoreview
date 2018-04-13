package CreateResto;

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

/**
 * Servlet implementation class CreateResto
 */
//@WebServlet("/CreateResto")
public class CreateResto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection _conn;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateResto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubr
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int ownid=0;
		String rname = (String)request.getParameter("inputRestaurantName");
		String raddress = (String)request.getParameter("inputAddress");
		int pin = Integer.parseInt(request.getParameter("inputPincode"));
		//String SelectOwner = (String)request.getParameter("SelectOwner");
		String inputOwner = (String)request.getParameter("inputOwner");
		String inputContactNumber = (String)request.getParameter("inputContactNumber");
	    int cuisine1 = Integer.parseInt(request.getParameter("CuisineType1"));
		
			
			try {
				_conn = Conn.openDBConnection();
				
							
					String query="INSERT  into owner (name) VALUE ('"+inputOwner+"');";
					Conn.executeUpdate(_conn, query);
					//request.getSession().setAttribute("resultData", query);
					//response.sendRedirect("credentials.jsp");
					int own_id = Conn.getIntFromDB(_conn, "select max(own_id) from Owner");
					
					
				String query1 = "INSERT INTO Restaurant (name, address, pincode, own_id, cuisine_type1, contact) "
						+ "VALUES ( '"+ rname +"', '"+ raddress +"', "+ pin +", "+own_id+", "+cuisine1+", '"+inputContactNumber+"' );";
					Conn.executeUpdate(_conn, query1);
				
				
				
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
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//ownid=Integer.parseInt();
		
		 
		 
		    /*request.getSession().setAttribute("resultData", query);
			response.sendRedirect("credentials.jsp");*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
