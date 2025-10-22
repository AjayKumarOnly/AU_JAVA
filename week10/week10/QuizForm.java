import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizForm extends JFrame implements ActionListener {

    JRadioButton q1opt1, q1opt2, q1opt3, q1opt4;
    JCheckBox q2opt1, q2opt2, q2opt3, q2opt4;
    JTextField q3Answer;
    JTextArea q4Answer;
    JButton submitBtn;

    int score = 0;

    public QuizForm() {
        setTitle("Simple Quiz Form");
        setSize(600, 600);
        setLayout(new GridLayout(10, 1, 5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("1. What is the capital of India?"));
        q1opt1 = new JRadioButton("Mumbai");
        q1opt2 = new JRadioButton("New Delhi");
        q1opt3 = new JRadioButton("Kolkata");
        q1opt4 = new JRadioButton("Chennai");

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(q1opt1);
        bg1.add(q1opt2);
        bg1.add(q1opt3);
        bg1.add(q1opt4);

        add(q1opt1);
        add(q1opt2);
        add(q1opt3);
        add(q1opt4);

        add(new JLabel("2. Which of the following are programming languages?"));
        q2opt1 = new JCheckBox("Python");
        q2opt2 = new JCheckBox("HTML");
        q2opt3 = new JCheckBox("Java");
        q2opt4 = new JCheckBox("Google");
        add(q2opt1);
        add(q2opt2);
        add(q2opt3);
        add(q2opt4);

        add(new JLabel("3. Who invented Java?"));
        q3Answer = new JTextField();
        add(q3Answer);

        add(new JLabel("4. Write any one feature of Java:"));
        q4Answer = new JTextArea(3, 20);
        add(q4Answer);

        submitBtn = new JButton("Submit Quiz");
        submitBtn.addActionListener(this);
        add(submitBtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        score = 0;

        if (q1opt2.isSelected()) score += 1;

        if (q2opt1.isSelected()) score += 0.5;
        if (q2opt3.isSelected()) score += 0.5;

        String ans3 = q3Answer.getText().trim().toLowerCase();
        if (ans3.contains("gosling")) score += 1;

        String ans4 = q4Answer.getText().trim().toLowerCase();
        if (ans4.contains("oop") || ans4.contains("portable") || ans4.contains("platform independent"))
            score += 1;

        String message = "Your Total Score: " + score + " / 4\n\n"
                + "Correct Answers:\n"
                + "1. New Delhi\n"
                + "2. Python, Java\n"
                + "3. James Gosling\n"
                + "4. Example: Object Oriented, Platform Independent, Portable";

        JOptionPane.showMessageDialog(this, message);
    }

    public static void main(String[] args) {
        new QuizForm();
    }
}
