package jdbc_ex;

import java.sql.*;

public class JDBC2 {
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@192.168.219.104:1521:xe",
                "C##SCOTT",
                "TIGER"))
        {
            String sql = "insert into person values('0012','철씨','30')";

            Statement stmt = conn.createStatement();
            int result = stmt.executeUpdate(sql);
            System.out.println("몇건 적용 "+result);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
