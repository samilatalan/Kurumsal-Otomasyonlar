/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muzeotomasyon;

import com.sun.xml.internal.bind.v2.runtime.JAXBContextImpl;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class personel extends javax.swing.JFrame {

          Connection conn = null;
    Statement stmt=null;
    ResultSet rs=null;
    // veri tabanı bağlan kodu
    public void baglan() throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/müze1", "root", "");
    }
// eserler tablosundaki verileri tabloya doldurma
    public void tablodoldur() throws SQLException {


        String baslik[] = new String[]{"id", "EserAdi", "Kategori","personel","Yil"};

        try {
            baglan();

            String sorgu = "select * from eserler";

            stmt = conn.createStatement();
             rs = stmt.executeQuery(sorgu);

            // kac tane kayit var onu buluyor
            rs.last();
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();


            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{
                    rs.getInt("id"),
                    rs.getString("EserAdi"),
                    rs.getString("Kategori"),
                    rs.getString("personel"),
                    rs.getString("Yil")
                };
                i++;
            }
            conn.close();
            jTable1.setModel(new DefaultTableModel(data, baslik));
        } catch (Exception ex) {
        }

    } 
    public void tablodoldur1() throws SQLException {


        String baslik1[] = new String[]{"Gunler", "TarihiEserler", "SanatsalEserler","DiniEserler","YakinCagEserleri","OrtaCagEserleri","TasCagiEserleri","Romaİmparatorlugu","Bizansİmparatorlugu"};

        try {
            baglan();

            String sorgu = "select * from ziyaretsaatleri";

            stmt = conn.createStatement();
             rs = stmt.executeQuery(sorgu);

            // kac tane kayit var onu buluyor
            rs.last();
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();


            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{
                    rs.getString("Gunler"),
                    rs.getString("TarihiEserler"),
                    rs.getString("SanatsalEserler"),
                    rs.getString("DiniEserler"),
                    rs.getString("YakinCagEserleri"),
                    rs.getString("OrtaCagEserleri"),
                    rs.getString("TasCagiEserleri"),
                    rs.getString("Romaİmparatorlugu"),
                    rs.getString("Bizansİmparatorlugu"),
                    
                };
                i++;
            }
            conn.close();
            jTable2.setModel(new DefaultTableModel(data, baslik1));
        } catch (Exception ex) {
        }

    } 
    
    public void tablodoldur2() throws SQLException {


        String baslik2[] = new String[]{"id","Ad","Soyad","GirisTarihi","GirisSaati"};

        try {
            baglan();

            String sorgu = "select * from rezervasyon";

            stmt = conn.createStatement();
             rs = stmt.executeQuery(sorgu);

            // kac tane kayit var onu buluyor
            rs.last();
            int kayitsayisi = rs.getRow();
            rs.beforeFirst();


            Object data[][] = new Object[kayitsayisi][];
            int i = 0;

            while (rs.next()) {

                data[i] = new Object[]{
                    rs.getInt("id"),
                    rs.getString("Ad"),
                    rs.getString("Soyad"),
                    rs.getString("GirisTarihi"),
                    rs.getString("GirisSaati"),
                    
                    
                };
                i++;
            }
            conn.close();
            jTable4.setModel(new DefaultTableModel(data, baslik2));
        } catch (Exception ex) {
        }

    } 
    
    public personel() throws SQLException {
        initComponents();
        tablodoldur();
        tablodoldur1();
        tablodoldur2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        kategori = new javax.swing.JComboBox();
        yil = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        personel = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        eseradi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        c_yil = new javax.swing.JComboBox<>();
        c_ay = new javax.swing.JComboBox<>();
        c_gun = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel4.setText("Geldiği Yıl:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 212, -1, -1));

        kategori.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        kategori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tarihi Eserler", "Sanatsal Eserler", "Dini Eserler", "Yakın Çağ Eserleri", "Orta Çağ Eserleri", "Taş Çağı Eserleri", "Roma İmparatorluğu Eserleri ", "Bizans İmparatorluğu Eserleri ", " " }));
        jPanel4.add(kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 163, 200, -1));

        yil.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        yil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016" }));
        jPanel4.add(yil, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 209, 200, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel5.setText("Eser Sorumlusu:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 261, -1, -1));

        personel.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        personel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ahmet ", "Mehmet", "İsmail", "İbrahim" }));
        jPanel4.add(personel, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 258, 200, -1));

        jButton1.setText("EKLE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 312, -1, -1));

        eseradi.setForeground(new java.awt.Color(153, 153, 255));
        jPanel4.add(eseradi, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 88, 200, 64));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel2.setText("Eser Adı:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 112, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel3.setText("Kategori:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 166, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muzeotomasyon/gokyuzu.jpg"))); // NOI18N
        jLabel19.setText("jLabel19");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 410));

        jTabbedPane1.addTab("Eser Ekle", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 50, -1, 110));

        jButton5.setText("Eser Sil");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 186, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muzeotomasyon/gokyuzu.jpg"))); // NOI18N
        jLabel18.setText("jLabel18");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 410));

        jTabbedPane1.addTab("Eser Sil", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel10.setText("Eser Sorumlusu:");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 277, -1, -1));

        jComboBox6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ahmet ", "Mehmet", "İsmail", "İbrahim" }));
        jPanel6.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 274, 202, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButton3.setText("GÜNCELLE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 327, -1, -1));
        jPanel6.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 87, 202, 64));

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel12.setText("Eser Adı:");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 112, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel13.setText("Kategori:");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 182, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel14.setText("Geldiği Yıl:");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 228, -1, -1));

        jComboBox7.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tarihi Eserler", "Sanatsal Eserler", "Dini Eserler", "Yakın Çağ Eserleri", "Orta Çağ Eserleri", "Taş Çağı Eserleri", "Roma İmparatorluğu Eserleri ", "Bizans İmparatorluğu Eserleri ", " " }));
        jPanel6.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 179, 202, -1));

        jComboBox8.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016" }));
        jPanel6.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 225, 202, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muzeotomasyon/gokyuzu.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 410));

        jTabbedPane1.addTab("Eser Güncelle", jPanel6);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 655, 110));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muzeotomasyon/gokyuzu.jpg"))); // NOI18N
        jLabel16.setText("jLabel16");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 410));

        jTabbedPane1.addTab("Ziyaret Saatleri", jPanel7);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel1.setText("Adı:");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel15.setText("Giriş Tarihi:");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));
        jPanel8.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 171, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButton4.setText("Ekle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        c_yil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016", "2015", "2014", "2013" }));
        jPanel8.add(c_yil, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        c_ay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        c_ay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_ayActionPerformed(evt);
            }
        });
        jPanel8.add(c_ay, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        c_gun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel8.add(c_gun, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jLabel6.setText("Soyadı:");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 171, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muzeotomasyon/gokyuzu.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 410));

        jTabbedPane1.addTab("Ziyaretçi Girişi", jPanel8);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 39, -1, 90));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muzeotomasyon/gokyuzu.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 730, 400));

        jTabbedPane1.addTab("Rezervasyon", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 680, 430));

        jButton2.setText("Çıkış Yap");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muzeotomasyon/gokyuzu.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 470));

        jLabel20.setText("jLabel20");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void c_ayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_ayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_ayActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String ad = jTextField4.getText();
        String soyad = jTextField1.getText();
        String gun_al = String.valueOf(c_gun.getSelectedItem());
        String ay_al = String.valueOf(c_ay.getSelectedItem());
        String yil_al = String.valueOf(c_yil.getSelectedItem());
        String tarih =  yil_al + " - " + ay_al + " - " +gun_al ;
