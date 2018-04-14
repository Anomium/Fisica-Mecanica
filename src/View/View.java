package View;

public class View extends javax.swing.JFrame {

    public View() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbx_Unidad = new javax.swing.JComboBox<>();
        txt_Entrada = new javax.swing.JTextField();
        cmbx_Dunidad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txt_Salida = new javax.swing.JLabel();
        cmbx_Aunidad = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbx_Unidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Energia", "Frecuencia", "Longitud", "Masa", "Presion", "Temperatura", "Tiempo", "Velocidad" }));
        cmbx_Unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbx_UnidadActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setText("=");

        txt_Salida.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txt_Salida.setText("0.0");

        jButton1.setText("Calcular");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbx_Unidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbx_Dunidad, javax.swing.GroupLayout.Alignment.LEADING, 0, 180, Short.MAX_VALUE)
                            .addComponent(txt_Entrada, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbx_Aunidad, 0, 168, Short.MAX_VALUE)
                            .addComponent(txt_Salida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(cmbx_Unidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_Entrada, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                        .addComponent(txt_Salida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbx_Dunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbx_Aunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt_Entrada;
    private javax.swing.JLabel txt_Salida;
    // End of variables declaration//GEN-END:variables
}
