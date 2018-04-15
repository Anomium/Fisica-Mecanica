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
        txtEntrada = new javax.swing.JTextField();
        cmbx_Dunidad = new javax.swing.JComboBox<>();
        cmbx_Aunidad = new javax.swing.JComboBox<>();
        txtSalida = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        cmbx_Unidad = new javax.swing.JComboBox<>();
        btnCalcular = new javax.swing.JButton();
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
        cmbx_Unidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Energia", "Frecuencia", "Longitud", "Masa", "Presion", "Temperatura", "Tiempo", "Velocidad" }));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbx_Unidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbx_Dunidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEntrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(cmbx_Aunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(111, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(cmbx_Unidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtEntrada)
                        .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbx_Dunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbx_Aunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(31, 31, 31))
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

            cmbx_Aunidad.addItem("Julio");
            cmbx_Aunidad.addItem("Kilojule");
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
        }
    }//GEN-LAST:event_cmbx_UnidadActionPerformed

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

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            ValUnidad(cmbx_Dunidad, cmbx_Aunidad);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Recuerde llevar toda la informacion.", "Error", 0);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed
    
    public void ValUnidad(JComboBox de, JComboBox A){
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
        }  else if (de.getSelectedItem().toString().equalsIgnoreCase("Milla")) {
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
            
        }
             

    }
    
    public void Conversion(JComboBox de, JComboBox A){
        
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
