package Controller;


import Entity.DetailTransaksiEntity;

import java.sql.Date;

public class DetailTransaksiController {
    public void insertData(int transaksi_id, int customer_id, int pegawai_id, Date tgl_peminjaman, Date tgl_pengembalian, String status){
        AllObjectModel.detailTransaksi.insertData(new DetailTransaksiEntity(transaksi_id,customer_id,pegawai_id,tgl_peminjaman,tgl_pengembalian,status));
    }

    public void showData (){
        AllObjectModel.detailTransaksi.showData();
    }
}
