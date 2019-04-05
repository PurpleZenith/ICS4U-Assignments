/*
 * Assignment 2 - Change
 *
 * This application prompts a user for an amount of money in dollars and cents 
 * that they would like to exchange for coins. This application prompts a user 
 * for an amount of money in dollars and cents that they would like to exchange
 * for coins.
 * 
 * The change is to be made up of the minimum number of:
 * quarters, dimes, nickels, pennies
 */
package change;

/**
 *
 * @author anonymous
 */
public class Change extends javax.swing.JFrame {

    /**
     * Creates new form Change
     */
    public Change() {
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

        MainTitle = new javax.swing.JLabel();
        Instructions1 = new javax.swing.JLabel();
        Instructions2 = new javax.swing.JLabel();
        InputField = new javax.swing.JTextField();
        Calculate = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        AmountLabel = new javax.swing.JLabel();
        QuartersLabel = new javax.swing.JLabel();
        DimesLabel = new javax.swing.JLabel();
        NickelsLabel = new javax.swing.JLabel();
        PenniesLabel = new javax.swing.JLabel();
        outputToonies = new javax.swing.JTextField();
        outputLoonies = new javax.swing.JTextField();
        outputQuarters = new javax.swing.JTextField();
        outputDimes = new javax.swing.JTextField();
        outputNickels = new javax.swing.JTextField();
        outputPennies = new javax.swing.JTextField();
        outputAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        MainTitle.setForeground(new java.awt.Color(255, 0, 0));
        MainTitle.setText("Change Exchange");

        Instructions1.setText("Enter Currency");

        Instructions2.setText("Amount (xxxx.xx)");

        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        AmountLabel.setText("Amount");

        QuartersLabel.setText("Quarters");

        DimesLabel.setText("Dimes");

        NickelsLabel.setText("Nickels");

        PenniesLabel.setText("Pennies");

        jLabel1.setText("Loonies");

        jLabel2.setText("Toonies");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(MainTitle)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Instructions2)
                                    .addComponent(Instructions1)
                                    .addComponent(Calculate)
                                    .addComponent(AmountLabel))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ExitButton)
                                    .addComponent(InputField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(QuartersLabel)
                                            .addComponent(DimesLabel))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(outputQuarters, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(outputDimes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(outputToonies, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(PenniesLabel))
                                            .addComponent(jLabel1))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(outputLoonies)
                                            .addComponent(outputNickels)
                                            .addComponent(outputPennies, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
                                    .addComponent(NickelsLabel)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(outputAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Instructions1)
                        .addGap(12, 12, 12)
                        .addComponent(Instructions2))
                    .addComponent(InputField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calculate)
                    .addComponent(ExitButton))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmountLabel)
                    .addComponent(outputAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputLoonies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputToonies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuartersLabel)
                    .addComponent(NickelsLabel)
                    .addComponent(outputQuarters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputNickels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DimesLabel)
                    .addComponent(PenniesLabel)
                    .addComponent(outputDimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputPennies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* This method will calculate the minimum amount of coins that make up a 
     * given amount of money.
    */
    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        //variable declarations
        String amountIn;
        int total, quarters, dimes, nickels, pennies, loonies, toonies;
        double convertIn;
        
        //take input number,convert to double, then change it to integer (convertIn)
        amountIn = InputField.getText();
        convertIn = Double.parseDouble(amountIn)*100;
        total = (int)convertIn;
        
        //get numbers of coins and adjust total based on number removed
        toonies = total / 200;
        total = total - (toonies * 200);
        loonies = total / 100;
        total = total - (loonies * 100);
        quarters = total / 25;
        total = total - (quarters * 25);
        dimes = total / 10;
        total = total - (dimes * 10);
        nickels = total / 5;
        total = total - (nickels * 5);
        pennies = total;
        
        //change number of coins from int to strings then set textbox text as strings
        outputAmount.setText(amountIn);
        outputToonies.setText(Integer.toString(toonies));
        outputLoonies.setText(Integer.toString(loonies));
        outputQuarters.setText(Integer.toString(quarters));
        outputDimes.setText(Integer.toString(dimes));
        outputNickels.setText(Integer.toString(nickels));
        outputPennies.setText(Integer.toString(pennies));
    }//GEN-LAST:event_CalculateActionPerformed

    /* This is a method to close the window when the Exit button is pressed */
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Change().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AmountLabel;
    private javax.swing.JButton Calculate;
    private javax.swing.JLabel DimesLabel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField InputField;
    private javax.swing.JLabel Instructions1;
    private javax.swing.JLabel Instructions2;
    private javax.swing.JLabel MainTitle;
    private javax.swing.JLabel NickelsLabel;
    private javax.swing.JLabel PenniesLabel;
    private javax.swing.JLabel QuartersLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField outputAmount;
    private javax.swing.JTextField outputDimes;
    private javax.swing.JTextField outputLoonies;
    private javax.swing.JTextField outputNickels;
    private javax.swing.JTextField outputPennies;
    private javax.swing.JTextField outputQuarters;
    private javax.swing.JTextField outputToonies;
    // End of variables declaration//GEN-END:variables
}