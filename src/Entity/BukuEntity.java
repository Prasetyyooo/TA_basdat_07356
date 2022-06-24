package Entity;

public class BukuEntity {
    protected int kode_buku;
    protected String judul_buku;
    protected String penerbit_buku;
    protected String status;

    public BukuEntity(int kode_buku, String judul_buku, String penerbit_buku, String status) {
        this.kode_buku = kode_buku;
        this.judul_buku = judul_buku;
        this.penerbit_buku = penerbit_buku;
        this.status = status;
    }

    public int getKode_buku() {
        return kode_buku;
    }

    public void setKode_buku(int kode_buku) {
        this.kode_buku = kode_buku;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public String getPenerbit_buku() {
        return penerbit_buku;
    }

    public void setPenerbit_buku(String penerbit_buku) {
        this.penerbit_buku = penerbit_buku;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
