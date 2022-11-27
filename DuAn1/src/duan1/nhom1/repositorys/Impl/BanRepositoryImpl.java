/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1.nhom1.repositorys.Impl;

import duan1.nhom1.domainModels.Ban;
import duan1.nhom1.repositorys.BanRepository;
import duan1.nhom1.utilities.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kiuqu
 */
public class BanRepositoryImpl implements BanRepository{

    @Override
    public Ban search(Ban ban) {
        String query = """
                       SELECT [IDBan]
                             ,[MaBan]
                             ,[TrangThaiBan]
                         FROM [dbo].[ban]
                       WHERE [MaBan] = ?
                       """;
        try(Connection con = DBConnect.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ban.getMaBan());
            ResultSet rs = ps.executeQuery();
            Ban v = null;
            while (rs.next()) {                
                v = new Ban(rs.getString("IDBan"),
                        rs.getString("MaBan"),
                        rs.getInt("TrangThaiBan"));
                
            }
            return v;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    
}
