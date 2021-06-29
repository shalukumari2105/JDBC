package org.example;
import java.sql.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/practicesql","root","Sangam@186");
//here sonoo is database name, root is username and password
        Statement stmt = con.createStatement();
        ResultSet resultSet = stmt.executeQuery("select * from Sales_Rep");
        while (resultSet.next()){

            Integer empId = resultSet.getInt("Rep_ID");
            String name = resultSet.getString("Name");
            String city = resultSet.getString("City");

            System.out.println(empId+" "+name+" "+city);
        }
    }
}

