/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.JdbcHelper;
import Model.User;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class UserDAO {
    public List<User> findByUsername (String username){
        String sql ="SELECT * FROM users WHERE Username ='"+ username + "'";
        return select(sql);
    }

    private List<User> select(String sql, Object... args) {
        List<User> list = new ArrayList<>();
        try {
                ResultSet rs = null;
                try{
                    rs = JdbcHelper.executeQuery(sql,args);
                    while (rs.next()){
                        User model = readFromResultSet(rs);
                        list.add(model);
                    }
                } finally {
                    rs.getStatement().getConnection().close();
                }
        } catch (Exception e){
            throw new RuntimeException(e);
        }
        
            return list;
    }

    private User readFromResultSet(ResultSet rs) throws SQLException{
        User model = new User();
        model.setUsername(rs.getString("Username"));
        model.setPassword(rs.getString("Password"));
        model.setFullname(rs.getString("Fullname"));
        model.setIsAdmin(rs.getBoolean("IsAdmin"));
        return model;
    }
}
