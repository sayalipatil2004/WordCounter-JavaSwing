import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class project extends JFrame {

    public project() {
        getContentPane().setBackground(Color.lightGray);
        setTitle("WordCounter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(0, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        JLabel la = new JLabel("WORD COUNTER",JLabel.CENTER); 
        la.setFont(new Font("Calibri", Font.BOLD, 26));
        la.setBorder(new EmptyBorder(10, 0, 10, 0));
        la.setBounds(130,50 , 400, 30);
        add(la,BorderLayout.NORTH);

        JPanel p = new JPanel();
        p.setLayout(new BorderLayout(10, 10));
        p.setBorder(new EmptyBorder(10, 20, 10, 20));
        p.setBounds(20, 100, 600, 400);
        p.setBackground(Color.WHITE);

        JLabel l = new JLabel("Enter your sentence:");
        l.setFont(new Font("SansSerif", Font.BOLD, 20));
        l.setBounds(50, 30, 200, 30);
        p.add(l);
        JTextArea textarea = new JTextArea();
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        textarea.setBounds(50, 70, 500, 100);
        textarea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        p.add(textarea);

        JButton b = new JButton("Submit");
        b.setBounds(200, 250, 150, 70);
        p.add(b,JButton.CENTER);

        JLabel resultLabel = new JLabel("Total Words: ");
        // resultLabel.setFont(new Font("SansSerif", Font.BOLD, 22));
        // resultLabel.setBorder(new EmptyBorder(10, 20, 10, 20));
        resultLabel.setBounds(150,100, 250, 0);
         resultLabel.setBorder(new EmptyBorder(10, 20, 10, 20));
         resultLabel.setFont(new Font("SansSerif", Font.BOLD, 22));
        p.add(resultLabel);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textarea.getText();
                String[] substr = text.split(" ");
                // int length = text.length();
                resultLabel.setText("Total Words: " + substr.length);
                System.out.println("Sentence: \n" + substr.length);
            }
        });
        add(p,JPanel.CENTER_ALIGNMENT);
        setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("WELCOME TO WORD COUNTER GAME \n ");
        project p = new project();
    }
}