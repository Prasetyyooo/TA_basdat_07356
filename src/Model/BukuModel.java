package Model;

import Entity.BukuEntity;
import Helper.KoneksiDB;

import javax.swing.text.html.HTMLDocument;
import java.sql.*;
public class BukuModel {
    private String sql;
    private Connection conn = KoneksiDB.dbConnection();
    public void insertData(BukuEntity buku){
        try {
            sql = "INSERT INTO buku WHERE (kode_buku,judul_buku,penerbit_buku,status) VALUES (?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, buku.getKode_buku());
            stat.setString(2, buku.getJudul_buku());
            stat.setString(3, buku.getPenerbit_buku());
            stat.setString(4, buku.getStatus());

        } catch (SQLException e){
            System.out.println("Data Gagal Diinputkan");
            System.out.println(e);
        }
    }

    public void updateJudul(String judul, String kode){
        try{
            sql = "update buku SET judul=? WHERE kode=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, judul);
            stat.setString(2, kode);
        } catch (SQLException e){
            System.out.println("Gagal Menginputkan Data");
            System.out.println(e);
        }
    }

    public void updateStatus(String status, String kode){
        try{
            sql = "update buku SET status=? WHERE kode=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, status);
            stat.setString(2, kode);
        } catch (SQLException e){
            System.out.println("Gagal Mengintputkan Data");
            System.out.println(e);
        }
    }

    public void updatePenerbit(String penerbit, String kode){
        try{
            sql = "update buku SET penerbit=? WHERE namaBuku=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, penerbit);
            stat.setString(2, kode);
        } catch (SQLException e){
            System.out.println("Gagal Menginputkan Data");
            System.out.println(e);
        }
    }

    public void deleteData(String kode){
        try {
            sql = "DELETE FROM buku WHERE kode=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, kode);
            stat.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
