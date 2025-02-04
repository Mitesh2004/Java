import java.sql.*;

public class A2 {
    public static void main(String[] args) {
        Connection con = null;

        try {
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection("jdbc:postgresql:mitesh","postgres","Nitesh");

            DatabaseMetaData metaData = con.getMetaData();

            System.out.println("Database Product Name: " + metaData.getDatabaseProductName());
            System.out.println("Database Product Version: " + metaData.getDatabaseProductVersion());
            System.out.println("Driver Name: " + metaData.getDriverName());
            System.out.println("Driver Version: " + metaData.getDriverVersion());

            System.out.println("\nTables in the database:");
            ResultSet tables = metaData.getTables(null, null, "%", new String[]{"TABLE"});
            while (tables.next()) {
                System.out.println(tables.getString("TABLE_NAME"));
            }

            tables.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
