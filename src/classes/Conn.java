package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {
	public static Connection openDBConnection() throws SQLException, ClassNotFoundException {
		    
		    String driver = "org.postgresql.Driver";
		    Class.forName(driver);
		    /*
		    String url = "jdbc:postgresql://" + host + "/" + dbSID;
		    String username = "root";
		    String password = "root";*/

		    return DriverManager.getConnection("jdbc:postgresql://twilbury.cs.drexel.edu/kvs44_cs500","kvs44","ysnjynwl");
		  }
	 public static void closeDBConnection(Connection conn) throws SQLException {
		    conn.close();
	  }
	 public static void executeUpdate(Connection conn, String query)
		      throws SQLException {

		    Statement st = conn.createStatement();
		    st.executeUpdate(query);
		    st.close();
		  }
	 
	 public static int getIntFromDB(Connection conn, String query)
		      throws SQLException {

		    Statement st = conn.createStatement();
		    ResultSet rs = st.executeQuery(query);
		    int ret = Integer.MIN_VALUE;
		    if (rs.next()) {
		      ret = rs.getInt(1);
		    }
		    rs.close();
		    st.close();
		    return ret;
		  }
	
}
