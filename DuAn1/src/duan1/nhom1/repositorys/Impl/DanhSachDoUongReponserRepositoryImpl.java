/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1.nhom1.repositorys.Impl;

import duan1.nhom1.repositorys.DanhSachDoUongReponserRepository;
import duan1.nhom1.utilities.DBConnect;
import duan1.nhom1.viewModels.DanhSachDoUongReponser;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author kiuqu
 */
public class DanhSachDoUongReponserRepositoryImpl implements DanhSachDoUongReponserRepository{

    @Override
    public List<DanhSachDoUongReponser> getAll() {
        String query = """
                       SELECT        dbo.mon.TenMon, dbo.loai.TenLoai, dbo.monChiTiet.Gia
                       FROM            dbo.loai INNER JOIN
                                                dbo.monChiTiet ON dbo.loai.IDLoai = dbo.monChiTiet.IDLoai INNER JOIN
                                                dbo.mon ON dbo.monChiTiet.IDMon = dbo.mon.IDMon
                       """;
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<DanhSachDoUongReponser> list = new ArrayList<>();
            while (rs.next()) {
                DanhSachDoUongReponser vu = new DanhSachDoUongReponser(rs.getString("TenMon"), rs.getString("TenLoai"), rs.getDouble("Gia"));
                list.add(vu);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
}
