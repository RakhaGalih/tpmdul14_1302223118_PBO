/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modul12_1302223118_gui;

import modul12_1302223118_gui.JDBC;
import modul12_1302223118_gui.Mahasiswa;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author rakha
 */
public class GUI extends javax.swing.JFrame {

    ArrayList<Mahasiswa> mahasiswaArrayList = new ArrayList<>();
    private Mahasiswa selectedMahasiswa;
    DefaultListModel<String> mhsListModel = new DefaultListModel<>();

    /**
     * Creates new form GUI
     */
    public GUI() {

        initComponents();
        EditButton.setVisible(false);
        hapusButton.setVisible(false);
        mahasiswaList.setModel(mhsListModel);
        refreshData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupProdi = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mahasiswaList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nimLabel = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        prodiLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        EditButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NIMTextField = new javax.swing.JTextField();
        namaTextField = new javax.swing.JTextField();
        IFRadioButton = new javax.swing.JRadioButton();
        SERadioButton = new javax.swing.JRadioButton();
        ITRadioButton = new javax.swing.JRadioButton();
        DSRadioButton = new javax.swing.JRadioButton();
        simpanButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mahasiswaList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        mahasiswaList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mahasiswaListMouseClicked(evt);
            }
        });
        mahasiswaList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                mahasiswaListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(mahasiswaList);

        jLabel1.setText("Detail Mahasiswa");

        jLabel2.setText("NIM :");

        jLabel3.setText("Nama :");

        refreshButton.setText("Perbarui Daftar");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Prodi :");

        nimLabel.setText("NIM");

        namaLabel.setText("Nama");

        prodiLabel.setText("Prodi");

        jLabel5.setText("© Rakha - 1302223118");

        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namaLabel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prodiLabel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(nimLabel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(EditButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hapusButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nimLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(namaLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(prodiLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditButton)
                            .addComponent(hapusButton))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshButton)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Daftar Mahasiswa", jPanel2);

        jLabel6.setText("© Rakha - 1302223118");

        jLabel7.setText("NIM :");

        jLabel8.setText("Nama :");

        jLabel9.setText("Prodi :");

        buttonGroupProdi.add(IFRadioButton);
        IFRadioButton.setText("IF");

        buttonGroupProdi.add(SERadioButton);
        SERadioButton.setText("SE");

        buttonGroupProdi.add(ITRadioButton);
        ITRadioButton.setText("IT");

        buttonGroupProdi.add(DSRadioButton);
        DSRadioButton.setText("DS");

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(IFRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(SERadioButton))
                            .addComponent(namaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(NIMTextField)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ITRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(DSRadioButton))
                            .addComponent(simpanButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 56, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(NIMTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(IFRadioButton)
                        .addComponent(SERadioButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ITRadioButton)
                    .addComponent(DSRadioButton))
                .addGap(18, 18, 18)
                .addComponent(simpanButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Input Mahasiswa", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        // TODO add your handling code here:
        String NIM = NIMTextField.getText();
        String nama = namaTextField.getText();
        String prodi = "";
        if (IFRadioButton.isSelected()) {
            prodi = "IF";
        } else if (SERadioButton.isSelected()) {
            prodi = "SE";
        } else if (ITRadioButton.isSelected()) {
            prodi = "IT";
        } else if (DSRadioButton.isSelected()) {
            prodi = "DS";
        }

        if (!NIM.isEmpty() && !nama.isEmpty() && !prodi.isEmpty()) {
            Mahasiswa mhs = new Mahasiswa(NIM, nama, prodi);
            JDBC.insertMahasiswa(mhs);
            refreshData();
            NIMTextField.setText("");
            namaTextField.setText("");
            buttonGroupProdi.clearSelection();
        } else {
            // Tampilkan pesan error jika data tidak lengkap
            javax.swing.JOptionPane.showMessageDialog(this, "Data tidak lengkap!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        refreshData();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void refreshData() {
        mahasiswaArrayList = JDBC.fetchDataMahasiswa();
        mhsListModel.clear();  // Clear the model before adding new data
        for (Mahasiswa mhs : mahasiswaArrayList) {
            mhsListModel.addElement(mhs.getNama());
        }
    }

    private void mahasiswaListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mahasiswaListMouseClicked
        // TODO add your handling code here:
        int selectedIndex = mahasiswaList.getSelectedIndex();
        System.out.println(selectedIndex);
        if (selectedIndex != -1) {
            EditButton.setVisible(true);
            hapusButton.setVisible(true);
            selectedMahasiswa = mahasiswaArrayList.get(selectedIndex);
            nimLabel.setText(selectedMahasiswa.getNim());
            System.out.println(selectedIndex);
            namaLabel.setText(selectedMahasiswa.getNama());
            prodiLabel.setText(selectedMahasiswa.getProdi());
        }
    }//GEN-LAST:event_mahasiswaListMouseClicked

    private void mahasiswaListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_mahasiswaListValueChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_mahasiswaListValueChanged

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        // TODO add your handling code here:
        if (selectedMahasiswa != null) {
            EditDialog ed = new EditDialog(this, true, selectedMahasiswa);
            ed.setVisible(true);
            refreshData();
        }
    }//GEN-LAST:event_EditButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        // TODO add your handling code here:
        if (selectedMahasiswa != null) {
            String nim = selectedMahasiswa.getNim();
            JDBC.deleteMahasiswa(nim);
            refreshData();
        }
    }//GEN-LAST:event_hapusButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton DSRadioButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JRadioButton IFRadioButton;
    private javax.swing.JRadioButton ITRadioButton;
    private javax.swing.JTextField NIMTextField;
    private javax.swing.JRadioButton SERadioButton;
    private javax.swing.ButtonGroup buttonGroupProdi;
    private javax.swing.JButton hapusButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> mahasiswaList;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JLabel nimLabel;
    private javax.swing.JLabel prodiLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton simpanButton;
    // End of variables declaration//GEN-END:variables
}
