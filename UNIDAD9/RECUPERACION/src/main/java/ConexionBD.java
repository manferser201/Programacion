import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static Connection con = null;

    public static Connection getConnection(){
        try {
            if (con == null){
                con = DriverManager.getConnection("jdbc:mariadb://localhost:3336/classicmodels?user=root&password=root"
                        + "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return (con);
    }

    public static void closeConnection(){

        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
