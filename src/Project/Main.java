/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author My Lappy
 */
public class Main extends javax.swing.JFrame {
    int xMouse,yMouse;
    
    /**
     * Creates new form Main
     * @throws java.lang.ClassNotFoundException
     */
    public Main() throws ClassNotFoundException{
        initComponents();
        setLocationRelativeTo(null);
        // removes the jframe bg color
        setBackground(new Color(0,0,0,0)); 
        Exitz.setBackground(new Color(0,0,0,0));
        Miniz.setBackground(new Color(0,0,0,0));
        Password.setBackground(new Color(0,0,0,0));
        Passgen.setBackground(new Color(0,0,0,0));
        Hide.setBackground(new Color(0,0,0,0));
        Show.setBackground(new Color(0,0,0,0));
   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Hide = new javax.swing.JButton();
        Show = new javax.swing.JButton();
        Password = new javax.swing.JButton();
        Passgen = new javax.swing.JButton();
        Exitz = new javax.swing.JButton();
        Miniz = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        FrameDrag = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Hide.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Hide.setForeground(new java.awt.Color(255, 0, 255));
        Hide.setText("Hide Files");
        Hide.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Hide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HideActionPerformed(evt);
            }
        });
        getContentPane().add(Hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 110, 30));

        Show.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Show.setForeground(new java.awt.Color(255, 102, 0));
        Show.setText("Show Files");
        Show.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });
        getContentPane().add(Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 110, 30));

        Password.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(0, 255, 0));
        Password.setText("Password Manager");
        Password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 170, 30));

        Passgen.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Passgen.setForeground(new java.awt.Color(255, 51, 51));
        Passgen.setText("Password Generator");
        Passgen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        Passgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassgenActionPerformed(evt);
            }
        });
        getContentPane().add(Passgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 170, 30));

        Exitz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/icons8-cancel-26(1).png"))); // NOI18N
        Exitz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitzActionPerformed(evt);
            }
        });
        getContentPane().add(Exitz, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 30, 30));

        Miniz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/icons8-minimize-window-26.png"))); // NOI18N
        Miniz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinizActionPerformed(evt);
            }
        });
        getContentPane().add(Miniz, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 20, 30));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Task ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 30));

        FrameDrag.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        FrameDrag.setForeground(new java.awt.Color(255, 255, 255));
        FrameDrag.setText(" Operations");
        FrameDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                FrameDragMouseDragged(evt);
            }
        });
        FrameDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FrameDragMousePressed(evt);
            }
        });
        getContentPane().add(FrameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/SparksHorizt-XL.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 30));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 280, 190));

        jLabel1.setBackground(new java.awt.Color(17, 15, 15));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/ubuntu_desktop_blue-wallpaper-1920x1080.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HideActionPerformed
        try {
            JFileChooser obj = new JFileChooser();
            obj.showOpenDialog(null);
            File f =obj.getSelectedFile();
            String p = f.getPath();
            String cmd[] = {"attrib","+h",p};
            Runtime.getRuntime().exec(cmd);    
            JOptionPane.showMessageDialog(this,"File Hidden");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HideActionPerformed

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed

try {  
            JFileChooser obj = new JFileChooser();
            obj.setFileHidingEnabled(false);
            obj.showOpenDialog(null);
            File f =obj.getSelectedFile();
            String p = f.getPath();
            String cmd[] = {"attrib","-s","-h",p};
            Runtime.getRuntime().exec(cmd);    
            JOptionPane.showMessageDialog(this,"File Unhidden");
            // TODO add your handling code here:
     }      catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_ShowActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        try {
            // TODO add your handling code here:
            this.setVisible(false);
            PassMang obj = new PassMang();
            obj.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Add.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void PassgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassgenActionPerformed
        PassGen obj1 = new PassGen();
        this.setVisible(false);
        obj1.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_PassgenActionPerformed

    private void MinizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinizActionPerformed
        this.setState(this.ICONIFIED);
        // TODO add your handling code here:
    }//GEN-LAST:event_MinizActionPerformed

    private void ExitzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitzActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitzActionPerformed

    private void FrameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMouseDragged
            int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
       this.setLocation(x-xMouse, y-yMouse);

        // TODO add your handling code here:
    }//GEN-LAST:event_FrameDragMouseDragged

    private void FrameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameDragMousePressed
             xMouse=evt.getX();
        yMouse=evt.getY();
   
        // TODO add your handling code here:
    }//GEN-LAST:event_FrameDragMousePressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Main().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exitz;
    private javax.swing.JLabel FrameDrag;
    private javax.swing.JButton Hide;
    private javax.swing.JButton Miniz;
    private javax.swing.JButton Passgen;
    private javax.swing.JButton Password;
    private javax.swing.JButton Show;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
