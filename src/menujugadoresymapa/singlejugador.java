/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menujugadoresymapa;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import ping_pong_wars.*;

/**
 *
 * @author Alex
 */
public class singlejugador extends javax.swing.JFrame {

    /**
     * Creates new form singlejugador
     */
    public singlejugador() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("War Table Hana");
        this.jArena2.setVisible(false);
        this.jArena3.setVisible(false);
        this.jButton2.setVisible(false);
        this.jButton3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jname = new javax.swing.JLabel();
        jnombre = new javax.swing.JTextField();
        jarena = new javax.swing.JLabel();
        jArena1 = new javax.swing.JLabel();
        jArena2 = new javax.swing.JLabel();
        jArena3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        junplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("1 PLAYER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 350, 90));

        jname.setFont(new java.awt.Font("Kongtext", 1, 18)); // NOI18N
        jname.setForeground(new java.awt.Color(255, 255, 255));
        jname.setText("Name:");
        jname.setToolTipText("");
        getContentPane().add(jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 120, 30));

        jnombre.setBackground(new java.awt.Color(0, 0, 0));
        jnombre.setFont(new java.awt.Font("Kongtext", 1, 18)); // NOI18N
        jnombre.setForeground(new java.awt.Color(255, 255, 255));
        jnombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jnombre.setOpaque(false);
        getContentPane().add(jnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 140, 30));

        jarena.setFont(new java.awt.Font("Kongtext", 1, 18)); // NOI18N
        jarena.setForeground(new java.awt.Color(255, 255, 255));
        jarena.setText("Arena:");
        getContentPane().add(jarena, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 120, 30));

        jArena1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mapafutbol.png"))); // NOI18N
        jArena1.setOpaque(true);
        getContentPane().add(jArena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 240, 150));

        jArena2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/maparoyal.png"))); // NOI18N
        jArena2.setOpaque(true);
        getContentPane().add(jArena2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, 180));

        jArena3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cielo estrellado.png"))); // NOI18N
        jArena3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        getContentPane().add(jArena3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 240, 150));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 30, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 50, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 50, -1));

        jButton4.setFont(new java.awt.Font("Kongtext", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("START");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, -1, -1));

        junplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cielo estrellado.png"))); // NOI18N
        getContentPane().add(junplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.jArena1.setVisible(false);
        this.jArena2.setVisible(true);
        this.jArena3.setVisible(false);
        this.jButton2.setVisible(true);
        this.jButton3.setVisible(false);
        this.jButton1.setVisible(false);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.jArena1.setVisible(false);
        this.jArena2.setVisible(false);
        this.jArena3.setVisible(true);
        this.jButton2.setVisible(false);
        this.jButton3.setVisible(true);
        this.jButton1.setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.jArena1.setVisible(true);
        this.jArena2.setVisible(false);
        this.jArena3.setVisible(false);
        this.jButton2.setVisible(false);
        this.jButton3.setVisible(false);
        this.jButton1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        Game game = new Game();
        singlejugador jug = new singlejugador();
        JDialog dialogo = new JDialog(jug,"Titulo");
        dialogo.add(game);
        dialogo.setVisible(true);
        dialogo.setSize(800,500);
        dialogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(singlejugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(singlejugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(singlejugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(singlejugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new singlejugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jArena1;
    private javax.swing.JLabel jArena2;
    private javax.swing.JLabel jArena3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jarena;
    private javax.swing.JLabel jname;
    private javax.swing.JTextField jnombre;
    private javax.swing.JLabel junplay;
    // End of variables declaration//GEN-END:variables
}
