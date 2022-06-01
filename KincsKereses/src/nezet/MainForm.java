package nezet;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import modell.KincsesLada;
import modell.Terem;

public class MainForm extends javax.swing.JFrame {

    private JButton[] gombok;
    Terem terem;

    public MainForm() {
        initComponents();
        gombokAlap();
        terem = new Terem();
        alapLeirasok();
        pack();
    }

    private void gombokAlap() {
        gombok = new JButton[3];
        Component[] comps = ladaPanel.getComponents();
        
//        for (int i = 0; i < hossz ; i++) {
//            System.out.println("bent");
//           if(comps[i] instanceof JButton){ // nem megy be
//               System.out.println("bentebb");
//               gombok[n] =(JButton) comps[i];
//               
//               n++;
//           }
//        }
        //ideiglenes
        gombok[0] = lada1;
        gombok[1] = lada2;
        gombok[2] = lada3;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ladaPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        aranyLabel = new javax.swing.JLabel();
        lada1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lada2 = new javax.swing.JButton();
        ezustLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bronzLabel = new javax.swing.JLabel();
        lada3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        leiras = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        visszajelzes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kincskeresés");

        ladaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ládák"));
        ladaPanel.setLayout(new java.awt.GridLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Arany"));

        aranyLabel.setText("jLabel1");

        lada1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/arany.png"))); // NOI18N
        lada1.setPreferredSize(new java.awt.Dimension(136, 108));
        lada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kivalaszt(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aranyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(aranyLabel)
                .addContainerGap())
        );

        ladaPanel.add(jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ezüst"));

        lada2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/ezust.png"))); // NOI18N
        lada2.setPreferredSize(new java.awt.Dimension(136, 108));
        lada2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kivalaszt(evt);
            }
        });

        ezustLabel.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(ezustLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(ezustLabel)
                .addContainerGap())
        );

        ladaPanel.add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Bronz"));

        bronzLabel.setText("jLabel3");

        lada3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/bronz.png"))); // NOI18N
        lada3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kivalaszt(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lada3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bronzLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lada3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(bronzLabel)
                .addContainerGap())
        );

        ladaPanel.add(jPanel4);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("leírás"));

        leiras.setText("leírás....");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leiras, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leiras)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Visszajelzések"));

        jLabel1.setText("visszajelzés:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visszajelzes, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(visszajelzes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ladaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(ladaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kivalaszt(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kivalaszt

        JButton gomb = (JButton) evt.getSource();
        
        int i = 0;
        while (i < gombok.length && !(gomb == gombok[i])) {
            i++;
        }
        disableGomb(gomb);
        if (i < gombok.length) {
            ellenorzes(i);
        }
        
    }//GEN-LAST:event_kivalaszt

    private void ellenorzes(int i) {
        boolean talaltE = terem.getKincsesLadak()[i].getTartalom().equals(KincsesLada.KINCS);
        visszajelzes.setText(talaltE?"<html>Gratulálok megtatáltad.</html>":"<html>Nem sikerült.</html>");
        if(talaltE){
            disableGomb();
        }
        
    }

    private void disableGomb(){
        for (int i = 0; i < gombok.length; i++) {
            disableGomb(gombok[i]);
        }
    }
    private void disableGomb(JButton gomb){
        gomb.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aranyLabel;
    private javax.swing.JLabel bronzLabel;
    private javax.swing.JLabel ezustLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton lada1;
    private javax.swing.JButton lada2;
    private javax.swing.JButton lada3;
    private javax.swing.JPanel ladaPanel;
    private javax.swing.JLabel leiras;
    private javax.swing.JLabel visszajelzes;
    // End of variables declaration//GEN-END:variables

    private void alapLeirasok() {

        JLabel[] leirasok = new JLabel[]{aranyLabel, ezustLabel, bronzLabel};
        leiras.setText("<html>" + terem.getLeiras() + "</html>");
        for (int i = 0; i < leirasok.length; i++) {
            leirasok[i].setText(terem.getKincsesLadak()[i].getFelirat());
        }

    }

}
