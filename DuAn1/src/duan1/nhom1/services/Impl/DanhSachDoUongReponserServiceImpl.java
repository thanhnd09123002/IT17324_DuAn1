/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1.nhom1.services.Impl;

import duan1.nhom1.repositorys.DanhSachDoUongReponserRepository;
import duan1.nhom1.repositorys.Impl.DanhSachDoUongReponserRepositoryImpl;
import duan1.nhom1.services.DanhSachDoUongReponserService;
import duan1.nhom1.viewModels.DanhSachDoUongReponser;
import java.util.List;

/**
 *
 * @author kiuqu
 */
public class DanhSachDoUongReponserServiceImpl implements DanhSachDoUongReponserService{

    DanhSachDoUongReponserRepository dsdu = new DanhSachDoUongReponserRepositoryImpl();
    @Override
    public List<DanhSachDoUongReponser> getAll() {
        return dsdu.getAll();
    }
    
}
