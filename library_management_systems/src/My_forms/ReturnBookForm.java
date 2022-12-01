/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package My_forms;


import java.awt.Color;
import java.awt.HeadlessException;
import static java.awt.SystemColor.text;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author divyp
 */
public class ReturnBookForm extends javax.swing.JFrame {

    /**
     * Creates new form MembersListForm
     */
    My_classes.Member member= new My_classes.Member();
    My_classes.Func_Class func=new My_classes.Func_Class();
    My_classes.Book book=new My_classes.Book();
    My_classes.Issue_Book isb=new My_classes.Issue_Book();
    // these are flags
    boolean book_Exist= false;
    boolean member_Exist=false;
    
    public ReturnBookForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        // add a gray border to the panel
          Border panelHeader_1_Border= BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(0,51,153));
        jPanel1.setBorder(panelHeader_1_Border);
        
        
        func.displayImage(90, 60, null, "/My_images/issuebook.png", jLabel_FormTitle1);
        setBorderToJLabel(jLabel_BookName,Color.white);
        setBorderToJLabel(jLabel_MemberFullName,Color.white);
        
          //custom table 
       func.customTable(jTable_IssuedBookList);
        
        
        
        //custom jtable Headers
        func.customTableHeader(jTable_IssuedBookList,new Color(34,167,240),16);
        
        populateJtableWithIssuedBooks("");
      
        
        
     
        /*
        //adding default image to jLabel_Image1
         func.displayImage(260, 159, null, "/My_images/blank people.png", jLabel_Image1);
         
        */
         
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
        jLabel_CloseFormMouseClicked = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton_Return = new javax.swing.JButton();
        jDateChooser_IssueDate = new com.toedter.calendar.JDateChooser();
        jLabel_BookName = new javax.swing.JLabel();
        jLabel_MemberFullName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser_Return_Date = new com.toedter.calendar.JDateChooser();
        jSpinner_BookId = new javax.swing.JSpinner();
        jSpinner_MemberID = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Note = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_IssuedBookList = new javax.swing.JTable();
        jButton_Lost = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_Status = new javax.swing.JComboBox<>();
        jButton_Delete = new javax.swing.JButton();

        jLabel_Image.setBackground(new java.awt.Color(153, 255, 255));
        jLabel_Image.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel_FormTitle1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel_FormTitle1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle1.setText("Return Book");
        jLabel_FormTitle1.setOpaque(true);

        jLabel_CloseFormMouseClicked.setBackground(new java.awt.Color(0, 51, 102));
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

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Book ID:");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Issue Date:");

        jButton_Return.setBackground(new java.awt.Color(0, 153, 153));
        jButton_Return.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Return.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Return.setText("Return");
        jButton_Return.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jButton_Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReturnActionPerformed(evt);
            }
        });

        jDateChooser_IssueDate.setEnabled(false);

        jLabel_BookName.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_BookName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel_BookName.setForeground(new java.awt.Color(102, 204, 255));
        jLabel_BookName.setText("Book Name");
        jLabel_BookName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_BookName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BookNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_BookNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_BookNameMouseExited(evt);
            }
        });

        jLabel_MemberFullName.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_MemberFullName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel_MemberFullName.setForeground(new java.awt.Color(102, 204, 255));
        jLabel_MemberFullName.setText("Member Full Name");
        jLabel_MemberFullName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MemberFullName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MemberFullNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MemberFullNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MemberFullNameMouseExited(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Member ID:");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Return Date:");

        jSpinner_BookId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jSpinner_BookId.setEnabled(false);

        jSpinner_MemberID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jSpinner_MemberID.setEnabled(false);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Note:");

        jTextArea_Note.setColumns(20);
        jTextArea_Note.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Note);

        jTable_IssuedBookList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_IssuedBookList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_IssuedBookListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_IssuedBookList);

        jButton_Lost.setBackground(new java.awt.Color(0, 153, 153));
        jButton_Lost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Lost.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Lost.setText("Lost");
        jButton_Lost.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jButton_Lost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LostActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Select Book Status:");

        jComboBox_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Returned", "Issued", "Lost" }));
        jComboBox_Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_StatusActionPerformed(evt);
            }
        });

        jButton_Delete.setBackground(new java.awt.Color(0, 153, 153));
        jButton_Delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Delete.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Delete.setText("Delete");
        jButton_Delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
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
                        .addComponent(jLabel_FormTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_CloseFormMouseClicked, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(194, 194, 194)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel_BookName)
                                                .addGap(111, 111, 111))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel12)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jDateChooser_Return_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(96, 96, 96))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jLabel13))
                                                    .addGap(28, 28, 28)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jDateChooser_IssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jSpinner_BookId, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel_MemberFullName)
                                                                .addGap(71, 71, 71))
                                                            .addComponent(jSpinner_MemberID))))))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton_Return, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton_Lost, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(26, 26, 26)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_CloseFormMouseClicked, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_FormTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jSpinner_BookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_BookName)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jSpinner_MemberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_MemberFullName)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser_IssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser_Return_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Return, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Lost, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseFormMouseClickedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseFormMouseClickedMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseFormMouseClickedMouseClicked

    private void jButton_ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReturnActionPerformed
        //return a book
        int _book_id = (int)jSpinner_BookId.getValue();
        int _member_id = (int)jSpinner_MemberID.getValue();
        String _note = jTextArea_Note.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
        String _issue_date = dateFormat.format(jDateChooser_IssueDate.getDate());
        String _return_date = dateFormat.format(jDateChooser_Return_Date.getDate());
        //checking weather the issue date is before return date
        
        Date issDate=dateFormat.parse(_issue_date);
        Date retDate=dateFormat.parse(_return_date);
        
        //Checking weather the book and member exist
        if(retDate.before(issDate))
        {
            JOptionPane.showMessageDialog(null, "return date cannot be before issue date", "Select valid Dates", 2);
        }
        else{
             isb.updateIssue(_book_id, _member_id, "returned", _issue_date, _return_date, _note);
             //reset fields
             jSpinner_BookId.setValue(0);
             jSpinner_MemberID.setValue(0);
             jLabel_BookName.setText("Book Name");
             jLabel_MemberFullName.setText("Member Full Name");
             jDateChooser_IssueDate.setDate(new Date());
             jDateChooser_Return_Date.setDate(new Date());
             jTextArea_Note.setText("");
             
        }
        
       
            
        }
        catch(HeadlessException|NullPointerException | ParseException ex){
            JOptionPane.showMessageDialog(null, "Select An Item From the Table", "Select Item", 2);
        }
        
      
    }//GEN-LAST:event_jButton_ReturnActionPerformed

    private void jLabel_BookNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookNameMouseClicked
       int book_id=(int)jSpinner_BookId.getValue();
       BooksInfoCardForm bicf=new BooksInfoCardForm(book_id);
       bicf.setVisible(true);
    }//GEN-LAST:event_jLabel_BookNameMouseClicked

    private void jLabel_BookNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookNameMouseEntered
        // adding border to the book name 
    setBorderToJLabel(jLabel_BookName,new Color(51,102,255));
        
    }//GEN-LAST:event_jLabel_BookNameMouseEntered

    private void jLabel_BookNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookNameMouseExited
        // adding white border on exit
        setBorderToJLabel(jLabel_BookName,Color.white);
    }//GEN-LAST:event_jLabel_BookNameMouseExited

    private void jLabel_MemberFullNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MemberFullNameMouseEntered
        setBorderToJLabel(jLabel_MemberFullName,new Color(51,102,255));
    }//GEN-LAST:event_jLabel_MemberFullNameMouseEntered

    private void jLabel_MemberFullNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MemberFullNameMouseExited
        setBorderToJLabel(jLabel_MemberFullName,Color.white);
    }//GEN-LAST:event_jLabel_MemberFullNameMouseExited

    private void jLabel_MemberFullNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MemberFullNameMouseClicked
        int member_id=(int)jSpinner_MemberID.getValue();
        MembersInfoCardForm micf=new MembersInfoCardForm(member_id);
        micf.setVisible(true);
    }//GEN-LAST:event_jLabel_MemberFullNameMouseClicked

    private void jTable_IssuedBookListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_IssuedBookListMouseClicked
        
        //get the selected row index

        int index=jTable_IssuedBookList.getSelectedRow();

        //get values
        int  book_id =Integer.parseInt(jTable_IssuedBookList.getValueAt(index, 0).toString());
        int member_id = Integer.parseInt(jTable_IssuedBookList.getValueAt(index, 1).toString());
        
        My_classes.Book selectedBook;
         My_classes.Member selectedMember ;
        try {
            selectedBook = book.getBookById(book_id);
            //diplay book name
            jSpinner_BookId.setValue(selectedBook.getId());
            jLabel_BookName.setText(selectedBook.getName());
            
            selectedMember = member.getMemberById(member_id);
            // display name
            jSpinner_MemberID.setValue(selectedMember.getId());
            jLabel_MemberFullName.setText(selectedMember.getFirstName() + " " + selectedMember.getLastName());
            
            jLabel_MemberFullName.setText("Member Full Name");
            String issued_date =jTable_IssuedBookList.getValueAt(index, 3).toString();
            String return_date = jTable_IssuedBookList.getValueAt(index, 4).toString();
            //String status =jTable_IssuedBookList.getValueAt(index, 4).toString();
            String note =jTable_IssuedBookList.getValueAt(index, 5).toString();
            //diplay the issue date
             Date issDate = new SimpleDateFormat("yyyy-MM-dd").parse(issued_date); 
             jDateChooser_IssueDate.setDate(issDate );
             
             //dispaly return date
             Date rtnDate = new SimpleDateFormat("yyyy-MM-dd").parse(return_date); 
             jDateChooser_Return_Date.setDate(rtnDate );
             
             jTextArea_Note.setText(note);
        } catch (SQLException ex) {
            Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        

        //show data in textfields


    }//GEN-LAST:event_jTable_IssuedBookListMouseClicked

    private void jButton_LostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LostActionPerformed
         // book is lost
         //update status to lost and quantity t -1
        int _book_id = (int)jSpinner_BookId.getValue();
        int _member_id = (int)jSpinner_MemberID.getValue();
        String _note = jTextArea_Note.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
        String _issue_date = dateFormat.format(jDateChooser_IssueDate.getDate());
        String _return_date = dateFormat.format(jDateChooser_Return_Date.getDate());
     
        isb.updateIssue(_book_id, _member_id, "lost", _issue_date, _return_date, _note);
             
             //changing the quantiy of the lost book
        int quantity = new My_classes.Book().getBookById(_book_id).getQuantity();
        book.setQuantity_Minus_One(_book_id,quantity - 1);
             
             //reset fields
        jSpinner_BookId.setValue(0);
        jSpinner_MemberID.setValue(0);
        jLabel_BookName.setText("Book Name");
        jLabel_MemberFullName.setText("Member Full Name");
        jDateChooser_IssueDate.setDate(new Date());
        jDateChooser_Return_Date.setDate(new Date());
        jTextArea_Note.setText("");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "", "Select Item", 1);
        }
    }//GEN-LAST:event_jButton_LostActionPerformed

    private void jComboBox_StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_StatusActionPerformed
        String status = jComboBox_Status.getSelectedItem().toString();
        if (status.equals("Al"))
                {
                    status = "";
                }
        populateJtableWithIssuedBooks(status);
    }//GEN-LAST:event_jComboBox_StatusActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        //delete selected issue from the database
        
        int index=jTable_IssuedBookList.getSelectedRow();
        try{
        int  book_id = Integer.parseInt(jTable_IssuedBookList.getValueAt(index, 0).toString());
        int member_id = Integer.parseInt(jTable_IssuedBookList.getValueAt(index, 1).toString());
        String _issued_date = jTable_IssuedBookList.getValueAt(index, 3).toString();
        
        isb.removeFromIssuedTable(book_id, member_id, _issued_date);    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Select a Row from the Table","Delete Error",1);
        }
        //get values
        
        
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    //create a function to set border 
    public void setBorderToJLabel(JLabel label,Color color)
    {
        Border border= BorderFactory.createMatteBorder(0, 0, 1, 0, color);
        label.setBorder(border);
    }
    
    
     public void populateJtableWithIssuedBooks(String _status)
    {
       
        ArrayList<My_classes.Issue_Book> ibList= isb.issuedbooksList(_status);
        
        String[] colNames= {"Book","Member", "Status","Iss-Date", "Retn-Date","Note"};
        
        //rowa
        Object[] [] rows = new Object[ibList.size()][colNames.length];
        
        for(int i=0;i<ibList.size();i++)
        {
            rows[i][0]=ibList.get(i).getBook_id();
            rows[i][1]=ibList.get(i).getMember_id();
            rows[i][2]=ibList.get(i).getStatus();
            rows[i][3]=ibList.get(i).getIssue_date();
            rows[i][4]=ibList.get(i).getReturn_date();
            rows[i][5]=ibList.get(i).getNote();


        }
        
        DefaultTableModel model=new DefaultTableModel(rows,colNames);
        jTable_IssuedBookList.setModel(model);
        
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
                 //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                   //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ReturnBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Lost;
    private javax.swing.JButton jButton_Return;
    private javax.swing.JComboBox<String> jComboBox_Status;
    private com.toedter.calendar.JDateChooser jDateChooser_IssueDate;
    private com.toedter.calendar.JDateChooser jDateChooser_Return_Date;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_BookName;
    private javax.swing.JLabel jLabel_CloseFormMouseClicked;
    private javax.swing.JLabel jLabel_FormTitle1;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_MemberFullName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner_BookId;
    private javax.swing.JSpinner jSpinner_MemberID;
    private javax.swing.JTable jTable_IssuedBookList;
    private javax.swing.JTextArea jTextArea_Note;
    // End of variables declaration//GEN-END:variables
}
