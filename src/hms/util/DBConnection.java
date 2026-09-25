package hms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Central place that opens/holds the JDBC connection to the
 * hospital_db MySQL database running under XAMPP.
 *
 * Edit DB_URL / DB_USER / DB_PASSWORD below to match your XAMPP setup.
 * Default XAMPP MySQL has user "root" with an empty password.
 */
public final class DBConnection {

    private static final String DB_URL =
            "jdbc:mysql://localhost:3306/hospital_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    private static Connection connection;

    private DBConnection() {
        // utility class - no instances
    }

    /**
     * Returns a live connection, opening a new one if necessary.
     */
    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "MySQL JDBC Driver not found.\n"
                    + "Make sure mysql-connector-j-x.x.x.jar is added to the project Libraries.",
                    "Driver Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Could not connect to the database.\n"
                    + "1) Start Apache and MySQL in the XAMPP Control Panel.\n"
                    + "2) Make sure the 'hospital_db' database has been imported.\n\n"
                    + "Details: " + e.getMessage(),
                    "Database Connection Error", JOptionPane.ERROR_MESSAGE);
        }
        return connection;
    }

    /**
     * Closes the connection if it is open. Call when the application exits.
     */
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            System.err.println("Error closing connection: " + e.getMessage());
        }
    }
}
