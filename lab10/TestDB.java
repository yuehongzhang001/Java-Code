import java.sql.*;

public class TestDB {

	public static void main(String[] args) throws SQLException {
		final String DB_URL = "jdbc:derby:test;create=true";
		Connection con = DriverManager.getConnection(DB_URL);
		
		
		
		final String sqlStatement = "SELECT * FROM Games";
		// Send the statement to the DBMS
		ResultSet result = stmt.executeQuery(sqlStatement);
		// This is a suggested column headings display
		System.out.println("List of games and scores:");
		System.out.printf("%-6s %-20s %6s %-20s %6s\n",
				"GameID", "Home", "Score",
				"Visitor", "Score");
		// TASK #2
		// Use a while loop to display the result set
		// The result set will have five columns
		while(result.next()) {
			System.out.printf("%-6s %-20s %6s %-20s %6s\n",
					result.getString("GameNumber"),
					result.getString("HomeTeam"),
					result.getInt("HomeTeamScore"),
					result.getString("VisitorTeam"),
					result.getInt("VisitorTeamScore"));
		}
	}
}
