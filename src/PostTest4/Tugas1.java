/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostTest4;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author warung pak sabar
 */
public class Tugas1 extends javax.swing.JFrame {

    /**
     * Creates new form Tugas1
     */
    public Tugas1() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        kg = new javax.swing.JLabel();
        berat = new javax.swing.JTextField();
        panel = new javax.swing.JPanel();
        diskon = new javax.swing.JLabel();
        aturan = new javax.swing.JSlider();
        persen = new javax.swing.JLabel();
        jasa = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        e1 = new javax.swing.JRadioButton();
        proses = new javax.swing.JButton();
        ulang = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        k = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM PELANGGAN LOUNDRY YUUHUUU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA");

        nama.setText("NAMA");
        nama.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                namaCaretUpdate(evt);
            }
        });
        nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                namaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                namaKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NO.TELEPON");

        no.setText("NO");
        no.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                noCaretUpdate(evt);
            }
        });
        no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                noKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                noKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BERAT BARANG");

        kg.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        kg.setForeground(new java.awt.Color(255, 255, 255));
        kg.setText("KG");

        berat.setText("0");
        berat.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                beratCaretUpdate(evt);
            }
        });
        berat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                beratKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(no)
                        .addComponent(jLabel2)
                        .addComponent(nama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(berat, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kg)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kg)
                    .addComponent(berat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panel.setBackground(new java.awt.Color(51, 51, 51));

        diskon.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        diskon.setForeground(new java.awt.Color(255, 255, 255));
        diskon.setText("ATURAN DISKON");

        aturan.setMajorTickSpacing(10);
        aturan.setPaintLabels(true);
        aturan.setPaintTicks(true);
        aturan.setValue(0);

        persen.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        persen.setForeground(new java.awt.Color(255, 255, 255));
        persen.setText("0%");

        jasa.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jasa.setForeground(new java.awt.Color(255, 255, 255));
        jasa.setText("JENIS JASA");

        buttonGroup1.add(r1);
        r1.setText("Reguler");

        buttonGroup1.add(e1);
        e1.setText("Express");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(r1)
                        .addGap(30, 30, 30)
                        .addComponent(e1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(diskon)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jasa))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(aturan, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(persen)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(diskon)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aturan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(persen)))
                .addGap(18, 18, 18)
                .addComponent(jasa)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1)
                    .addComponent(e1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        proses.setText("PROSES");
        proses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                prosesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                prosesMouseReleased(evt);
            }
        });
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });

        ulang.setText("ULANGI");
        ulang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ulangMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ulangMouseReleased(evt);
            }
        });
        ulang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulangActionPerformed(evt);
            }
        });

        keluar.setText("KELUAR");
        keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                keluarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                keluarMouseReleased(evt);
            }
        });
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        k.setBackground(new java.awt.Color(204, 204, 204));
        k.setColumns(20);
        k.setRows(5);
        jScrollPane2.setViewportView(k);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(proses)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ulang)
                        .addGap(335, 335, 335)
                        .addComponent(keluar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keluar)
                    .addComponent(ulang)
                    .addComponent(proses)))
        );

        setSize(new java.awt.Dimension(590, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void ulangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulangActionPerformed
        // TODO add your handling code here:
     
        nama.setText("");
        no.setText("");
        berat.setText("");
        aturan.setValue(0);
        kg.setText("");
        persen.setText("");
        k.setText("");
        buttonGroup1.clearSelection();
        aturan.setValue(0);
       
    }//GEN-LAST:event_ulangActionPerformed

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
        // TODO add your handling code here:
       String nama1,no1,js = null;
       int aturan1;
       float berat1;
       double total1 = 0;
       nama1 = nama.getText();
       no1 = no.getText();
       aturan1 = aturan.getValue();
       berat1 = Float.parseFloat(berat.getText());
       
       if(r1.isSelected()==true){
           js = "Reguler";
           total1 = (11500*berat1)-((11500*berat1*aturan1)/100);   
       }
       else if(e1.isSelected()==true){
           js = "Reguler";
            total1 = ((11500*1.5)*berat1)-((11500*1.5)*berat1*aturan1)/100; 
       }
       
       if(buttonGroup1.getSelection()==null || berat1<=0){
           JOptionPane.showMessageDialog(null,"Berat Tidak Boleh o dan pilih jasa","Konfirmasi",JOptionPane.INFORMATION_MESSAGE);     
       }
       else{
           k.setText("***********STRUK PEMBAYARAN LOUNDRY YUUUHUUUU**********\n"
                   +"nama\t\t:\t "+nama1+"\n"+
                   "no\t\t: \t"+no1+"\n"+
                   "berat\t\t:\t"+berat1+"\n"+
                   "aturan\t\t:\t"+aturan1+"%"+"\n"+
                   "total\t\t:\t"+total1+"\n"+
                   "jasa : "+js);
       }
    }//GEN-LAST:event_prosesActionPerformed

    private void namaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_namaCaretUpdate
        // TODO add your handling code here:
        if(nama.getText().length()==0 || no.getText().length()==0 ||berat.getText().length()==0 ||berat.getText().matches("[0]")){
            proses.setEnabled(false);
        }
        else {
            proses.setEnabled(true);
        }
    }//GEN-LAST:event_namaCaretUpdate

    private void noCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_noCaretUpdate
        // TODO add your handling code here:
        if(nama.getText().length()==0 || no.getText().length()==0 || berat.getText().length()==0||berat.getText().matches("[0]")){
            proses.setEnabled(false);
        }
        else {
            proses.setEnabled(true);
        
        }
    }//GEN-LAST:event_noCaretUpdate

    private void beratCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_beratCaretUpdate
        // TODO add your handling code here:
         if(nama.getText().length()==0 || no.getText().length()==0 ||berat.getText().length()==0 ||berat.getText().matches("[0]")){
            proses.setEnabled(false);
        }
        else {
            proses.setEnabled(true);
        }          
    }//GEN-LAST:event_beratCaretUpdate

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        nama.setText("");
        no.setText("");
        berat.setText("");
        aturan.setValue(0);
        kg.setText("");
        persen.setText("");
    }//GEN-LAST:event_formWindowOpened

    private void namaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaKeyReleased
        // TODO add your handling code here:
        nama.setBackground(Color.LIGHT_GRAY);
        nama.setForeground(Color.BLUE);
    }//GEN-LAST:event_namaKeyReleased

    private void noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noKeyReleased
        // TODO add your handling code here:
         no.setForeground(Color.red);
         no.setBackground(Color.CYAN);
    }//GEN-LAST:event_noKeyReleased

    private void beratKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_beratKeyReleased
        // TODO add your handling code here:
        berat.setForeground(Color.blue);
        berat.setBackground(Color.YELLOW);
    }//GEN-LAST:event_beratKeyReleased

    private void namaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaKeyPressed
        // TODO add your handling code here:
        nama.setBackground(Color.red);
        nama.setBackground(Color.PINK);
    }//GEN-LAST:event_namaKeyPressed

    private void noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_noKeyPressed

    private void prosesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prosesMousePressed
        // TODO add your handling code here:
        proses.setBackground(Color.pink);
        
    }//GEN-LAST:event_prosesMousePressed

    private void prosesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prosesMouseReleased
        // TODO add your handling code here:
        proses.setBackground(Color.white);
    }//GEN-LAST:event_prosesMouseReleased

    private void ulangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ulangMousePressed
        // TODO add your handling code here:
        ulang.setBackground(Color.blue);
    }//GEN-LAST:event_ulangMousePressed

    private void ulangMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ulangMouseReleased
        // TODO add your handling code here:
        ulang.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_ulangMouseReleased

    private void keluarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluarMousePressed
        // TODO add your handling code here:
        keluar.setBackground(Color.darkGray);
    }//GEN-LAST:event_keluarMousePressed

    private void keluarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluarMouseReleased
        // TODO add your handling code here:
        keluar.setBackground(Color.GREEN);
    }//GEN-LAST:event_keluarMouseReleased

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
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider aturan;
    private javax.swing.JTextField berat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel diskon;
    private javax.swing.JRadioButton e1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jasa;
    private javax.swing.JTextArea k;
    private javax.swing.JButton keluar;
    private javax.swing.JLabel kg;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField no;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel persen;
    private javax.swing.JButton proses;
    private javax.swing.JRadioButton r1;
    private javax.swing.JButton ulang;
    // End of variables declaration//GEN-END:variables
}
