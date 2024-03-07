import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PuzzleGame extends JFrame implements ActionListener {
    private JPanel panel;
    private List<JButton> buttons;
    private JButton resetButton;
    private JLabel movesLabel;
    private int gridSize = 4;
    private int tileSize = 100;
    private int emptyIndex;
    private int movesCount;
    private Timer timer;
    private JLabel timerLabel;
    private int seconds;
    private int minutes;
    private String userName;

    private static List<User> userList = new ArrayList<>();

    public PuzzleGame() {
        setTitle("Puzzle Game");
        setSize(gridSize * tileSize, gridSize * tileSize + 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Prompt for user details
        userName = JOptionPane.showInputDialog(this, "Please enter your name:", "User Details", JOptionPane.QUESTION_MESSAGE);

        panel = new JPanel(new GridLayout(gridSize, gridSize));
        buttons = new ArrayList<>();

        // Create tiles and add to the panel
        for (int i = 0; i < gridSize * gridSize; i++) {
            JButton button;
            if (i == gridSize * gridSize - 1) {
                button = new JButton();
                button.setEnabled(false);
                emptyIndex = i;
            } else {
                button = new JButton(String.valueOf(i + 1));
                button.addActionListener(this);
            }
            button.setPreferredSize(new Dimension(tileSize, tileSize));
            panel.add(button);
            buttons.add(button);
        }

        // Shuffle the tiles
        Collections.shuffle(buttons);

        // Add panel to frame
        add(panel, BorderLayout.CENTER);

        // Add reset button
        resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        add(resetButton, BorderLayout.SOUTH);

        // Add moves label
        movesLabel = new JLabel("Moves: 0");
        add(movesLabel, BorderLayout.NORTH);

        // Add timer
        timerLabel = new JLabel("Time: 00:00");
        add(timerLabel, BorderLayout.EAST);

        // Start the timer
        startTimer();

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            resetGame();
        } else {
            JButton button = (JButton) e.getSource();
            int index = buttons.indexOf(button);
            if (isAdjacent(index, emptyIndex)) {
                Collections.swap(buttons, index, emptyIndex);
                updatePanel();
                movesCount++;
                movesLabel.setText("Moves: " + movesCount);
                if (isGameComplete()) {
                    timer.stop();
                    JOptionPane.showMessageDialog(this, "Congratulations " + userName + "! You solved the puzzle in " +
                            String.format("%02d:%02d", minutes, seconds) + " with " + movesCount + " moves.", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
                    userList.add(new User(userName, movesCount, String.format("%02d:%02d", minutes, seconds)));
                }
            }
        }
    }

    private boolean isAdjacent(int index1, int index2) {
        int row1 = index1 / gridSize;
        int col1 = index1 % gridSize;
        int row2 = index2 / gridSize;
        int col2 = index2 % gridSize;

        return Math.abs(row1 - row2) + Math.abs(col1 - col2) == 1;
    }

    private void updatePanel() {
        panel.removeAll();
        for (JButton button : buttons) {
            panel.add(button);
        }
        revalidate();
        repaint();
    }

    private boolean isGameComplete() {
        for (int i = 0; i < gridSize * gridSize - 1; i++) {
            if (!buttons.get(i).getText().equals(String.valueOf(i + 1))) {
                return false;
            }
        }
        return true;
    }

    private void startTimer() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seconds++;
                if (seconds == 60) {
                    minutes++;
                    seconds = 0;
                }
                timerLabel.setText("Time: " + String.format("%02d:%02d", minutes, seconds));
            }
        });
        timer.start();
    }

    private void resetGame() {
        seconds = 0;
        minutes = 0;
        movesCount = 0;
        movesLabel.setText("Moves: 0");
        Collections.shuffle(buttons);
        updatePanel();
        timer.stop();
        startTimer();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PuzzleGame::new);
    }
}

class User {
    private String name;
    private int moves;
    private String time;

    public User(String name, int moves, String time) {
        this.name = name;
        this.moves = moves;
        this.time = time;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", moves=" + moves +
                ", time='" + time + '\'' +
                '}';
    }
}
