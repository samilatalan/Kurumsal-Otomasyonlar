/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package surucukursuotomasyonu;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TOSHIBA
 */
public class senet extends javax.swing.JFrame {

    /**
     * Creates new form senet
     */
    public senet() {
        initComponents();
        
        cmb_durum.addItem("Ödendi");
        cmb_durum.addItem("Ödenmedi");
        
        try {
        Class.forName("com.mysql.jdbc.Driver");
        try (java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/surucukursu","root","") //Mysql sunucusuna bağlandık
                ) {             java.sql.Statement st = (java.sql.Statement) con.createStatement();
                try (ResultSet rs = st.executeQuery("Select * from senet")) { //Veritabanındaki tabloya bağlandık
                    int colcount = rs.getMetaData().getColumnCount(); //Veritabanındaki tabloda kaç tane sütun var?
                    DefaultTableModel tm = new DefaultTableModel(); //Model oluşturuyoruz
                    for(int i = 1;i<=colcount;i++)
                        tm.addColumn(rs.getMetaData().getColumnName(i)); //Tabloya sütun ekliyoruz veritabanımızdaki sütun ismiyle aynı olacak şekilde
                    while(rs.next())
                    {
                        Object[] row = new Object[colcount];
                        for(int i=1;i<=colcount;i++)
                            row[i-1] = rs.getObject(i);
                        tm.addRow(row);
                    }
                    table_bilgi.setModel(tm);
                }
        }
        } catch (SQLException ex) {
            Logger.getLogger(senet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(senet.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table_bilgi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_tc = new javax.swing.JTextField();
        txt_adi = new javax.swing.JTextField();
        txt_borc = new javax.swing.JTextField();
        cmb_durum = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        table_bilgi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_bilgi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_bilgiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_bilgi);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 800, 142);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Tc Kimlik No");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(31, 160, 73, 16);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Adı Soyadı");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(222, 160, 68, 16);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Borç");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(413, 160, 29, 16);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Durumu");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(599, 160, 50, 16);
        getContentPane().add(txt_tc);
        txt_tc.setBounds(31, 194, 103, 22);
        getContentPane().add(txt_adi);
        txt_adi.setBounds(222, 194, 103, 22);
        getContentPane().add(txt_borc);
        txt_borc.setBounds(413, 194, 103, 22);

