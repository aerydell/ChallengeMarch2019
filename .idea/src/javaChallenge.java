import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class javaChallenge {


    private JFrame f;
    private JPanel p;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    private JLabel label1;
    String[] questions = {"", "Hey what was that?", "Oh, it was you :D", "For some reason i'm happy to see you <3", "Well... Unless you keep poking me", "so please stop it.",
            "I said stop it", "STOP!!!", "Fine. I won't let you click the button anymore", "", "", "", "", "", "Aaaargh how does it work again?", "Let's see if you can find it now!", "",
            "Crap you found it :l", "Okay, how about now?", "", "Dangit you are to smart", "You should try closing me", "HAHA now I trapped you >:D", "You are mine Forever.",
            "I will keep you here untill you stop poking me", "So please stop it -.-", "pleeeaaaaaaaaaaaaaaase T_T", "Stop torturing me!", "Okay fine, Leave...",
            "Go on leave... (you can click the button now)", "HAHA JUST KIDDING", "I can't believe you fell for that!", "Okay but seriously you are allowed to leave now",
            "This project was made by Aerydell Programming", "Thanks for playing"};
    int id = 0;



    public javaChallenge(){
        gui();
    }

    public void gui(){

        f = new JFrame("Challenge 26/27 Maart 2019");
        f.setSize(500,750);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.addWindowListener(new java.awt.event.WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                if(id <34 ) {
                    if (JOptionPane.showConfirmDialog(f, "Did you really just try to close me?", "Close window?",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                        JOptionPane.showConfirmDialog(f, "That's not going to work. Don't make me mad", "Close window?",
                                JOptionPane.OK_CANCEL_OPTION,
                                JOptionPane.QUESTION_MESSAGE);
                    }
                }
            }
        });
        p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.BLACK);

        b1 = new JButton("POKE");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                id++;
                label1.setText(questions[id]);
                if (id == 16){
                    b1.setBounds(450, 0, 100, 30);
                }
                if (id == 17){
                    b1.setBounds(200,300,100,30);
                }
                if (id == 19){
                    b1.setBounds(365, 100, 100,30);
                    p.add(b2);
                    p.add(b3);
                    p.add(b4);
                    p.add(b5);
                    p.add(b6);
                    p.add(b7);
                    p.add(b8);
                    p.add(b9);
                    p.add(b10);
                    p.updateUI();
                }
                if(id == 20) {
                    b1.setBounds(200,300,100,30);
                    b2.setVisible(false);
                    b3.setVisible(false);
                    b4.setVisible(false);
                    b5.setVisible(false);
                    b6.setVisible(false);
                    b7.setVisible(false);
                    b8.setVisible(false);
                    b9.setVisible(false);
                    b10.setVisible(false);
                }
                if(id == 34) {
                    b1.setVisible(false);
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });

        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.setBorderPainted(false);
        b1.setFocusable(false);
        b1.setBounds(200, 300,100,30);
        b2 = new JButton("POKE");
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b2.setBorderPainted(false);
        b2.setBounds(20,20,100,30);
        b3 = new JButton("POKE");
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.WHITE);
        b3.setBorderPainted(false);
        b3.setBounds(20,100,100,30);
        b4 = new JButton("POKE");
        b4.setBackground(Color.GRAY);
        b4.setForeground(Color.WHITE);
        b4.setBorderPainted(false);
        b4.setBounds(20,180,100,30);
        b5 = new JButton("POKE");
        b5.setBackground(Color.GRAY);
        b5.setForeground(Color.WHITE);
        b5.setBorderPainted(false);
        b5.setBounds(200,20,100,30);
        b6 = new JButton("POKE");
        b6.setBackground(Color.GRAY);
        b6.setForeground(Color.WHITE);
        b6.setBorderPainted(false);
        b6.setBounds(200,100,100,30);
        b7 = new JButton("POKE");
        b7.setBackground(Color.GRAY);
        b7.setForeground(Color.WHITE);
        b7.setBorderPainted(false);
        b7.setBounds(200,180,100,30);
        b8 = new JButton("POKE");
        b8.setBackground(Color.GRAY);
        b8.setForeground(Color.WHITE);
        b8.setBorderPainted(false);
        b8.setBounds(200,260,100,30);
        b9 = new JButton("POKE");
        b9.setBackground(Color.GRAY);
        b9.setForeground(Color.WHITE);
        b9.setBorderPainted(false);
        b9.setBounds(365,20,100,30);
        b10 = new JButton("POKE");
        b10.setBackground(Color.GRAY);
        b10.setForeground(Color.WHITE);
        b10.setBorderPainted(false);
        b10.setBounds(365,180,100,30);
        label1 = new JLabel(""+questions[id], SwingConstants.CENTER);
        label1.setBounds(0,400,500,30);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Courier", Font.BOLD,20));
        p.add(b1);
        p.add(label1);

        f.add(p);
        f.setVisible(true);


    }

    public static void main(String[] args){
        new javaChallenge();
    }
}