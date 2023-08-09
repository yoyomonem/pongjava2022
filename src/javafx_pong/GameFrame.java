package javafx_pong;
import java.awt.*;
import javax.swing.*;
/**
 * The UI.
 * @author <a href="mailto:youssef.land@outlook.com">Youssef Nasr</a>
 * @since Pong 2022 (1.1)
 */
public class GameFrame extends JFrame {
    GamePanel panel;

    /**
     * The Pong UI.
     * @author <a href="mailto:youssef.land@outlook.com">Youssef Nasr</a>
     * @since Pong 2022 (1.1)
     */
    GameFrame() {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong written in Java with the help of JavaFX");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
