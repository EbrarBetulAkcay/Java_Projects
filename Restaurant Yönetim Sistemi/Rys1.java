/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rys;

import java.time.LocalDate;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author Ebrar Betül AKÇAY
 */
public class Rys1 extends javax.swing.JFrame {
    int[] yiyecek_fiyat={250,300,500,350};
    int[] icecek_fiyat = {75,50,75,60};
    double kdv = 0, servis = 0,yiyecek_total = 0,icecek_total = 0;
    double ara_toplam = 0,genel_toplam = 0;
    double firstnum,secondnum,result = 0;
    String operator ="";
    public Rys1() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cb_tavuk = new javax.swing.JCheckBox();
        cb_etdoner = new javax.swing.JCheckBox();
        cb_iskender = new javax.swing.JCheckBox();
        txt_tavuk = new javax.swing.JTextField();
        txt_etdoner = new javax.swing.JTextField();
        txt_iskender = new javax.swing.JTextField();
        txt_burdursis = new javax.swing.JTextField();
        cb_burdursis = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        cb_salgam = new javax.swing.JCheckBox();
        cb_soda = new javax.swing.JCheckBox();
        cb_ayran = new javax.swing.JCheckBox();
        cb_kola = new javax.swing.JCheckBox();
        txt_kola = new javax.swing.JTextField();
        txt_ayran = new javax.swing.JTextField();
        txt_soda = new javax.swing.JTextField();
        txt_salgam = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_icecek = new javax.swing.JLabel();
        lbl_yiyecek = new javax.swing.JLabel();
        lbl_servis = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_aratoplam = new javax.swing.JLabel();
        lbl_kdv = new javax.swing.JLabel();
        lbl_geneltoplam = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea_fatura = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        txt_ekran = new javax.swing.JTextField();
        b_delete = new javax.swing.JButton();
        b_c = new javax.swing.JButton();
        b_0 = new javax.swing.JButton();
        b_7 = new javax.swing.JButton();
        b_4 = new javax.swing.JButton();
        b_6 = new javax.swing.JButton();
        b_1 = new javax.swing.JButton();
        b_8 = new javax.swing.JButton();
        b_3 = new javax.swing.JButton();
        b_5 = new javax.swing.JButton();
        b_artieksi = new javax.swing.JButton();
        b_9 = new javax.swing.JButton();
        b_2 = new javax.swing.JButton();
        b_esittir = new javax.swing.JButton();
        b_arti = new javax.swing.JButton();
        b_nokta = new javax.swing.JButton();
        b_carpi = new javax.swing.JButton();
        b_bolme = new javax.swing.JButton();
        b_eksi = new javax.swing.JButton();
        b_yuzde = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btn_toplam = new javax.swing.JButton();
        btn_fatura = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        btn_kapat = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.setPreferredSize(new java.awt.Dimension(182, 138));

