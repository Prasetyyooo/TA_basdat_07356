package Entity;

public class CustomerEntity {
    protected int id_customer;
    protected String nama_customer;
    protected String username;
    protected String password;
    protected String noTelp;


    public CustomerEntity(int id_customer, String nama_customer, String usernaname,String password, String noTelp) {
        this.id_customer = id_customer;
        this.nama_customer = nama_customer;
        this.password = password;
        this.noTelp = noTelp;
        this.username = usernaname;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public String getNama_customer() {
        return nama_customer;
    }

    public void setNama_customer(String nama_customer) {
        this.nama_customer = nama_customer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
