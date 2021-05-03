package wilk.marcin;

import javax.swing.JPanel;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainPanel extends JPanel {
    private final int rows;
    private final int columns;

    private final int speed;
    private final double propability;

    private List<Square> squares;

    public MainPanel(int m, int n, int k, double p) {
        squares = new ArrayList<>();

        rows = m;
        columns = n;
        speed = k;
        propability = p;

        setLayout(new GridLayout(rows, columns));
        createGrid();
    }

    public void createGrid() {
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                JPanel panel = new JPanel();
                squares.add(new Square(panel, speed, propability));
                add(panel);
            }
        }
    }
}
