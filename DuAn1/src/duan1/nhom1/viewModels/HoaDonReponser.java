/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1.nhom1.viewModels;

/**
 *
 * @author kiuqu
 */
public class HoaDonReponser {
    private String MaBan;

    public HoaDonReponser() {
    }

    public HoaDonReponser(String MaBan) {
        this.MaBan = MaBan;
    }

    public String getMaBan() {
        return MaBan;
    }

    public void setMaBan(String MaBan) {
        this.MaBan = MaBan;
    }
    public Object[] getDataRow(){
        return new Object[]{MaBan};  
    }
}
