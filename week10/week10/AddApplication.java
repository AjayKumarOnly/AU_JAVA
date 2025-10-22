import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Addition extends JFrame implements ActionListener {
        JTextField a,b,sum;
        JButton add , clear;
        JLabel num1, num2,submit,name , roll;

        public Addition() {
            num1 = new JLabel("Number 1 :");
            a = new JTextField(10);
            num2 = new JLabel("Number 2");
            b = new JTextField(10);
            submit = new JLabel("SUM");
            sum = new JTextField(20);
            add = new JButton(" ADD ");
            clear = new JButton("Clear");
            name = new JLabel("S.Ajay Kumar ");
            roll = new JLabel("2024503701");
            add(num1);
            add(a);
            add(num2);
            add(b);
            add(submit);
            add(sum);
            add(add);
            add(clear);
            add(name);
            add(roll);
            setLayout(new FlowLayout());
            //setLayout(new GridLayout(5,5));
            setVisible(true);
            setSize(500, 480);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            getContentPane().setBackground(Color.YELLOW);
            add.addActionListener(this);
            clear.addActionListener(this);


        }
    @Override
    public void actionPerformed(ActionEvent e) {
            try{
                if(e.getSource() == add){
                    int number1 = Integer.parseInt(a.getText().trim());
                    int number2 = Integer.parseInt(b.getText().trim());
                    int total = number1 + number2;
                    sum.setText(Integer.toString(total));
                }
                if(e.getSource() == clear){
                    a.setText("");
                    b.setText("");
                    sum.setText("");
                }

            }
            catch(NumberFormatException  w){
                String err = w.getMessage();
                System.out.println(err);
                sum.setText(err);
            }

    }
//    class clear implements ActionListener{
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            a.setText("");
//            b.setText("");
//            sum.setText("");
//        }
//    }
}

public class AddApplication {
    public static void main(String[] args) {
        System.out.println("Name : Ajay Kumar");
        System.out.println("Roll : 2024503701");
        Addition addition = new Addition();


    }
}
