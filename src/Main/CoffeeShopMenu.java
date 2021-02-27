package Main;
import Main.CoffeeShopFrame.*;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoffeeShopMenu extends JPanel{
    public JFrame ShopMenu = new JFrame("Starducks Coffee");
    public JPanel sp = new JPanel();
    public JButton button = new JButton("Order");
    public JLabel MainMenu = new JLabel();
    public JLabel SizeMenu = new JLabel();
    public String Menu = "menu";
    public CoffeeShopMenu(){
        String title = "Starducks Coffee";
        Border border = BorderFactory.createTitledBorder(title);
        Border newBorder = BorderFactory.createTitledBorder(Menu);
        Border sizeBorder = BorderFactory.createTitledBorder("Drink Sizes");
        sp.setBorder(border);
        sp.setBackground(Color.PINK);
        MainMenu.setBorder(newBorder);
        SizeMenu.setBorder(sizeBorder);
        MainMenu.setText("<html><ul><li>Americano</li>\n<li>Black Coffee</li><li>Iced Tea</li><li>English Breakfast Tea</li><li>Hot Chocolate</li></ul></html>");
        SizeMenu.setText("<html><ul><li>Small - $2.50</li>\n<li>Medium - $3.00</li><li>Large - $3.50</li><li>XLarge - $4.00</li></ul></html>");
        MainMenu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        sp.add(MainMenu);
        sp.add(SizeMenu);
        button.setBounds(300, 500, getWidth(), getHeight());
        sp.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CoffeeShopFrame coffeeShopFrame = new CoffeeShopFrame();
                coffeeShopFrame.DansMenu();
            }
        });
        ShopMenu.add(sp);
        ShopMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ShopMenu.pack();
        ShopMenu.setSize(800, 800);
        ShopMenu.setVisible(true);
    }
}
