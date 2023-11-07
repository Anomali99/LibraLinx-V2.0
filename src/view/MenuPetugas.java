/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.DaoPetugas;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import parsisten.Peminjam;
import parsisten.Petugas;
import servis.ServicePetugas;
import tableModel.TabelPetugas;

/**
 *
 * @author fatiq
 */
public class MenuPetugas extends javax.swing.JPanel {

    /**
     * Creates new form Dasbor
     */
    private ServicePetugas servis = new DaoPetugas();
    private TabelPetugas tbl = new TabelPetugas();
    
    public MenuPetugas(){
        initComponents();        
        tbl_conten.setModel(tbl);
        loadData();
        setColWidht();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_conten = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_conten = new javax.swing.JTable();
        btn_tambah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbx_cari = new javax.swing.JComboBox<>();
        tf_cari = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        btn_kta = new javax.swing.JButton();

        pn_conten.setBackground(new java.awt.Color(255, 255, 255));

        tbl_conten.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_conten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_contenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_conten);

        btn_tambah.setBackground(new java.awt.Color(68, 50, 124));
        btn_tambah.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_tambah.setForeground(new java.awt.Color(68, 50, 124));
        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tambah1.png"))); // NOI18N
        btn_tambah.setText("TAMBAH");
        btn_tambah.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_tambahMouseMoved(evt);
            }
        });
        btn_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_tambahMouseExited(evt);
            }
        });
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_hapus.setBackground(new java.awt.Color(200, 0, 0));
        btn_hapus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_hapus.setForeground(new java.awt.Color(200, 0, 0));
        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hapus1.png"))); // NOI18N
        btn_hapus.setText("HAPUS");
        btn_hapus.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_hapusMouseMoved(evt);
            }
        });
        btn_hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_hapusMouseExited(evt);
            }
        });
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_batal.setBackground(new java.awt.Color(180, 160, 59));
        btn_batal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_batal.setForeground(new java.awt.Color(180, 160, 59));
        btn_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/batal1.png"))); // NOI18N
        btn_batal.setText("BATAL");
        btn_batal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_batalMouseMoved(evt);
            }
        });
        btn_batal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_batalMouseExited(evt);
            }
        });
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/petugas.png"))); // NOI18N
        jLabel1.setText("Data Petugas Perpustakaan");

        cbx_cari.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cbx_cari.setForeground(new java.awt.Color(204, 204, 204));
        cbx_cari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "NAMA", "ALAMAT" }));
        cbx_cari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tf_cari.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tf_cari.setForeground(new java.awt.Color(204, 204, 204));
        tf_cari.setText("Cari");
        tf_cari.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        tf_cari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_cariFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_cariFocusLost(evt);
            }
        });

        btn_cari.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cari.png"))); // NOI18N
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        btn_kta.setBackground(new java.awt.Color(0, 200, 0));
        btn_kta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_kta.setForeground(new java.awt.Color(0, 200, 0));
        btn_kta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kartu.png"))); // NOI18N
        btn_kta.setText("KTA");
        btn_kta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_ktaMouseMoved(evt);
            }
        });
        btn_kta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ktaMouseExited(evt);
            }
        });
        btn_kta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ktaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_contenLayout = new javax.swing.GroupLayout(pn_conten);
        pn_conten.setLayout(pn_contenLayout);
        pn_contenLayout.setHorizontalGroup(
            pn_contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_contenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pn_contenLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_contenLayout.createSequentialGroup()
                        .addComponent(btn_tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_hapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_batal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_kta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pn_contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbx_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn_contenLayout.createSequentialGroup()
                                .addComponent(tf_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        pn_contenLayout.setVerticalGroup(
            pn_contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_contenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pn_contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_contenLayout.createSequentialGroup()
                        .addGroup(pn_contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_tambah)
                        .addComponent(btn_hapus)
                        .addComponent(btn_batal)
                        .addComponent(btn_kta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_conten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_conten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseMoved
        btn_tambah.setForeground(Color.white);
        ImageIcon icon;
        if(btn_tambah.getText().equalsIgnoreCase("UBAH"))
            icon = new ImageIcon(getClass().getResource("/img/edit.png"));
        else
            icon = new ImageIcon(getClass().getResource("/img/tambah.png"));
        btn_tambah.setIcon(icon);
    }//GEN-LAST:event_btn_tambahMouseMoved

    private void btn_tambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tambahMouseExited
        btn_tambah.setForeground(new Color(68,50,124));
        ImageIcon icon;
        if(btn_tambah.getText().equalsIgnoreCase("UBAH"))
            icon = new ImageIcon(getClass().getResource("/img/edit1.png"));
        else
            icon = new ImageIcon(getClass().getResource("/img/tambah1.png"));
        btn_tambah.setIcon(icon);
        jLabel1.requestFocus();
    }//GEN-LAST:event_btn_tambahMouseExited

    private void btn_hapusMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseMoved
        btn_hapus.setForeground(Color.white);
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/hapus.png"));
        btn_hapus.setIcon(icon);
    }//GEN-LAST:event_btn_hapusMouseMoved

    private void btn_hapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hapusMouseExited
        btn_hapus.setForeground(new Color(200,0,0));
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/hapus1.png"));
        btn_hapus.setIcon(icon);
    }//GEN-LAST:event_btn_hapusMouseExited

    private void btn_batalMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_batalMouseMoved
        btn_batal.setForeground(Color.white);
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/batal.png"));
        btn_batal.setIcon(icon);
    }//GEN-LAST:event_btn_batalMouseMoved

    private void btn_batalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_batalMouseExited
        btn_batal.setForeground(new Color(180,160,59));
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/batal1.png"));
        btn_batal.setIcon(icon);
    }//GEN-LAST:event_btn_batalMouseExited

    private void tf_cariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_cariFocusGained
        if(tf_cari.getText().equals("Cari")||tf_cari.getText().equalsIgnoreCase(""))
            tf_cari.setText("");
    }//GEN-LAST:event_tf_cariFocusGained

    private void tf_cariFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_cariFocusLost
        if(tf_cari.getText().equals("Cari")||tf_cari.getText().equalsIgnoreCase(""))
            tf_cari.setText("Cari");
    }//GEN-LAST:event_tf_cariFocusLost

    private void tbl_contenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_contenMouseClicked
        if(btn_tambah.getText().equalsIgnoreCase("TAMBAH")){
            btn_tambah.setText("UBAH");
            ImageIcon icon = new ImageIcon(getClass().getResource("/img/edit1.png"));
            btn_tambah.setIcon(icon);
        }
        btn_hapus.setVisible(true);
        btn_batal.setVisible(true);
