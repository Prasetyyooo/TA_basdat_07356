package Model;

import Entity.CustomerEntity;
import Entity.PegawaiEntity;
import Helper.KoneksiDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.zip.Adler32;

public class PegawaiModel {
    private String sql;
    private Connection conn = KoneksiDB.dbConnection();

    public void insertData(PegawaiEntity pegawai){
        try {
            sql = "INSERT INTO pegawai WHERE (id_pegawai,nama_pegawai,username,alamat_pegawai,noTelp,password) WHERE (?,?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, pegawai.getId_pegawai());
            stat.setString(2, pegawai.getNama_pegawai());
            stat.setString(3, pegawai.getUsername());
            stat.setString(4, pegawai.getAlamat_pegawai());
            stat.setString(5, pegawai.getNoTelp());
            stat.setString(6, pegawai.getPassword());
        } catch (SQLException e){
            System.out.println("Gagal Menginputkan Data");
            System.out.println(e);
        }
    }

    public void updatePassword (String password, String username){
        try{
            sql = "update pegawai SET password =? WHERE username=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, password);
            stat.setString(2, username);
            stat.executeUpdate();
        } catch (SQLException e){
            System.out.println("Gagal Untuk Menginputkan Data");
            System.out.println(e);
        }
    }

    public int cekLogin (int id,String password ){
        int cek = 0;
        try{
            sql = "SELECT * FROM pegawai WHERE id=? and password=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id);
            stat.setString(2, password);
            ResultSet rs = stat.executeQuery();
            if (rs.next()){
                cek = rs.getInt("id");
            }else{
                cek=0;
            }
        }catch (Exception e){
            e.printStackTrace();
        }return cek;
    }

    public void deleteData(String username){
        try{
            sql="DELETE FROM pegawai WHERE username=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, username);
            stat.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public ArrayList<PegawaiEntity> dataPegawai(){
        ArrayList<PegawaiEntity> data = new ArrayList<>();
        try{
            sql = "select * from admin";
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){
                data.add(new PegawaiEntity(rs.getInt("id_pegawai"), rs.getString("nama_pegawai"), rs.getString("username"), rs.getString("alamat_pegawai"),rs.getString("noTelp"), rs.getString("password")));
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return data;
    }

    public int loginAdmin(String username, String password){
        int cek=0;

        try{
            sql = "select * from pegawai where username=? and password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                cek = rs.getInt("id_pegawai");
            }
            return cek;
        }catch (SQLException e){
            System.out.println(e);
            return -1;
        }
    }

    public int deleteSatuCustomer(String id){
        try{
            sql = "delete from customer where id_customer=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            return ps.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
            return -1;
        }
    }
}
