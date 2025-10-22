//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//class Login extends JFrame {
//
//    JLabel userName = new JLabel("User Name : ");
//    JPasswordField  pass = new JPasswordField("Password : ");
//    JLabel title = new JLabel("Login Form ");
//    JTextField userText = new JTextField(10);
//    JTextField passText = new JTextField(10);
//    JButton loginButton = new JButton(" Login ");
//    JButton clear = new JButton("Clear");
//    JTextArea res = new JTextArea();
//    StringBuilder result = new StringBuilder();
//    Login(){
//
//        setLayout(new BorderLayout(50, 50) );
//        JLabel label1=new JLabel("Form Layouts", SwingConstants.CENTER);
//
//        JPanel panel2=panelMethod();
//        add(panel2, BorderLayout.CENTER);
//        add( res, BorderLayout.SOUTH);
//        setSize(400,400);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//    public JPanel panelMethod() {
//        JPanel panel1 = new JPanel();
//        panel1.setLayout(new GridLayout(4, 4, 10, 10));
//        panel1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//        JLabel label1 = new JLabel("User Name : ", SwingConstants.RIGHT);
//        panel1.add(label1);
//        panel1.add(userName);
//        panel1.add(passText);
//        panel1.add(pass);
//        panel1.add(loginButton);
//        loginButton.addMouseListener(new SubmitButton());
//        panel1.add(clear);
//        clear.addMouseListener(new ClearButton());
//        return panel1;
//    }
//
//    class SubmitButton extends MouseAdapter{
//            public void mouseClicked(MouseEvent e){
//                result.setLength(0);
//                String name = userName.getText();
//                if( name == null || name.trim().isEmpty() || name.length() < 3){
//                    result.append("Error : UserName must be greater than 3 letter ");
//                }
//                boolean hasdigt = false,hasUpper = false,hasLower = false,hasSpecial = false;
//                String password = pass.getText().trim();
//                for(int i =0 ; i< password.length(); i++){
//                    if(Character.isDigit(i)){
//                        hasdigt = true;
//                    }
//                    if(Character.isUpperCase(i)){
//                        hasUpper = true;
//                    }
//                    if(Character.isLowerCase(i)){
//                        hasLower = true;
//                    }
//                    if(password.charAt(i) == '@' || password.charAt(i) == '!' || password.charAt(i) == '$'){
//                        hasSpecial = true;
//                    }
//                    if (result.isEmpty()){
//                        result.append("Form Submit Successfully");
//                    }
//                    if(!hasUpper){
//                        result.append("Error : must contain one upper case \n");
//                    }
//                    if(!hasdigt){
//                        result.append("Error : must contain one digit\n");
//                    }
//                    if(!hasLower){
//                        result.append("Error : must contain one lower case\n");
//                    }
//                    if(!hasSpecial) result.append("Error : must contain one special character\n");
//                    res.setText(result.toString());
//                }
//            }
//        }
//        class ClearButton extends MouseAdapter{
//            void mouseClicked(ActionEvent e){
//                userName.setText("");
//                pass.setText("");
//                res.setText("");
//            }
//        }
//}
//
//
//public class LoginPage {
//    public static void main(String[] args) {
//        Login login = new Login();
//        login.setVisible(true);
//    }
//}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Login extends JFrame {

    JLabel userLabel = new JLabel("User Name: ");
    JLabel passLabel = new JLabel("Password: ");
    JTextField userText = new JTextField(10);
    JPasswordField pass = new JPasswordField(10);
    JButton loginButton = new JButton("Login");
    JButton clearButton = new JButton("Clear");
    JTextArea res = new JTextArea(5, 30);

    Login() {
        setTitle("Login Form");
        setLayout(new BorderLayout(10, 10));

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(userLabel);
        panel.add(userText);
        panel.add(passLabel);
        panel.add(pass);
        panel.add(loginButton);
        panel.add(clearButton);

        add(panel, BorderLayout.CENTER);
        add(new JScrollPane(res), BorderLayout.SOUTH);

        loginButton.addActionListener(new SubmitButton());
        clearButton.addActionListener(new ClearButton());

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center on screen
    }

    class SubmitButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            res.setText("");
            String name = userText.getText().trim();
            String password = new String(pass.getPassword());

            if (name.length() < 3) {
                res.append("Error: UserName must be greater than 3 letters.\n");
            }

            boolean hasDigit = false, hasUpper = false, hasLower = false, hasSpecial = false;
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (Character.isDigit(ch)) hasDigit = true;
                else if (Character.isUpperCase(ch)) hasUpper = true;
                else if (Character.isLowerCase(ch)) hasLower = true;
                else if (ch == '@' || ch == '!' || ch == '$') hasSpecial = true;
            }

            if (!hasUpper)
                res.append("Error: Password must contain at least one uppercase letter.\n");
            if (!hasDigit)
                res.append("Error: Password must contain at least one digit.\n");
            if (!hasLower)
                res.append("Error: Password must contain at least one lowercase letter.\n");
            if (!hasSpecial)
                res.append("Error: Password must contain at least one special character (@, !, $).\n");

            if (res.getText().isEmpty()) {
                res.append("Form Submitted Successfully!");
            }
        }
    }

    class ClearButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            userText.setText("");
            pass.setText("");
            res.setText("");
        }
    }
}

public class LoginPage {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Login login = new Login();
            login.setVisible(true);
        });
    }
}

