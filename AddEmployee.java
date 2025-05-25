package HotelManagement;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class AddEmployee extends JFrame{


    JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6;
    JComboBox c1;

    public AddEmployee(){
        getContentPane().setForeground(Color.BLUE);
        getContentPane().setBackground(Color.WHITE);
        setTitle("ADD EMPLOYEE DETAILS");

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(778,486);
        getContentPane().setLayout(null);

        JLabel Passportno = new JLabel("NAME");
        Passportno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Passportno.setBounds(60, 30, 120, 30);
        add(Passportno);

        textField = new JTextField();
        textField.setBounds(200, 30, 150, 30);
        add(textField);

        JButton Next = new JButton("SAVE");
        Next.setBounds(200, 420, 150, 30);
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        add(Next);

        JLabel Pnrno = new JLabel("AGE");
        Pnrno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Pnrno.setBounds(60, 80, 120, 30);
        add(Pnrno);

        textField_1 = new JTextField();
        textField_1.setBounds(200, 80, 150, 30);
        add(textField_1);

        JLabel Gender = new JLabel("GENDER");
        Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Gender.setBounds(60, 130, 150, 30);
        add(Gender);

        JRadioButton NewRadioButton = new JRadioButton("MALE");
        NewRadioButton.setBackground(Color.WHITE);
        NewRadioButton.setBounds(200, 130, 70, 30);
        add(NewRadioButton);

        JRadioButton Female = new JRadioButton("FEMALE");
        Female.setBackground(Color.WHITE);
        Female.setBounds(280, 130, 70, 30);
        add(Female);


        JLabel Address = new JLabel("JOB");
        Address.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Address.setBounds(60, 180, 120, 30);
        add(Address);

        String[] course = {"Front Desk Clerks","Porters","Housekeeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"};
        c1 = new JComboBox(course);
        c1.setBackground(Color.WHITE);
        c1.setBounds(200,180,150,30);
        add(c1);

        JLabel Nationality = new JLabel("SALARY");
        Nationality.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Nationality.setBounds(60, 230, 120, 30);
        add(Nationality);

        textField_3 = new JTextField();
        textField_3.setBounds(200, 230, 150, 30);
        add(textField_3);

        JLabel Name = new JLabel("PHONE");
        Name.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Name.setBounds(60, 280, 150, 30);
        add(Name);

        textField_4 = new JTextField();
        textField_4.setBounds(200, 280, 150, 30);
        add(textField_4);

        JLabel Phno = new JLabel("AADHAR");
        Phno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Phno.setBounds(60, 380, 120, 30);
        add(Phno);

        textField_5 = new JTextField();
        textField_5.setBounds(200, 380, 120, 30);
        add(textField_5);


        JLabel email = new JLabel("EMAIL");
        email.setFont(new Font("Tahoma", Font.PLAIN, 17));
        email.setBounds(60, 330, 120, 30);
        add(email);

        textField_6 = new JTextField();
        textField_6.setBounds(200, 330, 120, 30);
        add(textField_6);

        setVisible(true);

        JLabel AddPassengers = new JLabel("ADD EMPLOYEE DETAILS");
        AddPassengers.setForeground(Color.BLUE);
        AddPassengers.setFont(new Font("Tahoma", Font.PLAIN, 31));
        AddPassengers.setBounds(450, 24, 442, 35);
        add(AddPassengers);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/tenth.jpg"));
        Image i3 = i1.getImage().getScaledInstance(450, 450,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel image = new JLabel(i2);
        image.setBounds(380,60,450,370);
        add(image);


        Next.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String name = textField.getText();
                String age = textField_1.getText();
                String salary = textField_3.getText();
                String phone = textField_4.getText();
                String aadhar = textField_5.getText();
                String email = textField_6.getText();

                String gender = null;

                if(NewRadioButton.isSelected()){
                    gender = "male";

                }else if(Female.isSelected()){
                    gender = "female";
                }


                String s6 = (String)c1.getSelectedItem();

                try {
                    Conn c = new Conn();
                    String str = "INSERT INTO employee values( '"+name+"', '"+age+"', '"+gender+"','"+s6+"', '"+phone+"','"+aadhar+"', '"+email+"')";

                    c.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null,"Employee Added");
                    setVisible(false);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        setSize(850,540);
        setVisible(true);
        setLocation(350,200);

    }

    public static void main(String[] args){
        new AddEmployee();
    }
}
