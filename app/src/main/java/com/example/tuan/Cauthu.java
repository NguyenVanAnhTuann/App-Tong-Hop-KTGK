package com.example.tuan;

public class Cauthu {
    private String Ten;
    private String Mota;
    private String Noidung;
    private int Hinh;

    public Cauthu(String ten, String mota, String noidung, int hinh){
        Ten = ten ;
        Mota =mota;
        Noidung = noidung;
        Hinh = hinh ;
    }

    public String getTen() {
        return Ten;
    }
    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMota() {
        return Mota;
    }
    public void setMota(String mota) {
        Mota = mota;
    }

    public String getNoidung() {
        return Noidung;
    }
    public void setNoidung(String noidung) {Noidung = noidung;}

    public int getHinh() {
        return Hinh;
    }
    public void setHinh(int hinh) {
        Hinh = hinh;
    }


}

