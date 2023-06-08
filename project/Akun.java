package project;

public  class Akun {
    protected int jumlah;
    protected String ID;
    protected String UserName;
    private String email;
    protected double hitungTotal;
    public String status;

    public void setID(String iD) {
        ID = iD;
    }
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public double hitungTotal(){
        return hitungTotal;
    }

    public String getId(){
        return ID;
    }

    public String userName(){
        return UserName;
    }

    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    public void Status(int cek){
        if(cek!=5){
            setStatus("Sudah Bayar");
        }else{
            setStatus("Belum Bayar");
        }
    }
    
}
