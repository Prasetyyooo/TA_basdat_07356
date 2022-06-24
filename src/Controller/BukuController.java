package Controller;

import Entity.BukuEntity;

public class BukuController {

    public void insertData(int kode_buku, String judul_buku, String penerbit_buku, String status){
        AllObjectModel.bkModel.insertData(new BukuEntity(kode_buku,judul_buku,penerbit_buku,status));
    }

    public void updateJudul(String judul, String kode){
        AllObjectModel.bkModel.updateJudul(judul,kode);
    }

    public void updateStatus(String status, String kode){
        AllObjectModel.bkModel.updateStatus(status,kode);
    }

    public void updatePenerbit(String penerbit, String kode){
        AllObjectModel.bkModel.updatePenerbit(penerbit,kode);
    }

    public void deleteData(String kode){
        AllObjectModel.bkModel.deleteData(kode);
    }
}
