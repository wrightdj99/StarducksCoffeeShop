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
    public JLabel dLabel7;
    public JLabel dLabel8;
    public JLabel dLabel9;
    public JLabel dLabel10;
    public String Menu = "menu";
    public CoffeeShopMenu(){
        dLabel7 = new JLabel("<html><img  height='250' width='270' src='https://cms.qz.com/wp-content/uploads/2016/10/2427770107_e7be35d768_o-e1475851811724.jpg?quality=75&strip=all&w=1600&h=900&crop=1' /></html>");
        dLabel8 = new JLabel("<html><img  height='250' width='270' src='https://cdn.shopify.com/s/files/1/2504/6898/files/coffee-ceramic-cup-on-marbled-table-reduced_1024x1024.jpg?v=1513790993'");
        dLabel9 = new JLabel("<html><img  height='250' width='270' src='https://s6.favim.com/orig/151117/cafe-coffee-forest-nature-Favim.com-3583496.jpg'");
        dLabel10 = new JLabel("<html><img  height='250' width='270' src='https://www.marylandzoo.org/wp-content/uploads/2017/11/wood_duck_web.jpg'");
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
        SizeMenu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        button.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        sp.add(dLabel7);
        sp.add(dLabel8);
        sp.add(dLabel9);
        sp.add(dLabel10);
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
