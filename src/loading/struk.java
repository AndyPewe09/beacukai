/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loading;

import com.mysql.jdbc.Connection;
import java.awt.Toolkit;
import java.sql.DriverManager;
import com.mysql.jdbc.Statement;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JFrame;

/**
 *
 * @author abel
 */
public class struk extends javax.swing.JFrame {

    /**
     * Creates new form struk
     */
    private Statement stm;
    
    public struk() {
        initComponents();
        
        try{
            makeConnection con = new makeConnection();
            stm = (Statement) con.getConnection().createStatement();
        }
        catch (Exception e){
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Struk");
        job.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)  {
                pageFormat.setOrientation(PageFormat.PORTRAIT);
                if (pageIndex > 0) {
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D g2 = (Graphics2D) graphics;
                g2.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                g2.scale(0.24, 0.24);
                
                panel.paint(g2);
                
                return Printable.PAGE_EXISTS;
            }
        });
        
        boolean ok = job.printDialog();
        if (ok) {
            try {
                job.print();
            } catch (PrinterException ex) {
                
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        kodebarang = new javax.swing.JLabel();
        namabarang = new javax.swing.JLabel();
        jumlahbarang = new javax.swing.JLabel();
        jumlahmaksimal = new javax.swing.JLabel();
        hargabarang = new javax.swing.JLabel();
        pajakperbarang = new javax.swing.JLabel();
        pajaktotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pengirim = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        asalnegara = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kotatujuan = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        negaratujuan = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        jenis = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(453, 572));
        setMinimumSize(new java.awt.Dimension(453, 572));
        setResizable(false);

        panel.setBackground(new java.awt.Color(0, 51, 102));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel27.setFont(new java.awt.Font("Heiti SC", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loading/direktorat-jenderal-bea-dan-cukai-logo-BC477025FF-seeklogo.com copy.png"))); // NOI18N
        jLabel27.setText("BeaCukai");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(18, 18, 18))
        );

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        kodebarang.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        kodebarang.setText("-");

        namabarang.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        namabarang.setText("-");

        jumlahbarang.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jumlahbarang.setText("-");

        jumlahmaksimal.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jumlahmaksimal.setText("-");

        hargabarang.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        hargabarang.setText("-");

        pajakperbarang.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        pajakperbarang.setText("-");

        pajaktotal.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        pajaktotal.setText("-");

        jLabel1.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel1.setText("Tanggal");

        pengirim.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        pengirim.setText("-");

        jLabel2.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel2.setText("Jenis");

        asalnegara.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        asalnegara.setText("-");

        jLabel3.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel3.setText("Kode Barang");

        kotatujuan.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        kotatujuan.setText("-");

        jLabel4.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel4.setText("Nama Barang");

        jLabel5.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel5.setText("Jumlah Barang");

        negaratujuan.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        negaratujuan.setText("-");

        jLabel6.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel6.setText("Jumlah Maksimal");

        jLabel7.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel7.setText("Harga Barang");

        jLabel8.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel8.setText("Pajak perBarang");

        jLabel9.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel9.setText("Pajak Total");

        jLabel14.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Struk");

        jLabel10.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel10.setText("Pengirim");

        jLabel11.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel11.setText("Asal Negara");

        jLabel12.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel12.setText("Kota Tujuan");

        jLabel13.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jLabel13.setText("Negara Tujuan");

        tanggal.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        tanggal.setText("-");

        jenis.setFont(new java.awt.Font("Heiti SC", 0, 13)); // NOI18N
        jenis.setText("-");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("================");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("================");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(negaratujuan)
                    .addComponent(kotatujuan)
                    .addComponent(asalnegara)
                    .addComponent(pengirim)
                    .addComponent(pajaktotal)
                    .addComponent(pajakperbarang)
                    .addComponent(hargabarang)
                    .addComponent(jumlahmaksimal)
                    .addComponent(jumlahbarang)
                    .addComponent(namabarang)
                    .addComponent(kodebarang)
                    .addComponent(jenis)
                    .addComponent(tanggal))
                .addGap(132, 132, 132))
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tanggal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jenis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kodebarang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namabarang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jumlahbarang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jumlahmaksimal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hargabarang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pajakperbarang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pajaktotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pengirim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(asalnegara)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kotatujuan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(negaratujuan)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(5, 10, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ImportEKsport IE = new ImportEKsport();
        IE.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(struk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(struk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(struk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(struk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new struk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel asalnegara;
    public javax.swing.JLabel hargabarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel jenis;
    public javax.swing.JLabel jumlahbarang;
    public javax.swing.JLabel jumlahmaksimal;
    public javax.swing.JLabel kodebarang;
    public javax.swing.JLabel kotatujuan;
    public javax.swing.JLabel namabarang;
    public javax.swing.JLabel negaratujuan;
    public javax.swing.JLabel pajakperbarang;
    public javax.swing.JLabel pajaktotal;
    private javax.swing.JPanel panel;
    public javax.swing.JLabel pengirim;
    public javax.swing.JLabel tanggal;
    // End of variables declaration//GEN-END:variables
}