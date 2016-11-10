/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Index.java
 *
 * Created on 09 Nov 16, 23:52:02
 */

package sisfo;

import java.awt.CardLayout;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class Index extends javax.swing.JFrame {

    DefaultTableModel model;
    DefaultComboBoxModel  modelKegiatan;
    Object[][] semuaData;
    Object[] dataBaru, kolom, listKegiatan;

    DBSistem dataDBSistem = new DBSistem();
    List dataKegiatan = dataDBSistem.readKegiatan();
    List dataMahasiswa = dataDBSistem.readMahasiswa();
    
    /** Creates new form Index */
    public Index() throws IOException {
        initComponents();
        
        //LIST Combobox Kegiatan
        DefaultComboBoxModel listKegiatan = new DefaultComboBoxModel();

        String[] row0 = null;

        for (Object object : dataKegiatan) {
            row0 = (String[]) object;
            listKegiatan.addElement(row0[1]);
        }
        kegiatanMahasiswa.setModel(listKegiatan);

        //MEMBUAT TABLE Kegiatan
        kolom = new Object[]{"No","NAMA KEGIATAN"};
        semuaData = new Object[][]{};

            model = new DefaultTableModel(semuaData, kolom);
            tabelKegiatan.setModel(model);

            //READ DATA CSV Kegiatan
            String[] row1 = null;
//            List dataKegiatan = dataDBSistem.readKegiatan();

            for (Object object : dataKegiatan) {
                row1 = (String[]) object;

                //Nambah Data di Tabel
                Object[] rowKegiatan = {row1[0], row1[1]};
                DefaultTableModel dataTable = (DefaultTableModel) tabelKegiatan.getModel();
                dataTable.addRow(rowKegiatan);
            }

        //MEMBUAT TABLE Mahasiswa
            kolom = new Object[]{"NIM","NAMA","ALAMAT","KEGIATAN"};
            semuaData = new Object[][]{};

            model = new DefaultTableModel(semuaData, kolom);
            table.setModel(model);

            //READ DATA CSV Mahasiswa
            String[] row2 = null;

            for (Object object1 : dataMahasiswa) {
                row2 = (String[]) object1;

                //Nambah Data di Tabel
                Object[] rowMahasiswa = {row2[0], row2[1], row2[2], row2[3]};
                DefaultTableModel dataTable = (DefaultTableModel) table.getModel();
                dataTable.addRow(rowMahasiswa);
            }

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        card2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        namaMahasiswa = new javax.swing.JTextField();
        nimMahasiswa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatMahasiswa = new javax.swing.JTextArea();
        kegiatanMahasiswa = new javax.swing.JComboBox();
        simpan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        card1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        namaKegiatan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelKegiatan = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        card2.setLayout(null);

        jLabel5.setText("Nama");
        card2.add(jLabel5);
        jLabel5.setBounds(20, 60, 70, 14);

        namaMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaMahasiswaActionPerformed(evt);
            }
        });
        card2.add(namaMahasiswa);
        namaMahasiswa.setBounds(80, 60, 170, 20);
        card2.add(nimMahasiswa);
        nimMahasiswa.setBounds(80, 90, 170, 20);

        jLabel3.setText("Alamat");
        card2.add(jLabel3);
        jLabel3.setBounds(270, 60, 60, 14);

        jLabel7.setText("Kegiatan");
        card2.add(jLabel7);
        jLabel7.setBounds(20, 120, 90, 14);

        table.setAutoCreateRowSorter(true);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.setEnabled(false);
        jScrollPane2.setViewportView(table);

        card2.add(jScrollPane2);
        jScrollPane2.setBounds(20, 160, 480, 280);

        alamatMahasiswa.setColumns(20);
        alamatMahasiswa.setRows(5);
        jScrollPane1.setViewportView(alamatMahasiswa);

        card2.add(jScrollPane1);
        jScrollPane1.setBounds(320, 60, 180, 50);

        kegiatanMahasiswa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        card2.add(kegiatanMahasiswa);
        kegiatanMahasiswa.setBounds(80, 120, 170, 20);

        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        card2.add(simpan);
        simpan.setBounds(320, 120, 180, 23);

        jLabel4.setText("NIM");
        card2.add(jLabel4);
        jLabel4.setBounds(20, 90, 70, 14);

        jLabel6.setText("DATA MAHASISWA");
        card2.add(jLabel6);
        jLabel6.setBounds(220, 20, 170, 14);

        mainPanel.add(card2, "card2");

        jLabel2.setText("Kegiatan");

        jLabel1.setText("KEGIATAN MAHASISWA");

        namaKegiatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaKegiatanActionPerformed(evt);
            }
        });

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabelKegiatan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelKegiatan.setEnabled(false);
        jScrollPane3.setViewportView(tabelKegiatan);

        javax.swing.GroupLayout card1Layout = new javax.swing.GroupLayout(card1);
        card1.setLayout(card1Layout);
        card1Layout.setHorizontalGroup(
            card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card1Layout.createSequentialGroup()
                .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(card1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(namaKegiatan)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(card1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel1)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        card1Layout.setVerticalGroup(
            card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaKegiatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        mainPanel.add(card1, "card1");

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Kegiatan");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Mahasiswa");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Exit");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "card1");
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "card1");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "card2");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void namaMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaMahasiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaMahasiswaActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        //Mengambil Data Dari Form
        // String namaString = VariableName.getText().toString();
        String strMahasiswa = namaMahasiswa.getText().toString();
        String strNim       = nimMahasiswa.getText().toString();
        String strAlamat    = alamatMahasiswa.getText().toString();
        String strKegiatan  = (String)kegiatanMahasiswa.getSelectedItem();  //Mengambil data dari ComboBox

        //READ DATA CSV Mahasiswa
        String[] row3 = null;
        int selesai = 0;
        for (Object object1 : dataMahasiswa) {
            row3 = (String[]) object1;
            if(selesai == 0)
            {
                if(strNim.equals(row3[0]))
                {
                    selesai = 1;
                }
            }
        }


        //Filter apakah Nama Mahasiswa, Nim atau alamat kosong atau tidak
        if (strMahasiswa == null || strMahasiswa.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Nama Mahasiswa Tidak Boleh Kosong", "Alert", JOptionPane.ERROR_MESSAGE);
        }
        else if (strNim == null || strNim.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "NIM Mahasiswa Tidak Boleh Kosong", "Alert", JOptionPane.ERROR_MESSAGE);
        }
        else if (selesai == 1)
        {
            JOptionPane.showMessageDialog(null, "NIM Mahasiswa sudah ada", "Alert", JOptionPane.ERROR_MESSAGE);
        }
        else if (strAlamat == null || strAlamat.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Alamat Mahasiswa Tidak Boleh Kosong", "Alert", JOptionPane.ERROR_MESSAGE);
        }
        else{
            //Nambah Data di Tabel
            Object[] row = { strNim, strMahasiswa, strAlamat, strKegiatan };
            DefaultTableModel dataTable = (DefaultTableModel) table.getModel();
            dataTable.addRow(row);

            //Script Input ke Kegiatan
            String dataBaru = strNim + ";" + strMahasiswa + "," + strAlamat + "," + strKegiatan;
            try {
                DBSistem.writeMahasiswa(dataBaru);
            } catch (Exception ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        

    }//GEN-LAST:event_simpanActionPerformed

    private void namaKegiatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaKegiatanActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_namaKegiatanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // String namaString = VariableName.getText().toString();
        String strKegiatan  = namaKegiatan.getText().toString();
        int last_data = tabelKegiatan.getRowCount() + 1;

        //Filter apakah Nama Mahasiswa, Nim atau alamat kosong atau tidak
        if (strKegiatan == null || strKegiatan.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Kegiatan Tidak Boleh Kosong", "Alert", JOptionPane.ERROR_MESSAGE);
        }
        else{
            //Nambah Data di Tabel
            Object[] row = { last_data, strKegiatan };
            DefaultTableModel dataTable = (DefaultTableModel) tabelKegiatan.getModel();
            dataTable.addRow(row);

            //Script Input ke Kegiatan
            String dataBaru = last_data + ";" + strKegiatan;
            try {
                DBSistem.writeKegiatan(dataBaru);
            } catch (Exception ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Namabah List Kegiatan di CheckBox
            DBSistem dataDBSistem = new DBSistem();
            List dataKegiatan = null;
            try {
                dataKegiatan = dataDBSistem.readKegiatan();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            }

            DefaultComboBoxModel listKegiatan = new DefaultComboBoxModel();

            String[] row0 = null;

            for (Object object : dataKegiatan) {
                row0 = (String[]) object;
                listKegiatan.addElement(row0[1]);
            }
            kegiatanMahasiswa.setModel(listKegiatan);
        }
}//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Index().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatMahasiswa;
    private javax.swing.JPanel card1;
    private javax.swing.JPanel card2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox kegiatanMahasiswa;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField namaKegiatan;
    private javax.swing.JTextField namaMahasiswa;
    private javax.swing.JTextField nimMahasiswa;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabelKegiatan;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
