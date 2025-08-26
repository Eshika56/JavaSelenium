package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class PreparedStatementEg {


	


	public static void main(String[] args) throws SQLException {
		// fetch the db url, password and username of the my sql db
		String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
		String username = "root";
		String password = "12512588";
		// load the my sql driver file
		// The line Class.forName("com.mysql.cj.jdbc.Driver"); in Java is used to explicitly load and register the MySql JDBC driver with
		
		// create a connection to the data base - connecting the database to java application
		// in Jdbc, a connection represemts an active session between a JAVA application and a specific database
		Connection con = DriverManager.getConnection(dbURL, username, password);
		// create the statement object
		// In JDBC, a statement object is an interface used to execute SQL statements agaisnt a relational database
		Statement st = con.createStatement();
		// execute the select with one parameter
		String query = "select * from persons WHERE FirstName = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, "Eshika");
		
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
		
			System.out.println(rs.getString("FirstName"));
			
		}
		// execute the select with two parameters
		// hard coded query
		String query1 = "select * from persons WHERE FirstName = 'Eshika' AND PersonId = '1234'";
		String query2 = "select * from persons WHERE FirstName = ? AND PersonId = ?";
		PreparedStatement ps1 = con.prepareStatement(query2);
		// set the parameters
		ps1.setString(1, "Eshika");
		ps1.setInt(2, 1234);
		
		ResultSet rs1 = ps1.executeQuery();
		while (rs1.next()) {
			System.out.println(rs1.getString("Address"));
			System.out.println(rs1.getString("LastName"));
			System.out.println(rs1.getString("City"));
		}
		
		
		String query3 = "INSERT INTO persons  VALUES (?,?,?)";
		
		PreparedStatement ps2 = con.prepareStatement(query3);
		// set the parameters
		ps2.setInt(1, 1);
		ps1.setInt(2, 1234);
		
		ResultSet rs2 = ps1.executeQuery();
		while (rs1.next()) {
			System.out.println(rs1.getString("Address"));
			System.out.println(rs1.getString("LastName"));
			System.out.println(rs1.getString("City"));
		
		rs.close();
		st.close();
		con.close();
		
		
	}
	}}



