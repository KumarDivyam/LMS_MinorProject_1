/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package My_forms;


import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author divyp
 */
public class MembersInfoCardForm extends javax.swing.JFrame {

    /**
     * Creates new form MembersListForm
     */
    My_classes.Member member= new My_classes.Member();
    My_classes.Author author= new My_classes.Author();
    My_classes.Func_Class func=new My_classes.Func_Class();
    My_classes.Genre genre = new My_classes.Genre();
    
    
    
    public MembersInfoCardForm(int member_id) {
        initComponents();
        
        this.setLocationRelativeTo(null);
        // add a gray border to the panel
          Border panelHeader_1_Border= BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(255,102,153));
        jPanel1.setBorder(panelHeader_1_Border);
        
        
        func.displayImage(90, 60, null, "/My_images/members.png", jLabel_FormTitle1);
        
      
        
         Border JlabelImageBorder= BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1,152,117));
        jLabel_Image1.setBorder(JlabelImageBorder);
        
        //adding default image to jLabel_Image1
         func.displayImage(260, 159, null, "/My_images/blank people.png", jLabel_Image1);
         displayMemberInfo(member_id);
         

    }
    
    // create a function to display the member info
    public void displayMemberInfo(int _member_id)
    {
        try {
            My_classes.Member SelectedMember=member.getMemberById(_member_id);
            
             
            if(SelectedMember!=null)
            { 
            jLabel_ID.setText(String.valueOf(SelectedMember.getId()));
            jLabel_Name.setText(SelectedMember.getFirstName()+" "+SelectedMember.getLastName());
            jLabel_Email.setText(SelectedMember.getEmail());
            jLabel_Phone.setText(SelectedMember.getPhone());
            jLabel_Gender.setText(SelectedMember.getGender());
            
           
          
            
            //display the member image
            
            byte[] image= SelectedMember.getPicture();
            func.displayImage(190, 134, image, "", jLabel_Image1);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No member with this Id is Found ", "Invalid Id!", 3);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MembersInfoCardForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Image = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_Image1 = new javax.swing.JLabel();
        jLabel_ID = new javax.swing.JLabel();
        jLabel_Name = new javax.swing.JLabel();
        jLabel_Phone = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_Gender = new javax.swing.JLabel();
        jLabel_CloseFormMouseClicked = new javax.swing.JLabel();

        jLabel_Image.setBackground(new java.awt.Color(153, 255, 255));
        jLabel_Image.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle1.setBackground(new java.awt.Color(255, 102, 153));
        jLabel_FormTitle1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_FormTitle1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle1.setText("Member Info Card");
        jLabel_FormTitle1.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));

        jLabel_Image1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_Image1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Image1.setOpaque(true);

        jLabel_ID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_ID.setText("ID");

        jLabel_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Name.setText("Full-Name");

        jLabel_Phone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Phone.setText("Phone");

        jLabel_Email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Email.setText("Email");

        jLabel_Gender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Gender.setText("Gender");

        jLabel_CloseFormMouseClicked.setBackground(new java.awt.Color(255, 102, 153));
        jLabel_CloseFormMouseClicked.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel_CloseFormMouseClicked.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CloseFormMouseClicked.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseFormMouseClicked.setText("X");
        jLabel_CloseFormMouseClicked.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseFormMouseClicked.setOpaque(true);
        jLabel_CloseFormMouseClicked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseFormMouseClickedMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Image1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel_ID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_Name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                .addComponent(jLabel_Phone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_Email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(697, 697, 697)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_FormTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_CloseFormMouseClicked, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_CloseFormMouseClicked, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jLabel_FormTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_ID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_Phone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_Email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_Gender)
                                .addGap(0, 51, Short.MAX_VALUE))
                            .addComponent(jLabel_Image1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel9)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseFormMouseClickedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseFormMouseClickedMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseFormMouseClickedMouseClicked

    
    
    
    
    
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
                 //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                   //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MembersInfoCardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MembersInfoCardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MembersInfoCardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MembersInfoCardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MembersInfoCardForm(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_CloseFormMouseClicked;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_FormTitle1;
    private javax.swing.JLabel jLabel_Gender;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_Image1;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Phone;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
