package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CompanyDBEg {
    public static void main(String[] args) throws Exception {
        // Step 1: Database connection URL, username, password
        String dbURL = "jdbc:mysql://localhost:3306/companydb"; // Change if needed
        String username = "root"; // Your DB username
        String password = "12512588"; // Your DB password

        // Step 2: Establish connection to the database
        Connection con = DriverManager.getConnection(dbURL, username, password);

        // Step 3: Create a Statement object to send SQL queries
        Statement st = con.createStatement();

        // Step 4: Execute SELECT query to fetch all employees
        ResultSet rs = st.executeQuery("SELECT * FROM employees");

        // Step 5: Loop through result set and display data
        while (rs.next()) {
            int id = rs.getInt("id");                 // Get id
            String name = rs.getString("name");       // Get name
            String dept = rs.getString("department"); // Get department
            double salary = rs.getDouble("salary");   // Get salary

            // Print the row
            System.out.println(id + "\t" + name + "\t" + dept + "\t" + salary);
        }

        // Step 6: Close the ResultSet, Statement and Connection
        rs.close();
        st.close();
        con.close();
    }
}
