import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;





public class TestDBConnection {

    @Test
    public void testDBConnectionMySQL(){
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "1234";

        try(Connection con = DriverManager.getConnection(url, user, password)){
            if(con != null || !con.isClosed()){
                System.out.println("Connection is stable");
            }

        }catch(SQLException e ){
            System.err.println("Error : " + e.getMessage());
        }

    }

}
