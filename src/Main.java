import javax.swing.*;
import javax.swing.text.StyledEditorKit;

import packages.informationPage;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Create and configure the main frame
        JFrame frame = new JFrame("Survey form");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(Color.YELLOW);

        // Create font
        Font font = new Font("Serif",Font.PLAIN,15);

        // Create title label
        JLabel title = new JLabel("Servey form");
        title.setFont(font);
        title.setHorizontalAlignment(JLabel.CENTER);

        // Create start button
        JButton startButton = new JButton("Start!");
        startButton.setFont(font);
      
        // Add components to the panel
        panel.add(title, BorderLayout.NORTH);
        panel.add(startButton, BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
