import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class Facebook {

	public static void main(String[] args)
			throws SQLException, JsonGenerationException, JsonMappingException, IOException {
		Connection HiFi_db_connection = MySqlConnection.getConnection();
		Statement stmt = HiFi_db_connection.createStatement();
		String sql = "select * from users";
		ResultSet rs = stmt.executeQuery(sql);
		List<User> usersList = new ArrayList<User>();
		while (rs.next()) {
			String name = rs.getString("name");
			long mobileNo = rs.getLong("mobileNo");
			String emailId = rs.getString("emailId");
			String password = rs.getString("password");
			User retrieveUser = new User(name, mobileNo, emailId, password);
//			System.out.println(AppUtility.convertObjectToString(retrieveUser));
			usersList.add(retrieveUser);

		}
		for(User i : usersList) {
			System.out.println(AppUtility.convertObjectToString(i));
		}
		
	}
}
