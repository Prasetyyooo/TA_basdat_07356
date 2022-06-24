package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuTambahCustomer extends JFrame {
    JLabel labelJudul = new JLabel("Menu Admin");
    JButton btncustomerlama = new JButton("Customer Lama");
    JButton btnCustomerbaru = new JButton("Customer Baru");
    JButton btnback = new JButton("<<Kembali");

    public MenuTambahCustomer(int cek){
        initComponent(cek);
    }

    void initComponent(int cek){
        setTitle("Pilih Customer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(440,380);
        setLocationRelativeTo(null);
        setVisible(true);

        btncustomerlama.setBounds(50,150,140,100);
        btncustomerlama.setCursor(new Cursor(12));
        btncustomerlama.setBackground(Color.black);
        btncustomerlama.setForeground(Color.white);
        add(btncustomerlama);

        btnCustomerbaru.setBounds(250,150,140,100);
        btnCustomerbaru.setCursor(new Cursor(12));
        btnCustomerbaru.setBackground(Color.black);
        btnCustomerbaru.setForeground(Color.white);
        add(btnCustomerbaru);

        btnback.setBounds(25,20,80,25);
        btnback.setBackground(Color.white);
        btnback.setCursor(new Cursor(12));
        btnback.setBorder(null);
        add(btnback);

        btncustomerlama.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
