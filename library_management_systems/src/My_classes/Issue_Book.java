/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package My_classes;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author divyp
 */
public class Issue_Book {
    
private int book_id; 
private int member_id;
private String status; 
private String issue_date; 
private String Return_date; 
private String note;

    public Issue_Book() {
       
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public void setReturn_date(String Return_date) {
        this.Return_date = Return_date;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getBook_id() {
        return book_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public String getStatus() {
        return status;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public String getReturn_date() {
        return Return_date;
    }

    public String getNote() {
        return note;
    }

    public Book getBook() {
        return book;
    }
    
    public Issue_Book(int _book_id, int _member_id,String _status,String _issue_date,String _Return_date,String _note){
        this.book_id=_book_id;
        this.member_id=_member_id;
        this.status=_status;
        this.issue_date=_issue_date;
        this.Return_date=_Return_date;
        this.note=_note;
    }

Book book= new Book();
Func_Class func=new Func_Class();


public void addIssue (int _book_id, int _member_id, String _status, String _issue_date, String _return_date, String _note){
     
    String insertQuery = "INSERT INTO `issue_book`(`book_id`, `member_id`, `status`, `issue_date`, `return_date`, `note`) VALUES (?,?,?,?,?,?)";
    
           try {
            java.sql.PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setInt(1, _book_id);
            ps.setInt(2, _member_id);
            ps.setString(3, _status);
            ps.setString(4, _issue_date);
            ps.setString(5, _return_date);
            ps.setString(6, _note);
        
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Issue Added", "add issue", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Issue Not Added", "add issue", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
}

//updating  Issue
public void updateIssue (int _book_id, int _member_id, String _status,String _issue_date, String _return_date, String _note){
     
    String updateQuery = "UPDATE `issue_book` SET `status`= ?,`return_date`= ?,`note`= ?  WHERE `book_id` = ? AND `member_id` = ? AND `issue_date` = ?";
    
           try {
            java.sql.PreparedStatement ps = DB.getConnection().prepareStatement(updateQuery);
            
            
            ps.setString(1, _status);
            ps.setString(2, _return_date);
            ps.setString(3, _note);
            ps.setInt(4, _book_id);
            ps.setInt(5, _member_id);
            ps.setString(6, _issue_date);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Status Updated", "Book Issue", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Status Not Updated", "Book Issue", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
}

//function to check weather the book is available
//how to do that?
//get the book quantity from table books
public boolean checkBookAvailability(int _book_id)
{
    boolean availability=false;
    try {
        //getting quantity
        Book selectedBook=book.getBookById(_book_id);
        int quantity= selectedBook.getQuantity();
        //get the number of books issued (the same book)
        int issued_book_count=countData(_book_id);
        
        if(quantity>issued_book_count)
        {
            availability=true;
        }
        else
        {
            availability=false;
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
    }
    return availability;
    
    
}
//function to count number of issued book
 public int countData(int _book_id)
     {
         int total  = 0;
         ResultSet rs;
         PreparedStatement ps;
         
         try {
             ps = DB.getConnection().prepareStatement("SELECT COUNT(*) as total FROM `issue_book` WHERE book_id=? AND `status`='issued'");
             ps.setInt(1,_book_id);
             rs = ps.executeQuery();
             
             
         if(rs.next())
         {
             total = rs.getInt("total");
         }
         
         } catch (SQLException ex) {
             Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         return total;
     }
 //creating a function to populate jTable with issued/returned/lost books
  public ArrayList<Issue_Book> issuedbooksList(String _status)
        {
            ArrayList<Issue_Book> ibList= new ArrayList<>();
            String query;
            if(_status.equals(""))
            {
                query="SELECT * FROM `issue_book`";
            }
            else
            {
               query="SELECT * FROM `issue_book` WHERE  `status`= '"+_status+"'";  
            }

            try {
               
            ResultSet rs=func.getData(query);
            Issue_Book ibook;
             
             while(rs.next())
             {
                 ibook = new Issue_Book(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),   
                            rs.getString(5),rs.getString(6));
                 ibList.add(ibook);
             }
          
           
        }
            catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
            return ibList;
            
        }
     

    public void removeFromIssuedTable(int _book_id,int _member_id,String _issued_date)
    {   
        String editQuery = "DELETE FROM `issue_book` WHERE `book_id` = ? AND `member_id` = ? AND `issue_date`= ?";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            
            
            ps.setInt(1, _book_id);
            ps.setInt(2, _member_id);
            ps.setString(3, _issued_date);
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Deleted Sucessfully", "remove", 1);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Not Deleted", "remove", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}


}
