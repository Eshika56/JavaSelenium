package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	// fetch the db url, password and username of the my sql db
	String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
	String username = "root";
	String password = "12512588";
	// load the my sql driver file
	// The line Class.forName("com.mysql.cj.jdbc.Driver"); in Java is used to explicitly load and register the MySql JDBC driver with
	
	// create a connection to the data base - connecting the database to java application
	// in Jdbc, a connection represemts an active session between a JAVA application and a specific database
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection con = DriverManager.getConnection(dbURL, username, password);
	// create the statement object
	// In JDBC, a statement object is an interface used to execute SQL statements agaisnt a relational database
	Statement st = con.createStatement();
	// execute the queries
	String selectQuery = "select * from Student;";
	// pass the selectquery to result set
	ResultSet rs = st.executeQuery(selectQuery);
	// result set in JDBC is an object that represents the result of a database query
	while (rs.next()) {
		System.out.println(rs.getString("Id"));
		System.out.println(rs.getString("Name"));
		System.out.println(rs.getString("Class"));
		System.out.println(rs.getString("Mark"));
		System.out.println(rs.getString("Gender"));
	}
	
	rs.close();
	st.close();
	con.close();
	
	
}
}

