/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiyatro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author CASPER
 */
public class unuttum extends javax.swing.JFrame {

    /**
     * Creates new form unuttum
     */
    public unuttum() {
        
        super("Şifremi Unuttum Formu");
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_email = new javax.swing.JLabel();
        btn_sifre_goster = new javax.swing.JButton();
        txt_email = new javax.swing.JTextField();
        btn_cikis3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resim = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 0));
        setMinimumSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        lbl_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_email.setText("E-Posta Adresiniz");
        getContentPane().add(lbl_email);
        lbl_email.setBounds(70, 230, 103, 17);

        btn_sifre_goster.setText("Şifreyi Göster");
        btn_sifre_goster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sifre_gosterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sifre_goster);
        btn_sifre_goster.setBounds(220, 270, 170, 35);

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_email);
        txt_email.setBounds(190, 220, 240, 30);

        btn_cikis3.setText("ÇIKIŞ");
        btn_cikis3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikis3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cikis3);
        btn_cikis3.setBounds(10, 10, 90, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("ŞİFRENİZİ Mİ UNUTTUNUZ?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 100, 630, 110);

        resim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tiyatro/charles-chaplin-02.jpg"))); // NOI18N
        getContentPane().add(resim);
        resim.setBounds(280, 0, 390, 440);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 670, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sifre_gosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sifre_gosterActionPerformed
        
            String email=txt_email.getText();
                
            try {
                    
                if (email.equals("")) {

                    JOptionPane.showMessageDialog(this, "Lütfen E-Posta Adresinizi Giriniz!");

                } else {            
                    Class.forName("com.mysql.jdbc.Driver");

                    Connection con = null;
                    Statement st = null;
                    ResultSet rs = null;
                    
                    con = DriverManager.getConnection("jdbc:mysql://localhost/tiyatro", "root", "");
                    st = con.createStatement();
                    
                    rs = st.executeQuery("select * from uyeler where email='"+email+"'");
                    
                    if(rs.next()){
                       
                        JOptionPane.showMessageDialog(null, "Şifreniz: " + rs.getString("parola"));
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Böyle Bir E-Posta Kayıtlı Değil!"); 
                    }
                }
            
            } catch (ClassNotFoundException ex) {
                 JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
            }
        
    }//GEN-LAST:event_btn_sifre_gosterActionPerformed

    private void btn_cikis3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikis3ActionPerformed

        oyun_ekle a = new oyun_ekle();
        a.setVisible(false);
        dispose();
    }//GEN-LAST:event_btn_cikis3ActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

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
            java.util.logging.Logger.getLogger(unuttum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(unuttum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(unuttum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(unuttum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new unuttum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cikis3;
    private javax.swing.JButton btn_sifre_goster;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel resim;
    private javax.swing.JTextField txt_email;
    // End of variables declaration//GEN-END:variables
}
