import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/HiFi_db";
		String username = "abcd";
		String password = "12345";

		System.out.println("Connecting database...");

		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("Database connected!");
			return connection;
		} catch (SQLException e) {
			throw new IllegalStateException("Cannot connect the database!", e);
		}
	}
}
