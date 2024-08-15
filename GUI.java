import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;
public class GUI extends JFrame{
    public GUI(String title){
        super(title);
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void paint(Graphics g) {
        Font f = new Font("Times New Roman", Font.BOLD, 20);
        
        // Background rectangle
        g.setColor(Color.cyan);
        g.fillRect(0, 0, 800, 600);
        
        // First rectangle and text
        g.setFont(f);
        g.setColor(Color.yellow);
        g.fillRect(20, 40, 400, 60);
        g.setColor(Color.blue);
        g.drawString("Welcome to Java Graphics", 30, 60);
        
        // Second rectangle and text
        g.setColor(Color.pink);
        g.fillRect(20, 110, 400, 60);
        g.setColor(Color.blue);
        g.drawString("Today is " + new Date(), 30, 130);
    }
    
    public static void main (String args[]){
        JFrame nframe = new GUI("This is a GUI application");
        nframe.setVisible(true);
    }
}