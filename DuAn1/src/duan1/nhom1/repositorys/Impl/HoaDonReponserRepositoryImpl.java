/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1.nhom1.repositorys.Impl;

import duan1.nhom1.domainModels.HoaDon;
import duan1.nhom1.repositorys.HoaDonReponserRepository;
import duan1.nhom1.utilities.DBConnect;
import duan1.nhom1.viewModels.HoaDonReponser;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author kiuqu
 */
public class HoaDonReponserRepositoryImpl implements HoaDonReponserRepository{

    @Override
    public List<HoaDonReponser> getAll() {
        String query = """
                       SELECT        dbo.ban.MaBan
                                                FROM            dbo.ban INNER JOIN
                                                                         dbo.hoaDon ON dbo.ban.IDBan = dbo.hoaDon.IDBan
                       """;
        
        try ( Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<HoaDonReponser> list = new ArrayList<>();
            while (rs.next()) {
                HoaDonReponser vu = new HoaDonReponser(rs.getString("MaBan"));
                list.add(vu);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public Boolean add(HoaDon hoaDon) {
        String query = """
                       INSERT INTO [dbo].[hoaDon]
                                  ([IDBan])
                            VALUES
                                  (?)
                       """;
        int check = 0;
        try(Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, hoaDon.getIDBan());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check>0;
    }
    
}
