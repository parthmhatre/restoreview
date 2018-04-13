package Search;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import classes.Conn;
import classes.restaurant;
import CreateUser.CreateUser;

/**
 * Servlet implementation class Search
 */
//@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection _conn;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*request.getSession().getAttribute("resultData", userName);
		request.getSession().setAttribute("resultData", userName);*/
		String name = (String)request.getParameter("inputField");
		String param = (String)request.getParameter("searchparameter");
		String query = "";
		Set<String>rating = new HashSet<>();
		ArrayList<restaurant> lists = new ArrayList<restaurant>();
		if(param.equals("c"))
		{
			query = "select r.*, ifnull(avg(ra.rate), 0.0) average from restaurant r left join cuisine c on (r.cuisine_type1 = c.cuisine_id) left join rating ra on r.rest_id = ra.rest_id where c.type LIKE'%" + name + "%' group by r.name order by average DESC; ";
			
		}
		if(param.equals("locality"))
		{
			query = "select r.*,  ifnull(avg(ra.rate), 0.0) average from restaurant r left join location l on l.pincode=r.pincode left join rating ra on r.rest_id = ra.rest_id where l.area LIKE '%"+name+"%' group by r.name order by average DESC;";
		}
		if(param.equals("dishes"))
		{
			query = "select r.*,  ifnull(avg(ra.rate), 0.0) average from restaurant r left join Dishes d on d.rest_id=r.rest_id left join rating ra on r.rest_id = ra.rest_id where  d.name LIKE '%"+name+"%' group by r.name order by average DESC;";
		}
		if(param.equals("restaurant"))
		{
			query = "select r.*,  ifnull(avg(ra.rate), 0.0) average from restaurant r left join rating ra on r.rest_id = ra.rest_id where r.name LIKE'%"+name+"%' group by r.name order by average DESC;";
		}
		
		
		Statement st = null;
        ResultSet rs = null;
        
        try {
        	_conn = Conn.openDBConnection();
        	st = _conn.createStatement();
            rs = st.executeQuery(query);
			while(rs.next()){
				  int rid = rs.getInt("rest_id");
		          String name1 = rs.getString("name");
		          String address = rs.getString("address");
		          String contact = rs.getString("contact");
		          int oid = rs.getInt("own_id");
		          int pin = rs.getInt("pincode");
		          int c1 = rs.getInt("cuisine_type1");
		          String ratings =rs.getString("average");
		        		  
		          restaurant resto = new restaurant(name1, rid, address, contact, pin, oid,c1);
		           
		          lists.add(resto);
		          rating.add(ratings);
		          
				
			}
			rs.close();
            st.close();
            
            _conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        request.getSession().setAttribute("lists", lists);
        request.getSession().setAttribute("rating", rating);
        response.sendRedirect("searchResults.jsp");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
