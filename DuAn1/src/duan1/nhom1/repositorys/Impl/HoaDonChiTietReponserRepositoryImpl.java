/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1.nhom1.repositorys.Impl;

import duan1.nhom1.repositorys.HoaDonChiTietReponserRepository;
import duan1.nhom1.utilities.DBConnect;
import duan1.nhom1.viewModels.HoaDonChiTietReponser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kiuqu
 */
public class HoaDonChiTietReponserRepositoryImpl implements HoaDonChiTietReponserRepository {

    @Override
    public List<HoaDonChiTietReponser> getAll() {
        String query = """
                       SELECT        dbo.mon.TenMon, dbo.loai.TenLoai, dbo.hoaDonChiTiet.GiaTien, dbo.hoaDonChiTiet.SoLuong, dbo.hoaDonChiTiet.MoTa
                       FROM            dbo.hoaDonChiTiet INNER JOIN
                                                dbo.monChiTiet ON dbo.hoaDonChiTiet.IDMonChiTiet = dbo.monChiTiet.IDMonChiTiet INNER JOIN
                                                dbo.loai ON dbo.monChiTiet.IDLoai = dbo.loai.IDLoai INNER JOIN
                                                dbo.mon ON dbo.monChiTiet.IDMon = dbo.mon.IDMon
                       """;
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<HoaDonChiTietReponser> list = new ArrayList<>();
            while (rs.next()) {
                HoaDonChiTietReponser vu = new HoaDonChiTietReponser(rs.getString("TenMon"), rs.getString("TenLoai"), rs.getDouble("GiaTien"), rs.getInt("SoLuong"), rs.getString("MoTa"));
                list.add(vu);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
