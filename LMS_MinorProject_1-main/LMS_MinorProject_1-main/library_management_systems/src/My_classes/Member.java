
package My_classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Member {
    
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String gender;
    private byte[] picture;
    
    public Member () {}
        public Member(int _id, String _fname, String _lname, String _phone, String _email,String _gender, byte[] _picture)
    {
        this.id= _id;
        this.firstName=_fname;
        this.lastName=_lname;
        this.phone=_phone;
        this.email=_email;
        this.gender=_gender;
        this.picture=_picture;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
    
    //insert new Member Function
   public void addMember(String _fname,String _lname,String _phone,String _email,String _gender, byte[] _picture)
    {   
        String insertQuery = "INSERT INTO `members`(`firstName`, `lastName`, `phone`, `email`, `gender`, `picture`) VALUES (?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setString(1,_fname);
            ps.setString(2,_lname);
            ps.setString(3,_phone);
            ps.setString(4,_email);
            ps.setString(5,_gender);
            ps.setBytes(6,_picture);
          
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Member Added", "add member", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Member Not Added", "member", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
   //edit Member
   public void editMember(Integer _id,String _fname,String _lname,String _phone,String _email,String _gender, byte[] _picture)
    {   
        String editQuery = "UPDATE `members` SET `firstName`=?,`lastName`=?,`phone`=?,`email`=?,`gender`=?,`picture`=? WHERE `id` = ?";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            
            ps.setString(1,_fname);
            ps.setString(2,_lname);
            ps.setString(3,_phone);
            ps.setString(4,_email);
            ps.setString(5,_gender);
            ps.setBytes(6,_picture);
            ps.setInt(7,_id);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Member Edited", "edit Author", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Member Not Edited", "edit Author", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
   
       
 public void removeMember(int _id)
    {   
        String editQuery = "DELETE FROM `author` WHERE `id` = ?";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            
            
            ps.setInt(1, _id);
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Member Deleted", "remove", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Member Not Deleted", "remove", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}

 
 
 
}
