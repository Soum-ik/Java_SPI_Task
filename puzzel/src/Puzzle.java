import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.io.*;
import javax.sound.sampled.*;

public class Puzzle extends Frame implements ActionListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    String playerName;
    long startTime;
    int moves;

    Puzzle() {
        super("Puzzle - JavaTpoint");
        // Add project info at the top
        Label projectInfo = new Label("Project by: Author Team Stack");
        projectInfo.setBounds(10, 30, 200, 20);
        add(projectInfo);

        playerName = JOptionPane.showInputDialog(this, "Enter your name:");

        b1 = new Button("1");
        b1.setBounds(200, 200, 60, 60);
        b2 = new Button("2");
        b2.setBounds(270, 200, 60, 60);
        b3 = new Button("3");
        b3.setBounds(340, 200, 60, 60);
        b4 = new Button("4");
        b4.setBounds(200, 270, 60, 60);
        b5 = new Button("5");
        b5.setBounds(270, 270, 60, 60);
        b6 = new Button("6");
        b6.setBounds(340, 270, 60, 60);
        b7 = new Button("7");
        b7.setBounds(200, 340, 60, 60);
        b8 = new Button("");
        b8.setBounds(270, 340, 60, 60);
        b9 = new Button("8");
        b9.setBounds(340, 340, 60, 60);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        startTime = System.currentTimeMillis();
        moves = 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        playSound("/sound/drop.mp3");
        if (e.getSource() == b1) {
            String label = b1.getLabel();
            if (b2.getLabel().equals("")) {
                b2.setLabel(label);
                b1.setLabel("");
            } else if (b4.getLabel().equals("")) {
                b4.setLabel(label);
                b1.setLabel("");
            }
        } else if (e.getSource() == b2) {
            String label = b2.getLabel();
            if (b1.getLabel().equals("")) {
                b1.setLabel(label);
                b2.setLabel("");
            } else if (b3.getLabel().equals("")) {
                b3.setLabel(label);
                b2.setLabel("");
            } else if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b2.setLabel("");
            }
        } else if (e.getSource() == b3) {
            String label = b3.getLabel();
            if (b2.getLabel().equals("")) {
                b2.setLabel(label);
                b3.setLabel("");
            } else if (b6.getLabel().equals("")) {
                b6.setLabel(label);
                b3.setLabel("");
            }
        } else if (e.getSource() == b4) {
            String label = b4.getLabel();
            if (b1.getLabel().equals("")) {
                b1.setLabel(label);
                b4.setLabel("");
            } else if (b7.getLabel().equals("")) {
                b7.setLabel(label);
                b4.setLabel("");
            } else if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b4.setLabel("");
            }
        } else if (e.getSource() == b5) {
            String label = b5.getLabel();
            if (b2.getLabel().equals("")) {
                b2.setLabel(label);
                b5.setLabel("");
            } else if (b4.getLabel().equals("")) {
                b4.setLabel(label);
                b5.setLabel("");
            } else if (b6.getLabel().equals("")) {
                b6.setLabel(label);
                b5.setLabel("");
            } else if (b8.getLabel().equals("")) {
                b8.setLabel(label);
                b5.setLabel("");
            }
        } else if (e.getSource() == b6) {
            String label = b6.getLabel();
            if (b3.getLabel().equals("")) {
                b3.setLabel(label);
                b6.setLabel("");
            } else if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b6.setLabel("");
            } else if (b9.getLabel().equals("")) {
                b9.setLabel(label);
                b6.setLabel("");
            }
        } else if (e.getSource() == b7) {
            String label = b7.getLabel();
            if (b4.getLabel().equals("")) {
                b4.setLabel(label);
                b7.setLabel("");
            } else if (b8.getLabel().equals("")) {
                b8.setLabel(label);
                b7.setLabel("");
            }
        } else if (e.getSource() == b8) {
            String label = b8.getLabel();
            if (b7.getLabel().equals("")) {
                b7.setLabel(label);
                b8.setLabel("");
            } else if (b9.getLabel().equals("")) {
                b9.setLabel(label);
                b8.setLabel("");
            } else if (b5.getLabel().equals("")) {
                b5.setLabel(label);
                b8.setLabel("");
            }
        } else if (e.getSource() == b9) {
            String label = b9.getLabel();
            if (b6.getLabel().equals("")) {
                b6.setLabel(label);
                b9.setLabel("");
            } else if (b8.getLabel().equals("")) {
                b8.setLabel(label);
                b9.setLabel("");
            }
        }
        moves++;
        //congrats code
        if (b1.getLabel().equals("1") && b2.getLabel().equals("2") && b3.getLabel()
                .equals("3") && b4.getLabel().equals("4") && b5.getLabel().equals("5")
                && b6.getLabel().equals("6") && b7.getLabel().equals("7") && b8.getLabel()
                .equals("8") && b9.getLabel().equals("")) {
            long endTime = System.currentTimeMillis();
            long timeTaken = (endTime - startTime) / 1000; // in seconds
            playSound("hooray.wav");
            JOptionPane.showMessageDialog(this, "Congratulations, " + playerName + "!\nMoves: " + moves + "\nTime taken: " + timeTaken + " seconds");
        }
    }

    private void playSound(String fileName) {
        try {
            File soundFile = new File(fileName);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Puzzle();
    }
}
