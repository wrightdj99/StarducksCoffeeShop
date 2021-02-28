package Main;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Dictionary;
import java.util.Hashtable;

public class CoffeeShopFrame extends JPanel {

    public JFrame DansFrame = new JFrame("Starducks Coffee");
    public JComboBox DrinkMenu, DrinkSizes;
    public JLabel dLabel, dLabel2, dLabel3, dLabel4, dLabel5, dLabel6, dLabel7;
    public JButton ConfirmButton = new JButton("Confirm Order");
    public JButton BackToMenu = new JButton("Back To Menu");
    public String drinks[] = {"Americano", "Black Coffee", "Iced Tea", "English Breakfast Tea", "Hot Chocolate"};
    public String sizes[] = {"Extra Large", "Large", "Medium", "Small"};
    Dictionary prices = new Hashtable();
    double SmallPrice = 2.50;
    double MediumPrice = 3.00;
    double LargePrice = 3.50;
    double XLargePrice = 4.00;
    double FinalPrice = 0.00;
    public void DansMenu(){
        //Setting up the screen and pink
        CoffeeShopFrame cf = new CoffeeShopFrame();
        JPanel dp = new JPanel();
        DrinkMenu = new JComboBox(drinks);
        DrinkSizes = new JComboBox(sizes);
        //JTextArea myDrinkOutput = new JTextArea();
        dLabel5 = new JLabel("", JLabel.CENTER);
        dLabel6 = new JLabel("", JLabel.LEFT);
        prices.put("Small", SmallPrice);
        prices.put("Medium", MediumPrice);
        prices.put("Large", LargePrice);
        prices.put("Extra Large", XLargePrice);
        DrinkMenu.setSelectedIndex(0);
        DrinkSizes.setSelectedIndex(0);
        DrinkMenu.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==ItemEvent.SELECTED){
                    dLabel6.setText("<html><ul>" +"<li>" +DrinkMenu.getSelectedItem().toString() + " is your selected drink \n</li>");
                    dLabel6.setFont(new Font("Times New Roman", Font.ITALIC, 20));
                }
            }
        });
        DrinkSizes.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==ItemEvent.SELECTED){
                    //JOptionPane.showMessageDialog(null, DrinkSizes.getSelectedItem().toString()+" is selected");
                    //System.out.println(DrinkSizes.getSelectedItem().toString()+ " is selected");
                    dLabel5.setText("<html><ul>" +"<li>" +DrinkSizes.getSelectedItem().toString() + " is your selected size \n </li>");
                    dLabel5.setFont(new Font("Times New Roman", Font.ITALIC, 20));

                }
            }
        });
        DrinkMenu.setEditable(true);
        DrinkSizes.setEditable(true);
        dLabel = new JLabel("Select your drink");
        dLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        dLabel2 = new JLabel("Select your size");
        dLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        dLabel3 = new JLabel("Americano Selected");
        dLabel4 = new JLabel("Extra Large Selected");
        dLabel.setForeground(Color.BLACK);
        dLabel2.setForeground(Color.BLACK);
        dLabel3.setForeground(Color.BLACK);
        dLabel4.setForeground(Color.BLACK);

        BackToMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CoffeeShopMenu coffeeShopMenu = new CoffeeShopMenu();
            }
        });
        ConfirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(DrinkSizes.getSelectedItem()=="Small"){
                    FinalPrice = FinalPrice + SmallPrice;
                }
                else if(DrinkSizes.getSelectedItem()=="Medium"){
                    FinalPrice = FinalPrice + MediumPrice;
                }
                else if(DrinkSizes.getSelectedItem()=="Large"){
                    FinalPrice = FinalPrice + LargePrice;
                }
                else if(DrinkSizes.getSelectedItem()=="Extra Large"){
                    FinalPrice = FinalPrice + XLargePrice;
                }
                JOptionPane.showMessageDialog(null, "Your order is: " + DrinkSizes.getSelectedItem() + " " + DrinkMenu.getSelectedItem() + "\n"
                + "Your total comes to: $" + FinalPrice + "0");
                FinalPrice = 0;
            }
        });
        String title = "Starducks Coffee";
        Border border = BorderFactory.createTitledBorder(title);
        DrinkMenu.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        DrinkSizes.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        dp.setBorder(border);
        dp.setBackground(Color.PINK);
        dp.setLayout(new FlowLayout(JLabel.VERTICAL));
        dp.add(dLabel);
        dp.add(DrinkMenu);
        dp.add(dLabel2);
        dp.add(DrinkSizes);
        dp.add(new JSeparator());
        dp.add(new JSeparator(SwingConstants.VERTICAL));
        dp.add(BackToMenu);
        dp.add(dLabel6);
        dp.add(ConfirmButton);
        dp.add(dLabel5);
        DansFrame.add(dp);
        DansFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DansFrame.pack();
        DansFrame.setSize(800, 800);
        dp.setSize(800, 800);
        DansFrame.setVisible(true);
    }
}