package javafx_pong;
import java.awt.*;
import java.util.*;
/**
 * The Pong ball.
 * @author <a href="mailto:youssef.land@outlook.com">Youssef Nasr</a>
 * @since Pong 1972 (1.0)
 */
public class Ball extends Rectangle {
    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 2;
    /**
     * The Pong ball.
     * @author <a href="mailto:youssef.land@outlook.com">Youssef Nasr</a>
     * @since Pong 1972 (1.0)
     */
    Ball(int x, int y, int w, int h) {
        super(x, y, w, h);
        random = new Random();
        int randomXDirection = random.nextInt(initialSpeed);
        if (randomXDirection == 0)
            randomXDirection--;
        setXDirection(randomXDirection * initialSpeed);
        int randomYDirection = random.nextInt(initialSpeed);
        if (randomYDirection == 0)
            randomYDirection--;
        setYDirection(randomYDirection * initialSpeed);
    }

    public void setXDirection(int randomXDirection) {
        xVelocity = randomXDirection;
    }

    public void setYDirection(int randomYDirection) {
        yVelocity = randomYDirection;
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x, y, width, height);
    }
}
