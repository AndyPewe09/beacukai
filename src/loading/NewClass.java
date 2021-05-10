/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loading;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author abel
 */
public class NewClass {Connection myConnection = null;
private Statement stm;
public ResultSet retrieve(String aSQLQueryString) throws SQLException
{
    makeConnection con = new makeConnection();
    stm = (Statement) con.getConnection().createStatement();
    ResultSet result = null;
    PreparedStatement prepStatement = null;

    myConnection = (Connection) con;

if (myConnection != null)
{
prepStatement = myConnection.prepareStatement("SELECT COUNT(*) FROM importeksport;");
result = prepStatement.executeQuery();

result.next();
}
return result;
}
} // end of class

