package atm_machine;

import java.awt.Color;
import java.awt.event.MouseAdapter;


@SuppressWarnings("serial")
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Menu() {
        initComponents();
    }
    
    private String AccID;
    private int bal;
    private int pin;
    public Menu(String AccID, int bal, int pin) {
    	initComponents();
    	this.AccID = AccID;
    	this.bal = bal;
    	this.pin = pin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblMyBank = new javax.swing.JLabel();
        lblLogout = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        btnDeposit = new javax.swing.JButton();
        btnDeposit.addMouseListener(new MouseAdapter() {
        	public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDepositMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDepositMouseExited(evt);
            }    
        });
        jLabel4 = new javax.swing.JLabel();
        btnChangePin = new javax.swing.JButton();
        btnChangePin.addMouseListener(new MouseAdapter() {
        	public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChangePinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChangePinMouseExited(evt);
            } 
        });
        btnCheckBal = new javax.swing.JButton();
        btnCheckBal.addMouseListener(new MouseAdapter() {
        	public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCheckBalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCheckBalMouseExited(evt);
            }        
        });
        btnWithdraw = new javax.swing.JButton();
        btnWithdraw.addMouseListener(new MouseAdapter() {
        	 public void mouseEntered(java.awt.event.MouseEvent evt) {
                 btnWithdrawMouseEntered(evt);
             }
             public void mouseExited(java.awt.event.MouseEvent evt) {
                 btnWithdrawMouseExited(evt);
             }        	
        });
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("img/icons8-bank-cards-100.png")); // NOI18N

        lblMyBank.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        lblMyBank.setForeground(new java.awt.Color(255, 255, 255));
        lblMyBank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMyBank.setText("MYBANK");

        lblLogout.setBackground(new java.awt.Color(0, 0, 0));
        lblLogout.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setText("Log Out");
        lblLogout.setToolTipText("");
        lblLogout.setActionCommand("");
        lblLogout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutMouseExited(evt);
            }          
        });
        lblLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMyBank)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblMyBank, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(159, 159, 159)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        lblWelcome.setFont(new java.awt.Font("Bahnschrift", 1, 60)); // NOI18N
        lblWelcome.setText("Welcome");

        btnDeposit.setBackground(new java.awt.Color(255, 255, 255));
        btnDeposit.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnDeposit.setIcon(new javax.swing.ImageIcon("C:\\Users\\jason\\OneDrive\\Documents\\DCIT 50 OOP\\ATM\\icons8-request-money-100.png")); // NOI18N
        btnDeposit.setText("  Deposit");
        btnDeposit.setToolTipText("");
        btnDeposit.setActionCommand("");
        btnDeposit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        btnChangePin.setBackground(new java.awt.Color(255, 255, 255));
        btnChangePin.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnChangePin.setIcon(new javax.swing.ImageIcon("C:\\Users\\jason\\OneDrive\\Documents\\DCIT 50 OOP\\ATM\\icons8-change-90.png")); // NOI18N
        btnChangePin.setText("  Change Pin");
        btnChangePin.setToolTipText("");
        btnChangePin.setActionCommand("");
        btnChangePin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btnChangePin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePin2ActionPerformed(evt);
            }
        });

        btnCheckBal.setBackground(new java.awt.Color(255, 255, 255));
        btnCheckBal.setFont(new java.awt.Font("Bahnschrift", 0, 23)); // NOI18N
        btnCheckBal.setIcon(new javax.swing.ImageIcon("C:\\Users\\jason\\OneDrive\\Documents\\DCIT 50 OOP\\ATM\\icons8-purchase-order-90.png")); // NOI18N
        btnCheckBal.setText(" Check Balance");
        btnCheckBal.setToolTipText("");
        btnCheckBal.setActionCommand("");
        btnCheckBal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btnCheckBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBalActionPerformed(evt);
            }
        });

        btnWithdraw.setBackground(new java.awt.Color(255, 255, 255));
        btnWithdraw.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        btnWithdraw.setIcon(new javax.swing.ImageIcon("C:\\Users\\jason\\OneDrive\\Documents\\DCIT 50 OOP\\ATM\\icons8-initiate-money-transfer-100.png")); // NOI18N
        btnWithdraw.setText(" Withdraw");
        btnWithdraw.setToolTipText("");
        btnWithdraw.setActionCommand("");
        btnWithdraw.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(lblWelcome)
                        .addGap(134, 134, 134))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnWithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCheckBal, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnChangePin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckBal, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangePin, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {                                     
        System.exit(0);
    }                                    
//Change pin
    private void changePin2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new ChangePin(AccID, bal, pin).setVisible(true);
        this.dispose();
    }                                        
//Check Balance
    private void checkBalActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new CheckBalance(AccID, bal, pin).setVisible(true);
        this.dispose();
    }                                        
//Withdraw
    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new Withdraw(AccID, bal, pin).setVisible(true);
        this.setVisible(false);
    }                                        
//Deposit
    private void depositActionPerformed(java.awt.event.ActionEvent evt) {                                        
    	new Deposit(AccID, bal, pin).setVisible(true);
    	this.setVisible(false);
    }                                       
//Log out button
    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {                                       
        new Login().setVisible(true);
        this.dispose();
    }
    private void btnWithdrawMouseEntered(java.awt.event.MouseEvent evt) {                                      
        btnWithdraw.setBackground(new Color(0,0,0));
        btnWithdraw.setForeground(new Color(255,255,255));
    }
    private void btnWithdrawMouseExited(java.awt.event.MouseEvent evt) {                                     
        btnWithdraw.setBackground(new Color(255,255,255));
        btnWithdraw.setForeground(new Color(0,0,0));
    }
    private void btnDepositMouseEntered(java.awt.event.MouseEvent evt) {                                      
        btnDeposit.setBackground(new Color(0,0,0));
        btnDeposit.setForeground(new Color(255,255,255));
    }
    private void btnDepositMouseExited(java.awt.event.MouseEvent evt) {                                     
        btnDeposit.setBackground(new Color(255,255,255));
        btnDeposit.setForeground(new Color(0,0,0));
    }
    private void btnCheckBalMouseEntered(java.awt.event.MouseEvent evt) {                                      
    	btnCheckBal.setBackground(new Color(0,0,0));
    	btnCheckBal.setForeground(new Color(255,255,255));
    }
    private void btnCheckBalMouseExited(java.awt.event.MouseEvent evt) {                                     
    	btnCheckBal.setBackground(new Color(255,255,255));
    	btnCheckBal.setForeground(new Color(0,0,0));
    }
    private void btnChangePinMouseEntered(java.awt.event.MouseEvent evt) {                                      
    	btnChangePin.setBackground(new Color(0,0,0));
    	btnChangePin.setForeground(new Color(255,255,255));
    }
    private void btnChangePinMouseExited(java.awt.event.MouseEvent evt) {                                     
    	btnChangePin.setBackground(new Color(255,255,255));
    	btnChangePin.setForeground(new Color(0,0,0));
    } 
    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {                                    
      lblLogout.setBackground(new Color(255,255,255));
      lblLogout.setForeground(new Color(0,0,0));         
    }                                   
    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {                                   
      lblLogout.setBackground(new Color(0,0,0));
      lblLogout.setForeground(new Color(255,255,255));
         
    }                                  

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton lblLogout;
    private javax.swing.JButton btnChangePin;
    private javax.swing.JButton btnCheckBal;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblMyBank;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
}