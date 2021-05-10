/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loading;

import com.mysql.jdbc.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ilham Irfan
 */
public class connection {
    String host;
    String user;
    String pass;
    String dbname;
    
    Connection conn;
    
    public connection() {
        this.dbname = "beacukai";
        
        this.host = "jdbc:mysql://localhost:3306/" + this.dbname;
        this.user = "root";
        this.pass = "";
        
        this.makeConnection();
    }
    
    private void makeConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection(this.host, this.user, this.pass);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Connection Not Found!");
            System.exit(0);
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Connection Failed!");
            System.exit(0);
        }
    }
    
    public Connection getConnection() {
        return this.conn;
    }
}
