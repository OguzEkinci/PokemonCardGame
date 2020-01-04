package prolab2;

import java.util.*;
import javax.swing.*;
import prolab2.*;

public class kullanicivsbilgisayar extends javax.swing.JFrame {

    Random random = new Random();
    insanOyuncu insan = new insanOyuncu();
    bilgisayar bilgisayar = new bilgisayar();
    ArrayList<Pokemon> kartDestesi = new ArrayList<>();
    ArrayList<JLabel> label = new ArrayList<>();
    ArrayList<Pokemon> iKartListesi = new ArrayList<>();
    ArrayList<Pokemon> bKartListesi = new ArrayList<>();
    Bulbasaur Bulbasaur = new Bulbasaur(50, 1, "Bulbasaur", "Çim");
    ButterFree ButterFree = new ButterFree(10, 2, "ButterFree", "Hava");
    Charmander Charmander = new Charmander(60, 3, "Charmander", "Ateş");
    Jigglypuff Jigglypuff = new Jigglypuff(70, 4, "Jigglypuff", "Ses");
    Meowth Meowth = new Meowth(40, 5, "Meowth", "Normal");
    Pikachu Pikachu = new Pikachu(40, 6, "Pikachu", "Elektrik");
    Psyduck Psyduck = new Psyduck(20, 7, "Psyduck", "Su");
    Snorlax Snorlax = new Snorlax(30, 8, "Snorlax", "Normal");
    Squirtle Squirtle = new Squirtle(30, 9, "Squirtle", "Su");
    Zubat Zubat = new Zubat(50, 10, "Zubat", "Hava");
    int a, b, c, d, e, f;

    private void kartatama() {
        kartDestesi.add(Bulbasaur);
        kartDestesi.add(ButterFree);
        kartDestesi.add(Charmander);
        kartDestesi.add(Jigglypuff);
        kartDestesi.add(Meowth);
        kartDestesi.add(Pikachu);
        kartDestesi.add(Psyduck);
        kartDestesi.add(Snorlax);
        kartDestesi.add(Squirtle);
        kartDestesi.add(Zubat);
    }

