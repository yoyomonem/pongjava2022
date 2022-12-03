package javafx_pong;
import java.awt.*;
import javax.swing.*;
/**
 * The UI.
 * @author <a href="mailto:yoyo.monem22@gmail.com">Youssef Nasr</a>
 */
public class GameFrame extends JFrame {
    GamePanel panel;

    /**
     * The UI.
     * @author <a href="mailto:yoyo.monem22@gmail.com">Youssef Nasr</a>
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
