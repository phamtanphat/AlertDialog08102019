package com.example.alertdialog08102019;

public class Banhmi {
    private String loai;
    private String salad;
    private String cachua;
    private String nuocsot;
    private String nuocuong;

    // alt + insert : goi chuc nang
    //constructor : phuong thuc tao object
    public Banhmi(String loai, String salad, String cachua, String nuocsot, String nuocuong) {
        this.loai = loai;
        this.salad = salad;
        this.cachua = cachua;
        this.nuocsot = nuocsot;
        this.nuocuong = nuocuong;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getSalad() {
        return salad;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public String getCachua() {
        return cachua;
    }

    public void setCachua(String cachua) {
        this.cachua = cachua;
    }

    public String getNuocsot() {
        return nuocsot;
    }

    public void setNuocsot(String nuocsot) {
        this.nuocsot = nuocsot;
    }

    public String getNuocuong() {
        return nuocuong;
    }

    public void setNuocuong(String nuocuong) {
        this.nuocuong = nuocuong;
    }
}
