import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GUI{
    JFrame frame;
    //DBController dbc;
    //StudentPanel studentPanel;
    
    public GUI(){
        //dbc = new DBController(this);
        frame = new JFrame("Bundesliga-Datenbank");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setPreferredSize(new Dimension (1000, 537));
        
        //studentPanel = new StudentPanel(this);
        //studentPanel.updateStudents();
        //studentPanel.updateClasses();
        
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