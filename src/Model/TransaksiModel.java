package Model;

import Entity.DetailTransaksiEntity;
import Entity.TransaksiEntity;
import Helper.KoneksiDB;

import java.sql.*;
import java.text.CompactNumberFormat;
import java.util.ArrayList;
import java.util.function.Predicate;

public class TransaksiModel {
    private String sql;
    private Connection conn = KoneksiDB.dbConnection();

    public void insertData(TransaksiEntity transaksi){
        try {
            sql = "INSERT INTO transaksi WHERE (id_transaksi,buku_kode,pegawai_id,customer_id) VALUES (?,?,?,?) ";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, transaksi.getId_transaksi());
            stat.setString(2, transaksi.getBuku_kode());
            stat.setInt(3, transaksi.getPegawai_id());
            stat.setInt(4, transaksi.getCustomer_id());
        } catch (SQLException e){
            System.out.println("Gagal Menginputkan Data");
            System.out.println(e);
        }
    }

    public ArrayList<TransaksiEntity> showData(){
        ArrayList<TransaksiEntity>Transaksi = new ArrayList<>();
        try{
            sql = "SELECT*FROM transaksi";
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){
                Transaksi.add(new TransaksiEntity(rs.getString("ID_TRANSAKSI"),rs.getString("BUKU_KODE"),rs.getInt("PEGAWAI_ID"),rs.getInt("CUSTOMER_ID")));
            }
        } catch (SQLException e){
            System.out.println("Gagal Menampilkan Data");
            System.out.println(e);

        }
        return Transaksi;
    }
}
