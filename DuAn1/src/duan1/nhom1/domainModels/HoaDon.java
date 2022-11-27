/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1.nhom1.domainModels;

/**
 *
 * @author kiuqu
 */
public class HoaDon {
    private String IDHoaDon;
    private Double ThanhTien;
    private Double TienGiam;
    private Integer TrangThai;
    private String IDBan;
    private String IDNhanVien;

    public HoaDon() {
    }

    public HoaDon(String IDHoaDon, Double ThanhTien, Double TienGiam, Integer TrangThai, String IDBan, String IDNhanVien) {
        this.IDHoaDon = IDHoaDon;
        this.ThanhTien = ThanhTien;
        this.TienGiam = TienGiam;
        this.TrangThai = TrangThai;
        this.IDBan = IDBan;
        this.IDNhanVien = IDNhanVien;
    }

    public String getIDHoaDon() {
        return IDHoaDon;
    }

    public void setIDHoaDon(String IDHoaDon) {
        this.IDHoaDon = IDHoaDon;
    }

    public Double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(Double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public Double getTienGiam() {
        return TienGiam;
    }

    public void setTienGiam(Double TienGiam) {
        this.TienGiam = TienGiam;
    }

    public Integer getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Integer TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getIDBan() {
        return IDBan;
    }

    public void setIDBan(String IDBan) {
        this.IDBan = IDBan;
    }

    public String getIDNhanVien() {
        return IDNhanVien;
    }

    public void setIDNhanVien(String IDNhanVien) {
        this.IDNhanVien = IDNhanVien;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "IDHoaDon=" + IDHoaDon + ", ThanhTien=" + ThanhTien + ", TienGiam=" + TienGiam + ", TrangThai=" + TrangThai + ", IDBan=" + IDBan + ", IDNhanVien=" + IDNhanVien + '}';
    }
    
}
