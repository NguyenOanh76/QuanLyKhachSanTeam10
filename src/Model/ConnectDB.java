/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC
 */
public class ConnectDB {
    private String className;
    private String url;
    private String user;
    private String password;
    
    
    public Connection getConnection() throws IOException{
        Connection conn;
        className = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/hotel";
        user = "root";
        password = "1234";
        try {
            // Khai báo tên driver (tên Class) để kết nối với hệ quản trị cơ sở dữ liệu MYSQL
            Class.forName(className);
            // Lấy về kết nối
            conn =DriverManager.getConnection(url,user,password);
            System.out.println("ket noi thanh cong");
            return conn;
        } catch (Exception e) {
            // Ket noi khong thanh cong, hien thi loi
            System.out.println("loi ket noi ");
            e.printStackTrace();
        }
        return null;
    }
}

