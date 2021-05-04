package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connect.DBConnect;
import model.User;

/**
 * This is a DAO (DATA ACCESS OBJECT) class which provides 
 * CRUD (CREATE - READ - UPDATE - DELETE) database operations 
 * for the table user in the database
 */
public class UserDAO {

	public UserDAO() {
	}

	public List<User> selectAllUsers() {

		List<User> users = new ArrayList<>();
		// Step 1: Establishing a Connection
		Connection connection = DBConnect.getConnection();
		try {
			// Step 2:Create a statement using connection object
			String SELECT_ALL_USERS = "SELECT * FROM user";
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();
			// Step 4: Process the ResultSet object
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String address = rs.getString("address");
				String mobile = rs.getString("mobile");
				users.add(new User(id, name, address, mobile));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}
}
