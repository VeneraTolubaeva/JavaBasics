package ru.ibs.day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class WorkWithDB {
    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection("jdbc:h2:./files/database", "sa", "")) {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM USERS");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id + " | " + name);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
