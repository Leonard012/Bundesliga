import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI{
    JFrame frame;
    //DBController dbc;
    //MainFrame mainFrame;
    
    public GUI(){
        //dbc = new DBController(this);
        frame = new JFrame("Bundesliga-Datenbank");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setPreferredSize(new Dimension (700, 400));
        frame.setLayout (null);
        
        //mainFrame = new StudentPanel(this);
        //mainFrame.updateStudents();
        //mainFrame.updateClasses();
        
        //frame.add(studentPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main (String[] args) {
        new GUI();
    }
    
    // public DBController getController(){
        // return dbc;
    // }
    public void switchToSide(String from, String to){
        
    }
    public void addPage(String page){
        
    }
    public void removePage(String page){
        
    }
    // public DatabaseController getDatabaseController(){
        
    // }
    
}