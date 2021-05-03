package wilk.marcin;

import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JPanel;
import java.awt.*;

public class Square {
    private JPanel panel;
    private Color color;
    private Thread thread;

    public Square(JPanel panel, int speed, double propability) {
        this.panel = panel;
        this.color = Color.BLACK;

        thread = new Thread(() -> {
            try {
                while(true) {
                    if(ThreadLocalRandom.current().nextDouble(0.0, 1.0) < propability) {
                        int red = ThreadLocalRandom.current().nextInt(0, 255);
                        int green = ThreadLocalRandom.current().nextInt(0, 255);
                        int blue = ThreadLocalRandom.current().nextInt(0, 255);
    
                        color = new Color(red, green, blue);
                        
                        EventQueue.invokeLater(() -> {
                            panel.setBackground(color);
                            panel.repaint();
                        });
                    }
                    
                    long sleepTime = ThreadLocalRandom.current().nextLong((long)(speed / 2), (long)(speed * 1.5));
    
                    Thread.sleep(sleepTime);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();
    }

    public JPanel getPanel() {
        return panel;
    }
}
