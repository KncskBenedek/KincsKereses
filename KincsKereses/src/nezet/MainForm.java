
package nezet;

public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ladaPanel = new javax.swing.JPanel();
        lada2 = new javax.swing.JButton();
        lada1 = new javax.swing.JButton();
        lada3 = new javax.swing.JButton();
        l1Label = new javax.swing.JLabel();
        l2Label = new javax.swing.JLabel();
        l3Label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        leiras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ladaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ládák"));

        lada2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/ezust.png"))); // NOI18N
        lada2.setPreferredSize(new java.awt.Dimension(136, 108));

        lada1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/arany.png"))); // NOI18N
        lada1.setPreferredSize(new java.awt.Dimension(136, 108));

        lada3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/bronz.png"))); // NOI18N

        l1Label.setText("jLabel2");

        l2Label.setText("jLabel3");

        l3Label.setText("jLabel4");

        javax.swing.GroupLayout ladaPanelLayout = new javax.swing.GroupLayout(ladaPanel);
        ladaPanel.setLayout(ladaPanelLayout);
        ladaPanelLayout.setHorizontalGroup(
            ladaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ladaPanelLayout.createSequentialGroup()
                .addGroup(ladaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ladaPanelLayout.createSequentialGroup()
                        .addContainerGap(69, Short.MAX_VALUE)
                        .addComponent(lada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(lada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(ladaPanelLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(l1Label)
                        .addGap(164, 164, 164)
                        .addComponent(l2Label)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(ladaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ladaPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lada3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ladaPanelLayout.createSequentialGroup()
                        .addComponent(l3Label)
                        .addGap(103, 103, 103))))
        );
        ladaPanelLayout.setVerticalGroup(
            ladaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ladaPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(ladaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lada3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ladaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l3Label)
                    .addComponent(l1Label)
                    .addComponent(l2Label))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("leírás"));

        leiras.setText("leírás....");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leiras, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leiras)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ladaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(432, 432, 432)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ladaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l1Label;
    private javax.swing.JLabel l2Label;
    private javax.swing.JLabel l3Label;
    private javax.swing.JButton lada1;
    private javax.swing.JButton lada2;
    private javax.swing.JButton lada3;
    private javax.swing.JPanel ladaPanel;
    private javax.swing.JLabel leiras;
    // End of variables declaration//GEN-END:variables
}
