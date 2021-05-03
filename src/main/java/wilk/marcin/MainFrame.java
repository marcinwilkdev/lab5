package wilk.marcin;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class MainFrame extends JFrame {
    private JPanel mainPanel;

    public MainFrame(int rows, int columns, int speed, double propability) {
        mainPanel = new MainPanel(rows, columns, speed, propability);

        Dimension dimensions = Toolkit.getDefaultToolkit().getScreenSize();
        setSize((int) (dimensions.getWidth()/2), (int) (dimensions.getHeight()/2));

        add(mainPanel, BorderLayout.CENTER);
    }
}
