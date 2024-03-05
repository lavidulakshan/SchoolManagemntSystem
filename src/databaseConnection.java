
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class databaseConnection {
    
    public static Connection connect(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement","root","Lakshan@1999");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return conn;
        
    
    } 
}
