import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GoogleAccountFormAjay extends JFrame implements ActionListener {
    JTextField fname, lname, username, phone, recoveryEmail;
    JPasswordField password, confirm;
    JComboBox<String> month, day, year, gender;
    JButton createBtn, resetBtn, cancelBtn;

    public GoogleAccountFormAjay() {
        setTitle("Create your Google Account - Ajay");
        setSize(450, 600);
        setLayout(new GridLayout(13, 2, 5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("First name:"));
        fname = new JTextField();
        add(fname);

        add(new JLabel("Last name:"));
        lname = new JTextField();
        add(lname);

        add(new JLabel("Username:"));
        username = new JTextField();
        add(username);

        add(new JLabel("Password:"));
        password = new JPasswordField();
        add(password);

        add(new JLabel("Confirm:"));
        confirm = new JPasswordField();
        add(confirm);

        add(new JLabel("Phone number:"));
        phone = new JTextField();
        add(phone);

        add(new JLabel("Recovery email address:"));
        recoveryEmail = new JTextField();
        add(recoveryEmail);

        add(new JLabel("Birth Month:"));
        month = new JComboBox<>(new String[]{"Select", "January", "February", "March", "April", "May", "June",
                                             "July", "August", "September", "October", "November", "December"});
        add(month);

        add(new JLabel("Day:"));
        day = new JComboBox<>();
        day.addItem("Select");
        for (int i = 1; i <= 31; i++) day.addItem(String.valueOf(i));
        add(day);

        add(new JLabel("Year:"));
        year = new JComboBox<>();
        year.addItem("Select");
        for (int i = 1980; i <= 2025; i++) year.addItem(String.valueOf(i));
        add(year);

        add(new JLabel("Gender:"));
        gender = new JComboBox<>(new String[]{"Select", "Male", "Female", "Other"});
        add(gender);

        createBtn = new JButton("Create Account");
        resetBtn = new JButton("Reset");
        cancelBtn = new JButton("Cancel");

        add(createBtn);
        add(resetBtn);
        add(cancelBtn);

        createBtn.addActionListener(this);
        resetBtn.addActionListener(this);
        cancelBtn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cancelBtn) {
            System.exit(0);
        } 
        else if (e.getSource() == resetBtn) {
            fname.setText(""); lname.setText(""); username.setText(""); 
            password.setText(""); confirm.setText(""); phone.setText(""); 
            recoveryEmail.setText(""); month.setSelectedIndex(0);
            day.setSelectedIndex(0); year.setSelectedIndex(0); gender.setSelectedIndex(0);
        } 
        else if (e.getSource() == createBtn) {
            try {
                String fn = fname.getText().trim();
                String ln = lname.getText().trim();
                String user = username.getText().trim();
                String ph = phone.getText().trim();
                String rec = recoveryEmail.getText().trim();
                String p1 = new String(password.getPassword());
                String p2 = new String(confirm.getPassword());

                if (fn.isEmpty() || ln.isEmpty() || user.isEmpty() || ph.isEmpty() || rec.isEmpty() 
                    || p1.isEmpty() || p2.isEmpty() 
                    || month.getSelectedIndex() == 0 || day.getSelectedIndex() == 0 
                    || year.getSelectedIndex() == 0 || gender.getSelectedIndex() == 0)
                    throw new Exception("All fields must be filled!");

                if (!user.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$"))
                    throw new Exception("Invalid Email ID!");

                if (p1.length() < 8)
                    throw new Exception("Password must have at least 8 characters!");

                if (!p1.equals(p2))
                    throw new Exception("Password and Confirm Password do not match!");

                JOptionPane.showMessageDialog(this, "Account Created Successfully!");
            } 
            catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new GoogleAccountFormAjay();
    }
}