    static void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public kullanicivsbilgisayar() {
        initComponents();
        kartyerleri();
        kartatama();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        KARTDAGIT = new javax.swing.JButton();
        TEKKARTDAGIT = new javax.swing.JButton();
        card1 = new javax.swing.JLabel();
        card2 = new javax.swing.JLabel();
        card3 = new javax.swing.JLabel();
        card4 = new javax.swing.JLabel();
        card5 = new javax.swing.JLabel();
        card6 = new javax.swing.JLabel();
        card7 = new javax.swing.JLabel();
        card8 = new javax.swing.JLabel();
        card9 = new javax.swing.JLabel();
        card10 = new javax.swing.JLabel();
        ekKart1 = new javax.swing.JLabel();
        ekKart2 = new javax.swing.JLabel();
        ekKart3 = new javax.swing.JLabel();
        ekKart4 = new javax.swing.JLabel();
        KullanıcıSkor = new javax.swing.JLabel();
        BotSkor = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        insanKart = new javax.swing.JLabel();
        botKart = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("               BİLGİSAYAR");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(710, 0, 650, 20);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("               KULLANICI");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(690, 1000, 570, 20);

        KARTDAGIT.setText("KART DAĞIT");
        KARTDAGIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KARTDAGIT(evt);
            }
        });
        getContentPane().add(KARTDAGIT);
        KARTDAGIT.setBounds(10, 870, 160, 30);

        TEKKARTDAGIT.setText("TEK KART VER");
        TEKKARTDAGIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEKKARTDAGIT(evt);
            }
        });
        getContentPane().add(TEKKARTDAGIT);
        TEKKARTDAGIT.setBounds(10, 870, 160, 30);

        card1.setText("card1");
        getContentPane().add(card1);
        card1.setBounds(900, 10, 190, 290);

        card2.setText("card2");
        getContentPane().add(card2);
        card2.setBounds(1120, 10, 190, 280);

        card3.setText("card3");
        getContentPane().add(card3);
        card3.setBounds(1340, 0, 190, 290);

        card4.setText("card4");
        card4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card4MouseClicked(evt);
            }
        });
        getContentPane().add(card4);
        card4.setBounds(880, 750, 190, 250);

        card5.setText("card5");
        card5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card5MouseClicked(evt);
            }
        });
        getContentPane().add(card5);
        card5.setBounds(1110, 750, 180, 250);

        card6.setText("card6");
        card6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card6MouseClicked(evt);
            }
        });
        getContentPane().add(card6);
        card6.setBounds(1320, 740, 190, 250);

        card7.setText("card7");
        card7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card7MouseClicked(evt);
            }
        });
        getContentPane().add(card7);
        card7.setBounds(770, 220, 230, 290);

        card8.setText("card8");
        card8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card8MouseClicked(evt);
            }
        });
        getContentPane().add(card8);
        card8.setBounds(1050, 240, 200, 250);

        card9.setText("card9");
        card9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card9MouseClicked(evt);
            }
        });
        getContentPane().add(card9);
        card9.setBounds(780, 490, 210, 280);

        card10.setText("card10");
        card10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card10MouseClicked(evt);
            }
        });
        getContentPane().add(card10);
        card10.setBounds(1070, 510, 190, 240);

        ekKart1.setText("ekKart1");
        ekKart1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ekKart1MouseClicked(evt);
            }
        });
        getContentPane().add(ekKart1);
        ekKart1.setBounds(690, 750, 180, 260);

        ekKart2.setText("ekKart2");
        ekKart2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ekKart2MouseClicked(evt);
            }
        });
        getContentPane().add(ekKart2);
        ekKart2.setBounds(490, 760, 190, 240);

        ekKart3.setText("ekKart3");
        ekKart3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ekKart3MouseClicked(evt);
            }
        });
        getContentPane().add(ekKart3);
        ekKart3.setBounds(670, 20, 210, 270);

        ekKart4.setText("ekKart4");
        ekKart4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ekKart4MouseClicked(evt);
            }
        });
        getContentPane().add(ekKart4);
        ekKart4.setBounds(460, 30, 200, 310);

        KullanıcıSkor.setText(":");
        getContentPane().add(KullanıcıSkor);
        KullanıcıSkor.setBounds(1380, 430, 150, 40);

        BotSkor.setText(":");
        getContentPane().add(BotSkor);
        BotSkor.setBounds(1380, 380, 150, 40);

        jTextField3.setText("BİLGİSAYAR SKOR");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(1260, 390, 120, 20);

        insanKart.setText("botKart");
        getContentPane().add(insanKart);
        insanKart.setBounds(140, 350, 200, 290);

        botKart.setText("insanKart");
        getContentPane().add(botKart);
        botKart.setBounds(370, 350, 230, 310);

        jTextField4.setText("KULLANICI");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(1288, 440, 90, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab2/fotolar/dIqooJo.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1570, 1040);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void KARTDAGIT(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KARTDAGIT
        KARTDAGIT.setVisible(false);
        rasgeleKartDagit();
        dagitResim();
    }//GEN-LAST:event_KARTDAGIT

    private void TEKKARTDAGIT(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEKKARTDAGIT
        JLabel oyuncuAlan = null;
        JLabel bilgisayarAlan = null;

        if (insan.getDeste().size() < 3 && kartDestesi.size() > 0) {
            int z = random.nextInt(kartDestesi.size());
            bilgisayar.getDeste().add(kartDestesi.get(z));
            for (int i = 0; i < label.size(); i++) {
                if (label.get(i).getName().equals(String.valueOf(kartDestesi.get(z).getPokemonID()))) {
                    bilgisayarAlan = label.get(i);
                }
            }
            kartDestesi.remove(z);

            int y = random.nextInt(kartDestesi.size());
            insan.getDeste().add(kartDestesi.get(y));
            for (int i = 0; i < label.size(); i++) {
                if (label.get(i).getName().equals(String.valueOf(kartDestesi.get(y).getPokemonID()))) {
                    oyuncuAlan = label.get(i);
                }
            }
            kartDestesi.remove(y);

            if (kartDestesi.size() == 2) {
                bilgisayarAlan.setBounds(670, 20, 210, 270);
                oyuncuAlan.setBounds(690, 750, 180, 260);

            } else {
               bilgisayarAlan.setBounds(460, 30, 200, 310);
                oyuncuAlan.setBounds(490, 760, 190, 240);
            }
        }

    }//GEN-LAST:event_TEKKARTDAGIT

    private void card4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card4MouseClicked
        int sayac = 0;

        for (int i = 0; i < insan.getDeste().size(); i++) {
            if (insan.getDeste().get(i).getPokemonID() == Integer.valueOf(card4.getName())) {
                sayac = 1;

            }
        }
        if (sayac == 1) {
            kartOyna(Integer.valueOf(card4.getName()));
        }

    }//GEN-LAST:event_card4MouseClicked

    private void card5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card5MouseClicked
        int sayac = 0;
        for (int i = 0; i < insan.getDeste().size(); i++) {
            if (insan.getDeste().get(i).getPokemonID() == Integer.valueOf(card5.getName())) {
                sayac = 1;

            }
        }
        if (sayac == 1) {
            kartOyna(Integer.valueOf(card5.getName()));
        }

    }//GEN-LAST:event_card5MouseClicked

    private void card6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card6MouseClicked
        int sayac = 0;
        for (int i = 0; i < insan.getDeste().size(); i++) {
            if (insan.getDeste().get(i).getPokemonID() == Integer.valueOf(card6.getName())) {
                sayac = 1;

            }
        }
        if (sayac == 1) {
            kartOyna(Integer.valueOf(card6.getName()));
        }

    }//GEN-LAST:event_card6MouseClicked

    private void card7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card7MouseClicked
        int sayac = 0;
        for (int i = 0; i < insan.getDeste().size(); i++) {
            if (insan.getDeste().get(i).getPokemonID() == Integer.valueOf(card7.getName())) {
                sayac = 1;

            }
        }
        if (sayac == 1) {
            kartOyna(Integer.valueOf(card7.getName()));
        }

    }//GEN-LAST:event_card7MouseClicked

    private void card8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card8MouseClicked
        int sayac = 0;
        for (int i = 0; i < insan.getDeste().size(); i++) {
            if (insan.getDeste().get(i).getPokemonID() == Integer.valueOf(card8.getName())) {
                sayac = 1;

            }
        }
        if (sayac == 1) {
            kartOyna(Integer.valueOf(card8.getName()));
        }

    }//GEN-LAST:event_card8MouseClicked

    private void card9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card9MouseClicked
        int sayac = 0;
        for (int i = 0; i < insan.getDeste().size(); i++) {
            if (insan.getDeste().get(i).getPokemonID() == Integer.valueOf(card9.getName())) {
                sayac = 1;

            }
        }
        if (sayac == 1) {
            kartOyna(Integer.valueOf(card9.getName()));
        }

    }//GEN-LAST:event_card9MouseClicked

    private void card10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card10MouseClicked
        int sayac = 0;
        for (int i = 0; i < insan.getDeste().size(); i++) {
            if (insan.getDeste().get(i).getPokemonID() == Integer.valueOf(card10.getName())) {
                sayac = 1;
            }
        }
        if (sayac == 1) {
            kartOyna(Integer.valueOf(card10.getName()));
        }
    }//GEN-LAST:event_card10MouseClicked

    private void ekKart1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ekKart1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ekKart1MouseClicked

    private void ekKart2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ekKart2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ekKart2MouseClicked

    private void ekKart3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ekKart3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ekKart3MouseClicked

    private void ekKart4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ekKart4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ekKart4MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(kullanicivsbilgisayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kullanicivsbilgisayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kullanicivsbilgisayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kullanicivsbilgisayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kullanicivsbilgisayar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotSkor;
    private javax.swing.JButton KARTDAGIT;
    private javax.swing.JLabel KullanıcıSkor;
    private javax.swing.JButton TEKKARTDAGIT;
    private javax.swing.JLabel botKart;
    private javax.swing.JLabel card1;
    private javax.swing.JLabel card10;
    private javax.swing.JLabel card2;
    private javax.swing.JLabel card3;
    private javax.swing.JLabel card4;
    private javax.swing.JLabel card5;
    private javax.swing.JLabel card6;
    private javax.swing.JLabel card7;
    private javax.swing.JLabel card8;
    private javax.swing.JLabel card9;
    private javax.swing.JLabel ekKart1;
    private javax.swing.JLabel ekKart2;
    private javax.swing.JLabel ekKart3;
    private javax.swing.JLabel ekKart4;
    private javax.swing.JLabel insanKart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
   private void kartyerleri() {
        label.add(card1);
        label.add(card2);
        label.add(card3);
        label.add(card4);
        label.add(card5);
        label.add(card6);
        label.add(card7);
        label.add(card8);
        label.add(card9);
        label.add(card10);
    }
    
    private void rasgeleKartDagit() {

        int x = random.nextInt(kartDestesi.size());
        iKartListesi.add(kartDestesi.get(x));
        kartDestesi.remove(kartDestesi.get(x));

        int y = random.nextInt(kartDestesi.size());
        iKartListesi.add(kartDestesi.get(y));
        kartDestesi.remove(kartDestesi.get(y));

        int z = random.nextInt(kartDestesi.size());
        iKartListesi.add(kartDestesi.get(z));
        kartDestesi.remove(kartDestesi.get(z));

        insan.setDeste(iKartListesi);

        int t = random.nextInt(kartDestesi.size());
        bKartListesi.add(kartDestesi.get(t));
        kartDestesi.remove(kartDestesi.get(t));

        int r = random.nextInt(kartDestesi.size());
        bKartListesi.add(kartDestesi.get(r));
        kartDestesi.remove(kartDestesi.get(r));

        int k = random.nextInt(kartDestesi.size());
        bKartListesi.add(kartDestesi.get(k));
        kartDestesi.remove(kartDestesi.get(k));

        bilgisayar.setDeste(bKartListesi);

    }

    private void dagitResim() {
        for (int i = 0; i < bilgisayar.getDeste().size(); i++) {
            label.get(i).setIcon(bilgisayar.getDeste().get(i).resimUzantı());
            label.get(i).setName(String.valueOf(bilgisayar.getDeste().get(i).getPokemonID()));
        }
        for (int i = 0; i < insan.getDeste().size(); i++) {
            label.get(i + 3).setIcon(insan.getDeste().get(i).resimUzantı());
            label.get(i + 3).setName(String.valueOf(insan.getDeste().get(i).getPokemonID()));
        }
        for (int i = 0; i < kartDestesi.size(); i++) {
            label.get(i + 6).setIcon(kartDestesi.get(i).resimUzantı());
            label.get(i + 6).setName(String.valueOf(kartDestesi.get(i).getPokemonID()));
        }
    }

 
    private int hasar(int y) {
        int damage = 0;
        if (y == 1) {
            damage = 50;
        } else if (y == 2) {
            damage = 10;
        } else if (y == 3) {
            damage = 60;
        } else if (y == 4) {
            damage = 70;
        } else if (y == 5) {
            damage = 40;
        } else if (y == 6) {
            damage = 40;
        } else if (y == 7) {
            damage = 20;
        } else if (y == 8) {
            damage = 30;
        } else if (y == 9) {
            damage = 30;
        } else {
            damage = 50;
        }
        return damage;
    }

    private void kartOyna(int x) {
        if (insan.getDeste().size() == 3 || kartDestesi.isEmpty()) {

            int deger = random.nextInt(bilgisayar.getDeste().size());
            Pokemon p = bilgisayar.getDeste().get(deger);
            for (int i = 0; i < label.size(); i++) {
                if (label.get(i).getName().equals(String.valueOf(x))) {
                    insanKart.setIcon(label.get(i).getIcon());
                    label.get(i).setVisible(false);
                } else if (label.get(i).getName().equals(String.valueOf(p.getPokemonID()))) {
                    botKart.setIcon(label.get(i).getIcon());
                    label.get(i).setVisible(false);
                }
            }
            int bilgisayarHasar = hasar(p.getPokemonID());
            int insanHasar = hasar(x);

            if (bilgisayarHasar > insanHasar) {
                bilgisayar.setSkor(bilgisayar.getSkor() + 5);
            } else if (bilgisayarHasar < insanHasar) {
                insan.setSkor(insan.getSkor() + 5);
            }

            BotSkor.setText("" + bilgisayar.getSkor());
            KullanıcıSkor.setText("" + insan.getSkor());
            Pokemon sil = null;
            for (int i = 0; i < insan.getDeste().size(); i++) {
                if (insan.getDeste().get(i).getPokemonID() == x) {
                    sil = insan.getDeste().get(i);
                }
            }
            bilgisayar.getDeste().remove(p);
            insan.getDeste().remove(sil);
           
        }
        
    }


}
