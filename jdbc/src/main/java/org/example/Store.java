package org.example;
import java.sql.*;
public class Store {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/practicesql", "root", "Sangam@186");
        PreparedStatement stmt = con.prepareStatement("INSERT INTO Consumer values(?,?,?,?,?)");
        stmt.setInt(1, 777);
        stmt.setString(2, "Shalu");
        stmt.setString(3, "Muzaffarpur");
        stmt.setInt(4, 300);
        stmt.setInt(5, 1003);
        int count = stmt.executeUpdate();
        System.out.println(count + "insertion successful");
        con.close();
    }
}
