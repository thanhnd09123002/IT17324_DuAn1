/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1.nhom1.domainModels;

/**
 *
 * @author kiuqu
 */
public class Ban {
    private String IDban;
    private String MaBan;
    private Integer TrangThai;

    public Ban() {
    }

    public Ban(String IDban, String MaBan, Integer TrangThai) {
        this.IDban = IDban;
        this.MaBan = MaBan;
        this.TrangThai = TrangThai;
    }

    public String getIDban() {
        return IDban;
    }

    public void setIDban(String IDban) {
        this.IDban = IDban;
    }

    public String getMaBan() {
        return MaBan;
    }

    public void setMaBan(String MaBan) {
        this.MaBan = MaBan;
    }

    public Integer getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Integer TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "Ban{" + "IDban=" + IDban + ", MaBan=" + MaBan + ", TrangThai=" + TrangThai + '}';
    }
    
}
