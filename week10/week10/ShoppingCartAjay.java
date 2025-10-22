import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ShoppingCartAjay extends JFrame implements ActionListener {
    JComboBox<String> items;
    JTextArea cartArea;
    JButton addBtn, totalBtn;
    JLabel totalLabel;
    Map<String, Integer> prices = new HashMap<>();
    int total = 0;

    public ShoppingCartAjay() {
        setTitle("Shopping Cart - Ajay");
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        prices.put("Apple", 30);
        prices.put("Banana", 10);
        prices.put("Orange", 20);
        prices.put("Milk", 50);
        prices.put("Bread", 40);

        items = new JComboBox<>(new String[]{"Apple", "Banana", "Orange", "Milk", "Bread"});
        addBtn = new JButton("Add to Cart");
        totalBtn = new JButton("Show Total");
        cartArea = new JTextArea(10, 25);
        totalLabel = new JLabel("Total: Rs. 0");

        add(new JLabel("Select Item:"));
        add(items);
        add(addBtn);
        add(new JScrollPane(cartArea));
        add(totalBtn);
        add(totalLabel);

        addBtn.addActionListener(this);
        totalBtn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addBtn) {
            String item = (String) items.getSelectedItem();
            int price = prices.get(item);
            cartArea.append(item + " - Rs." + price + "\n");
            total += price;
        } else if (e.getSource() == totalBtn) {
            totalLabel.setText("Total: Rs. " + total);
        }
    }

    public static void main(String[] args) {
        new ShoppingCartAjay();
    }
}
