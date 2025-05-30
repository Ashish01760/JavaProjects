package HotelManagement;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener{

    JLabel l1;
    JButton b1;

    public HotelManagementSystem() {

        setBounds(100,100,1366,565);
        setLayout(null);


        l1 = new JLabel("");
        b1 = new JButton("Next");

        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);



        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i3 = i1.getImage().getScaledInstance(1366, 565,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        l1 = new JLabel(i2);

        JLabel lid=new JLabel("HOTEL MANAGEMENT SYSTEM");
        lid.setBounds(20,400,1000,90);
        lid.setFont(new Font("serif",Font.PLAIN,50));
        lid.setForeground(Color.white);
        l1.add(lid);

        b1.setBounds(1150,450,150,50);
        l1.setBounds(0, 0, 1366, 565);

        l1.add(b1);
        add(l1);

        b1.addActionListener(this);
        setVisible(true);

        while(true){
            lid.setVisible(false);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
            lid.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }

    public void actionPerformed(ActionEvent ae){
        new Login().setVisible(true);
        this.setVisible(false);

    }

    public static void main(String[] args) {
        HotelManagementSystem window = new HotelManagementSystem();
        window.setVisible(true);
    }
}
