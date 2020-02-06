package elastic.apm;

import co.elastic.apm.api.CaptureSpan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// This class can be used to initialize the database connection

public class DatabaseConnection {

    @CaptureSpan
    protected static Connection initializeDatabase()
            throws SQLException, ClassNotFoundException
    {
        // Initialize all the information regarding
        // Database Connection
        String dbDriver = "com.mysql.jdbc.Driver";
        String dbURL = "jdbc:mysql://172.18.0.2:3306/";
        // Database name to access
        String dbName = "demoprj";
        String dbUsername = "root";
        String dbPassword = "my-secret-pw";

        Class.forName(dbDriver);
        Connection con = DriverManager.getConnection(dbURL + dbName,
                dbUsername,
                dbPassword);
        return con;
    }
}
