/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loading;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author abel
 */
public class crud {
        
        private static Connection mysqlconfig;
        public static Connection configDB()throws SQLException{
            try{
            String host = "jdbc:mysql://localhost:8889/beacukai";
            String user = "root";
            String pass = "root";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlconfig=DriverManager.getConnection(host, user, pass);
            }
            catch (Exception e){
                System.err.println("Gagal "+e.getMessage());
            }
            return mysqlconfig;
        }
}
