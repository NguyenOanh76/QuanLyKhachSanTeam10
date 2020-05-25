/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ConnectDB;
import Model.KhachHang;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class KhachHangController {
    private ConnectDB myConn;
    private ArrayList<KhachHang> listKhachHang;
    private PreparedStatement ps;
    private Statement st;
    private ResultSet rs;
    private String sqlCommand;
    private String sqlCommand1;
    private String sqlCommand2;
    private String sqlCommand3;
    private KhachHang KhachHang;
    
    public KhachHangController() {
        myConn = new ConnectDB();
    }
    public ArrayList<KhachHang> getListKhachhang(String IDDiaChi, String Ten, String SDT) throws SQLException, IOException {
        listKhachHang = new ArrayList<KhachHang>();
        st = null;
        rs = null;
        sqlCommand1 = "select * from khach_hang where ID_Dia_Chi = '"+IDDiaChi+"'";
        sqlCommand2 = "select * from KhachHang where Ten = '" + Ten + "' AND ID_Dia_Chi = '"+IDDiaChi+"'";
        sqlCommand3 = "select * from KhachHang where SDT = '" + SDT + "'AND ID_Dia_Chi = '"+IDDiaChi+"'";
        
        try {
            st = myConn.getConnection().createStatement();
            if (Ten != "") {
                sqlCommand = sqlCommand2;
            } else if (SDT != "") {
                sqlCommand = sqlCommand3;
            } else {
                sqlCommand = sqlCommand1;
            }
            rs = st.executeQuery(sqlCommand);
            while (rs.next()) {
//                KhachHang = new KhachHang(rs.getString("MaKH"), rs.getString("TenKH"), rs.getDate("NgaySinh"), rs.getString("SDT"),rs.getString("QueQuan"),rs.getString("Email"));
                listKhachHang.add(KhachHang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            myConn.getConnection().close();
        }

        return listKhachHang;
    }
}
