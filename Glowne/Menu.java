package Glowne;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Szab
 */
import Algorytmy1.FIFOsimulation;
import Algorytmy1.OPTsimulation;
import Algorytmy1.Simulation;
import Algorytmy1.LRUsimulation;
import Algorytmy1.AprLRUsimulation;
import Algorytmy1.RANDsimulation;
import Algorytmy2.*;
import java.util.*;

public class Menu extends javax.swing.JFrame
{

    /**
     * Creates new form Menu
     */
    public Menu()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        grpAlgorytmy = new javax.swing.ButtonGroup();
        grpPrzydzielanie = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnFCFS = new javax.swing.JRadioButton();
        btnSJF = new javax.swing.JRadioButton();
        btnSJFw = new javax.swing.JRadioButton();
        btnROT = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        btnRAND = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jtxtMaxProc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtMaxPage = new javax.swing.JTextField();
        btnProp = new javax.swing.JRadioButton();
        btnRowny = new javax.swing.JRadioButton();
        btnCzestosc = new javax.swing.JRadioButton();
        btnStrefowy = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Wybierz algorytm symulacji:");

        grpAlgorytmy.add(btnFCFS);
        btnFCFS.setText("FIFO");

        grpAlgorytmy.add(btnSJF);
        btnSJF.setText("OPT");

        grpAlgorytmy.add(btnSJFw);
        btnSJFw.setText("LRU");

        grpAlgorytmy.add(btnROT);
        btnROT.setText("Aproksymowany LRU");

        jButton1.setText("Uruchom symulację");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        grpAlgorytmy.add(btnRAND);
        btnRAND.setText("RAND");

        jLabel4.setText("Max. procesów:");

        jtxtMaxProc.setText("10");

        jLabel2.setText("Max. stron na proces:");

        jtxtMaxPage.setText("50");

        grpPrzydzielanie.add(btnProp);
        btnProp.setText("Przydział proporcjonalny");

        grpPrzydzielanie.add(btnRowny);
        btnRowny.setText("Przydział równy");
        btnRowny.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRownyActionPerformed(evt);
            }
        });

        grpPrzydzielanie.add(btnCzestosc);
        btnCzestosc.setText("Sterowanie częstością błędów");

        grpPrzydzielanie.add(btnStrefowy);
        btnStrefowy.setText("Przydział strefowy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFCFS)
                                    .addComponent(btnSJF)
                                    .addComponent(btnSJFw)
                                    .addComponent(btnROT)
                                    .addComponent(btnRAND)))
                            .addComponent(jButton1))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnStrefowy)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(4, 4, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtMaxProc, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                    .addComponent(jtxtMaxPage))
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnProp)
                                    .addComponent(btnRowny)
                                    .addComponent(btnCzestosc))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFCFS))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jtxtMaxProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSJF)
                    .addComponent(jLabel2)
                    .addComponent(jtxtMaxPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSJFw)
                    .addComponent(btnProp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnROT)
                    .addComponent(btnRowny))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRAND)
                    .addComponent(btnCzestosc))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnStrefowy)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed

        
        this.setVisible(false);
        
        MemoryManager ProcMan = new MemoryManager(Integer.parseInt(jtxtMaxProc.getText()), Integer.parseInt(jtxtMaxPage.getText()));
        Simulation sim = null;
        Simulation sim2 = null;
        
        if(btnFCFS.isSelected()) sim = new FIFOsimulation(ProcMan);
        if(btnSJF.isSelected()) sim = new OPTsimulation(ProcMan);
        if(btnSJFw.isSelected()) sim = new LRUsimulation(ProcMan);
        if(btnROT.isSelected()) sim = new AprLRUsimulation(ProcMan);
        if(btnRAND.isSelected()) sim = new RANDsimulation(ProcMan);
        
        if(btnRowny.isSelected()) sim2 = new Stalysimulation(ProcMan);
        if(btnStrefowy.isSelected()) sim2 = new Strefowysimulation(ProcMan);
        if(btnProp.isSelected()) sim2 = new Proporcjonalnysimulation(ProcMan);
        
        if(sim!=null) ProcMan.initialize(sim, sim2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRownyActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRownyActionPerformed
    {//GEN-HEADEREND:event_btnRownyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRownyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnCzestosc;
    private javax.swing.JRadioButton btnFCFS;
    private javax.swing.JRadioButton btnProp;
    private javax.swing.JRadioButton btnRAND;
    private javax.swing.JRadioButton btnROT;
    private javax.swing.JRadioButton btnRowny;
    private javax.swing.JRadioButton btnSJF;
    private javax.swing.JRadioButton btnSJFw;
    private javax.swing.JRadioButton btnStrefowy;
    private javax.swing.ButtonGroup grpAlgorytmy;
    private javax.swing.ButtonGroup grpPrzydzielanie;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtxtMaxPage;
    private javax.swing.JTextField jtxtMaxProc;
    // End of variables declaration//GEN-END:variables
}