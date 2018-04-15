package View;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.time.LocalDateTime;
import javax.swing.Timer;

public class View extends javax.swing.JFrame {
    
    private int x,y;
    public View() {
        initComponents();
        Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,15,15);
        AWTUtilities.setWindowShape(this, forma);
        AWTUtilities.setWindowOpaque(this, false);
        jLabel1.setForeground(Color.white);
        setLocationRelativeTo(null);
        
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                LocalDateTime now = LocalDateTime.now();
                jLabel1.setText(String.valueOf(now.getHour() + ":" + now.getMinute() + ":" + now.getSecond()));

            }
        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_Entrada = new javax.swing.JTextField();
        cmbx_Dunidad = new javax.swing.JComboBox<>();
        cmbx_Aunidad = new javax.swing.JComboBox<>();
        txt_Salida = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        cmbx_Unidad = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        txt_Entrada.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N

        cmbx_Dunidad.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N

        cmbx_Aunidad.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N

        txt_Salida.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txt_Salida.setText("0.0");

        jLabel.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel.setText("=");
        jLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt);
            }
        });

        cmbx_Unidad.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        cmbx_Unidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Energia", "Frecuencia", "Longitud", "Masa", "Presion", "Temperatura", "Tiempo", "Velocidad" }));
        cmbx_Unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbx_UnidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbx_Unidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbx_Dunidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Entrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbx_Aunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(124, 124, 124))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(cmbx_Unidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_Entrada)
                        .addComponent(txt_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbx_Dunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbx_Aunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/if_cancel_49826 (1).png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(319, 319, 319)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMouseClicked

    }//GEN-LAST:event_jLabelMouseClicked

    private void cmbx_UnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbx_UnidadActionPerformed
        if (cmbx_Unidad.getSelectedItem().toString().equalsIgnoreCase("Energia")) {
            System.out.println(cmbx_Unidad.getSelectedItem());
            cmbx_Dunidad.removeAllItems();
            cmbx_Aunidad.removeAllItems();

            cmbx_Dunidad.addItem("Julio");
            cmbx_Dunidad.addItem("Kilojule");
            cmbx_Dunidad.addItem("Gram Calorie");
            cmbx_Dunidad.addItem("Kilocaloria");
            cmbx_Dunidad.addItem("Vatio-hora");
            cmbx_Dunidad.addItem("Kilovatio-hora");
            cmbx_Dunidad.addItem("Electronvoltio");
            cmbx_Dunidad.addItem("BTU");
            cmbx_Dunidad.addItem("US therm");
            cmbx_Dunidad.addItem("Pie-libra fuerza");

            cmbx_Aunidad.addItem("Julio");
            cmbx_Aunidad.addItem("Kilojule");
            cmbx_Aunidad.addItem("Gram Calorie");
            cmbx_Aunidad.addItem("Kilocaloria");
            cmbx_Aunidad.addItem("Vatio-hora");
            cmbx_Aunidad.addItem("Kilovatio-hora");
            cmbx_Aunidad.addItem("Electronvoltio");
            cmbx_Aunidad.addItem("BTU");
            cmbx_Aunidad.addItem("US therm");
            cmbx_Aunidad.addItem("Pie-libra fuerza");

        } else if (cmbx_Unidad.getSelectedItem().toString().equalsIgnoreCase("Frecuencia")) {
            System.out.println(cmbx_Unidad.getSelectedItem());
            cmbx_Dunidad.removeAllItems();
            cmbx_Aunidad.removeAllItems();

            cmbx_Dunidad.addItem("Hercio");
            cmbx_Dunidad.addItem("Kilohertz");
            cmbx_Dunidad.addItem("MegaHercio");
            cmbx_Dunidad.addItem("Gigahercio");

            cmbx_Dunidad.addItem("Hercio");
            cmbx_Aunidad.addItem("Kilohertz");
            cmbx_Aunidad.addItem("MegaHercio");
            cmbx_Aunidad.addItem("Gigahercio");

        } else if (cmbx_Unidad.getSelectedItem().toString().equalsIgnoreCase("Longitud")) {
            System.out.println(cmbx_Unidad.getSelectedItem());
            cmbx_Dunidad.removeAllItems();
            cmbx_Aunidad.removeAllItems();

            cmbx_Dunidad.addItem("Kilometro");
            cmbx_Dunidad.addItem("Metro");
            cmbx_Dunidad.addItem("Centimetro");
            cmbx_Dunidad.addItem("Milimetro");
            cmbx_Dunidad.addItem("Micrometro");
            cmbx_Dunidad.addItem("Nanometro");
            cmbx_Dunidad.addItem("Milla");
            cmbx_Dunidad.addItem("Yarda");
            cmbx_Dunidad.addItem("Pie");
            cmbx_Dunidad.addItem("Pulgada");
            cmbx_Dunidad.addItem("Milla nautica");

            cmbx_Aunidad.addItem("Kilometro");
            cmbx_Aunidad.addItem("Metro");
            cmbx_Aunidad.addItem("Centimetro");
            cmbx_Aunidad.addItem("Milimetro");
            cmbx_Aunidad.addItem("Micrometro");
            cmbx_Aunidad.addItem("Nanometro");
            cmbx_Aunidad.addItem("Milla");
            cmbx_Aunidad.addItem("Yarda");
            cmbx_Aunidad.addItem("Pie");
            cmbx_Aunidad.addItem("Pulgada");
            cmbx_Aunidad.addItem("Milla nautica");

        } else if (cmbx_Unidad.getSelectedItem().toString().equalsIgnoreCase("Masa")) {
            System.out.println(cmbx_Unidad.getSelectedItem());
            cmbx_Dunidad.removeAllItems();
            cmbx_Aunidad.removeAllItems();

            cmbx_Dunidad.addItem("Tonelada");
            cmbx_Dunidad.addItem("Kilogramo");
            cmbx_Dunidad.addItem("Gramo");
            cmbx_Dunidad.addItem("Miligramo");
            cmbx_Dunidad.addItem("Microgramo");
            cmbx_Dunidad.addItem("Tonelada larga");
            cmbx_Dunidad.addItem("Tonelada corta");
            cmbx_Dunidad.addItem("Stone");
            cmbx_Dunidad.addItem("Libra");
            cmbx_Dunidad.addItem("Onza");

            cmbx_Aunidad.addItem("Tonelada");
            cmbx_Aunidad.addItem("Kilogramo");
            cmbx_Aunidad.addItem("Gramo");
            cmbx_Aunidad.addItem("Miligramo");
            cmbx_Aunidad.addItem("Microgramo");
            cmbx_Aunidad.addItem("Tonelada larga");
            cmbx_Aunidad.addItem("Tonelada corta");
            cmbx_Aunidad.addItem("Stone");
            cmbx_Aunidad.addItem("Libra");
            cmbx_Aunidad.addItem("Onza");

        } else if (cmbx_Unidad.getSelectedItem().toString().equalsIgnoreCase("Presion")) {
            System.out.println(cmbx_Unidad.getSelectedItem());
            cmbx_Dunidad.removeAllItems();
            cmbx_Aunidad.removeAllItems();

            cmbx_Dunidad.addItem("Atmosfera");
            cmbx_Dunidad.addItem("Bar");
            cmbx_Dunidad.addItem("Libra por pulgada cuadrada");
            cmbx_Dunidad.addItem("Pascal");
            cmbx_Dunidad.addItem("Tor");

            cmbx_Aunidad.addItem("Atmosfera");
            cmbx_Aunidad.addItem("Bar");
            cmbx_Aunidad.addItem("Libra por pulgada cuadrada");
            cmbx_Aunidad.addItem("Pascal");
            cmbx_Aunidad.addItem("Tor");

        } else if (cmbx_Unidad.getSelectedItem().toString().equalsIgnoreCase("Temperatura")) {
            System.out.println(cmbx_Unidad.getSelectedItem());
            cmbx_Dunidad.removeAllItems();
            cmbx_Aunidad.removeAllItems();

            cmbx_Dunidad.addItem("Grado Celsius");
            cmbx_Dunidad.addItem("Grado Fahrenheit");
            cmbx_Dunidad.addItem("Kelvin");

            cmbx_Aunidad.addItem("Grado Celsius");
            cmbx_Aunidad.addItem("Grado Fahrenheit");
            cmbx_Aunidad.addItem("Kelvin");

        } else if (cmbx_Unidad.getSelectedItem().toString().equalsIgnoreCase("Tiempo")) {
            System.out.println(cmbx_Unidad.getSelectedItem());
            cmbx_Dunidad.removeAllItems();
            cmbx_Aunidad.removeAllItems();

            cmbx_Dunidad.addItem("Nanosegundo");
            cmbx_Dunidad.addItem("Microsegundo");
            cmbx_Dunidad.addItem("Milisegundo");
            cmbx_Dunidad.addItem("Segundo");
            cmbx_Dunidad.addItem("Minuto");
            cmbx_Dunidad.addItem("Hora");
            cmbx_Dunidad.addItem("Dia");
            cmbx_Dunidad.addItem("Semana");
            cmbx_Dunidad.addItem("Mes");
            cmbx_Dunidad.addItem("Año");
            cmbx_Dunidad.addItem("Decada");
            cmbx_Dunidad.addItem("Siglo");

            cmbx_Aunidad.addItem("Nanosegundo");
            cmbx_Aunidad.addItem("Microsegundo");
            cmbx_Aunidad.addItem("Milisegundo");
            cmbx_Aunidad.addItem("Segundo");
            cmbx_Aunidad.addItem("Minuto");
            cmbx_Aunidad.addItem("Hora");
            cmbx_Aunidad.addItem("Dia");
            cmbx_Aunidad.addItem("Semana");
            cmbx_Aunidad.addItem("Mes");
            cmbx_Aunidad.addItem("Año");
            cmbx_Aunidad.addItem("Decada");
            cmbx_Aunidad.addItem("Siglo");

        } else if (cmbx_Unidad.getSelectedItem().toString().equalsIgnoreCase("Velocidad")) {
            System.out.println(cmbx_Unidad.getSelectedItem());
            cmbx_Dunidad.removeAllItems();
            cmbx_Aunidad.removeAllItems();

            cmbx_Dunidad.addItem("Milla por hora");
            cmbx_Dunidad.addItem("Pie por segundo");
            cmbx_Dunidad.addItem("Metro por segundo");
            cmbx_Dunidad.addItem("Kilometro por hora");
            cmbx_Dunidad.addItem("Nudo");

            cmbx_Aunidad.addItem("Milla por hora");
            cmbx_Aunidad.addItem("Pie por segundo");
            cmbx_Aunidad.addItem("Metro por segundo");
            cmbx_Aunidad.addItem("Kilometro por hora");
            cmbx_Aunidad.addItem("Nudo");
        }
    }//GEN-LAST:event_cmbx_UnidadActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded

    }//GEN-LAST:event_jLabel2AncestorAdded

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel2MouseDragged

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbx_Aunidad;
    private javax.swing.JComboBox<String> cmbx_Dunidad;
    private javax.swing.JComboBox<String> cmbx_Unidad;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txt_Entrada;
    private javax.swing.JLabel txt_Salida;
    // End of variables declaration//GEN-END:variables
}