        cb_tavuk.setText("Tavuk Döner");
        cb_tavuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tavukActionPerformed(evt);
            }
        });

        cb_etdoner.setText("Et Döner");
        cb_etdoner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_etdonerActionPerformed(evt);
            }
        });

        cb_iskender.setText("İskender");
        cb_iskender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_iskenderActionPerformed(evt);
            }
        });

        txt_tavuk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_etdoner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_iskender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_burdursis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cb_burdursis.setText("Burdur Şiş");
        cb_burdursis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_burdursisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cb_tavuk, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tavuk, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cb_etdoner, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_etdoner, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cb_iskender, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_iskender, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cb_burdursis, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_burdursis, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_tavuk)
                    .addComponent(txt_tavuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_etdoner)
                    .addComponent(txt_etdoner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_iskender)
                    .addComponent(txt_iskender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_burdursis)
                    .addComponent(txt_burdursis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 41, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel2.setPreferredSize(new java.awt.Dimension(182, 126));

        cb_salgam.setText("Şalgam");
        cb_salgam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_salgamActionPerformed(evt);
            }
        });

        cb_soda.setText("Soda");
        cb_soda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_sodaActionPerformed(evt);
            }
        });

        cb_ayran.setText("Ayran");
        cb_ayran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ayranActionPerformed(evt);
            }
        });

        cb_kola.setText("Kola");
        cb_kola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_kolaActionPerformed(evt);
            }
        });

        txt_kola.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_ayran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_soda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_salgam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cb_salgam, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_salgam, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cb_kola, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_kola, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cb_ayran, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_ayran, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cb_soda, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_soda, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_kola)
                    .addComponent(txt_kola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_ayran)
                    .addComponent(txt_ayran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_soda)
                    .addComponent(txt_soda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_salgam)
                    .addComponent(txt_salgam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel3.setPreferredSize(new java.awt.Dimension(182, 138));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("İçecek");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Yiyecek");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Servis");

        lbl_icecek.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lbl_yiyecek.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lbl_servis.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jCheckBox1.setText("Servis Bedeli");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("KDV");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_yiyecek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_servis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_icecek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox2)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_icecek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_yiyecek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lbl_servis, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.setPreferredSize(new java.awt.Dimension(182, 126));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ara Toplam:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("KDV:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Genel Toplam:");

        lbl_aratoplam.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lbl_kdv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lbl_geneltoplam.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_aratoplam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_kdv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_geneltoplam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_aratoplam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_kdv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lbl_geneltoplam, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        txtarea_fatura.setColumns(20);
        txtarea_fatura.setRows(5);
        jScrollPane1.setViewportView(txtarea_fatura);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Fatura", jPanel7);

        b_delete.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        b_delete.setText("DEL");
        b_delete.setPreferredSize(new java.awt.Dimension(50, 50));
        b_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deleteActionPerformed(evt);
            }
        });

        b_c.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        b_c.setText("C");
        b_c.setPreferredSize(new java.awt.Dimension(50, 50));
        b_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cActionPerformed(evt);
            }
        });

        b_0.setText("0");
        b_0.setPreferredSize(new java.awt.Dimension(50, 50));
        b_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_0ActionPerformed(evt);
            }
        });

        b_7.setText("7");
        b_7.setPreferredSize(new java.awt.Dimension(50, 50));
        b_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_7ActionPerformed(evt);
            }
        });

        b_4.setText("4");
        b_4.setPreferredSize(new java.awt.Dimension(50, 50));
        b_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_4ActionPerformed(evt);
            }
        });

        b_6.setText("6");
        b_6.setPreferredSize(new java.awt.Dimension(50, 50));
        b_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_6ActionPerformed(evt);
            }
        });

        b_1.setText("1");
        b_1.setPreferredSize(new java.awt.Dimension(50, 50));
        b_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_1ActionPerformed(evt);
            }
        });

        b_8.setText("8");
        b_8.setPreferredSize(new java.awt.Dimension(50, 50));
        b_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_8ActionPerformed(evt);
            }
        });

        b_3.setText("3");
        b_3.setPreferredSize(new java.awt.Dimension(50, 50));
        b_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_3ActionPerformed(evt);
            }
        });

        b_5.setText("5");
        b_5.setPreferredSize(new java.awt.Dimension(50, 50));
        b_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_5ActionPerformed(evt);
            }
        });

        b_artieksi.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        b_artieksi.setText("+/-");
        b_artieksi.setPreferredSize(new java.awt.Dimension(50, 50));
        b_artieksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_artieksiActionPerformed(evt);
            }
        });

        b_9.setText("9");
        b_9.setPreferredSize(new java.awt.Dimension(50, 50));
        b_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_9ActionPerformed(evt);
            }
        });

        b_2.setText("2");
        b_2.setPreferredSize(new java.awt.Dimension(50, 50));
        b_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_2ActionPerformed(evt);
            }
        });

        b_esittir.setText("=");
        b_esittir.setPreferredSize(new java.awt.Dimension(50, 50));
        b_esittir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_esittirActionPerformed(evt);
            }
        });

        b_arti.setText("+");
        b_arti.setPreferredSize(new java.awt.Dimension(50, 50));
        b_arti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_artiActionPerformed(evt);
            }
        });

        b_nokta.setText(".");
        b_nokta.setPreferredSize(new java.awt.Dimension(50, 50));
        b_nokta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_noktaActionPerformed(evt);
            }
        });

        b_carpi.setText("*");
        b_carpi.setPreferredSize(new java.awt.Dimension(50, 50));
        b_carpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_carpiActionPerformed(evt);
            }
        });

        b_bolme.setText("/");
        b_bolme.setPreferredSize(new java.awt.Dimension(50, 50));
        b_bolme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_bolmeActionPerformed(evt);
            }
        });

        b_eksi.setText("-");
        b_eksi.setPreferredSize(new java.awt.Dimension(50, 50));
        b_eksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_eksiActionPerformed(evt);
            }
        });

        b_yuzde.setText("%");
        b_yuzde.setPreferredSize(new java.awt.Dimension(50, 50));
        b_yuzde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_yuzdeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(b_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_bolme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(b_nokta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_esittir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_yuzde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(b_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_artieksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(b_arti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(b_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_eksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(b_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_carpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txt_ekran))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(txt_ekran, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_artieksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_arti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_eksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_carpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_bolme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(b_esittir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b_yuzde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b_nokta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hesap Makinesi", jPanel8);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        btn_toplam.setText("TOPLAM");
        btn_toplam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_toplamActionPerformed(evt);
            }
        });

        btn_fatura.setText("FATURA");
        btn_fatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_faturaActionPerformed(evt);
            }
        });

        btn_sil.setText("SİL");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

        btn_kapat.setText("KAPAT");
        btn_kapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kapatActionPerformed(evt);
            }
        });

        btn_reset.setText("RESET");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btn_toplam)
                .addGap(67, 67, 67)
                .addComponent(btn_fatura)
                .addGap(67, 67, 67)
                .addComponent(btn_sil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(btn_reset)
                .addGap(63, 63, 63)
                .addComponent(btn_kapat)
                .addGap(74, 74, 74))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_toplam)
                    .addComponent(btn_fatura)
                    .addComponent(btn_sil)
                    .addComponent(btn_kapat)
                    .addComponent(btn_reset))
                .addGap(17, 17, 17))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("                   Restaurant Yönetim Sistemi");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_burdursisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_burdursisActionPerformed
        // TODO add your handling code here:
        yiyecek_hesap(txt_burdursis, cb_burdursis, 3);
    }//GEN-LAST:event_cb_burdursisActionPerformed

    private void cb_salgamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_salgamActionPerformed
        // TODO add your handling code here:
        icecek_hesap(txt_salgam, cb_salgam, 3);
    }//GEN-LAST:event_cb_salgamActionPerformed

    private void cb_kolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_kolaActionPerformed
        // TODO add your handling code here:
        icecek_hesap(txt_kola, cb_kola, 0);
    }//GEN-LAST:event_cb_kolaActionPerformed

    private void cb_tavukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tavukActionPerformed
        // TODO add your handling code here:
           yiyecek_hesap(txt_tavuk, cb_tavuk, 0);
           
  
        
    }//GEN-LAST:event_cb_tavukActionPerformed

    private void cb_etdonerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_etdonerActionPerformed
             yiyecek_hesap(txt_etdoner, cb_etdoner, 1);
        
                }//GEN-LAST:event_cb_etdonerActionPerformed

    private void cb_iskenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_iskenderActionPerformed
        // TODO add your handling code here:
        yiyecek_hesap(txt_iskender, cb_iskender, 2);
    }//GEN-LAST:event_cb_iskenderActionPerformed

    private void cb_ayranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ayranActionPerformed
        // TODO add your handling code here:
        icecek_hesap(txt_ayran, cb_ayran, 1);
        
    }//GEN-LAST:event_cb_ayranActionPerformed

    private void cb_sodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_sodaActionPerformed
        // TODO add your handling code here:
        icecek_hesap(txt_soda, cb_soda, 2);
    }//GEN-LAST:event_cb_sodaActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
     
         if(jCheckBox1.isSelected() ){
            lbl_servis.setEnabled(false);
            servis += (yiyecek_total + icecek_total )*0.1;
            lbl_servis.setText(String.format("%.2f TL",servis));
         }else{
             servis = 0;
             lbl_servis.setText("");
             kdv = 0;
             jCheckBox2.setSelected(false);
             lbl_kdv.setText("");
         }
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
       
            if(jCheckBox1.isSelected()==false){
                JOptionPane.showMessageDialog(null, "Önce Servis Bedelini Belirtin!");
                lbl_kdv.setText("");
                jCheckBox2.setSelected(false);
                return;
            }
            
       
        if( jCheckBox2.isSelected()){
        lbl_kdv.setEnabled(false);
        kdv+=(yiyecek_total + icecek_total )*0.18;
        lbl_kdv.setText(String.format("%.2f TL",kdv));
    }else{
            kdv = 0;
            lbl_kdv.setText("");
            lbl_aratoplam.setText("");
            lbl_geneltoplam.setText("");
            
            }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        lbl_aratoplam.setText("");
        lbl_geneltoplam.setText("");
        lbl_kdv.setText("");
        lbl_icecek.setText("");
        lbl_yiyecek.setText("");
        txt_kola.setText("");
        txt_ayran.setText("");
        txt_salgam.setText("");
        txt_soda.setText("");
        txt_burdursis.setText("");
        txt_etdoner.setText("");
        txt_tavuk.setText("");
        txt_iskender.setText("");
        cb_tavuk.setSelected(false);
        cb_burdursis.setSelected(false);
        cb_iskender.setSelected(false);
        cb_etdoner.setSelected(false);
        cb_kola.setSelected(false);
        cb_salgam.setSelected(false);
        cb_ayran.setSelected(false);
        cb_soda.setSelected(false);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        lbl_servis.setText("");
        txt_tavuk.setEnabled(true);
        txt_etdoner.setEnabled(true);
        txt_burdursis.setEnabled(true);
        txt_iskender.setEnabled(true);
        txt_ayran.setEnabled(true);
        txt_kola.setEnabled(true);
        txt_salgam.setEnabled(true);
        txt_soda.setEnabled(true);
        
        
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_toplamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_toplamActionPerformed
        // TODO add your handling code here:
        if(jCheckBox2.isSelected()){
          ara_toplam+=yiyecek_total+icecek_total+servis;
          lbl_aratoplam.setText(String.format("%.2f TL",ara_toplam));
          genel_toplam+=yiyecek_total+icecek_total+servis+kdv;
          lbl_geneltoplam.setText(String.format("%.2f TL",genel_toplam));
            
        }else{
            lbl_aratoplam.setText("");
            lbl_geneltoplam.setText("");
            JOptionPane.showMessageDialog(null, "Lütfen Önce KDV Hesaplatın!");
        }
        

       
    }//GEN-LAST:event_btn_toplamActionPerformed

    private void btn_kapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kapatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_btn_kapatActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        // TODO add your handling code here:
        sil(txt_kola);
        sil(txt_ayran);
        sil(txt_salgam);
        sil(txt_soda);
        sil(txt_tavuk);
        sil(txt_iskender);
        sil(txt_etdoner);
        sil(txt_burdursis);
        
        
        
    }//GEN-LAST:event_btn_silActionPerformed

    private void b_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cActionPerformed
        // TODO add your handling code here:
        firstnum =0 ; secondnum = 0 ; result = 0;
        operator = "";
       txt_ekran.setText("");
    }//GEN-LAST:event_b_cActionPerformed

    private void b_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deleteActionPerformed
        // TODO add your handling code here:
