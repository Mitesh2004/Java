import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C2 extends JFrame {
    private BallPanel ballPanel;
    private JButton startButton;

    public C2() {
        setTitle("Ball Animation");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel where the ball moves
        ballPanel = new BallPanel();
        add(ballPanel, BorderLayout.CENTER);

        // Start button
        startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ballPanel.startMoving();
            }
        });
        add(startButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new C2();
    }
}

// Panel that contains the ball
class BallPanel extends JPanel implements Runnable {
    private int y = 20; // Ball's initial Y position
    private boolean moving = false;

    public BallPanel() {
        setPreferredSize(new Dimension(300, 350));
    }

    public void startMoving() {
        if (!moving) {
            moving = true;
            Thread t = new Thread(this);
            t.start();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(130, y, 30, 30); // Draw ball
    }

    @Override
    public void run() {
        while (moving) {
            y += 5; // Move ball downward
            if (y > getHeight() - 30) {
                y = 0; // Reset position when reaching the bottom
            }
            repaint();
            try {
                Thread.sleep(50); // Control speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

