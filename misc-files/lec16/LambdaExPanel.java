import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LambdaExPanel extends JPanel {
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JLabel lab1;
    private JLabel lab2;
    private JLabel lab3;
    private int count1;
    private int count2;
    private int count3;

    public LambdaExPanel() {
        count1 = 0;
        count2 = 0;
        count3 = 0;

        b1 = new JButton("Click here 1");
        b2 = new JButton("Click here 2");
        b3 = new JButton("Click here 3");

        // Private inner class
        b1.addActionListener(new ButtonListener());

        // Anonymous class
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count2++;
                lab2.setText("B2 pushes = " + count2);
            }
        });

        // No argument labmda example
        Runnable r = () -> System.out.println("hello");
        
        // Lambda expression
        ActionListener countup = ev -> {
            count3++;
            lab3.setText("B3 pushes = " + count3);
        };
        b3.addActionListener(countup);
        // Lambda expression
        /*
        b3.addActionListener(ev -> {
            count3++;
            lab3.setText("B3 pushes = " + count3);
        });
         */


        add(b1);
        add(b2);
        add(b3);
        lab1 = new JLabel("B1 pushes = " + count1);
        lab2 = new JLabel("B2 pushes = " + count1);
        lab3 = new JLabel("B3 pushes = " + count1);
        add(lab1);
        add(lab2);
        add(lab3);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            count1++;
            lab1.setText("B1 pushes = " + count1);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lambda Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LambdaExPanel panel = new LambdaExPanel();
        panel.setLayout(new GridLayout(2,3));
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
