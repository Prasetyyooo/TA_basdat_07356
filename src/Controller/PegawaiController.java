package Controller;
import Entity.PegawaiEntity;

public class PegawaiController {

    public void insertData(int id_pegawai, String nama_pegawai,String username, String alamat_pegawai, String noTelp, String password){
     AllObjectModel.pgwModel.insertData(new PegawaiEntity(id_pegawai,nama_pegawai,username,alamat_pegawai,noTelp,password));
    }


    public void deleteData(String username){
        AllObjectModel.pgwModel.deleteData(username);
    }

    public void updatePassword(String username, String password){
        AllObjectModel.pgwModel.updatePassword(password, username);
    }

    public int cekLogin(int id, String password){
       return AllObjectModel.pgwModel.cekLogin(id,password);
    }

    public int loginAdmin(String username, String password){
        return AllObjectModel.pgwModel.loginAdmin (username,password);
    }

    public int deleteSatuCustomer (String id){
       return AllObjectModel.pgwModel.deleteSatuCustomer(id);
    }
}
