/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import CSDL.DatabaseDongVanThanh;
import Models.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */

public class UsersDAODongVanThanh {
    public static int LayDSLop(Vector<Users> dsus)
    {
        Connection cnn = DatabaseDongVanThanh.KetnoiCSDL();
        if(cnn==null)
            return -1;
         String sql = "SELECT * FROM users";
        try {
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())//duyệt từng bản ghi kết quả select
            {
                Users lophoc = new Users();
                lophoc.name=(rs.getString("name"));
                lophoc.pass=(rs.getString("pass"));
                dsus.add(lophoc);
            }
            return dsus.size();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAODongVanThanh.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
    
}
