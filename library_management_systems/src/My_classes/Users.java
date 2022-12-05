package My_classes;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Rajat Gupta
 */
public class Users {
    
    private int id;
    private String firstname;
    private String lastname;
     private String username;
     private String password;
     private String userType;

   

    public void setUserType(String userType) {
        this.userType = userType;
    }
     

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
  public String getUserType() {
        return userType;
    }

    public Users() {
    }

    public Users(int id, String _firstname, String _lastname, String _username, String _password, String _userType ) {
        this.id = id;
        this.firstname = _firstname;
        this.lastname = _lastname;
        this.username = _username;
        this.password = _password;
        this.userType = _userType;
    }
    
    My_classes.Func_Class func= new Func_Class();
    public void addUser(String _fname,String _lname,String _username,String _password, String _user_type) throws java.sql.SQLException
    {   
        String insertQuery = "INSERT INTO `users_table`(`firstName`, `lastName`, `username`, `password`, `user_type`) VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setString(1,_fname);
            ps.setString(2,_lname);
            ps.setString(3,_username);
            ps.setString(4,_password);
            ps.setString(5, _user_type);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "User Added", "add User", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "User Not Added", "User Author", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
     public boolean checkUsernameExists(int _id,String _username)
    {
    ResultSet rs=func.getData(" SELECT * FROM `users_table` WHERE `username` = '"+ _username +"' and id <>" + _id);
           boolean exists = false;
             
        try {
            if(rs.next())
            {
               exists = true; 
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
             return exists;
    }
     
     
       public void editUser(int _id, String _fname,String _lname,String _username,String _password, String _user_type)
    {   
        String editQuery = "UPDATE `users_table` SET `firstName`=?,`lastName`=? ,`username`=?,`password`=?,`user_type`=? WHERE `id`=?";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            
            ps.setString(1,_fname);
            ps.setString(2,_lname);
            ps.setString(3,_username);
            ps.setString(4,_password);
            ps.setString(5,_user_type);
            ps.setInt(6, _id);
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "User Edited", "edit User", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "User Not Edited", "edit User", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
       
        public void removeUser(int _id)
    {   
        String editQuery = "DELETE FROM `users_table` WHERE `id` = ?";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            
            
            ps.setInt(1, _id);
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "User Deleted", "Delete User", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "User Not Deleted", "Delete User", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}

 
     public ArrayList<Users> usersList()
        {
            ArrayList<Users> uList= new ArrayList<>();
            

            
            
            try {
             
            ResultSet rs=func.getData("SELECT * FROM `users_table` where user_type <> 'owner'");
            Users user;
             
             while(rs.next())
                
             {
                 //`id`, `firstName`, `lastName`, `username`, `password`, `user_type`
                 user = new Users(rs.getInt("id"),rs.getString("firstname"),rs.getString("lastName"),rs.getString("username"),rs.getString("password"), rs.getString("user_type"));
                 uList.add(user);
             }
          
           
        }
            catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
            return uList;
            
        }
    

//function to allow the user to login
     public Users tryLogin(String _username, String _password)
     {
          
         ResultSet rs=func.getData("SELECT * FROM `users_table` WHERE `username` = '"+_username+"' AND `password` = '"+_password+"'");
            Users user = null;
             
        try {
            if (rs.next())
            {   //`id`, `firstName`, `lastName`, `username`, `password`, `user_type`
                user = new Users(rs.getInt("id"),rs.getString("firstname"),rs.getString("lastName"),rs.getString("username"),rs.getString("password"),rs.getString("user_type"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
             return user;
         
     }

}


