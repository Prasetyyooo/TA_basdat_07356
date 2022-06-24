package Entity;

public class TransaksiEntity {
    protected String id_transaksi;
    protected String buku_kode;
    protected int pegawai_id;
    protected int customer_id;

    public TransaksiEntity(String id_transaksi, String buku_kode, int pegawai_id, int customer_id) {
        this.id_transaksi = id_transaksi;
        this.buku_kode = buku_kode;
        this.pegawai_id = pegawai_id;
        this.customer_id = customer_id;
    }

    public String getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public String getBuku_kode() {
        return buku_kode;
    }

    public void setBuku_kode(String buku_kode) {
        this.buku_kode = buku_kode;
    }

    public int getPegawai_id() {
        return pegawai_id;
    }

    public void setPegawai_id(int pegawai_id) {
        this.pegawai_id = pegawai_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
}
