package model.dataccess;

public class ConnectionFactory {
	public DataBaseConnection getConnection(String dataBase)
	{
		if (dataBase.equalsIgnoreCase("postgres"))
			return new PostgresConnection();
		
		else if (dataBase.equalsIgnoreCase("mysql"))
			return new MySqlConnection();
		else
			System.out.println("Invalid database type");
			return null;
	}
}
