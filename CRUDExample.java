import java.sql.*;

public class CRUDExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "";

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            Statement stmt = con.createStatement();

            // INSERT
            stmt.executeUpdate("INSERT INTO student VALUES(1, 'Ankit', 21)");
            stmt.executeUpdate("INSERT INTO student VALUES(2, 'Ravi', 22)");

            // SELECT
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("age"));
            }

            // UPDATE
            stmt.executeUpdate("UPDATE student SET age = 23 WHERE id = 2");

            // DELETE
            stmt.executeUpdate("DELETE FROM student WHERE id = 1");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
