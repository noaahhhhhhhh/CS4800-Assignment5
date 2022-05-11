package model.dataccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection implements DataBaseConnection {
	public Connection getDataBaseConnection()
	{
		Connection connect = null;
		try {
			connect = DriverManager.getConnection("jdbc:postgresql://localhost:5433/authentication", "postgres", "password");
			System.out.println("Connected to the PostgreSQL server successfully.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return connect;
	}
}
