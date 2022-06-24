package Controller;


import Entity.TransaksiEntity;

public class TransaksiController {
    public void insertData(String id_transaksi, String buku_kode, int pegawai_id, int customer_id){
        AllObjectModel.trskModel.insertData(new TransaksiEntity(id_transaksi,buku_kode,pegawai_id,customer_id));
    }
}
