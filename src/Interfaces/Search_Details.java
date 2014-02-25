/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.ConnectionClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Thilina
 */
public class Search_Details extends javax.swing.JFrame {

    /**
     * Creates new form Search_Details
     */
    public Search_Details() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBooks = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rBookcat = new javax.swing.JRadioButton();
        rBookname = new javax.swing.JRadioButton();
        rBookcode = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbCat = new javax.swing.JComboBox();
        txtBname = new javax.swing.JTextField();
        txtBcode = new javax.swing.JTextField();
        btncatSearch = new javax.swing.JButton();
        btnBnameSearch = new javax.swing.JButton();
        btnBisbnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        jLabel1.setText("SEARCH BOOKS");

        tableBooks.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableBooks);

        btnBack.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        btnBack.setText("< < BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(464, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jLabel2.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        jLabel2.setText("Search book by : ");

        rBookcat.setText("Book Catageory");
        rBookcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBookcatActionPerformed(evt);
            }
        });

        rBookname.setText("Book Name");
        rBookname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBooknameActionPerformed(evt);
            }
        });

        rBookcode.setText("Book ISBN");
        rBookcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBookcodeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Vani", 1, 11)); // NOI18N
        jLabel3.setText("Book Catagoery");

        jLabel4.setFont(new java.awt.Font("Vani", 1, 11)); // NOI18N
        jLabel4.setText("Book Name");

        jLabel5.setFont(new java.awt.Font("Vani", 1, 11)); // NOI18N
        jLabel5.setText("Book ISBN");

        cmbCat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Java", "PHP" }));

        txtBname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBnameActionPerformed(evt);
            }
        });

        btncatSearch.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        btncatSearch.setText("Search");
        btncatSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncatSearchActionPerformed(evt);
            }
        });

        btnBnameSearch.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        btnBnameSearch.setText("Serach");
        btnBnameSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBnameSearchActionPerformed(evt);
            }
        });

        btnBisbnSearch.setFont(new java.awt.Font("Vani", 1, 12)); // NOI18N
        btnBisbnSearch.setText("Search");
        btnBisbnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBisbnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtBcode)
                                            .addComponent(txtBname)
                                            .addComponent(cmbCat, 0, 200, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btncatSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnBnameSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnBisbnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rBookcat)
                                                .addGap(52, 52, 52)
                                                .addComponent(rBookname)
                                                .addGap(60, 60, 60)
                                                .addComponent(rBookcode)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(519, 519, 519))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rBookcat)
                            .addComponent(rBookname)
                            .addComponent(rBookcode))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btncatSearch)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBnameSearch)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtBcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBisbnSearch)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBnameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        WelComePage welpage = new WelComePage();
        welpage.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btncatSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncatSearchActionPerformed
        // Search by book categoery
        this.SearchBooks();
    }//GEN-LAST:event_btncatSearchActionPerformed

    private void btnBnameSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBnameSearchActionPerformed
        // Search by book name
        this.SearchBooksName();
    }//GEN-LAST:event_btnBnameSearchActionPerformed

    private void btnBisbnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBisbnSearchActionPerformed
        // Search by book ISBN
        this.SearchBookISBN();
    }//GEN-LAST:event_btnBisbnSearchActionPerformed

    private void rBookcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBookcatActionPerformed
        if (rBookcat.isSelected() == true) {
            cmbCat.setEnabled(true);
            btncatSearch.setEnabled(true);
            txtBcode.setEnabled(false);
            txtBname.setEnabled(false);
            btnBisbnSearch.setEnabled(false);
            btnBnameSearch.setEnabled(false);
            rBookname.setSelected(false);
            rBookcode.setSelected(false);

        }
    }//GEN-LAST:event_rBookcatActionPerformed

    private void rBooknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBooknameActionPerformed
        if (rBookname.isSelected() == true) {
            txtBcode.setEnabled(false);
            txtBname.setEnabled(true);
            btnBisbnSearch.setEnabled(false);
            btnBnameSearch.setEnabled(true);
            btncatSearch.setEnabled(false);
            cmbCat.setEnabled(false);
            rBookcat.setSelected(false);
            rBookcode.setSelected(false);
        }
    }//GEN-LAST:event_rBooknameActionPerformed

    private void rBookcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBookcodeActionPerformed
        if (rBookcode.isSelected() == true) {
            txtBcode.setEnabled(true);
            txtBname.setEnabled(false);
            btnBisbnSearch.setEnabled(true);
            btnBnameSearch.setEnabled(false);
            cmbCat.setEnabled(false);
            btncatSearch.setEnabled(false);
            rBookcat.setSelected(false);
            rBookname.setSelected(false);
        }
    }//GEN-LAST:event_rBookcodeActionPerformed

    /*Search by Book Type*/
    public void SearchBooks() {
        try {
            ResultSet rs = null;
            ConnectionClass connection = new ConnectionClass();
            Connection c = connection.getConnection();
            String val = cmbCat.getSelectedItem().toString();
            String sql = "select * from books where BookCatag='" + val + "' ";
            PreparedStatement pst = c.prepareStatement(sql);
            rs = pst.executeQuery();
            tableBooks.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            Logger.getLogger(Delete_Update.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*Search By Author Name*/
    public void SearchBookISBN() {
        try {
            ResultSet rs = null;
            String ISBN = txtBcode.getText();
            ConnectionClass connection = new ConnectionClass();
            Connection c = connection.getConnection();

            String sql = "select * from books where ISBN='" + ISBN + "' ";
            PreparedStatement pst = c.prepareStatement(sql);
            rs = pst.executeQuery();
            tableBooks.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            Logger.getLogger(Delete_Update.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    /*Search by Book Name*/

    public void SearchBooksName() {
        try {
            ResultSet rs = null;
            String bookName = txtBname.getText();
            ConnectionClass connection = new ConnectionClass();
            Connection c = connection.getConnection();

            String sql = "select * from books where BookName='" + bookName + "' ";
            PreparedStatement pst = c.prepareStatement(sql);
            rs = pst.executeQuery();
            tableBooks.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            Logger.getLogger(Delete_Update.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void clear() {

        txtBcode.setText("");
        txtBname.setText("");

    }

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
            java.util.logging.Logger.getLogger(Search_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBisbnSearch;
    private javax.swing.JButton btnBnameSearch;
    private javax.swing.JButton btncatSearch;
    private javax.swing.JComboBox cmbCat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rBookcat;
    private javax.swing.JRadioButton rBookcode;
    private javax.swing.JRadioButton rBookname;
    private javax.swing.JTable tableBooks;
    private javax.swing.JTextField txtBcode;
    private javax.swing.JTextField txtBname;
    // End of variables declaration//GEN-END:variables
}
