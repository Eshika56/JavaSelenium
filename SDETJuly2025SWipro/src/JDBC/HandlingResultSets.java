package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class HandlingResultSets {
    public static void main(String[] args) throws SQLException {
        // Database connection details
        String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb"; // Your DB name
        String username = "root"; // DB username
        String password = "12512588"; // DB password

        // Establish connection to the database
        Connection con = DriverManager.getConnection(dbURL, username, password);

        // Create a Statement object to execute SQL queries
        Statement st = con.createStatement();

        // Define the SELECT query
        String selectQuery = "SELECT * FROM Student;";

        // Execute the query and store the result in a ResultSet
        ResultSet rs = st.executeQuery(selectQuery);

        // Print column headers
        System.out.println("Id\tName\tClass\tMark\tGender");

        // Loop through the ResultSet and print each row
        while (rs.next()) {
            // Fetch each column value from current row
            int id = rs.getInt("Id");
            String name = rs.getString("Name");
            String studentClass = rs.getString("Class");
            int marks = rs.getInt("Mark");
            String gender = rs.getString("Gender");

            // Print the values in a tabular format
            System.out.println(id + "\t" + name + "\t" + studentClass + "\t" + marks + "\t" + gender);
        }

        // Close the connection (best practice)
        con.close();
    }
}
