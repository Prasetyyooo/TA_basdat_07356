package GUI;

import javax.swing.*;
import java.awt.*;

public class PilihCustomer extends JFrame {
    private int kode;
    JButton btnback = new JButton("<<BACK");
    JButton btnpilih = new JButton("Pilih Customer");
    JTable tableCustomer = new JTable();
    JScrollPane cstr = new JScrollPane(tableCustomer);
    JTextField textField = new JTextField();

    public PilihCustomer(int cek){
        initComponent(cek);
    }

    void initComponent(int cek){
        setTitle("Pilih Customer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);

        cstr.setBounds(20,50,600,350);
    }
}
