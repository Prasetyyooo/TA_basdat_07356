package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuAdmin extends JFrame {
    JLabel labeljudul = new JLabel("MENY ADMIN");
    JButton btnviewperubahan = new JButton("UPDATE HISTORY");
    JButton btnviewcustomer = new JButton("View Customer");
    JButton viewbuku = new JButton("View Buku");
    JButton btnlogout = new JButton("<<Logout");

    public MenuAdmin(int cek){
        initComponent(cek);
    }

    void initComponent(int cek){
        setTitle("MENU ADMIN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);

        labeljudul.setBounds(240,60,200,25);
        labeljudul.setFont(new Font("Segoe Print",1,20));
        add(labeljudul);

        btnviewperubahan.setBounds(140,150,140,100);
        btnviewperubahan.setCursor(new Cursor(12));
        btnviewperubahan.setBackground(Color.black);
        btnviewperubahan.setForeground(Color.white);
        add(btnviewperubahan);

        btnviewcustomer.setBounds(140,270,140,100);
        btnviewcustomer.setCursor(new Cursor(12));
        btnviewcustomer.setBackground(Color.black);
        btnviewcustomer.setForeground(Color.white);
        add(btnviewcustomer);

        btnlogout.setBounds(25,20,80,25);
        btnlogout.setBackground(Color.white);
        btnlogout.setCursor(new Cursor(12));
        btnlogout.setBorder(null);
        add(btnlogout);

        btnlogout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                btnlogout.setForeground(Color.blue);
            }

            @Override
            public void mouseExited(MouseEvent e){
                btnlogout.setForeground(Color.black);
            }
        });
        btnlogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginAdmin loginAdmin = new LoginAdmin();
                loginAdmin.setVisible(true);
                dispose();
            }
        });
    }
}
