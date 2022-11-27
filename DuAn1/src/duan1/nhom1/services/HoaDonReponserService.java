/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duan1.nhom1.services;

import duan1.nhom1.domainModels.HoaDon;
import duan1.nhom1.viewModels.HoaDonReponser;
import java.util.List;

/**
 *
 * @author kiuqu
 */
public interface HoaDonReponserService {
    List<HoaDonReponser> getAll();
    String add(HoaDon hoaDon);
}
