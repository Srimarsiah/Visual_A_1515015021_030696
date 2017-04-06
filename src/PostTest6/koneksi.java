
package PostTest6;
import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi{
    private static Connection con;
    static Connection getConnection(){
            try {
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/praktikum_visual","root","");
                JOptionPane.showMessageDialog(null, " berhasil");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal"+ e.getMessage());
            }
            return con;
        
}   
}