// sistemin saatini almak için kullanılan kod
        SimpleDateFormat bicim3=new SimpleDateFormat("kk:mm");
        GregorianCalendar gcalender=new GregorianCalendar();
        bicim3.format(gcalender.getTime());

        try {

            baglan();     /*ekleme*/
            String sorgu = "insert into giriscikis (Ad,Soyad,GirisTarihi,GirisSaati) values ('" + ad + "','" + soyad + "','" + tarih + "','" + bicim3.format(gcalender.getTime()) + "')";
            Statement stmt = conn.createStatement();
            JOptionPane.showMessageDialog(rootPane, "Giriş Yapıldı");
            stmt.executeUpdate(sorgu);
            conn.close();

        } catch (ClassNotFoundException | SQLException | HeadlessException ex) {
            Logger.getLogger(ziyaretci.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String eseradi = jTextField3.getText();
        String kategorii=  (String) jComboBox7.getSelectedItem();
        String yill=  (String) jComboBox8.getSelectedItem();
        String personell=  (String) jComboBox6.getSelectedItem();

        try {

            baglan();    /*güncelle*/
            String sorgu ="UPDATE eserler SET EserAdi = '"+eseradi+"',Kategori='"+kategorii+"',Yil='"+yill+"',personel='"+personell+"' where EserAdi ='"+eseradi+"'";
            Statement stmt = conn.createStatement();
            JOptionPane.showMessageDialog(rootPane, "Güncellendi");
            stmt.executeUpdate(sorgu);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(eserekle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            baglan();

            String tablodangelen = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            JOptionPane.showMessageDialog(rootPane,tablodangelen );
            stmt = conn.createStatement();
            String sql = "DELETE FROM eserler "
            + "WHERE id = " + tablodangelen;
            stmt.executeUpdate(sql);
            tablodoldur();
        }
        catch(Exception e){}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String eseradii = eseradi.getText();
        String kategorii=  (String) kategori.getSelectedItem();
        String yill=  (String) yil.getSelectedItem();
        String personell=  (String) personel.getSelectedItem();

        try {

            baglan();
            String sorgu = "Insert Into eserler (EserAdi,Kategori,Yil,personel) values ('" + eseradii + "','" + kategorii + "','" + yill + "','" + personell + "')";
            Statement stmt = conn.createStatement();
            JOptionPane.showMessageDialog(rootPane, "Eklendi");
            stmt.executeUpdate(sorgu);
            conn.close();
            tablodoldur();
        } catch (Exception ex) {
            Logger.getLogger(eserekle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        anasayfa ana = new anasayfa ();
        this.setVisible(false);
        ana.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(personel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new personel().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(personel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c_ay;
    private javax.swing.JComboBox<String> c_gun;
    private javax.swing.JComboBox<String> c_yil;
    private javax.swing.JTextField eseradi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JComboBox kategori;
    private javax.swing.JComboBox personel;
    private javax.swing.JComboBox yil;
    // End of variables declaration//GEN-END:variables
}
