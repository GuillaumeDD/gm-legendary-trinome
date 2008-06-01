/*
 * MorpionAfricainUI.java
 *
 * Created on 1 juin 2008, 11:12
 */



/**
 *
 * @author  Nyho
 */
public class MorpionAfricainUI extends javax.swing.JFrame {

    /** Creates new form MorpionAfricainUI */
    public MorpionAfricainUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGlobal = new javax.swing.JPanel();
        jPanelJoueur1 = new javax.swing.JPanel();
        jLabelJoueur1 = new javax.swing.JLabel();
        jTextFieldJoueur1 = new javax.swing.JTextField();
        jLabelNom1 = new javax.swing.JLabel();
        jLabelScore1 = new javax.swing.JLabel();
        jLabelScoreJoueur1 = new javax.swing.JLabel();
        jPanelJoueur2 = new javax.swing.JPanel();
        jLabelJoueur2 = new javax.swing.JLabel();
        jTextFieldJoueur2 = new javax.swing.JTextField();
        jLabelNom2 = new javax.swing.JLabel();
        jLabelScore2 = new javax.swing.JLabel();
        jLabelScoreJoueur2 = new javax.swing.JLabel();
        jPanelMorpionAfricain = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabelTitreApplet = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Morpion africain");

        jPanelJoueur1.setBackground(new java.awt.Color(255, 255, 0));
        jPanelJoueur1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelJoueur1.setFont(new java.awt.Font("Purisa", 1, 18));
        jLabelJoueur1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJoueur1.setText("Joueur 1");

        jTextFieldJoueur1.setText("Joueur 1");

        jLabelNom1.setText("Nom");

        jLabelScore1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelScore1.setText("Score");

        jLabelScoreJoueur1.setFont(new java.awt.Font("Purisa", 1, 36));
        jLabelScoreJoueur1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelScoreJoueur1.setText("1");

        javax.swing.GroupLayout jPanelJoueur1Layout = new javax.swing.GroupLayout(jPanelJoueur1);
        jPanelJoueur1.setLayout(jPanelJoueur1Layout);
        jPanelJoueur1Layout.setHorizontalGroup(
            jPanelJoueur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJoueur1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNom1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldJoueur1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanelJoueur1Layout.createSequentialGroup()
                .addGroup(jPanelJoueur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelScoreJoueur1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelScore1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelJoueur1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanelJoueur1Layout.setVerticalGroup(
            jPanelJoueur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJoueur1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelJoueur1)
                .addGap(8, 8, 8)
                .addGroup(jPanelJoueur1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNom1)
                    .addComponent(jTextFieldJoueur1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelScore1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelScoreJoueur1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jPanelJoueur2.setBackground(new java.awt.Color(102, 255, 0));
        jPanelJoueur2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelJoueur2.setFont(new java.awt.Font("Purisa", 1, 18));
        jLabelJoueur2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJoueur2.setText("Joueur 2");

        jTextFieldJoueur2.setText("Joueur 2");

        jLabelNom2.setText("Nom");

        jLabelScore2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelScore2.setText("Score");

        jLabelScoreJoueur2.setFont(new java.awt.Font("Purisa", 1, 36));
        jLabelScoreJoueur2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelScoreJoueur2.setText("1");

        javax.swing.GroupLayout jPanelJoueur2Layout = new javax.swing.GroupLayout(jPanelJoueur2);
        jPanelJoueur2.setLayout(jPanelJoueur2Layout);
        jPanelJoueur2Layout.setHorizontalGroup(
            jPanelJoueur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJoueur2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNom2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldJoueur2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanelJoueur2Layout.createSequentialGroup()
                .addGroup(jPanelJoueur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelScoreJoueur2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelScore2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelJoueur2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanelJoueur2Layout.setVerticalGroup(
            jPanelJoueur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJoueur2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelJoueur2)
                .addGap(8, 8, 8)
                .addGroup(jPanelJoueur2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNom2)
                    .addComponent(jTextFieldJoueur2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelScore2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelScoreJoueur2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jPanelMorpionAfricain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("1");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("2");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("3");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("4");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setText("5");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("6");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setText("7");
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setText("8");
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setText("9");
        jButton9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanelMorpionAfricainLayout = new javax.swing.GroupLayout(jPanelMorpionAfricain);
        jPanelMorpionAfricain.setLayout(jPanelMorpionAfricainLayout);
        jPanelMorpionAfricainLayout.setHorizontalGroup(
            jPanelMorpionAfricainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMorpionAfricainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMorpionAfricainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMorpionAfricainLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMorpionAfricainLayout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMorpionAfricainLayout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMorpionAfricainLayout.setVerticalGroup(
            jPanelMorpionAfricainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMorpionAfricainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMorpionAfricainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMorpionAfricainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMorpionAfricainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelTitreApplet.setFont(new java.awt.Font("Purisa", 1, 24));
        jLabelTitreApplet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitreApplet.setText("Morpion africain");

        javax.swing.GroupLayout jPanelGlobalLayout = new javax.swing.GroupLayout(jPanelGlobal);
        jPanelGlobal.setLayout(jPanelGlobalLayout);
        jPanelGlobalLayout.setHorizontalGroup(
            jPanelGlobalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGlobalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelJoueur1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelMorpionAfricain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanelJoueur2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabelTitreApplet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );
        jPanelGlobalLayout.setVerticalGroup(
            jPanelGlobalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGlobalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitreApplet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGlobalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelJoueur1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelJoueur2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMorpionAfricain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MorpionAfricainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabelJoueur1;
    private javax.swing.JLabel jLabelJoueur2;
    private javax.swing.JLabel jLabelNom1;
    private javax.swing.JLabel jLabelNom2;
    private javax.swing.JLabel jLabelScore1;
    private javax.swing.JLabel jLabelScore2;
    private javax.swing.JLabel jLabelScoreJoueur1;
    private javax.swing.JLabel jLabelScoreJoueur2;
    private javax.swing.JLabel jLabelTitreApplet;
    private javax.swing.JPanel jPanelGlobal;
    private javax.swing.JPanel jPanelJoueur1;
    private javax.swing.JPanel jPanelJoueur2;
    private javax.swing.JPanel jPanelMorpionAfricain;
    private javax.swing.JTextField jTextFieldJoueur1;
    private javax.swing.JTextField jTextFieldJoueur2;
    // End of variables declaration//GEN-END:variables

}
