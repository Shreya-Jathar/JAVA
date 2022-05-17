import javax.swing.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

class flowLayout extends Frame {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    public flowLayout() {

        super("Flow Layout Demo");

        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");

        b4=new Button("Four");
        b5=new Button("Five");
        b6=new Button("Six");

        b7=new Button("Seven");
        b8=new Button("Eight");
        b9=new Button("Nine");
        b10=new Button("Ten");

        FlowLayout fl=new FlowLayout();
        fl.setAlignment(FlowLayout.CENTER);
        fl.setHgap(50);
        setLayout(fl);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
    }
}

class borderLayout extends Frame {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    public borderLayout() {

        super("Border Layout Demo");
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");

        b4=new Button("Four");
        b5=new Button("Five");
        b6=new Button("Mon");
        b7=new Button("Tue");

        b8=new Button("Wed");
        b9=new Button("Thru");
        b10=new Button("Fri");

        add(b2, BorderLayout.WEST);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.NORTH);
        add(b5, BorderLayout.SOUTH);

        Panel p=new Panel(new GridLayout());
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        add(p, BorderLayout.CENTER);

    }
}

class gridLayout extends Frame {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    public gridLayout() {

        super("Grid Layout Demo");
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        b4=new Button("Four");
        b5=new Button("Five");
        b6=new Button("Six");
        b7=new Button("Seven");
        b8=new Button("Eight");
        b9=new Button("Nine");
        b10=new Button("Ten");

        GridLayout gl=new GridLayout(4, 3);
        setLayout(gl);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
    }
}

class gridBagLayout extends Frame {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    public gridBagLayout() {

        super("GridBag Layout Demo");
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        b4=new Button("Four");
        b5=new Button("Five");
        b6=new Button("Six");

        GridBagLayout gb=new GridBagLayout();
        GridBagConstraints gbc=new GridBagConstraints();

        setLayout(gb);
        gbc.gridx=1;
        gbc.gridy=1;

        add(b1, gbc);
        gbc.gridx=2;
        gbc.gridy=2;

        add(b2, gbc);
        gbc.gridx=3;
        gbc.gridy=3;

        add(b3, gbc);
        gbc.gridx=4;
        gbc.gridy=4;

        add(b4, gbc);
        gbc.gridx=5;
        gbc.gridy=5;

        add(b5, gbc);
        gbc.gridx=6;
        gbc.gridy=6;
        add(b6, gbc);
    }
}

class cardLayout extends Frame {

    JFrame frame = new JFrame("CardLayout demo");
    JPanel panelCont = new JPanel();
    JPanel panelFirst = new JPanel();
    JPanel panelSecond = new JPanel();
    JButton buttonOne = new JButton("Switch to second panel/workspace");
    JButton buttonSecond = new JButton("Switch to first panel/workspace");
    CardLayout cl = new CardLayout();

    public cardLayout() {

        panelCont.setLayout(cl);
        panelFirst.add(buttonOne);
        panelSecond.add(buttonSecond);
        panelFirst.setBackground(Color.BLUE);
        panelSecond.setBackground(Color.GREEN);

        panelCont.add(panelFirst, "1");
        panelCont.add(panelSecond, "2");
        cl.show(panelCont, "1");

        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "2");
            }
        });

        buttonSecond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(panelCont, "1");
            }
        });

        frame.add(panelCont);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

    public class Lab11 {
        public static void main(String[] args) {
            flowLayout f = new flowLayout();
            f.setSize(500, 500);
            f.setVisible(true);
            borderLayout b = new borderLayout();
            b.setSize(500, 500);
            b.setVisible(true);
            gridLayout g = new gridLayout();
            g.setSize(500, 500);
            g.setVisible(true);
            gridBagLayout gb = new gridBagLayout();
            gb.setSize(500, 500);
            gb.setVisible(true);
            cardLayout cd = new cardLayout();
        }
    }