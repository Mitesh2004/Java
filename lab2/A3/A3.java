import java.sql.*;

public class A3 {
    public static void main(String[] args) {
        String url = "jdbc:postgresql:mitesh"; // Replace with your DB URL
        String user = "postgres"; // Replace with your DB username
        String password = "Nitesh"; // Replace with your DB password

        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM DONAR LIMIT 1")) { // Fetch metadata from one row

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            System.out.println("DONAR Table Column Details:");
            System.out.println("--------------------------------");

            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Column " + i + ": " + metaData.getColumnName(i));
                System.out.println("Type: " + metaData.getColumnTypeName(i));
                System.out.println("Size: " + metaData.getColumnDisplaySize(i));
                System.out.println("Nullable: " + (metaData.isNullable(i) == ResultSetMetaData.columnNullable ? "Yes" : "No"));
                System.out.println("--------------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

