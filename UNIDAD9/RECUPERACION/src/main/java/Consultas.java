import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas {

    public static List<Product> getProducts(Double price){
        Connection con = ConexionBD.getConnection();

        List<Product> productos = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement("SELECT p.productName \n" +
                    "FROM products p \n" +
                    "WHERE p.buyPrice < ?");

            ps.setDouble(1, price);

            Product p = new Product();

            //Añadimos los datos al producto
//            p.setProductName();
//            p.setBuyPrice();
//            p.setProductDescription();
//            p.setProductScale();
//            p.setMSRP();
//            p.setProductVendor();
//            p.setQuantityInStock();
//            p.setProductLine();

            //Añadimos el producto al Array
            //productos.add();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return productos;
    }
}
