
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

