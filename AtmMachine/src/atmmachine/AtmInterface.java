/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atmmachine;

import javax.swing.JOptionPane;

/**
 *
 * @author Jishan Aich
 */
public class AtmInterface extends javax.swing.JFrame {
            Database db;
    /**
     * Creates new form AtmInterface
     */
    public AtmInterface() {
        db=new Database();
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
        jLabel2 = new javax.swing.JLabel();
        tf_acnum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_pin = new javax.swing.JPasswordField();
        b_cle = new javax.swing.JButton();
        b_wdraw = new javax.swing.JButton();
        b_dep = new javax.swing.JButton();
        lab_bal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_amm = new javax.swing.JTextField();
        b_balance = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM BANAYA HU YAAR");

        jLabel1.setText("ATM FREE MONEYY!!!! COMMUNISM");

        jLabel2.setText("A/C Number:-");

        jLabel3.setText("PIN:-");

        b_cle.setText("Clear");
        b_cle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cleActionPerformed(evt);
            }
        });

        b_wdraw.setText("Withdraw");
        b_wdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_wdrawActionPerformed(evt);
            }
        });

        b_dep.setText("Deposit");
        b_dep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_depActionPerformed(evt);
            }
        });

        jLabel4.setText("Ammount: ");

        b_balance.setText("Balance");
        b_balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_balanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_acnum)
                            .addComponent(tf_pin))
                        .addGap(179, 179, 179))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b_cle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165)
                                .addComponent(b_balance)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b_dep)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                        .addComponent(b_wdraw))
                                    .addComponent(lab_bal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(196, 196, 196)))
                        .addGap(96, 96, 96))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_amm, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tf_acnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cle)
                    .addComponent(b_balance))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_amm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_wdraw)
                    .addComponent(b_dep))
                .addGap(113, 113, 113)
                .addComponent(lab_bal, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addGap(172, 172, 172))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_cleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cleActionPerformed
            tf_acnum.setText("");        // TODO add your handling code here:
            tf_pin.setText("");
    }//GEN-LAST:event_b_cleActionPerformed

    private void b_wdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_wdrawActionPerformed
            String amm=tf_amm.getText();
            String acc_no=tf_acnum.getText();
            double amm1=Double.parseDouble(amm);
            String amm_db=null;
            double ammwid;
            String query1="select * from bank where accnum='"+acc_no+"'";
            try{
                db.rs=db.stmt.executeQuery(query1);
                db.rs.next();
                amm_db=db.rs.getString(3);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            double amm2=Double.parseDouble(amm_db);
            if(amm_db==null)
                    {
                        JOptionPane.showMessageDialog(this,"Incorrect Credentials");
                    }
            else if(amm2>=amm1)
            {
                ammwid=amm2-amm1;
                amm_db=ammwid+"";
            }
            else
            {
                JOptionPane.showMessageDialog(this, "NOT ENOUGH BALENCE");
            }
            Boolean i=null;
            String query="UPDATE BANK SET BAL='"+amm_db+"' Where ACCNUM='"+acc_no+"'";
            try
            {
                   i=db.stmt.execute(query);
            }
            catch(Exception e)
            {
                   e.printStackTrace();
            }
            if(!i)
            {
                JOptionPane.showMessageDialog(this, "Successful");
            }
            else
            {
                   JOptionPane.showMessageDialog(this, "Unsuccessful");
            }// TODO add your handling code here:
    }                                     

    private void b_balActionPerformed(java.awt.event.ActionEvent evt) {                                      
               String acc_no=tf_acnum.getText();
               String acc_pin=tf_pin.getText();
               String db_bal=null;
               String query="SELECT * FROM BANK WHERE ACCNUM='"+acc_no+"'";
               try{
                    db.rs=db.stmt.executeQuery(query);
                    db.rs.next();
                    db_bal=db.rs.getString(3);
               } 
               catch(Exception e)
               {
                    e.printStackTrace();
               }
                if(db_bal==null)
                {
                      JOptionPane.showMessageDialog(this,"Incorrect Credentials");
                }
                else
                {
                        lab_bal.setText("The balance is "+db_bal);
                }                            // TODO add your handling code here:
    }//GEN-LAST:event_b_wdrawActionPerformed

    private void b_depActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_depActionPerformed
            String amm=tf_amm.getText();
            String acc_no=tf_acnum.getText();
            double amm1=Double.parseDouble(amm);
            String amm_db=null;
            double amm2;
            String query1="select * from bank where accnum='"+acc_no+"'";
            try{
                db.rs=db.stmt.executeQuery(query1);
                db.rs.next();
                amm_db=db.rs.getString(3);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            if(amm_db==null)
                    {
                        JOptionPane.showMessageDialog(this,"Incorrect Credentials");
                    }
            else
            {
                amm2=amm1+Double.parseDouble(amm_db);
                amm_db=amm2+"";
            }
            Boolean i=null;
            String query="UPDATE BANK SET BAL='"+amm_db+"' Where ACCNUM='"+acc_no+"'";
            try
            {
                   i=db.stmt.execute(query);
            }
            catch(Exception e)
            {
                   e.printStackTrace();
            }
            if(!i)
            {
                JOptionPane.showMessageDialog(this, "Successful");
            }
            else
            {
                   JOptionPane.showMessageDialog(this, "Unsuccessful");
            }// TODO add your handling code here:
    }//GEN-LAST:event_b_depActionPerformed

    private void b_balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_balanceActionPerformed
 String acc_no=tf_acnum.getText();
               String acc_pin=tf_pin.getText();
               String db_bal=null;
               String query="SELECT * FROM BANK WHERE ACCNUM='"+acc_no+"' and PIN ='"+acc_pin+"'";
               try{
                    db.rs=db.stmt.executeQuery(query);
                    db.rs.next();
                    db_bal=db.rs.getString(3);
               } 
               catch(Exception e)
               {
                    e.printStackTrace();
               }
                if(db_bal==null)
                {
                      JOptionPane.showMessageDialog(this,"Incorrect Credentials");
                }
                else
                {
                        lab_bal.setText("The balance is "+db_bal);
                }        // TODO add your handling code here:
    }//GEN-LAST:event_b_balanceActionPerformed

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
            java.util.logging.Logger.getLogger(AtmInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtmInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtmInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtmInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtmInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_balance;
    private javax.swing.JButton b_cle;
    private javax.swing.JButton b_dep;
    private javax.swing.JButton b_wdraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lab_bal;
    private javax.swing.JTextField tf_acnum;
    private javax.swing.JTextField tf_amm;
    private javax.swing.JPasswordField tf_pin;
    // End of variables declaration//GEN-END:variables
}