sil(txt_ekran);
    }//GEN-LAST:event_b_deleteActionPerformed
    
    private void b_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_4ActionPerformed
        // TODO add your handling code here:
                yazdir(b_4);
    }//GEN-LAST:event_b_4ActionPerformed

    private void b_bolmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_bolmeActionPerformed
        // TODO add your handling code here:
        islem("Bolme");
    }//GEN-LAST:event_b_bolmeActionPerformed

    private void b_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_8ActionPerformed
        yazdir(b_8);        // TODO add your handling code here:
    }//GEN-LAST:event_b_8ActionPerformed

    private void b_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_7ActionPerformed
        // TODO add your handling code here:
        yazdir(b_7);
    }//GEN-LAST:event_b_7ActionPerformed

    private void b_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_9ActionPerformed
        // TODO add your handling code here:
                yazdir(b_9);
    }//GEN-LAST:event_b_9ActionPerformed

    private void b_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_5ActionPerformed
        // TODO add your handling code here:
                yazdir(b_5);
    }//GEN-LAST:event_b_5ActionPerformed

    private void b_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_6ActionPerformed
        // TODO add your handling code here:
                yazdir(b_6);
    }//GEN-LAST:event_b_6ActionPerformed

    private void b_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_1ActionPerformed
        // TODO add your handling code here:
                yazdir(b_1);
    }//GEN-LAST:event_b_1ActionPerformed

    private void b_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_2ActionPerformed
        // TODO add your handling code here:
                yazdir(b_2);
    }//GEN-LAST:event_b_2ActionPerformed

    private void b_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_3ActionPerformed
        // TODO add your handling code here:
                yazdir(b_3);
    }//GEN-LAST:event_b_3ActionPerformed

    private void b_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_0ActionPerformed
        // TODO add your handling code here:
            if(txt_ekran.getText().equals("")){
                yazdir(b_0);
                return;
            }
            StringBuffer stb = new StringBuffer(txt_ekran.getText());
            if(stb.charAt(0) !='0' || stb.indexOf(".") != -1){
                 yazdir(b_0);
            }
                
    }//GEN-LAST:event_b_0ActionPerformed

    private void b_noktaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_noktaActionPerformed
        // TODO add your handling code here:
        StringBuffer stb = new StringBuffer(txt_ekran.getText());
        if(stb.indexOf(".") == -1){  //nokta yoksa
            stb.append(".");
            txt_ekran.setText(stb.toString());
        }

    }//GEN-LAST:event_b_noktaActionPerformed

    private void b_esittirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_esittirActionPerformed
        // TODO add your handling code here:
       secondnum = Double.parseDouble(txt_ekran.getText());
           if(operator.equals("Toplama")){
           result =firstnum + secondnum;}
           else if(operator.equals("Cikarma")){
                   result =firstnum - secondnum;
            }
            else if(operator.equals("Carpma")){
                   result =firstnum * secondnum;
                  
            }
            else if(operator.equals("Bolme")){
                   result =firstnum / secondnum;
            }
                   
             else if(operator.equals("Mod")){
                   result =firstnum % secondnum;
            }
       txt_ekran.setText(String.valueOf(result));
    }//GEN-LAST:event_b_esittirActionPerformed

    private void b_yuzdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_yuzdeActionPerformed
        // TODO add your handling code here:
