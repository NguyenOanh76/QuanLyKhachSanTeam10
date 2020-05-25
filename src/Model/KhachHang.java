/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author PC
 */
public class KhachHang {
     private String Ten;
    private String Ho;
    private Date NgaySinh;
    private String SDT;
    private String Email;
    private String CMND;
    private String IDDiaChi;
    
    public KhachHang(){
    }
    
    public KhachHang(String Ten,String Ho,Date NgaySinh ,String SDT,String Email ,String CMND, String IDDiaChi)
    {
        this.Ten=Ten;
        this.Ho=Ho;
        this.NgaySinh=NgaySinh;
        this.SDT=SDT;
        this.Email=Email;
        this.CMND=CMND; 
        this.IDDiaChi=IDDiaChi;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getIDDiaChi() {
        return IDDiaChi;
    }

    public void setIDDiaChi(String IDDiaChi) {
        this.IDDiaChi = IDDiaChi;
    }
    
    
}
