import javax.swing.*;
import java.awt.*;

class SimpleShapesApp extends JFrame {

    public SimpleShapesApp() {
        setTitle("Simple Shapes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Тіктөртбұрыш
        g.drawRect(50, 50, 150, 100);
        g.drawString("Rectangle", 80, 40);

        // Шеңбер (oval)
        g.drawOval(250, 50, 100, 100);
        g.drawString("Circle", 270, 40);

        // Түзу сызық
        g.drawLine(50, 200, 200, 200);
        g.drawString("Line", 100, 190);
    }

    public static void main(String[] args) {
        new SimpleShapesApp();
    }
}