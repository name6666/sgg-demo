package net.jhc.sgghspring;

import java.sql.*;

/**
 * @author icestar
 */
public class Mn {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_4?useSSL=false&serverTimezone=UTC", "root", "123456");
        Statement stat = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String command = "SELECT * FROM ic";
        ResultSet rs = stat.executeQuery(command);
        System.out.println(rs.next());

        rs.absolute(1);
        while (rs.next()) {
            int result = rs.getInt("num");
            System.out.println(result);
            rs.updateInt("num", 20);
            rs.updateRow();
            System.out.println(result);
        }
        rs.close();
        stat.close();
    }

    private static void load() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }
}