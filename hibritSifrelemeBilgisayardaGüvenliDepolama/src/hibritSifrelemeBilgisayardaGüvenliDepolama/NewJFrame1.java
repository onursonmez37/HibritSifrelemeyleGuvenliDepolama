/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibritSifrelemeBilgisayardaGüvenliDepolama;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author onurs
 */
public class NewJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    
    public String Sifre,Data;
    File file = new File("sifreKayit.txt");
    public NewJFrame1(String sifre , String data) {
        initComponents();
        this.Sifre=sifre;
        this.Data=data;
        
    }

    private NewJFrame1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPasswordControl = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("          ŞİFREYİ GİRİNİZ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(440, 120, 280, 90);

        jScrollPane1.setViewportView(txtPasswordControl);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(420, 210, 240, 54);

        jButton1.setBackground(java.awt.SystemColor.textHighlight);
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BİLGİSAYARA KAYDET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(450, 280, 180, 72);

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\masaüstü\\bg.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1194, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int sayac=0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String girilenSİfre = txtPasswordControl.getText();
        password pas  = new password();
            String[] tusAyari = { "tamam"};
            if(girilenSİfre.equals(Sifre))
            {
            JOptionPane.showOptionDialog(null, "şifre doğru. Gerekli işlemler yapıldı sistemden çıkış yapılacak",null, JOptionPane.DEFAULT_OPTION, 
                                            JOptionPane.QUESTION_MESSAGE, null, tusAyari, null);
                // txt kayıt 
                
                
            try {
                FileWriter writer = new FileWriter(file,true);
                writer.write("\n"+Data);
                writer.close();

            } catch (IOException ex) {
                Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.exit(0);

            }
            else
            {
                JOptionPane.showOptionDialog(null, "şifre Hatalı  "+sayac+" .denemeyi yaptınız 3. hatalı girişten sonra çıkış yapılacaktır",null, JOptionPane.DEFAULT_OPTION, 
                                            JOptionPane.QUESTION_MESSAGE, null, tusAyari, null);
                sayac++;
            }
            if(sayac==3)
            {
                System.exit(0);
            }
  
     
        
            
        
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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtPasswordControl;
    // End of variables declaration//GEN-END:variables
}
