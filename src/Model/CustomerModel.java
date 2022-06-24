package Model;

import Entity.CustomerEntity;
import Helper.KoneksiDB;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;

public class CustomerModel {
    private String sql;
    private Connection conn = KoneksiDB.dbConnection();

    public void insertData(CustomerEntity customer){
        try {
            sql = "INSERT INTO customer where (id_customer,nama_customer,username,password,noTelp_Customer) VALUES (?,?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, customer.getId_customer());
            stat.setString(2, customer.getNama_customer());
            stat.setString(3, customer.getUsername());
            stat.setString(4, customer.getPassword());
            stat.setString(5, customer.getNoTelp());
        } catch (SQLException e){
            System.out.println("Gagal Untuk Menginputkan Data");
            System.out.println(e);
        }
    }

    public void updatePassword(String password, String username){
        try{
            sql = "update customer SET password =? WHERE username=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, password);
            stat.setString(2, username);
            stat.executeUpdate();
        } catch (SQLException e){
            System.out.println("Gagal Untuk Menginputkan Data");
            System.out.println(e);
        }
    }

    public int cekLogin (int id, String password){
        int cek = 0;
        try {
            sql = "SELECT * FROM customer WHERE id=? and password=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            stat.setString(2, password);
            ResultSet rs = stat.executeQuery();
            if (rs.next()){
                cek = rs.getInt("id");
            }else{
                cek = 0;
            }
        }catch (Exception e){
            e.printStackTrace();
        }return cek;
    }

    public void deleteData(String username){
        try {
            sql = "DELETE FROM customer WHERE username=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, username);
            stat.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public ArrayList<CustomerEntity> dataCustomer(){
        ArrayList<CustomerEntity> data = new ArrayList<>();
        try{
            sql = "select * from customer";
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){
                data.add(new CustomerEntity(rs.getInt("id_customer"), rs.getString("String nama_customer"), rs.getString("username"), rs.getString("password"),rs.getString("noTelp") ));
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return data;
    }

    public int loginCustomer(String username, String password){
        int cek = 0;
        try{
            sql = "select * from customer where username=? and password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                cek = rs.getInt("id_admin");
            }
            return cek;
        }catch (SQLException e){
            System.out.println(e);
            return -1;
        }
    }

    public DefaultTableModel viewCustomer(){
        DefaultTableModel buktiTransaksiCustomer = new DefaultTableModel();
        Object[] kolom = {"ID CUSTOMER","NAMA CUSTOMER"};
        buktiTransaksiCustomer.setColumnIdentifiers(kolom);

        int size = dataCustomer().size();
        for (int i = 0;i<size;i++){
            Object[] data = new Object[2];
            data[0] = dataCustomer().get(i).getId_customer();
            data[1] = dataCustomer().get(i).getNama_customer();
        }
        return buktiTransaksiCustomer;
    }
}
