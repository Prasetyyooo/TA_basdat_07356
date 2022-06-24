package GUI;

import javax.swing.*;
import java.awt.*;
import java.net.JarURLConnection;

public class ViewCustomer extends JFrame {
    private int kode;

    JButton btnback = new JButton("<<Back");
    JButton btnadd = new JButton("Tambah Customer");
    JButton btndelete = new JButton("Hapus Customer");

    JTable tabelCustomer = new JTable();
    JScrollPane cstr = new JScrollPane(tabelCustomer);
    JTextField textpilih = new JTextField();

    public ViewCustomer(int cek){
        initComponent(cek);
    }

    void initComponent(int cek){
        setTitle("View Customer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(820,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);

        cstr.setBounds(20,50,600,350);
//        tabelCustomer.setModel(AllObjectController.bukuController);
    }
}
