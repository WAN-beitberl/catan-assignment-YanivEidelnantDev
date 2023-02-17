import javax.sound.sampled.Line;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame f = new JFrame("קטאן קטן");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setPreferredSize(new Dimension(1200, 800));

        drawTitleScreen(f);

        f.pack();
        f.setVisible(true);

    }

    // Method to draw the title screen
    public static void drawTitleScreen(JFrame f) {
        JPanel titlePanel = new JPanel(new BorderLayout());
        ImageIcon icon = new ImageIcon("catankatan.png");
        JLabel label = new JLabel(icon);
        titlePanel.add(label, BorderLayout.CENTER);

        label.setLayout(new GridBagLayout());
        GridBagConstraints gbc =  new GridBagConstraints();

        JButton playButton = new JButton("PLAY", new ImageIcon("playicon.png"));
        playButton.setFont(new Font("Tahoma", Font.BOLD, 50));
        playButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        playButton.setFocusPainted(false);
        playButton.setForeground(new Color(0xFFFFFF));
        playButton.setBackground(Color.RED);

        gbc.gridx= 0;
        gbc.gridy= 0;
        label.add(playButton, gbc);
        playButton.addActionListener(e -> {
            f.remove(label);
            Window w = new Window();
            f.setContentPane(w);
            f.revalidate();
            f.repaint();
        });


        f.setContentPane(titlePanel);
    }
}
