/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1.nhom1.viewModels;

/**
 *
 * @author kiuqu
 */
public class HoaDonChiTietReponser {
    private String tenMon;
    private String tenLoai;
    private Double thanhTien;
    private Integer soLuong;
    private String moTa;

    public HoaDonChiTietReponser() {
    }

    public HoaDonChiTietReponser(String tenMon, String tenLoai, Double thanhTien, Integer soLuong, String moTa) {
        this.tenMon = tenMon;
        this.tenLoai = tenLoai;
        this.thanhTien = thanhTien;
        this.soLuong = soLuong;
        this.moTa = moTa;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public Double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    public Object[] getDataRow(){
        return new Object[]{tenMon+" "+tenLoai,moTa,soLuong};  
    }
}
