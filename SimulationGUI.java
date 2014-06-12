/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Szab
 */
import javax.swing.DefaultListModel;

public class SimulationGUI extends javax.swing.JFrame
{
    private MemoryManager ProcMan = null;
    private IOController IO = null;

    /**
     * Creates new form SimulationGUI
     */
    
    // Dodatkowy konstruktor
    public SimulationGUI(MemoryManager ProcMan, IOController IO)
    {
        this.ProcMan = ProcMan;
        
        this.IO = IO;
        initComponents();
        
        Integer count = ProcMan._templateList.size();
        lblGeneratorCount.setText(count.toString());  
        lblROTQuant.setText((new Integer(ProcMan.quantSize)).toString());
        
    }
    
    public SimulationGUI()
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

        canvas1 = new java.awt.Canvas();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblWorkTime = new javax.swing.JLabel();
        lblRemaining = new javax.swing.JLabel();
        lblNumberRealised = new javax.swing.JLabel();
        lblAverageWaited = new javax.swing.JLabel();
        lblProcessDuration = new javax.swing.JLabel();
        lblRemainingTime = new javax.swing.JLabel();
        lblROTQuant = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNextQ = new javax.swing.JButton();
        btnFastFW = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstOdwolania = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstStrony = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstProcesy1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Statystyki symulacji"));

        jLabel2.setText("Pozostało odwołań:");

        jLabel3.setText("Zrealizowano odwołań:");

        jLabel4.setText("Ilość błędów:");

        jLabel6.setText("Błędów na odwołanie:");

        jLabel7.setText("Ilość stron:");

        jLabel8.setText("Ilość przebiegów:");

        jLabel11.setText("Ilość ramek:");

        lblWorkTime.setText("0");

        lblRemaining.setText("0");

        lblNumberRealised.setText("0");

        lblAverageWaited.setText("0");

        lblProcessDuration.setText("0,0");

        lblRemainingTime.setText("0");

        lblROTQuant.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(116, 116, 116)
                        .addComponent(lblWorkTime))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(105, 105, 105)
                        .addComponent(lblRemaining))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(89, 89, 89)
                        .addComponent(lblNumberRealised))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(136, 136, 136)
                        .addComponent(lblAverageWaited))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(94, 94, 94)
                        .addComponent(lblProcessDuration))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7))
                        .addGap(142, 142, 142)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblROTQuant)
                            .addComponent(lblRemainingTime))))
                .addGap(243, 243, 243))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lblWorkTime))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblRemaining))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblNumberRealised))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lblAverageWaited))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProcessDuration)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRemainingTime)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblROTQuant))
                .addGap(34, 34, 34))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Kontrola przebiegu"));

        btnNextQ.setText("Następny przebieg");
        btnNextQ.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNextQActionPerformed(evt);
            }
        });

        btnFastFW.setText("Przejdź do końca");
        btnFastFW.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFastFWActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNextQ, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFastFW, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNextQ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFastFW)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 160, -1));

        jScrollPane3.setViewportView(lstOdwolania);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 480, 170));

        jScrollPane4.setViewportView(lstStrony);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 476, 350));

        jScrollPane5.setViewportView(lstProcesy1);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 480, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextQActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNextQActionPerformed
    {//GEN-HEADEREND:event_btnNextQActionPerformed
        ProcMan.nextStep();
    }//GEN-LAST:event_btnNextQActionPerformed

    private void btnFastFWActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFastFWActionPerformed
    {//GEN-HEADEREND:event_btnFastFWActionPerformed
        ProcMan.endSimulation();
    }//GEN-LAST:event_btnFastFWActionPerformed

    // Ustawia wartosc wygenerowanych procesów
    public void incrementGenerated()
    {
        Integer count = Integer.parseInt(lblCountGenerated.getText());
        count += 1;
        
        lblCountGenerated.setText(count.toString());
    }
    
    // Aktualizuje wartości statystyk
    public void update()
    {
        Integer workTime = ProcMan.workTime;
        Integer remainingProc = ProcMan.processList.size();
        Integer procRealised = ProcMan.numberRealised;
        Double average = ProcMan.getAverageTime();     
        
        // Aktualizacja statystyk
        if(ProcMan.processList.size()!=0)
        {
             Integer currentDuration = ProcMan.getCurrent().duration;
             Integer currentRemaining = ProcMan.getCurrent().timeLeft;
             String currentProcess = ProcMan.getCurrent().id;
             lblCurrentProcess.setText(currentProcess);
             lblProcessDuration.setText(currentDuration.toString());
             lblRemainingTime.setText(currentRemaining.toString());
        }
        else
        {
            lblCurrentProcess.setText("brak");
            lblProcessDuration.setText("-");
            lblRemainingTime.setText("-");
        }
        lblAverageWaited.setText(average.toString());
        lblRemaining.setText(remainingProc.toString());
        lblWorkTime.setText(workTime.toString());
        lblNumberRealised.setText(procRealised.toString());
        
        // Zapełnienie listy procesów
        DefaultListModel model = new DefaultListModel();
        int selected = 0;
        
        if(ProcMan.processList.size()!=0)
        {
            for(Process process : ProcMan.processList)
            {
                model.addElement(process.id+": długość "+process.duration+", pozostało "+process.timeLeft);
                if(process == ProcMan.getCurrent()) selected = model.size()-1;
            }
        }
        else
        {
            model.addElement("Brak procesów");
        }
        lstOdwolania.setModel(model);
        lstOdwolania.setSelectedIndex(selected);  
        
         // Zapełnienie listy wzorców
        DefaultListModel tmplmodel = new DefaultListModel();
        if(ProcMan._templateList.size()!=0)
        {
            for(ProcessTemplate template : ProcMan._templateList)
            {
                tmplmodel.addElement("Wzór id: "+template.id+", długość procesu "+template.duration+". Generowany co "+template.interval+" jednostek czasu. Pozostało: "+template.remaining);
            }
        }
        else
        {
            tmplmodel.addElement("Brak wzorców");
        }
        lstStrony.setModel(tmplmodel);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFastFW;
    private javax.swing.JButton btnNextQ;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblAverageWaited;
    private javax.swing.JLabel lblNumberRealised;
    private javax.swing.JLabel lblProcessDuration;
    private javax.swing.JLabel lblROTQuant;
    private javax.swing.JLabel lblRemaining;
    private javax.swing.JLabel lblRemainingTime;
    private javax.swing.JLabel lblWorkTime;
    private javax.swing.JList lstOdwolania;
    private javax.swing.JList lstProcesy1;
    private javax.swing.JList lstStrony;
    // End of variables declaration//GEN-END:variables
}
