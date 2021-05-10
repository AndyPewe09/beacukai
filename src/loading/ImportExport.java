/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loading;

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;

/**
 *
 * @author k401u
 */
public class ImportExport {
    private Statement stm;
    private String search;
    private ResultSet response;
    
    ImportExport(String search){
        this.search = search;
        this.connection();
    }
    
    private void connection(){
        try {
            makeConnection con = new makeConnection();
            stm = (Statement) con.getConnection().createStatement();    
        } catch (Exception e) {
            System.out.println("Error Found @connection ImportExport Class : " +e.getMessage());
        }
        
    }
    public void fetchData(){
        try {
            String query = "SELECT * FROM importeksport where `tanggal` Like '%" + search +"%' or `jenis` Like '%" + search +"%' or `KodeBarang` Like '%" + search +"%' or `NamaBarang` Like '%" + search +"%' or `JumlahBarang` Like '%" + search +"%' or `JumlahMaksimal` Like '%" + search +"%' or `HargaBarang` Like '%" + search +"%' or `PajakPerBarang` Like '%" + search +"%' or `PajakTotal` Like '%" + search +"%' or `NamaPengirim` Like '%" + search +"%' or `AsalNegara` Like '%" + search +"%' or `KotaTujuan` Like '%" + search +"%' or `NegaraTujuan` Like '%" + search +"%'";
            response = stm.executeQuery(query);
        } catch (Exception e) {
            System.out.println("Error Found @fetchData ImportExport Class : " + e.getMessage());
        }
    }
    
    public ResultSet getImportExport(){
        return response;
    }
    
    public void setSearch(String search){
        this.search = search;
        this.fetchData();
    }
}
