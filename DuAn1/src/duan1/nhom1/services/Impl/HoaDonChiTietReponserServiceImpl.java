/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1.nhom1.services.Impl;

import duan1.nhom1.repositorys.HoaDonChiTietReponserRepository;
import duan1.nhom1.repositorys.Impl.HoaDonChiTietReponserRepositoryImpl;
import duan1.nhom1.services.HoaDonChiTietReponserServices;
import duan1.nhom1.viewModels.HoaDonChiTietReponser;
import java.util.List;

/**
 *
 * @author kiuqu
 */
public class HoaDonChiTietReponserServiceImpl implements HoaDonChiTietReponserServices{

    HoaDonChiTietReponserRepository hdct = new HoaDonChiTietReponserRepositoryImpl();
    @Override
    public List<HoaDonChiTietReponser> getAll() {
        return hdct.getAll();
    }
    
}
