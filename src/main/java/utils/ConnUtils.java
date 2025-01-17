package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnUtils {
 
    private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String username = "jhta";
    private static final String password = "1234";
    
    static {

        try { Class.forName("oracle.jdbc.OracleDriver"); }
        catch (ClassNotFoundException e) { throw new RuntimeException(e); }
    }

    public static Connection getConnection() throws SQLException {
    	
        return DriverManager.getConnection(url, username, password);
    }
}
