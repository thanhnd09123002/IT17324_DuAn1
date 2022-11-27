/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1.nhom1.viewModels;

/**
 *
 * @author kiuqu
 */
public class DanhSachDoUongReponser {
    private String TenMon;
    private String TenLoai;
    private Double GiaTien;

    public DanhSachDoUongReponser() {
    }

    public DanhSachDoUongReponser(String TenMon, String TenLoai, Double GiaTien) {
        this.TenMon = TenMon;
        this.TenLoai = TenLoai;
        this.GiaTien = GiaTien;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public Double getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(Double GiaTien) {
        this.GiaTien = GiaTien;
    }
    public Object[] getDataRow(){
        return new Object[]{TenMon+" "+TenLoai,GiaTien};  
    }

    @Override
    public String toString() {
        return "DanhSachDoUong{" + "TenMon=" + TenMon + ", TenLoai=" + TenLoai + ", GiaTien=" + GiaTien + '}';
    }
    
}
