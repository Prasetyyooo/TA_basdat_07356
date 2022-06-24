package Entity;

public class PegawaiEntity {
    protected int id_pegawai;
    protected String nama_pegawai;
    protected String username;
    protected String alamat_pegawai;
    protected String noTelp;
    protected String password;

    public PegawaiEntity(int id_pegawai, String nama_pegawai,String username, String alamat_pegawai, String noTelp, String password) {
        this.id_pegawai = id_pegawai;
        this.nama_pegawai = nama_pegawai;
        this.alamat_pegawai = alamat_pegawai;
        this.noTelp = noTelp;
        this.password = password;
        this.username = username;
    }

    public int getId_pegawai() {
        return id_pegawai;
    }

    public void setId_pegawai(int id_pegawai) {
        this.id_pegawai = id_pegawai;
    }

    public String getNama_pegawai() {
        return nama_pegawai;
    }

    public void setNama_pegawai(String nama_pegawai) {
        this.nama_pegawai = nama_pegawai;
    }

    public String getAlamat_pegawai() {
        return alamat_pegawai;
    }

    public void setAlamat_pegawai(String alamat_pegawai) {
        this.alamat_pegawai = alamat_pegawai;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
