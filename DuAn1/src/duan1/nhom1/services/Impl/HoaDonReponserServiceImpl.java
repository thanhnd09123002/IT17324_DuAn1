/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1.nhom1.services.Impl;

import duan1.nhom1.domainModels.HoaDon;
import duan1.nhom1.repositorys.HoaDonReponserRepository;
import duan1.nhom1.repositorys.Impl.HoaDonReponserRepositoryImpl;
import duan1.nhom1.services.HoaDonReponserService;
import duan1.nhom1.viewModels.HoaDonReponser;
import java.util.List;

/**
 *
 * @author kiuqu
 */
public class HoaDonReponserServiceImpl implements HoaDonReponserService{

    HoaDonReponserRepository hd = new HoaDonReponserRepositoryImpl();
    @Override
    public List<HoaDonReponser> getAll() {
        return hd.getAll();
    }

    @Override
    public String add(HoaDon hoaDon) {
        if (hd.add(hoaDon)) {
            return "Tạo thành công";
        } else {
            return "Tạo thất bại";
        }
    }
    
}
