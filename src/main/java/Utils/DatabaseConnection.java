package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/biblioFlow";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion établie avec succès");

        } catch (ClassNotFoundException e) {
            System.out.println("Driver non trouvé");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erreur lors de la connexion");
            e.printStackTrace();
        }
        return connection;
    }
}
