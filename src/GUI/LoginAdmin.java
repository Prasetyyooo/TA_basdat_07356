package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;

public class LoginAdmin extends JFrame {
    BufferedImage bufferedImage = null;

    JButton btnlogin = new JButton("Login");
    JLabel labelloginadmin = new JLabel();
    JButton btnupdatenama = new JButton("Ubah");
    JButton btnupdatealamat = new JButton("Ubah");
    JButton btnupdatenotelp = new JButton("Ubah");
    JLabel labelusername = new JLabel("Username");
    JLabel labelpassword = new JLabel("Password");
    JLabel labelbingkai = new JLabel();
    JTextField tfusername = new JTextField();
    JPasswordField pfpassword = new JPasswordField();

    public LoginAdmin(){
        initComponent();
    }

    void initComponent(){
        setTitle("LOGIN ADMIN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);

        labelusername.setBounds(35,25,60,25);
        add(labelusername);
        tfusername.setBounds(130,25,130,25);
        add(tfusername);

        labelpassword.setBounds(35,75,100,25);
        add(labelpassword);
        pfpassword.setBounds(130,75,130,25);
        add(pfpassword);

        btnlogin.setBounds(110,350,100,25);
        btnlogin.setBackground(Color.black);
        btnlogin.setBackground(Color.white);
        btnlogin.setCursor(new Cursor(12));
        add(btnlogin);

        btnlogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                btnlogin.setForeground(Color.black);
                btnlogin.setBackground(Color.white);
            }

            @Override
            public void mouseExited(MouseEvent e){
                btnlogin.setForeground(Color.white);
                btnlogin.setBackground(Color.black);
            }
        });

        btnlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = tfusername.getText();
                String password = String.valueOf(pfpassword.getPassword());
                int cek = AllObjectController.pegawaiController.loginAdmin(username,password);

                if (cek>0){
                    dispose();
                    MenuAdmin menuAdmin = new MenuAdmin(cek);
                    menuAdmin.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null, "Gagal Login");
                    kosong();
                }
            }
        });
    }

    void kosong(){
        tfusername.setText(null);
        pfpassword.setText(null);
    }
}