//        btn_kta.setVisible(true);
    }//GEN-LAST:event_tbl_contenMouseClicked

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        loadData();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        String s = (String) tbl_conten.getValueAt(tbl_conten.getSelectedRow(), 1);
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/hapus1.png"));
        if(JOptionPane.showConfirmDialog(null, "Menghapus petugas dengan ID "+s, "Apakah anda yakin", 0, 0, icon)==0)
            servis.hapusData((String) tbl_conten.getValueAt(tbl_conten.getSelectedRow(), 1));
        loadData();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        if(btn_tambah.getText().equalsIgnoreCase("UBAH"))
            new TambahPetugas(null,true,(String) tbl_conten.getValueAt(tbl_conten.getSelectedRow(), 1)).setVisible(true);
        else 
            new TambahPetugas(null,true).setVisible(true);
            
        loadData();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        String sc = tf_cari.getText();
        List<Petugas> list = new ArrayList();
        switch (cbx_cari.getSelectedIndex()){
            case 0: 
                list = servis.getByID(sc);
                break;
            case 1:
                list = servis.getByNama(sc);
                break;
            case 2:
                list = servis.getByAlamat(sc);
                break;
        }
        tbl.setData(list);
    }//GEN-LAST:event_btn_cariActionPerformed

    private void btn_ktaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ktaActionPerformed
        String id = (String) tbl_conten.getValueAt(tbl_conten.getSelectedRow(), 1);
        String email = (String) tbl_conten.getValueAt(tbl_conten.getSelectedRow(), 8);
        new KartuAnggota(null,true,id,email).setVisible(true);
        loadData();
    }//GEN-LAST:event_btn_ktaActionPerformed

    private void btn_ktaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ktaMouseExited
        btn_kta.setForeground(new Color(0,200,0));
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/kartu.png"));
        btn_kta.setIcon(icon);
    }//GEN-LAST:event_btn_ktaMouseExited

    private void btn_ktaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ktaMouseMoved
        btn_kta.setForeground(Color.white);
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/kartu1.png"));
        btn_kta.setIcon(icon);
    }//GEN-LAST:event_btn_ktaMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_kta;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JComboBox<String> cbx_cari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pn_conten;
    private javax.swing.JTable tbl_conten;
    private javax.swing.JTextField tf_cari;
    // End of variables declaration//GEN-END:variables
   
    private void setColWidht() {
        int[] noCol = {0,1,2,5,6,7};
        int[] noColW = {35,70,150,120,30,70};
        
        TableColumnModel tblModel = tbl_conten.getColumnModel();
        for(int i = 0; i < noCol.length; i++){
        tblModel.getColumn(noCol[i]).setPreferredWidth(noColW[i]);
        tblModel.getColumn(noCol[i]).setMaxWidth(noColW[i]);
        tblModel.getColumn(noCol[i]).setMinWidth(noColW[i]);
        }
    }

    private void loadData() {
        List<Petugas> list = servis.ambilData();
        tbl.setData(list);
        if(btn_tambah.getText().equalsIgnoreCase("UBAH")){
            btn_tambah.setText("TAMBAH");
            ImageIcon icon = new ImageIcon(getClass().getResource("/img/tambah1.png"));
            btn_tambah.setIcon(icon);
        }
        btn_hapus.setVisible(false);
        btn_batal.setVisible(false);
        btn_kta.setVisible(false);
        jLabel1.requestFocus();
    }
}
