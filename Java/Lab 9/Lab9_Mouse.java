import java.awt.*;    
import java.awt.event.*;

public class Lab9_Mouse {

    public class mouseAdapterClass extends MouseAdapter {

        Frame f;

        public mouseAdapterClass() {
            f = new Frame("Mouse Adapter");
            f.setSize(500, 500);
            f.setLayout(null);
            f.setVisible(true);
            f.addMouseListener(this);

            f.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                   System.exit(0);
                }
            });
        }

        public void mouseClicked (MouseEvent e) {    
            Graphics g = f.getGraphics();
            
            Color randomColor = new Color((int)(Math.random() * 0x1000000));
            g.setColor (randomColor);    
            g.fillRect (e.getX(), e.getY(), 30, 30);    
        }
    }

    public static void main(String[] args) {
        Lab9_Mouse L = new Lab9_Mouse();

        mouseAdapterClass M = L.new mouseAdapterClass();
        M.getClass();
        System.out.println("Mouse Adapter Class Executed!");
    }
}