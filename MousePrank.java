import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Toolkit;

public class MousePrank {
    public static void main(String[] args) {
        System.String message = "Prank started. Press Ctrl+C in this console to stop it early!";
        System.out.println(message);
        
        try {
            Robot robot = new Robot();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            
            long startTime = System.currentTimeMillis();
            long duration = 5 * 60 * 1000; // 5 minutes in milliseconds

            while (System.currentTimeMillis() - startTime < duration) {
                // Get current mouse coordinates
                Point currentPos = MouseInfo.getPointerInfo().getLocation();
                int x = currentPos.x;
                int y = currentPos.y;

                // Generate a random jitter between -10 and +10 pixels
                int jitterX = (int) (Math.random() * 21) - 10;
                int jitterY = (int) (Math.random() * 21) - 10;

                // Calculate new position ensuring it stays on screen
                int newX = Math.max(0, Math.min(screenSize.width, x + jitterX));
                int newY = Math.max(0, Math.min(screenSize.height, y + jitterY));

                // Move the mouse
                robot.mouseMove(newX, newY);

                // Wait 3 seconds before shaking it again
                Thread.sleep(3000);
            }
            
            System.out.println("Prank automatically finished.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