        getContentPane().add(cmb_durum);
        cmb_durum.setBounds(599, 194, 100, 22);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(128, 296, 131, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("Güncelle");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(291, 296, 131, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setText("Sil");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(462, 296, 131, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\TOSHIBA\\Desktop\\sefabingoljavatasarim\\background.png")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1, -4, 800, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        try {
           String tc_kimlik1=txt_tc.getText();
            String adi_soyadi1=txt_adi.getText();
            String borc1=txt_borc.getText();
            String durum= String.valueOf(cmb_durum.getSelectedItem());
            
            if (tc_kimlik1.equals("") || adi_soyadi1.equals("")){

                JOptionPane.showMessageDialog(this, "Lütfen Boş Alanları Doldurunuz!");

            } else {            
                Class.forName("com.mysql.jdbc.Driver");

                java.sql.Connection con = null;
                java.sql.Statement st = null;
                ResultSet rs = null;

                con = DriverManager.getConnection("jdbc:mysql://localhost/surucukursu","root","");
                
                st =(java.sql.Statement) con.createStatement();

                String sql = "INSERT INTO senet (tc,adi_soyadi,borc,senet_durumu)" 
                        + " VALUES ('"+tc_kimlik1+"','"+adi_soyadi1+"', '"+borc1+"', '"+durum+"')";

                st.executeUpdate(sql); //
                JOptionPane.showMessageDialog(null,"Senet Bilgisi Eklenmiştir");
       }
       }
       catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }
        try {
        Class.forName("com.mysql.jdbc.Driver");
        try (java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/surucukursu","root","") //Mysql sunucusuna bağlandık
                ) {             java.sql.Statement st = (java.sql.Statement) con.createStatement();
                try (ResultSet rs = st.executeQuery("Select * from senet")) { //Veritabanındaki tabloya bağlandık
                    int colcount = rs.getMetaData().getColumnCount(); //Veritabanındaki tabloda kaç tane sütun var?
                    DefaultTableModel tm = new DefaultTableModel(); //Model oluşturuyoruz
                    for(int i = 1;i<=colcount;i++)
                        tm.addColumn(rs.getMetaData().getColumnName(i)); //Tabloya sütun ekliyoruz veritabanımızdaki sütun ismiyle aynı olacak şekilde
                    while(rs.next())
                    {
                        Object[] row = new Object[colcount];
                        for(int i=1;i<=colcount;i++)
                            row[i-1] = rs.getObject(i);
                        tm.addRow(row);
                    }
                    table_bilgi.setModel(tm);
                }
        }
        } catch (SQLException ex) {
            Logger.getLogger(senet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(senet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        try{
            String kimlik=txt_tc.getText();
            String adi=txt_adi.getText();
            String borc=txt_borc.getText();
            String durum=String.valueOf(cmb_durum.getSelectedItem());
            
            
           
             Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
                Statement st = null;
                ResultSet rs = null;
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/surucukursu","root","");
                st =(Statement) con.createStatement();
                String sql="UPDATE `senet` SET tc='"+kimlik+"', adi_soyadi='"+adi+"', borc='"+borc+"', senet_durumu='"+durum+"' WHERE tc='"+kimlik+"'";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Senet Durumu Güncellenmiştir.");
                txt_adi.setText("");
                txt_tc.setText("");
                txt_borc.setText("");
                
                
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(senet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(senet.class.getName()).log(Level.SEVERE, null, ex);
        }
       try {
        Class.forName("com.mysql.jdbc.Driver");
        try (java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/surucukursu","root","") //Mysql sunucusuna bağlandık
                ) {             java.sql.Statement st = (java.sql.Statement) con.createStatement();
                try (ResultSet rs = st.executeQuery("Select * from senet")) { //Veritabanındaki tabloya bağlandık
                    int colcount = rs.getMetaData().getColumnCount(); //Veritabanındaki tabloda kaç tane sütun var?
                    DefaultTableModel tm = new DefaultTableModel(); //Model oluşturuyoruz
                    for(int i = 1;i<=colcount;i++)
                        tm.addColumn(rs.getMetaData().getColumnName(i)); //Tabloya sütun ekliyoruz veritabanımızdaki sütun ismiyle aynı olacak şekilde
                    while(rs.next())
                    {
                        Object[] row = new Object[colcount];
                        for(int i=1;i<=colcount;i++)
                            row[i-1] = rs.getObject(i);
                        tm.addRow(row);
                    }
                    table_bilgi.setModel(tm);
                }
        }
        } catch (SQLException ex) {
            Logger.getLogger(senet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(senet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void table_bilgiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_bilgiMouseClicked
        
        String kimlik = table_bilgi.getValueAt(table_bilgi.getSelectedRow(), 0).toString();
        String adi = table_bilgi.getValueAt(table_bilgi.getSelectedRow(), 1).toString();
        String borc = table_bilgi.getValueAt(table_bilgi.getSelectedRow(),2).toString();
        
        txt_adi.setText(adi);
        txt_tc.setText(kimlik);
        txt_borc.setText(borc);
    }//GEN-LAST:event_table_bilgiMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
{
           
            String kimlik=txt_tc.getText();
            
            
             Class.forName("com.mysql.jdbc.Driver");
            Connection con = null;
                Statement st = null;
                ResultSet rs = null;
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/surucukursu","root","");
                st =(Statement) con.createStatement();
                String sql="DELETE FROM `senet` WHERE tc='"+kimlik+"'";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Senet Bilgisi Silinmiştir.");
                txt_adi.setText("");
                txt_tc.setText("");
                txt_borc.setText("");
                
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(senet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(senet.class.getName()).log(Level.SEVERE, null, ex);
        }

try {
        Class.forName("com.mysql.jdbc.Driver");
        try (java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/surucukursu","root","") //Mysql sunucusuna bağlandık
                ) {             java.sql.Statement st = (java.sql.Statement) con.createStatement();
                try (ResultSet rs = st.executeQuery("Select * from senet")) { //Veritabanındaki tabloya bağlandık
                    int colcount = rs.getMetaData().getColumnCount(); //Veritabanındaki tabloda kaç tane sütun var?
                    DefaultTableModel tm = new DefaultTableModel(); //Model oluşturuyoruz
                    for(int i = 1;i<=colcount;i++)
                        tm.addColumn(rs.getMetaData().getColumnName(i)); //Tabloya sütun ekliyoruz veritabanımızdaki sütun ismiyle aynı olacak şekilde
                    while(rs.next())
                    {
                        Object[] row = new Object[colcount];
                        for(int i=1;i<=colcount;i++)
                            row[i-1] = rs.getObject(i);
                        tm.addRow(row);
                    }
                    table_bilgi.setModel(tm);
                }
        }
        } catch (SQLException ex) {
            Logger.getLogger(senet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(senet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(senet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(senet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(senet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(senet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new senet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_durum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_bilgi;
    private javax.swing.JTextField txt_adi;
    private javax.swing.JTextField txt_borc;
    private javax.swing.JTextField txt_tc;
    // End of variables declaration//GEN-END:variables
}
