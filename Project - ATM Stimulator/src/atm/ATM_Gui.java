/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author MR.COOL
 */
public class ATM_Gui extends javax.swing.JFrame {
    
    /**
     * Creates new form ATM_Gui
     */
   
    public static int len=0,totalUser=0,match=0,userNo=0;  
    static user[] user_card;
    static String current_user;

    
    public ATM_Gui() {
        initComponents();
        
    }
   
    void match(String usr,String pswd,user[]user_card){
        for(int i=0;i<totalUser;i++)
        {
            String forCard = user_card[i].getCardNo();
            String forPswd = user_card[i].getPinNo();
            if(usr.equals(forCard) & pswd.equals(forPswd))
            {
                JOptionPane.showMessageDialog(null, "Welcome to UnicornBank.\nPress ok to continue","Password matched",JOptionPane.INFORMATION_MESSAGE);
                userNo = i;
                match=1;
                break;
            }
            else if(i==(totalUser-1))
            {
                JOptionPane.showMessageDialog(null, "Incorrect username/password. Plese try again","Sorry!",JOptionPane.ERROR_MESSAGE );
                match=0;
                break;
            }
        }    
    }
    
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        text_cardnum = new javax.swing.JTextField();
        text_pin = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button_login = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label_logo2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome!");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 239, 239));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        text_cardnum.setBackground(new java.awt.Color(255, 239, 239));
        text_cardnum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_cardnum.setForeground(new java.awt.Color(140, 118, 165));
        text_cardnum.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        text_cardnum.setText("Card Number");
        text_cardnum.setBorder(null);
        text_cardnum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                text_cardnumMouseClicked(evt);
            }
        });
        text_cardnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_cardnumActionPerformed(evt);
            }
        });

        text_pin.setBackground(new java.awt.Color(255, 239, 239));
        text_pin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text_pin.setForeground(new java.awt.Color(140, 118, 165));
        text_pin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        text_pin.setText("......");
        text_pin.setBorder(null);
        text_pin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_pinFocusGained(evt);
            }
        });
        text_pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_pinActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(140, 118, 165));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 20));

        jSeparator2.setForeground(new java.awt.Color(140, 118, 165));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/card.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lock.png"))); // NOI18N

        button_login.setBackground(new java.awt.Color(140, 118, 165));
        button_login.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        button_login.setForeground(new java.awt.Color(140, 118, 165));
        button_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button_login.setText("Login");
        button_login.setToolTipText("");
        button_login.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(140, 118, 165)));
        button_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_loginMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(140, 118, 165));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Clear");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(140, 118, 165)));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_login, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(text_cardnum, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_pin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(text_cardnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(140, 118, 165));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label_logo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logonew.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(102, 191, 229));
        jLabel5.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(213, 221, 222));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/title.png"))); // NOI18N
        jLabel5.setText("ATM | DEPOSIT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(label_logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(label_logo2)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void text_pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_pinActionPerformed

    private void text_cardnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_cardnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_cardnumActionPerformed

    private void button_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_loginMouseClicked
        // TODO add your handling code here:
        String tpassword = new String(this.text_pin.getPassword());
        match(text_cardnum.getText(),tpassword,user_card);
        if(match==1)
        {
            current_user = text_cardnum.getText();
            close();
            GUI new_gui = new GUI(user_card,userNo,totalUser);
            new_gui.setVisible(true);
        }
    }//GEN-LAST:event_button_loginMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        text_pin.setText("");
        text_cardnum.setText("");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void text_pinFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_pinFocusGained
        // TODO add your handling code here:
        text_pin.setText("");
    }//GEN-LAST:event_text_pinFocusGained

    private void text_cardnumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_cardnumMouseClicked
        // TODO add your handling code here:
        text_cardnum.setText("");
    }//GEN-LAST:event_text_cardnumMouseClicked
    public static void readFile()
    {
        try 
        {
            FileReader read = new FileReader("user.txt");
            System.out.println("file exists!");
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println("File not exists!");
        }

        try 
        {
            RandomAccessFile read = new RandomAccessFile("user.txt", "rw");
            for(int i=0;read.readLine()!=null;i++)
                len++;
        }
        catch (FileNotFoundException ex) 
        {
           System.out.println("File not found in your device!");
        }
        catch (IOException ex) 
        {
           System.out.println("Failed to read the file!");	
        } 

        System.out.println("number of lines:"+len);
        totalUser = (len+1)/6;
        System.out.println("number of users:"+totalUser);
        user_card = new user[totalUser];
        try 
        {
            RandomAccessFile input = new RandomAccessFile("user.txt", "rw");
            for(int i=0;i<totalUser;i++)
            {
                String forCard = input.readLine().substring(9);
                String forPswd = input.readLine().substring(8);
                String forAccHolder = input.readLine().substring(11);
                String forAccNum = input.readLine().substring(8);
                Double forBalance =  Double.parseDouble(input.readLine().substring(8));
                Account account = new Account(forAccHolder,forBalance,forAccNum);
                user_card[i] = new user(forCard,forPswd,account);
                input.readLine();
            }
			
               
        }
        catch (FileNotFoundException ex) {
          	System.out.println("File not found in your device!");
        } catch (IOException ex) {
         	System.out.println("Failed to read the file!");
        }
        
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
            java.util.logging.Logger.getLogger(ATM_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        readFile();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATM_Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel button_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_logo2;
    private javax.swing.JTextField text_cardnum;
    private javax.swing.JPasswordField text_pin;
    // End of variables declaration//GEN-END:variables
}
