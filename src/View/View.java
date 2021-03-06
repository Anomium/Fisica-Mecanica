package View;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.time.LocalDateTime;
import javax.swing.JComboBox;
import javax.swing.Timer;
import Controller.MedidaController;
import javax.swing.JOptionPane;

public class View extends javax.swing.JFrame {

    private MedidaController medco = new MedidaController();
    private int x, y;

    public View() {
        initComponents();
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 15, 15);
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
        txtEntrada = new javax.swing.JTextField();
        cmbx_Dunidad = new javax.swing.JComboBox<>();
        cmbx_Aunidad = new javax.swing.JComboBox<>();
        txtSalida = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        cmbx_Unidad = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
        btn_SinNotacion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtEntrada.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N

        cmbx_Dunidad.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N

        cmbx_Aunidad.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N

        txtSalida.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txtSalida.setText("0.0");

        jLabel.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel.setText("=");

        cmbx_Unidad.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        cmbx_Unidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Energia", "Potencia", "Frecuencia", "Fuerza", "Longitud", "Masa", "Presion", "Temperatura", "Tiempo", "Velocidad" }));
        cmbx_Unidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbx_UnidadActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btn_SinNotacion.setText("Sin notacion cientifica");
        btn_SinNotacion.setEnabled(false);
        btn_SinNotacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SinNotacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(cmbx_Unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel)
                        .addGap(12, 12, 12)
                        .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(cmbx_Dunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(cmbx_Aunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(btnCalcular)
                        .addGap(51, 51, 51)
                        .addComponent(btn_SinNotacion)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(cmbx_Unidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel)
                    .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbx_Dunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbx_Aunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcular)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btn_SinNotacion)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(319, 319, 319)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbx_UnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbx_UnidadActionPerformed
        if (cmbx_Unidad.getSelectedItem().toString().equalsIgnoreCase("Potencia")) {
            cmbx_Dunidad.removeAllItems();
            cmbx_Aunidad.removeAllItems();

            cmbx_Dunidad.addItem("Vatio");
            cmbx_Dunidad.addItem("Kilovatio");
            cmbx_Dunidad.addItem("Megavatio");
            cmbx_Dunidad.addItem("Julio por segundo");
            cmbx_Dunidad.addItem("Horse power");
                    
            cmbx_Aunidad.addItem("Vatio");
            cmbx_Aunidad.addItem("Kilovatio");
            cmbx_Aunidad.addItem("Megavatio");
            cmbx_Aunidad.addItem("Julio por segundo");
            cmbx_Aunidad.addItem("Horse power");
        } else if (cmbx_Unidad.getSelectedItem().toString().equalsIgnoreCase("Energia")) {
            System.out.println(cmbx_Unidad.getSelectedItem());
            cmbx_Dunidad.removeAllItems();
            cmbx_Aunidad.removeAllItems();

            cmbx_Dunidad.addItem("Julio");
            cmbx_Dunidad.addItem("Kilojoule");
            cmbx_Dunidad.addItem("Gram Calorie");
            cmbx_Dunidad.addItem("Kilocaloria");
            cmbx_Dunidad.addItem("Vatio-hora");
            cmbx_Dunidad.addItem("Kilovatio-hora");
            cmbx_Dunidad.addItem("Electronvoltio");

            cmbx_Aunidad.addItem("Julio");
            cmbx_Aunidad.addItem("Kilojoule");
            cmbx_Aunidad.addItem("Gram Calorie");
            cmbx_Aunidad.addItem("Kilocaloria");
            cmbx_Aunidad.addItem("Vatio-hora");
            cmbx_Aunidad.addItem("Kilovatio-hora");
            cmbx_Aunidad.addItem("Electronvoltio");

        } else if (cmbx_Unidad.getSelectedItem().toString().equalsIgnoreCase("Frecuencia")) {
            System.out.println(cmbx_Unidad.getSelectedItem());
            cmbx_Dunidad.removeAllItems();
            cmbx_Aunidad.removeAllItems();

            cmbx_Dunidad.addItem("Hercio");
            cmbx_Dunidad.addItem("Kilohertz");
            cmbx_Dunidad.addItem("MegaHercio");
            cmbx_Dunidad.addItem("Gigahercio");

            cmbx_Aunidad.addItem("Hercio");
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
            cmbx_Dunidad.addItem("Libra");
            cmbx_Dunidad.addItem("Onza");

            cmbx_Aunidad.addItem("Tonelada");
            cmbx_Aunidad.addItem("Kilogramo");
            cmbx_Aunidad.addItem("Gramo");
            cmbx_Aunidad.addItem("Miligramo");
            cmbx_Aunidad.addItem("Microgramo");
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

            cmbx_Dunidad.addItem("Segundo");
            cmbx_Dunidad.addItem("Minuto");
            cmbx_Dunidad.addItem("Hora");
            cmbx_Dunidad.addItem("Dia");
            cmbx_Dunidad.addItem("Semana");
            cmbx_Dunidad.addItem("Mes");
            cmbx_Dunidad.addItem("Año");
            cmbx_Dunidad.addItem("Decada");
            cmbx_Dunidad.addItem("Siglo");

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
        } else if (cmbx_Unidad.getSelectedItem().toString().equalsIgnoreCase("Fuerza")) {
            cmbx_Dunidad.removeAllItems();
            cmbx_Aunidad.removeAllItems();
            
            cmbx_Dunidad.addItem("Nanonewton");
            cmbx_Dunidad.addItem("Micronewton");
            cmbx_Dunidad.addItem("Milinewton");
            cmbx_Dunidad.addItem("Newton");
            cmbx_Dunidad.addItem("Kilonewton");
            cmbx_Dunidad.addItem("Meganewton");
            cmbx_Dunidad.addItem("Giganewton");
            
            cmbx_Aunidad.addItem("Nanonewton");
            cmbx_Aunidad.addItem("Micronewton");
            cmbx_Aunidad.addItem("Milinewton");
            cmbx_Aunidad.addItem("Newton");
            cmbx_Aunidad.addItem("Kilonewton");
            cmbx_Aunidad.addItem("Meganewton");
            cmbx_Aunidad.addItem("Giganewton");
        }
    }//GEN-LAST:event_cmbx_UnidadActionPerformed

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded

    }//GEN-LAST:event_jLabel2AncestorAdded

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            ValUnidad(cmbx_Dunidad, cmbx_Aunidad);
            if (Double.parseDouble(txtSalida.getText()) >= 1) {
                btn_SinNotacion.setEnabled(true);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Recuerde llevar toda la informacion.", "Error", 0);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void btn_SinNotacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SinNotacionActionPerformed
        medco.SinNotacion(Double.parseDouble(txtSalida.getText()));
        btn_SinNotacion.setEnabled(false);
    }//GEN-LAST:event_btn_SinNotacionActionPerformed

    public void ValUnidad(JComboBox de, JComboBox A) {
        if (de.getSelectedItem().toString().equalsIgnoreCase("Kilometro")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Kilometro")) {
                txtSalida.setText(txtEntrada.getText());
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Metro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Centimetro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 100000)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milimetro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e+6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Micrometro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e+9)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.621371)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Yarda")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1093.61)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pie")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3280.84)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pulgada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 39370.1)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla nautica")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.539957)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Metro")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Kilometro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Metro")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Centimetro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 100)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milimetro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Micrometro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e+6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000621371)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Yarda")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.09361)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pie")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3.28084)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pulgada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 39.3701)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla nautica")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000539957)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Centimetro")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Kilometro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e-5)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Metro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.01)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Centimetro")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milimetro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 10)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Micrometro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 10000)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 6.2137e-6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Yarda")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.0109361)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pie")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.0328084)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pulgada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.393701)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla nautica")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 5.3996e-6)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Milimetro")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Kilometro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e-6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Metro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Centimetro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.1)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milimetro")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Micrometro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 6.2137e-7)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Yarda")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.00109361)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pie")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.00328084)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pulgada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.0393701)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla nautica")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 5.3996e-7)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Micrometro")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Kilometro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e-9)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Metro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e-6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Centimetro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e-4)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milimetro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Micrometro")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 6.2137e-10)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Yarda")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.0936e-6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pie")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3.2808e-6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pulgada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3.937e-5)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla nautica")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 5.3996e-10)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Milla")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Kilometro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.60934)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Metro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1609.34)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Centimetro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 160934)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milimetro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.609e+6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Micrometro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.609e+9)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 6.2137e-13)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Yarda")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1760)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pie")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 5280)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pulgada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 63360)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla nautica")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.868976)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Yarda")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Kilometro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.0009144)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Metro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.9144)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Centimetro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 91.44)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milimetro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 914.4)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Micrometro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 914400)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000568182)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Yarda")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pie")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pulgada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 36)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla nautica")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000493737)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Pie")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Kilometro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.0003048)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Metro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.3048)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Centimetro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 30.48)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milimetro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 304.8)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Micrometro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 304800)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000189394)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Yarda")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.333333)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pie")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pulgada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 12)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla nautica")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000164579)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Pulgada")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Kilometro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 2.54e-5)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Metro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.0254)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Centimetro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 2.54)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milimetro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 25.4)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Micrometro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 25400)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.5783e-5)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Yarda")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.0277778)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pie")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.0833333)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pulgada")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla nautica")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.3715e-5)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Milla nautica")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Kilometro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.852)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Metro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1852)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Centimetro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 185200)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milimetro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.852e+6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Micrometro")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.852e+9)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.15078)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Yarda")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 2025.37)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pie")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 6076.12)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pulgada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 72913.4)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milla nautica")) {

                txtSalida.setText(txtEntrada.getText());

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Tonelada")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Tonelada")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilogramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Gramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e+6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Miligramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e+9)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Microgramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e+12)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Libra")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 2204.62)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Onza")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 35274)));

            }

        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Kilogramo")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Tonelada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilogramo")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Gramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Miligramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e+6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Microgramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e+9)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Libra")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 2.20462)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Onza")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 35.274)));

            }

        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Gramo")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Tonelada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e-6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilogramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Gramo")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Miligramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Microgramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e+6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Libra")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.00220462)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Onza")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.035274)));

            }

        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Miligramo")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Tonelada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e-9)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilogramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e-6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Gramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Miligramo")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Microgramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Libra")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 2.2046e-6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Onza")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3.5274e-5)));

            }

        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Microgramo")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Tonelada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e-12)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilogramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e-9)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Gramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e-6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Miligramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Microgramo")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Libra")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 2.2046e-9)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Onza")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3.5274e-8)));

            }

        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Libra")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Tonelada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000453592)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilogramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.453592)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Gramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 453.592)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Miligramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 453592)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Microgramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 4.536e+8)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Libra")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Onza")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 16)));

            }

        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Onza")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Tonelada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 2.835e-5)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilogramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.0283495)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Gramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 28.3495)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Miligramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 28349.5)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Microgramo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 2.835e+7)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Libra")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.0625)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Onza")) {

                txtSalida.setText(txtEntrada.getText());

            }

        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Hercio")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Hercio")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilohertz")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Megahercio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e-6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Gigahercio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e-9)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Kilohertz")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Hercio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilohertz")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Megahercio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Gigahercio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e-6)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Megahercio")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Hercio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e+6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilohertz")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Megahercio")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Gigahercio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Gigahercio")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Hercio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e+9)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilohertz")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e+6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Megahercio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Gigahercio")) {

                txtSalida.setText(txtEntrada.getText());

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Atmosfera")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Atmosfera")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Bar")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.01325)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Libra por pulgada cuadrada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 14.6959)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("pascal")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 101325)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("tor")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 760)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Bar")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Atmosfera")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.986923)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Bar")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Libra por pulgada cuadrada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 14.5038)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("pascal")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 100000)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("tor")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 750.062)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Libra por pulgada cuadrada")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Atmosfera")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.068046)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Bar")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.0689476)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Libra por pulgada cuadrada")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("pascal")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 6894.76)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("tor")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 51.7149)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Pascal")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Atmosfera")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 9.8692e-6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Bar")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1e-5)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Libra por pulgada cuadrada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000145038)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("pascal")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("tor")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.00750062)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Tor")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Atmosfera")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.00131579)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Bar")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.00133322)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Libra por pulgada cuadrada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.0193368)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("pascal")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 133.322)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("tor")) {

                txtSalida.setText(txtEntrada.getText());

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Grados Celsius")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Grados Celsius")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Grados Fahrenheit")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 33.8)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kelvin")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 274.15)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Grados Fahrenheit")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Grados Celsius")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * -17.2222)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Grados Fahrenheit")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kelvin")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 255.928)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Grados Celsius")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Grados Celsius")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * -272.15)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Grados Fahrenheit")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * -457.87)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kelvin")) {

                txtSalida.setText(txtEntrada.getText());

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Milla por hora")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Milla por hora")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pie por segundo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.46667)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Metro por segundo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.44704)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilometro por hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.60934)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Nudo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.868976)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Pie por segundo")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Milla por hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.681818)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pie por segundo")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Metro por segundo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.3048)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilometro por hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.09728)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Nudo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.592484)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Metro por segundo")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Milla por hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 2.23694)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pie por segundo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3.28084)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Metro por segundo")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilometro por hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3.6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Nudo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.94384)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Kilometro por hora")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Milla por hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.621371)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pie por segundo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.911344)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Metro por segundo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.277778)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilometro por hora")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Nudo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.539957)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Nudo")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Milla por hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.15078)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Pie por segundo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.68781)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Metro por segundo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.514444)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilometro por hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.852)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Nudo")) {

                txtSalida.setText(txtEntrada.getText());

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Julio")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Julio")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilojoule")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Gram Calorie")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.239006)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilocaloria")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000239006)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Vatio-hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000277778)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilovatio-hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 2.7778e-7)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Electronvoltio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 6.242e+18)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Kilojoule")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Julio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilojoule")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Gram Calorie")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 239.006)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilocaloria")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.239006)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Vatio-hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.277778)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilovatio-hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000277778)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Electronvoltio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 6.242e+21)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Gram Calorie")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Julio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 4.184)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilojoule")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.004184)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Gram Calorie")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilocaloria")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Vatio-hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.00116222)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilovatio-hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.1622e-6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Electronvoltio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 2.611e+19)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Kilocaloria")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Julio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 4184)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilojoule")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 4.184)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Gram Calorie")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilocaloria")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Vatio-hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.16222)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilovatio-hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.00116222)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Electronvoltio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 2.611e+22)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Vatio-hora")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Julio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3600)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilojoule")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3.6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Gram Calorie")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 860.421)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilocaloria")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.860421)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Vatio-hora")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilovatio-hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Electronvoltio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 2.247e+22)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Kilovatio-hora")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Julio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3.6e+6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilojoule")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3600)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Gram Calorie")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 860421)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilocaloria")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 860.421)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Vatio-hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilovatio-hora")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Electronvoltio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 2.247e+25)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Electronvoltio")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Julio")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.6022e-19)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilojoule")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.6022e-22)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Gram Calorie")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3.8293e-20)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilocaloria")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3.8293e-23)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Vatio-hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 4.4505e-23)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilovatio-hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 4.4505e-26)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Electronvoltio")) {

                txtSalida.setText(txtEntrada.getText());

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Segundo")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Segundo")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Minuto")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.0166667)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000277778)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Dia")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.1574e-5)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Semana")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.6534e-6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Mes")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3.8052e-7)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Año")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3.171e-8)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Decada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3.171e-9)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Siglo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3.171e-10)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Minuto")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Segundo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 60)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Minuto")) {

                txtSalida.setText(txtEntrada.getText());;

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.0166667)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Dia")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000694444)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Semana")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 9.9206e-5)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Mes")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 2.2831e-5)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Año")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.9026e-6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Decada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.9026e-7)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Siglo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.9026e-8)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Hora")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Segundo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3600)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Minuto")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 60)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Hora")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Dia")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.0416667)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Semana")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.00595238)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Mes")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.00136986)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Año")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000114155)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Decada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.1416e-5)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Siglo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.1416e-6)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Dia")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Segundo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 86400)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Minuto")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1440)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 24)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Dia")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Semana")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.142857)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Mes")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.0328767)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Año")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.00273973)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Decada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000273973)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Siglo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 2.7397e-5)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Semana")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Segundo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 604800)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Minuto")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 10080)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 168)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Dia")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 7)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Semana")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Mes")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.230137)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Año")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.0191781)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Decada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.00191781)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Siglo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000191781)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Mes")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Segundo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 2.628e+6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Minuto")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 43800)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 730.001)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Dia")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 30.4167)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Semana")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 4.34524)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Mes")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Año")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.0833334)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Decada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.00833334)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Siglo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000833334)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Año")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Segundo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3.154e+7)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Minuto")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 525600)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 8760)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Dia")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 365)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Semana")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 52.1429)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Mes")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 12)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Año")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Decada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.1)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Siglo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.01)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Decada")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Segundo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3.154e+8)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Minuto")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 5.256e+6)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 87600)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Dia")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3650)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Semana")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 521.429)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Mes")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 120)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Año")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 10)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Decada")) {

                txtSalida.setText(txtEntrada.getText());

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Siglo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.1)));

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Siglo")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Segundo")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 3.154e+9)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Minuto")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 5.256e+7)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Hora")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 876000)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Dia")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 36500)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Semana")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 5214.29)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Mes")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1200)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Año")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 100)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Decada")) {

                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 10)));

            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Siglo")) {

                txtSalida.setText(txtEntrada.getText());

            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Nanonewton")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Nanonewton")) {
                txtSalida.setText(txtEntrada.getText());
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Micronewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milinewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000001)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Newton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * Math.pow(10,-9))));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilonewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * (10 * Math.pow(10,-13)))));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Meganewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * (10 * Math.pow(10,-16)))));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Giganewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * Math.pow(10,-18))));
            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Micronewton")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Nanonewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Micronewton")) {
                txtSalida.setText(txtEntrada.getText());
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milinewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Newton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000001)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilonewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * Math.pow(10,-9))));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Meganewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * (10 * Math.pow(10,-13)))));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Giganewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * (10 * Math.pow(10,-15)))));
            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Milinewton")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Nanonewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000000)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Micronewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milinewton")) {
                txtSalida.setText(txtEntrada.getText());
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Newton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilonewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000001)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Meganewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * (10 * Math.pow(10,-10)))));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Giganewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * (10 * Math.pow(10,-13)))));
            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Newton")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Nanonewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000000000)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Micronewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000000)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milinewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Newton")) {
                txtSalida.setText(txtEntrada.getText());
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilonewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Meganewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000001)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Giganewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * Math.pow(10,-9))));
            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Kilonewton")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Nanonewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * Math.pow(10,12))));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Micronewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000000000)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milinewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000000)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Newton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilonewton")) {
                txtSalida.setText(txtEntrada.getText());
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Meganewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Giganewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.000001)));
            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Meganewton")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Nanonewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * Math.pow(10,15))));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Micronewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * Math.pow(10,12))));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milinewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000000000)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Newton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000000)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilonewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Meganewton")) {
                txtSalida.setText(txtEntrada.getText());
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Giganewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));
            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Giganewton")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Nanonewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * Math.pow(10,18))));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Micronewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * Math.pow(10,15))));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Milinewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * (Math.pow(10,11)))));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Newton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * ( Math.pow(10,8)))));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilonewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000000)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Meganewton")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Giganewton")) {
                txtSalida.setText(txtEntrada.getText());
            }
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Vatio")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Vatio")) {
                txtSalida.setText(txtEntrada.getText());
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilovatio")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Megavatio")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * (Math.pow(10,-6)))));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Julio por segundo")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Horse power")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.00134)));
            }
            
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Kilovatio")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Vatio")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilovatio")) {
                txtSalida.setText(txtEntrada.getText());
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Megavatio")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Julio por segundo")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Horse power")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1.34102)));
            }
            
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Megavatio")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Vatio")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000000)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilovatio")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Megavatio")) {
                txtSalida.setText(txtEntrada.getText());
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Julio por segundo")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1000000)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Horse power")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1341.02209)));
            }
            
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Julio por segundo")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Vatio")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 1)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilovatio")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.001)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Megavatio")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * (Math.pow(10,-6)))));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Julio por segundo")) {
                txtSalida.setText(txtEntrada.getText());
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Horse power")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.00134)));
            }
            
        } else if (de.getSelectedItem().toString().equalsIgnoreCase("Horse power")) {
            if (A.getSelectedItem().toString().equalsIgnoreCase("Vatio")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 745.69987)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Kilovatio")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.7457)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Megavatio")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 0.00075)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Julio por segundo")) {
                txtSalida.setText(String.valueOf(medco.convertir(Double.parseDouble(txtEntrada.getText()) * 745.69987)));
            } else if (A.getSelectedItem().toString().equalsIgnoreCase("Horse power")) {
                txtSalida.setText(txtEntrada.getText());
            }
            
        }

    }

    public void Conversion(JComboBox de, JComboBox A) {

    }

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
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btn_SinNotacion;
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
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JLabel txtSalida;
    // End of variables declaration//GEN-END:variables
}