islem("Mod");
    }//GEN-LAST:event_b_yuzdeActionPerformed

    private void b_carpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_carpiActionPerformed
        // TODO add your handling code here:
islem("Carpma");
    }//GEN-LAST:event_b_carpiActionPerformed

    private void b_eksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_eksiActionPerformed
        // TODO add your handling code here:
        islem("Cikarma");
    }//GEN-LAST:event_b_eksiActionPerformed

    private void b_artiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_artiActionPerformed
        // TODO add your handling code here:
     islem("Toplama");
    }//GEN-LAST:event_b_artiActionPerformed

    private void islem(String opt){
       firstnum = Double.parseDouble(txt_ekran.getText());
       operator = opt;
       txt_ekran.setText("");
    }
    private void b_artieksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_artieksiActionPerformed
        // TODO add your handling code here:
        try{
        double num = Double.parseDouble(txt_ekran.getText());
        num = -1 *num;
        txt_ekran.setText(String.valueOf(num));
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Sayısal Bir İfade Giriniz!");
            
        }
    }//GEN-LAST:event_b_artieksiActionPerformed

    private void btn_faturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_faturaActionPerformed
        // TODO add your handling code here:
        if(genel_toplam != 0){
            txtarea_fatura.append("Restaurant Yönetim Sistemi:  \n\n" + "Fatura Tarihi: \t"+ LocalDate.now() +"\n İçecek Fiyati : \t" + lbl_icecek.getText() +
             "\n Yiyecek Fiyatı: \t" +lbl_yiyecek.getText() + "\n KDV: \t\t" + lbl_kdv.getText() + "\n Genel Toplam: \t " + lbl_geneltoplam.getText() );
                    
            
           
        }else{
                JOptionPane.showMessageDialog(null, "Lütfen  ");
        }
    }//GEN-LAST:event_btn_faturaActionPerformed
        private void yiyecek_hesap(javax.swing.JTextField txt,javax.swing.JCheckBox cb,int fiyatindex){
        if( txt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Lütfen Bir Değer Giriniz!");
            cb.setSelected(false);
            return;
        }
        int yiyecek_adet;
        try{
        yiyecek_adet = Integer.parseInt(txt.getText());
        if(yiyecek_adet<0){
            JOptionPane.showMessageDialog(null, "Lütfen Sıfırdan Büyük Bir Değer Giriniz!");
            cb.setSelected(false);
            txt.setText("");
            return;

        }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Lütfen Sayısal Bir Değer Giriniz!");
            return;
        }

        if(cb.isSelected()  ){
            txt.setEnabled(false);
            yiyecek_total += yiyecek_adet * yiyecek_fiyat[fiyatindex];
            
        }else{
            txt.setEnabled(true);
            yiyecek_total -= yiyecek_adet * yiyecek_fiyat[fiyatindex];    }     

            lbl_yiyecek.setText(String.format("%.2f TL",yiyecek_total));
            
        }
        private void icecek_hesap(javax.swing.JTextField txt,javax.swing.JCheckBox cb,int fiyatindex){
             
             
            if( txt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Lütfen Bir Değer Giriniz!");
            cb.setSelected(false);
            return;
        }
            int icecek_adet=Integer.parseInt(txt.getText());
            if(cb.isSelected() ){
            txt.setEnabled(false);
            icecek_total += icecek_adet * icecek_fiyat[fiyatindex];
            
        }else{
            txt.setEnabled(true);
            icecek_total -= icecek_adet * icecek_fiyat[fiyatindex];    }     

            lbl_icecek.setText(String.format("%.2f TL",icecek_total));
            

        }
        private void sil (javax.swing.JTextField txt){
            StringBuffer stb = new StringBuffer (txt_ekran.getText());
            if(stb.length() >0){
                stb.deleteCharAt(stb.length()-1);
                txt_ekran.setText(stb.toString());
            }
     
        }
        private void yazdir(javax.swing.JButton btn){
           
            String tmp = txt_ekran.getText();
            tmp+=btn.getText();
            txt_ekran.setText(tmp);
        }
        
        private Double number;
        private String islem;
        private void hesapla(){
            if(number==null)
            {
                return;
            }
            Double last_number = Double.parseDouble(txt_ekran.getText());
            if(islem == "+"){
                txt_ekran.setText(Double.toString(number+last_number));
                number = number+last_number;
            }else if(islem == "-"){
                 txt_ekran.setText(Double.toString(number-last_number));
                number = number-last_number;
                
                
            }else if(islem=="/"){
                 txt_ekran.setText(Double.toString(number/last_number));
                number = number/last_number;
            }else if(islem=="%"){
                 txt_ekran.setText(Double.toString(number%last_number));
                number = number%last_number;
            }else if(islem=="*"){
                 txt_ekran.setText(Double.toString(number*last_number));
                number = number*last_number;
            }
            
        }
        
      
       
   
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
            java.util.logging.Logger.getLogger(Rys1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rys1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rys1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rys1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rys1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_0;
    private javax.swing.JButton b_1;
    private javax.swing.JButton b_2;
    private javax.swing.JButton b_3;
    private javax.swing.JButton b_4;
    private javax.swing.JButton b_5;
    private javax.swing.JButton b_6;
    private javax.swing.JButton b_7;
    private javax.swing.JButton b_8;
    private javax.swing.JButton b_9;
    private javax.swing.JButton b_arti;
    private javax.swing.JButton b_artieksi;
    private javax.swing.JButton b_bolme;
    private javax.swing.JButton b_c;
    private javax.swing.JButton b_carpi;
    private javax.swing.JButton b_delete;
    private javax.swing.JButton b_eksi;
    private javax.swing.JButton b_esittir;
    private javax.swing.JButton b_nokta;
    private javax.swing.JButton b_yuzde;
    private javax.swing.JButton btn_fatura;
    private javax.swing.JButton btn_kapat;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_sil;
    private javax.swing.JButton btn_toplam;
    private javax.swing.JCheckBox cb_ayran;
    private javax.swing.JCheckBox cb_burdursis;
    private javax.swing.JCheckBox cb_etdoner;
    private javax.swing.JCheckBox cb_iskender;
    private javax.swing.JCheckBox cb_kola;
    private javax.swing.JCheckBox cb_salgam;
    private javax.swing.JCheckBox cb_soda;
    private javax.swing.JCheckBox cb_tavuk;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_aratoplam;
    private javax.swing.JLabel lbl_geneltoplam;
    private javax.swing.JLabel lbl_icecek;
    private javax.swing.JLabel lbl_kdv;
    private javax.swing.JLabel lbl_servis;
    private javax.swing.JLabel lbl_yiyecek;
    private javax.swing.JTextField txt_ayran;
    private javax.swing.JTextField txt_burdursis;
    private javax.swing.JTextField txt_ekran;
    private javax.swing.JTextField txt_etdoner;
    private javax.swing.JTextField txt_iskender;
    private javax.swing.JTextField txt_kola;
    private javax.swing.JTextField txt_salgam;
    private javax.swing.JTextField txt_soda;
    private javax.swing.JTextField txt_tavuk;
    private javax.swing.JTextArea txtarea_fatura;
    // End of variables declaration//GEN-END:variables
}
