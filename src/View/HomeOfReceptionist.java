/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;

/**
 *
 * @author CuongLuong
 */
public class HomeOfReceptionist extends javax.swing.JFrame {

    /**
     * Creates new form HomeOfReceptionist
     */
    public HomeOfReceptionist() {
        initComponents();
        jPHoaDon.setBackground(new Color(191, 133, 249));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        jPHoaDon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPDangXuat = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPKhachHang = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPPhong = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanelHotelInfo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanelHoaDon = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanelKhachHang = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jPanelPhong = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepane.setBackground(new java.awt.Color(54, 33, 89));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPHoaDon.setBackground(new java.awt.Color(88, 65, 118));
        jPHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPHoaDonMouseClicked(evt);
            }
        });
        jPHoaDon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hoadon.png"))); // NOI18N
        jPHoaDon.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quản Lí Hóa Đơn");
        jPHoaDon.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 120, 70));

        sidepane.add(jPHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 70));

        jPDangXuat.setBackground(new java.awt.Color(88, 65, 118));
        jPDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPDangXuatMouseClicked(evt);
            }
        });
        jPDangXuat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thoat.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        jPDangXuat.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Đăng xuất");
        jPDangXuat.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 90, 70));

        sidepane.add(jPDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 220, 70));

        jPKhachHang.setBackground(new java.awt.Color(88, 65, 118));
        jPKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPKhachHangMouseClicked(evt);
            }
        });
        jPKhachHang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/khachHang.png"))); // NOI18N
        jPKhachHang.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quản Lí Khách Hàng");
        jPKhachHang.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 140, 70));

        sidepane.add(jPKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 220, 70));

        jPPhong.setBackground(new java.awt.Color(88, 65, 118));
        jPPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPPhongMouseClicked(evt);
            }
        });
        jPPhong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-icon.png"))); // NOI18N
        jPPhong.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Quản Lí Phòng");
        jPPhong.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 70));

        sidepane.add(jPPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 220, 70));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tên khách sạn: lấy từ base");
        sidepane.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, -1));

        background.add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 470));

        jPanelHotelInfo.setBackground(new java.awt.Color(112, 72, 221));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ghi thông tin khách sạn ( lấy từ base ra)");

        javax.swing.GroupLayout jPanelHotelInfoLayout = new javax.swing.GroupLayout(jPanelHotelInfo);
        jPanelHotelInfo.setLayout(jPanelHotelInfoLayout);
        jPanelHotelInfoLayout.setHorizontalGroup(
            jPanelHotelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHotelInfoLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(428, Short.MAX_VALUE))
        );
        jPanelHotelInfoLayout.setVerticalGroup(
            jPanelHotelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHotelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(jPanelHotelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 830, 40));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Hàng Hóa", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab2", jPanel8);

        javax.swing.GroupLayout jPanelHoaDonLayout = new javax.swing.GroupLayout(jPanelHoaDon);
        jPanelHoaDon.setLayout(jPanelHoaDonLayout);
        jPanelHoaDonLayout.setHorizontalGroup(
            jPanelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2))
        );
        jPanelHoaDonLayout.setVerticalGroup(
            jPanelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        background.add(jPanelHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 830, 430));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Khách Hàng", jPanel10);

        javax.swing.GroupLayout jPanelKhachHangLayout = new javax.swing.GroupLayout(jPanelKhachHang);
        jPanelKhachHang.setLayout(jPanelKhachHangLayout);
        jPanelKhachHangLayout.setHorizontalGroup(
            jPanelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        jPanelKhachHangLayout.setVerticalGroup(
            jPanelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        background.add(jPanelKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 830, 430));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 825, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Phong", jPanel12);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 825, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("tab2", jPanel13);

        javax.swing.GroupLayout jPanelPhongLayout = new javax.swing.GroupLayout(jPanelPhong);
        jPanelPhong.setLayout(jPanelPhongLayout);
        jPanelPhongLayout.setHorizontalGroup(
            jPanelPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
            .addGroup(jPanelPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane3))
        );
        jPanelPhongLayout.setVerticalGroup(
            jPanelPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(jPanelPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPhongLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane3)
                    .addContainerGap()))
        );

        background.add(jPanelPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 830, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPHoaDonMouseClicked
        jPanelHoaDon.setVisible(true);
        jPanelKhachHang.setVisible(false);
        jPanelPhong.setVisible(false);
        
        jPHoaDon.setBackground(new Color(191, 133, 249));
        jPKhachHang.setBackground(new Color(88,65,118));
        jPPhong.setBackground(new Color(88,65,118));
    }//GEN-LAST:event_jPHoaDonMouseClicked

    private void jPKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPKhachHangMouseClicked
        jPanelKhachHang.setVisible(true);
        jPanelHoaDon.setVisible(false);
        jPanelPhong.setVisible(false);
        
        jPKhachHang.setBackground(new Color(191, 133, 249));
        jPHoaDon.setBackground(new Color(88,65,118));
        jPPhong.setBackground(new Color(88,65,118));
    }//GEN-LAST:event_jPKhachHangMouseClicked

    private void jPPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPPhongMouseClicked
        jPanelPhong.setVisible(true);
        jPanelHoaDon.setVisible(false);
        jPanelKhachHang.setVisible(false);
        
        jPPhong.setBackground(new Color(191, 133, 249));
        jPHoaDon.setBackground(new Color(88,65,118));
        jPKhachHang.setBackground(new Color(88,65,118));
    }//GEN-LAST:event_jPPhongMouseClicked

    private void jPDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPDangXuatMouseClicked
        // đóng cửa sổ hiện tại 
        this.dispose(); 
        // mở cửa sổ đăng nhập
        DangNhap dangNhap = new DangNhap();
        dangNhap.setLocationRelativeTo(null);
        dangNhap.setVisible(true);
        
    }//GEN-LAST:event_jPDangXuatMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeOfReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeOfReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeOfReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeOfReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeOfReceptionist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPDangXuat;
    private javax.swing.JPanel jPHoaDon;
    private javax.swing.JPanel jPKhachHang;
    private javax.swing.JPanel jPPhong;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelHoaDon;
    private javax.swing.JPanel jPanelHotelInfo;
    private javax.swing.JPanel jPanelKhachHang;
    private javax.swing.JPanel jPanelPhong;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JPanel sidepane;
    // End of variables declaration//GEN-END:variables
}