import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {

    public static void insertarOficina(){
        Connection con = ConexionBD.getConnection();

        try {
            con.setAutoCommit(false);

            //INSERTAMOS LA NUEVA OFICINA
            PreparedStatement ps = con.prepareStatement("INSERT INTO offices \n" +
                    "VALUES(?, ?, ?, ?, NULL, NULL, ?, ?, ?)");

            ps.setString(1, "8");
            ps.setString(2, "Sevilla");
            ps.setString(3, "+34 123 465 789");
            ps.setString(4, "Mi casa");
            ps.setString(5, "España");
            ps.setString(6, "41960");
            ps.setString(7, "EMEA");

            ps.executeUpdate();

            //INSERTAMOS LOS DOS EMPLEADOS

            PreparedStatement ps2 = con.prepareStatement("UPDATE employees e SET officeCode = 8 \n" +
                    "WHERE e.employeeNumber = ? OR e.employeeNumber = ?;");

            ps2.setString(1, "1002");
            ps2.setString(2, "1056");

            ps2.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
