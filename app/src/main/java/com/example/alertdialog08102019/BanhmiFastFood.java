package com.example.alertdialog08102019;

public class BanhmiFastFood implements BanhmiSetting {
    private String loai;
    private String salad;
    private String cachua;
    private String nuocsot;
    private String nuocuong;

    @Override
    public BanhmiSetting loai(String loai) {
        this.loai = loai;
        return this;
    }

    @Override
    public BanhmiSetting salad(String salad) {
        this.salad = salad;
        return this;
    }

    @Override
    public BanhmiSetting cachua(String cachua) {
        this.cachua = cachua;
        return this;
    }

    @Override
    public BanhmiSetting nuocsot(String nuocsot) {
        this.nuocsot = nuocsot;
        return this;
    }

    @Override
    public BanhmiSetting nuocuong(String nuocuong) {
        this.nuocuong = nuocuong;
        return this;
    }

    @Override
    public Banhmi build() {
        return new Banhmi(loai,salad,cachua,nuocsot,nuocuong);
    }
}
