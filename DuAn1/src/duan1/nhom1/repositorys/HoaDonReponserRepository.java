/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duan1.nhom1.repositorys;

import duan1.nhom1.domainModels.HoaDon;
import duan1.nhom1.viewModels.HoaDonReponser;
import java.util.List;

/**
 *
 * @author kiuqu
 */
public interface HoaDonReponserRepository {
    List<HoaDonReponser> getAll();
    Boolean add(HoaDon hoaDon);
}
