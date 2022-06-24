package Model;

import Entity.DetailTransaksiEntity;
import Helper.KoneksiDB;

import java.sql.*;
import java.util.ArrayList;

public class DetailTransaksiModel {
    private String sql;
    private Connection conn = KoneksiDB.dbConnection();

    public void insertData(DetailTransaksiEntity detail){
        try{
            sql = "INSERT INTO DetailTransaksi WHERE(transaksi_id, customer_id, pegawai_id, tgl_peminjaman, tgl_pengembalian, status) VALUES (?,?,?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, detail.getTransaksi_id());
            stat.setInt(2, detail.getCustomer_id());
            stat.setInt(3, detail.getPegawai_id());
            stat.setDate(4, detail.getTgl_peminjaman());
            stat.setDate(5, detail.getTgl_pengembalian());
            stat.setString(6, detail.getStatus());
        } catch (SQLException e){
            System.out.println("Gagal Menginputkan Data");
            System.out.println(e);
        }
    }

    public ArrayList<DetailTransaksiEntity>showData(){
        ArrayList<DetailTransaksiEntity>detailTransaksi = new ArrayList<>();

        try{
            sql="SELECT*FROM DetailTransaksi";
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){
                detailTransaksi.add(new DetailTransaksiEntity(rs.getInt("transaksi_id"),rs.getInt("pegawai_id"),rs.getInt("customer_id"),rs.getDate("tgl_peminjaman"),rs.getDate("tgl_pengembalian"),rs.getString("status")));
            }

        } catch (SQLException e){
            System.out.println("Gagal Menampilkan Data");
            System.out.println(e);
        }
        return detailTransaksi;
    }
}
