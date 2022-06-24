package Entity;

import java.sql.Date;

public class DetailTransaksiEntity {
    protected int transaksi_id;
    protected int customer_id;
    protected int pegawai_id;
    protected Date tgl_peminjaman;
    protected Date tgl_pengembalian;
    protected String status;

    public DetailTransaksiEntity(int transaksi_id, int customer_id, int pegawai_id, Date tgl_peminjaman, Date tgl_pengembalian, String status) {
        this.transaksi_id = transaksi_id;
        this.customer_id = customer_id;
        this.pegawai_id = pegawai_id;
        this.tgl_peminjaman = tgl_peminjaman;
        this.tgl_pengembalian = tgl_pengembalian;
        this.status = status;
    }

    public int getTransaksi_id() {
        return transaksi_id;
    }

    public void setTransaksi_id(int transaksi_id) {
        this.transaksi_id = transaksi_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getPegawai_id() {
        return pegawai_id;
    }

    public void setPegawai_id(int pegawai_id) {
        this.pegawai_id = pegawai_id;
    }

    public Date getTgl_peminjaman() {
        return tgl_peminjaman;
    }

    public void setTgl_peminjaman(Date tgl_peminjaman) {
        this.tgl_peminjaman = tgl_peminjaman;
    }

    public Date getTgl_pengembalian() {
        return tgl_pengembalian;
    }

    public void setTgl_pengembalian(Date tgl_pengembalian) {
        this.tgl_pengembalian = tgl_pengembalian;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
