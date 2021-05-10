/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loading;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author abel
 */
public class rekapanMinggu {
    int jmlImport, jmlEksport;
    String idMinggu;
    private Statement stm;
    
    public void rekapanMg(int jmlImport, int jmlEksport) {
        try {
            connection con = new connection();
            stm = (Statement) con.getConnection().createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "On Start : " + e.getMessage());
        }
        
        this.jmlImport = jmlImport;
        this.jmlEksport = jmlEksport;
        
        Calendar calendar = Calendar.getInstance();
        int week = calendar.get(Calendar.WEEK_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);
        
        this.idMinggu = week + month + year + "";
        
        
    }
    
    private  void selectData() {
        try {
            String query = "SELECT * FROM rekapanMinggu where idMinggu ='" + idMinggu + "'";
            ResultSet rs = stm.executeQuery(query);
            
            while(rs.next()) {
                try {
                    String query2 = "INSERT INTO rekapanMinggu VALUES ('" + this.idMinggu + "', '" + this.jmlImport + "', '" + this.jmlEksport +"');";
           
                    stm.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Berhasil ditambahkan!");
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "On Save : "+e.getMessage());
                }
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "On Select :" + e.getMessage());
        }
    }
    
}
