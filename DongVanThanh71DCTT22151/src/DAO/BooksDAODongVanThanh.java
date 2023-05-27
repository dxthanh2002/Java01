/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import CSDL.DatabaseDongVanThanh;
import Models.Books;
import java.sql.Connection;
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
public class BooksDAODongVanThanh {
    public Vector<Books> list;
    public BooksDAODongVanThanh()
    {
        list = new Vector<Books>();
    }
    //hàm trả về mảng dsLop chứa các lớp học học (qua tham chiếu)
    //hàm trả về -1 (lỗi kết nối CSDL), -2 (Lỗi SQL), còn lại là số bản ghi
    public int LayDSBook()
    {
        Connection cnn = DatabaseDongVanThanh.KetnoiCSDL();
        if(cnn==null)
            return -1;
         String sql = "SELECT * FROM Books";
        try {
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())//duyệt từng bản ghi kết quả select
            {
                Books bk = new Books();
                bk.tensach=(rs.getString("TenSach"));
                bk.theloai=(rs.getString("Theloai"));
                bk.namxuatban=(rs.getInt("Namxuatban"));
                bk.ngaynhap=(rs.getString("Ngaynhap"));
                bk.giatien=(rs.getInt("Giatien"));            
                this.list.add(bk);
            }
            return this.list.size();
        } catch (SQLException ex) {
            Logger.getLogger(BooksDAODongVanThanh.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
    
}
