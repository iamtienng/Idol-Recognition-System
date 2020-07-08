package com.iamtienng.em.view;

import com.iamtienng.em.bean.BeanList;
import com.iamtienng.em.controller.ScreenChangeController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iamtienng
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();

        setTitle("Idol Recognition System");

        ScreenChangeController controller = new ScreenChangeController(this, btnLogOut, jpnView);
        controller.setView(jpnHistory, jlbHistory);

        List<BeanList> listItem = new ArrayList<>();
        listItem.add(new BeanList("History", jpnHistory, jlbHistory));
        listItem.add(new BeanList("Profile", jpnProfile, jlbProfile));
        listItem.add(new BeanList("IdolRecognitor", jpnIdolRocognitor, jlbIdolRecognitor));

        controller.setEvent(listItem);
        controller.setLogOut();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnHistory = new javax.swing.JPanel();
        jlbHistory = new javax.swing.JLabel();
        jpnProfile = new javax.swing.JPanel();
        jlbProfile = new javax.swing.JLabel();
        jpnIdolRocognitor = new javax.swing.JPanel();
        jlbIdolRecognitor = new javax.swing.JLabel();
        jlbiamtienng = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnMenu.setBackground(new java.awt.Color(82, 83, 81));

        jPanel4.setBackground(new java.awt.Color(17, 45, 50));

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iamtienng/em/images/small_super_user_white.png"))); // NOI18N
        jLabel1.setText("Idol Recognition System");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        jpnHistory.setBackground(new java.awt.Color(110, 102, 88));

        jlbHistory.setBackground(new java.awt.Color(255, 255, 255));
        jlbHistory.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jlbHistory.setForeground(new java.awt.Color(255, 255, 255));
        jlbHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iamtienng/em/images/profile_white.png"))); // NOI18N
        jlbHistory.setText("Profile");

        javax.swing.GroupLayout jpnHistoryLayout = new javax.swing.GroupLayout(jpnHistory);
        jpnHistory.setLayout(jpnHistoryLayout);
        jpnHistoryLayout.setHorizontalGroup(
            jpnHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnHistoryLayout.setVerticalGroup(
            jpnHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHistoryLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlbHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpnProfile.setBackground(new java.awt.Color(110, 102, 88));

        jlbProfile.setBackground(new java.awt.Color(255, 255, 255));
        jlbProfile.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jlbProfile.setForeground(new java.awt.Color(255, 255, 255));
        jlbProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iamtienng/em/images/history_white.png"))); // NOI18N
        jlbProfile.setText("History");

        javax.swing.GroupLayout jpnProfileLayout = new javax.swing.GroupLayout(jpnProfile);
        jpnProfile.setLayout(jpnProfileLayout);
        jpnProfileLayout.setHorizontalGroup(
            jpnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnProfileLayout.setVerticalGroup(
            jpnProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jpnIdolRocognitor.setBackground(new java.awt.Color(110, 102, 88));

        jlbIdolRecognitor.setBackground(new java.awt.Color(255, 255, 255));
        jlbIdolRecognitor.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jlbIdolRecognitor.setForeground(new java.awt.Color(255, 255, 255));
        jlbIdolRecognitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iamtienng/em/images/search_white.png"))); // NOI18N
        jlbIdolRecognitor.setText("Idol Recognitor");

        javax.swing.GroupLayout jpnIdolRocognitorLayout = new javax.swing.GroupLayout(jpnIdolRocognitor);
        jpnIdolRocognitor.setLayout(jpnIdolRocognitorLayout);
        jpnIdolRocognitorLayout.setHorizontalGroup(
            jpnIdolRocognitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbIdolRecognitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnIdolRocognitorLayout.setVerticalGroup(
            jpnIdolRocognitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbIdolRecognitor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jlbiamtienng.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jlbiamtienng.setForeground(new java.awt.Color(255, 255, 255));
        jlbiamtienng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbiamtienng.setText("© iamtienng");

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbiamtienng, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnMenuLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnMenuLayout.createSequentialGroup()
                                .addComponent(btnLogOut)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jpnIdolRocognitor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnIdolRocognitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(18, 18, 18)
                .addComponent(jlbiamtienng)
                .addContainerGap())
        );

        jpnView.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogOutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jlbHistory;
    private javax.swing.JLabel jlbIdolRecognitor;
    private javax.swing.JLabel jlbProfile;
    private javax.swing.JLabel jlbiamtienng;
    private javax.swing.JPanel jpnHistory;
    private javax.swing.JPanel jpnIdolRocognitor;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnProfile;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
