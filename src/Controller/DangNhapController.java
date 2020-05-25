/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ConnectDB;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PC
 */
public class DangNhapController {
      private ConnectDB myConn;
    private Statement st;
    private ResultSet rs;
    private String sqlCommand;
    public static String role;

    public DangNhapController() {
        myConn = new ConnectDB();
    }

    public boolean isExistedAccount(String user, String password) throws IOException, SQLException {
        st = null;
        rs = null;
        sqlCommand = "SELECT * FROM hotel.user WHERE User_Name = '" + user + "' "
                + "AND Pass_Word = '" + password + "'" ;
        try {
            st = myConn.getConnection().createStatement();
            System.out.println(sqlCommand);
            rs = st.executeQuery(sqlCommand);
            if (rs.next()) {
                role = rs.getString("loai");
                return true;
            }
        } catch (IOException | SQLException e) {
            
        } finally {
            myConn.getConnection().close();
        }

        return false;
    }
    
}
