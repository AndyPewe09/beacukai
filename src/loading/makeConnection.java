/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loading;

import com.mysql.jdbc.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author abel
 */
public class makeConnection {
    String host;
    String user;
    String pass;
    String dbname;
    
    Connection conn;
    
    public makeConnection(){
        this.dbname = "beacukai";
        this.host = "jdbc:mysql://localhost:3306/" + this.dbname;
        this.user = "root";
        this.pass = "";
        
        this.makeconnection();
    }
    private void makeconnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            this.conn = DriverManager.getConnection(this.host, this.user, this.pass);
//            System.out.println("Berhasil!");
        }
        catch (ClassNotFoundException e){
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        catch (SQLException e){
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
    public Connection getConnection(){
        return this.conn;
    }
}
