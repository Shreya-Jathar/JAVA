import java.awt.*;    
import java.awt.event.*;

public class Lab9_Key {

    public class keyAdapterClass extends KeyAdapter {

        Frame f;
        TextField textArea;
        Label label;

        public keyAdapterClass() {

            f = new Frame("Key Adapter");
            
            f.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                    System.exit(0);
                }        
            });

            textArea = new TextField();
            textArea.setBounds(50, 50, 400, 200);
            textArea.setBackground(Color.LIGHT_GRAY);
            textArea.addKeyListener(this);
            label = new Label();  
            label.setBounds(0, 100, 500, 500);      
            label.setAlignment(Label.CENTER);

            f.setSize(500, 500);
            f.setLayout(null);
            f.add(textArea);
            f.add(label);
            f.setVisible(true);
        }

        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                label.setText("Entered text: " + textArea.getText());
            }
        }
    }

    public static void main(String[] args) {
        Lab9_Key L = new Lab9_Key();

        keyAdapterClass K = L.new keyAdapterClass();
        K.getClass();
        System.out.println("Key Adapter Class Executed!");
    }
}