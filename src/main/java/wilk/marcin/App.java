package wilk.marcin;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int m, n, k;
        double p;

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Podaj liczbę wierszy: ");
            m = in.nextInt();
            System.out.println("Podaj liczbę kolumn: ");
            n = in.nextInt();
            System.out.println("Podaj prędkość symulacji: ");
            k = in.nextInt();
            System.out.println("Podaj prawdopodobieństwo symulacji: ");
            p = in.nextDouble();
        }

        EventQueue.invokeLater(() -> {
            var frame = new MainFrame(m, n, k, p);
            frame.setTitle("Aplikacja wielowątkowa");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
