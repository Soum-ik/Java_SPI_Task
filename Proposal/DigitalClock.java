import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.SwingConstants;
import java.util.*;
import java.text.*;

/**
 * Digital_Clock
 */
public class DigitalClock {

    public static void main(String[] args) {
        ClockLabel dataLabel = new ClockLabel("date");  // Change "data" to "date"
        ClockLabel timeLabel = new ClockLabel("time");
        ClockLabel dayLabel = new ClockLabel("day");
        ClockLabel teamLabel = new ClockLabel("team");
    
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame f = new JFrame("Digital Clock");
        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(4, 1));
    
        f.add(dataLabel);
        f.add(timeLabel);
        f.add(dayLabel);
        f.add(teamLabel);
    
        f.getContentPane().setBackground(Color.BLACK);
        f.setVisible(true);
    }
    
}

 
/**
 * InnerDigital_Clock
 */
  class ClockLabel extends JLabel implements ActionListener {
    String type;
    SimpleDateFormat sdf;

    public ClockLabel(String type){
        this.type = type;
        setForeground(Color.green);
        switch (type) {
            case "date" : sdf = new SimpleDateFormat(" MMMM dd yyyy");
                          setFont(new Font("sans-serif", Font.PLAIN, 32));
                          setHorizontalAlignment(SwingConstants.CENTER);
                          break;
            case "time" : sdf = new SimpleDateFormat(" hh:mm:ss a");
                          setFont(new Font("sans-serif", Font.PLAIN, 70));
                          setHorizontalAlignment(SwingConstants.CENTER);
                          break;
            case "day" : sdf = new SimpleDateFormat("EEEE");
                          setFont(new Font("sans-serif", Font.PLAIN, 36));
                          setHorizontalAlignment(SwingConstants.CENTER);
                          break;
                          case "team":
                          sdf = new SimpleDateFormat("'Presented By: Team Stack'");
                          setFont(new Font("sans-serif", Font.PLAIN, 18));  // Adjust the font size
                          setHorizontalAlignment(SwingConstants.CENTER);  // Center alignment
                          break;
          
            default     : sdf = new SimpleDateFormat();
                            break; 
        }
        Timer t = new Timer(1000, this);
        t.start();
    }

    public void actionPerformed(ActionEvent ae) {
        Date d = new Date();
        setText(sdf.format(d));
    }
    
}