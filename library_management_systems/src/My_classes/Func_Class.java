
package My_classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.SQLException;

/**
 *
 * @author Divyam
 */
public class Func_Class {
     public void displayImage(int width, int height ,byte[] imagebyte, String ImagePath, JLabel label)
    {
        //get the image
        ImageIcon imgIco;
        
        if(imagebyte!=null)//get image using bytes
        {
            imgIco=new ImageIcon(imagebyte);
        }
        else// get image using path
        {
            try
            {
                 imgIco=new ImageIcon(getClass().getResource(ImagePath));
            }
            
           catch(Exception e)
           {
               imgIco=new ImageIcon(ImagePath);
           }
            
        }
        
        Image image=imgIco.getImage().getScaledInstance(width,height, Image.SCALE_SMOOTH );
        label.setIcon(new ImageIcon(image));
        
     
    }
     //function to select iamge
     public String selectImage()
     {  
         String path = null;
         JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Profile Picture");
        
        fileChooser.setCurrentDirectory(new File("D\\Pics"));
        
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Image",".png",".jpg",".jpeg");
        fileChooser.addChoosableFileFilter(extensionFilter);
        
        int fileState = fileChooser.showSaveDialog(null);
        
        if (fileState == JFileChooser.APPROVE_OPTION)
        {
             path = fileChooser.getSelectedFile().getAbsolutePath();   
        }
        
        return path;
     }
     //function to customize jTable
     
     public void customTable(JTable table)
     {
        table.setSelectionBackground(new Color(236, 179, 101));
        table.setSelectionForeground(Color.white);
        table.setRowHeight(30);
        table.setShowGrid(false);
        table.setBackground(new Color(255,196,196));
        table.setShowHorizontalLines(true);
        table.setGridColor(new Color(205,103,255));
         
     }
     // function to customize the jlabel Header
     public void customTableHeader(JTable table, Color back_Color, Integer fontSize)
     {
         table.getTableHeader().setBackground(back_Color);
        table.getTableHeader().setForeground(Color.white);
        table.getTableHeader().setFont(new Font("Verdana", Font.BOLD,fontSize));
        table.getTableHeader().setOpaque(false);
     }
     //create a function to return a resultSet
     public ResultSet getData(String query)
     {
         
            PreparedStatement ps;
            ResultSet rs=null;
            
            try {
             ps = DB.getConnection().prepareStatement(query);
             rs=ps.executeQuery();
              }
            catch (SQLException ex) {
            Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
            return rs;
         
     }

     public int countData(String tableName)
     {
         int total  = 0;
         ResultSet rs;
         Statement st;
         
         try {
             st = DB.getConnection().createStatement();
             rs = st.executeQuery("SELECT COUNT(*) as total FROM `"+tableName+"` ");
         if(rs.next())
         {
             total = rs.getInt("total");
         }
         
         } catch (SQLException ex) {
             Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         return total;
     }

}
