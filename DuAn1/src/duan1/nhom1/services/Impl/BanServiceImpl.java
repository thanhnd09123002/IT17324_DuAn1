/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1.nhom1.services.Impl;

import duan1.nhom1.domainModels.Ban;
import duan1.nhom1.repositorys.BanRepository;
import duan1.nhom1.repositorys.Impl.BanRepositoryImpl;
import duan1.nhom1.services.BanService;

/**
 *
 * @author kiuqu
 */
public class BanServiceImpl implements BanService{

    BanRepository br = new BanRepositoryImpl();

    @Override
    public Ban search(Ban ban) {
        return br.search(ban);
    }
    
    
}
