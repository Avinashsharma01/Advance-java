package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Date;

public class JdbcExample {
    public static void main(String[] args) {
        try {
            // Step 2: Load the JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 3: Establish the Connection
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3308/employees",
                    "root",
                    "root"
            );

            // Step 4: Create a Statement
            Statement statement = connection.createStatement();

            // Step 5: Execute a Query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");

            // Step 6: Process the Result
            while (resultSet.next()) {
                int emp_no = resultSet.getInt("emp_no");
                String first_name = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");
                int salary = resultSet.getInt("salary");
                Date birth_date = resultSet.getDate("birth_date");
                String gender = resultSet.getString("gender");
                Date joining_date = resultSet.getDate("joining_date");
                String department = resultSet.getString("department");

                // Print each employee's details
                System.out.println("Employee No: " + emp_no);
                System.out.println("First Name: " + first_name);
                System.out.println("Last Name: " + last_name);
                System.out.println("Salary: " + salary);
                System.out.println("Birth Date: " + birth_date);
                System.out.println("Gender: " + gender);
                System.out.println("Joining Date: " + joining_date);
                System.out.println("Department: " + department);
                System.out.println("--------------------------------------------------------");
                System.out.println("--------------------------------------------------------");
            }

            // Step 7: Close the resources
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
