/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dymoo6791
 */
public class NewJFrame extends javax.swing.JFrame {

    int getFib;
    int getPrime;
    int getFact;
    int fact = 1;
    boolean flag = false;
    int sum;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        factTF = new javax.swing.JTextField();
        factBtn = new javax.swing.JButton();
        factLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        primeTF = new javax.swing.JTextField();
        primeBtn = new javax.swing.JButton();
        primeLbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fibTF = new javax.swing.JTextField();
        fibBtn = new javax.swing.JButton();
        fibLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Numbers");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Enter a number and click the button to find the factorial.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 490, 30));

        factTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factTFActionPerformed(evt);
            }
        });
        jPanel1.add(factTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, 30));

        factBtn.setText("Factorial");
        factBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factBtnActionPerformed(evt);
            }
        });
        jPanel1.add(factBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 80, -1));

        factLbl.setText("...");
        jPanel1.add(factLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 120, 20));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Enter a number to determine if its a prime number.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 490, 30));

        primeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeTFActionPerformed(evt);
            }
        });
        jPanel1.add(primeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, 30));

        primeBtn.setText("Prime?");
        primeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(primeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 80, -1));

        primeLbl.setText("...");
        jPanel1.add(primeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 120, 20));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Enter a number and click the button to find the corresponding fibonacci number.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 570, 30));

        fibTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fibTFActionPerformed(evt);
            }
        });
        jPanel1.add(fibTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 100, 30));

        fibBtn.setText("Fibonacci");
        fibBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fibBtnActionPerformed(evt);
            }
        });
        jPanel1.add(fibBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 80, -1));

        fibLbl.setText("...");
        jPanel1.add(fibLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 120, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void factTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_factTFActionPerformed

    private void primeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primeTFActionPerformed

    private void fibTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fibTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fibTFActionPerformed

    private void factBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factBtnActionPerformed
        getFact = Integer.parseInt(factTF.getText());
        factor(getFact);
        String convert = String.valueOf(fact);
        factLbl.setText(convert);
    }//GEN-LAST:event_factBtnActionPerformed

    private void primeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeBtnActionPerformed
        getPrime = Integer.parseInt(primeTF.getText());
        prime();
    }//GEN-LAST:event_primeBtnActionPerformed

    private void fibBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fibBtnActionPerformed
        getFib = Integer.parseInt(fibTF.getText());
        fib(getFib);
        String convert = String.valueOf(sum);
        fibLbl.setText(convert);
    }//GEN-LAST:event_fibBtnActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    /**
     * fib() method receives 1 integer then goes through loop until it reaches
     * the given value and returns the value at that location in the sequence.
     *
     * @param n1
     * @return
     */
    public int fib(int n1) {
        int f1 = 0;
        int f2 = 1;
        for (int i = 1; i <= getFib; i++) {
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
        }
        return sum;
    }

    /**
     * factor() Method receives an integer then uses the integer as the
     * termination condition while increasing the factor value by 1 each time it
     * loops returning the factorial of the received integer
     *
     * @param n1
     * @return fact
     */
    public int factor(int n1) {

        for (int i = 1; i <= n1; i++) {
            fact = fact * i;
        }
        return fact;
    }

    /**
     * prime() method determines if the given value is a prime number or not
     */
    public void prime() {
        for (int i = 2; i <= getPrime / 2; i++) {
            if (getPrime % i == 0) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        if (!flag) {
            primeLbl.setText("Prime");
        } else if (flag) {
            primeLbl.setText("Not Prime");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton factBtn;
    private javax.swing.JLabel factLbl;
    private javax.swing.JTextField factTF;
    private javax.swing.JButton fibBtn;
    private javax.swing.JLabel fibLbl;
    private javax.swing.JTextField fibTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton primeBtn;
    private javax.swing.JLabel primeLbl;
    private javax.swing.JTextField primeTF;
    // End of variables declaration//GEN-END:variables
}
