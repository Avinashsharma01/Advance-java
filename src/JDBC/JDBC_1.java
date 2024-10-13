package JDBC;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_1 {
    public static void main(String[] args)  {
        System.out.println("Hello JDBC");

        // JDBC URL, username and password
        String sql = "SELECT name FROM avi";
        String url = "jdbc:mysql://localhost:3308/avinash";
        String username = "root";
        String password = "root";

        try{
            

            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            rs.next();
            System.out.println(rs.getString("name"));

        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
