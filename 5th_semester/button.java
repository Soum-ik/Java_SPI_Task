// Swing is module for style java
import javax.swing.*;

// AWT is module for useing actinos or event
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        // Create the JFrame
        JFrame frame = new JFrame("Simple GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 450);

        // Create a JPanel to hold components
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setBounds(100, 100, 0, 0);
        // Set the layout manager for the panel
        panel.setLayout(new GridLayout(3, 1));
 
        // Create components
        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField();
        JButton submitButton = new JButton("Submit");
        
        Font largerFont = new Font("Arial", Font.BOLD, 29);
        panel.setFont(largerFont);
        // Add components to the panel
        panel.add(label);
        panel.add(textField);
        panel.add(submitButton); 
        // Add action listener to the button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
            }
        });

        // Set the frame visibility to true
        frame.setVisible(true);
    }
}
