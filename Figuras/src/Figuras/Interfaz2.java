
package Figuras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author FERES
 */
public class Interfaz2 extends javax.swing.JFrame {
    int giro = 0;
    int escaladoX = 0, escaladoY = 0;
    int X = 0, Y = 0, X2 = 0, Y2 = 0, opc = 0, Colores1 = 0, ColorLi = 0;
    int XCir = 0, YCir = 0, AnchoCir = 0, AltoCir = 0, ColorCir = 0;
    int XCua = 0, YCua = 0, AnchoCua = 0, AltoCua = 0, ColorCua = 0;
    int XRec = 0, YRec = 0, AnchoRec = 0, AltoRec = 0, ColorRec = 0;
    int XTri = 0, YTri = 0, AnchoTri = 0, AltoTri = 0, ColorTri = 0;
    int XRom = 0, YRom = 0, AnchoRom = 0, AltoRom = 0, ColorRom = 0;
    ArrayList<Linea> ListaLinea = null;
    ArrayList<Circulo> ListaCirculos = null;
    ArrayList<Cuadrado> ListaCuadrados = null;
    ArrayList<Rombo> listaRombos = null;
    ArrayList<Triangulo> ListaTriangulos = null;

    public Interfaz2() {

        initComponents();
    }

    /**
     * .
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();
        txtCorX = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCorY = new javax.swing.JTextField();
        jSpinner2 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jSpinner3 = new javax.swing.JSpinner();
        txtCor2x = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        txtCor2y = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Colores = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        txtCorX.setToolTipText("");
        txtCorX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorXActionPerformed(evt);
            }
        });

        jLabel1.setText("Rotar");

        txtCorY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorYActionPerformed(evt);
            }
        });

        jButton1.setText("Linea");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtCor2x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCor2xActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Acomodar");
        jCheckBox1.setActionCommand("Acomodar");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        txtCor2y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCor2yActionPerformed(evt);
            }
        });

        jLabel2.setText("X=");

        jButton2.setText("Rombo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Y=");

        jButton3.setText("SALIR");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel4.setText("Ancho=");

        jButton4.setText("Circulo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Altura=");

        jButton5.setText("Cuadrado");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Triangulo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        Colores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colores", "Rojo", "Verde", "Azul", "Rosado", "Negro" }));
        Colores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColoresActionPerformed(evt);
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
                        .addComponent(Colores, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCorY, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCorX, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCor2x, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCor2y, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtCorY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCor2x)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCor2y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Colores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(670, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCor2yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCor2yActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCor2yActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtCorYActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCorYActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtCorYActionPerformed

    private void txtCorXActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCorXActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtCorXActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        X = Integer.parseInt(txtCorX.getText());
        Y = Integer.parseInt(txtCorY.getText());
        // txtCor2x
        X2 = Integer.parseInt(txtCor2x.getText());
        Y2 = Integer.parseInt(txtCor2y.getText());
        opc = 1;
    }// GEN-LAST:event_jButton1ActionPerformed

    private void txtCor2xActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCor2xActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtCor2xActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        XRom = Integer.parseInt(txtCorX.getText());
        YRom = Integer.parseInt(txtCorY.getText());
        opc = 2;
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton3MouseClicked
        System.exit(0);
    }// GEN-LAST:event_jButton3MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        XCir = Integer.parseInt(txtCorX.getText());
        YCir = Integer.parseInt(txtCorY.getText());

        AnchoCir = Integer.parseInt(txtCor2x.getText());
        AltoCir = Integer.parseInt(txtCor2y.getText());
        opc = 3;
    }// GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
        XCua = Integer.parseInt(txtCorX.getText());
        YCua = Integer.parseInt(txtCorY.getText());

        AnchoCua = Integer.parseInt(txtCor2x.getText());
        AltoCua = Integer.parseInt(txtCor2y.getText());
        opc = 4;
    }// GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
        XTri = Integer.parseInt(txtCorX.getText());
        YTri = Integer.parseInt(txtCorY.getText());

        AnchoTri = Integer.parseInt(txtCor2x.getText());
        AltoTri = Integer.parseInt(txtCor2y.getText());
        opc = 5;
    }// GEN-LAST:event_jButton6ActionPerformed

    private void ColoresActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ColoresActionPerformed
        Colores1 = Colores.getSelectedIndex();
    }// GEN-LAST:event_ColoresActionPerformed

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        switch (opc) {
            case 1:// linea
                g2d.scale(escaladoX, escaladoY);

                g2d.translate(X, Y);

                g2d.rotate(Math.toRadians(giro));

                switch (Colores1) {
                    case 1:
                        g2d.setColor(Color.red);
                        break;
                    case 2:
                        g2d.setColor(Color.green);
                        break;
                    case 3:
                        g2d.setColor(Color.blue);
                        break;
                    case 4:
                        g2d.setColor(Color.pink);
                        break;
                    case 5:
                        g2d.setColor(Color.black);
                        break;
                }
                g.drawLine(X, Y, X2, Y2);
                repaint();
                jSpinner1.addChangeListener(new ChangeListener() {

                    @Override
                    public void stateChanged(ChangeEvent e) {
                        giro = (int) jSpinner1.getValue();
                        repaint();

                    }
                });
                // si jcheckbox esta seleccionado jspinner2 y jspinner3 se igualan
                if (jCheckBox1.isSelected()) {
                    jSpinner2.setValue(jSpinner3.getValue());
                    repaint();
                }

                // escalaremos 2 veces su tamaño en X y Y, es decir, se duplicara
                // su tamaño
                // jSpinner2 es el spinner que controla el escalado en X y jSpinner3 en Y
                if (jSpinner2.getValue() != null && (int) jSpinner2.getValue() < 10) {// si el valor del spinner no es
                                                                                      // nulo se asigna a la variable
                                                                                      // escaladoX y se duplica el
                                                                                      // tamaño
                    escaladoX = (int) jSpinner2.getValue() + 1;
                    // mantener en el origen X
                    if (X > 30)
                        X = X / 2;
                    X = X;
                    repaint();
                }
                if (jSpinner3.getValue() != null && (int) jSpinner3.getValue() < 10) {
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    if (Y > 30)
                        Y = Y / 2;
                    Y = Y;
                    repaint();
                }
                break;
            case 2:// rombo
                g2d.scale(escaladoX, escaladoY);
                g2d.translate(X, Y);
                g2d.rotate(Math.toRadians(giro));
                switch (Colores1) {
                    case 1:
                        g2d.setColor(Color.red);
                        break;
                    case 2:
                        g2d.setColor(Color.green);
                        break;
                    case 3:
                        g2d.setColor(Color.blue);
                        break;
                    case 4:
                        g2d.setColor(Color.pink);
                        break;
                    case 5:
                        g2d.setColor(Color.black);
                        break;
                }
                // se dibuja relleno, XRom y YRom son las coordenadas del centro del rombo
                g2d.fillPolygon(new int[] { XRom, XRom + 10, XRom, XRom - 10 },
                        new int[] { YRom - 10, YRom, YRom + 10, YRom },
                        4);
                repaint();
                jSpinner1.addChangeListener(new ChangeListener() {

                    @Override
                    public void stateChanged(ChangeEvent e) {
                        giro = (int) jSpinner1.getValue();
                        repaint();

                    }
                });

                // si jcheckbox esta seleccionado jspinner2 y jspinner3 se igualan
                if (jCheckBox1.isSelected()) {
                    jSpinner2.setValue(jSpinner3.getValue());
                    repaint();
                }

                // escalaremos 2 veces su tamaño en X y Y, es decir, se duplicara
                // su tamaño
                // jSpinner2 es el spinner que controla el escalado en X y jSpinner3 en Y
                if (jSpinner2.getValue() != null) {// si el valor del spinner no es
                                                   // nulo se asigna a la variable
                                                   // escaladoX y se duplica el
                                                   // tamaño
                    escaladoX = (int) jSpinner2.getValue() + 1;
                    // mantener en el origen X
                    if (X > 12)
                        X = X - 1;
                    X = X;
                    repaint();
                }
                if (jSpinner3.getValue() != null) {
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    if (Y > 90)
                        Y = Y - 1;
                    Y = Y;
                    repaint();
                }
                break;
            case 3:// circulo
                g2d.scale(escaladoX, escaladoY);

                g2d.translate(X, Y);

                g2d.rotate(Math.toRadians(giro));

                switch (Colores1) {

                    case 1:
                        g2d.setColor(Color.red);
                        break;
                    case 2:
                        g2d.setColor(Color.green);
                        break;
                    case 3:
                        g2d.setColor(Color.blue);
                        break;
                    case 4:
                        g2d.setColor(Color.pink);
                        break;
                    case 5:
                        g2d.setColor(Color.black);
                        break;
                }
                g.fillOval(XCir, YCir, AnchoCir, AltoCir);
                repaint();
                jSpinner1.addChangeListener(new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        giro = (int) jSpinner1.getValue();
                        repaint();

                    }
                });

                // si jcheckbox esta seleccionado jspinner2 y jspinner3 se igualan
                if (jCheckBox1.isSelected()) {
                    jSpinner2.setValue(jSpinner3.getValue());
                    repaint();
                }

                // escalaremos el cuadrado en 2 veces su tamaño en X y Y, es decir, se duplicara
                // su tamaño
                // jSpinner2 es el spinner que controla el escalado en X y jSpinner3 en Y
                if (jSpinner2.getValue() != null && (int) jSpinner2.getValue() <= 5) {// si el valor del spinner no es
                                                                                      // nulo se asigna a la variable
                                                                                      // escaladoX y se duplica el
                                                                                      // tamaño
                    escaladoX = (int) jSpinner2.getValue() + 1;
                    // mantener el origen X
                    X = -10;
                    repaint();
                }
                if (jSpinner3.getValue() != null && (int) jSpinner3.getValue() <= 5) {
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    Y = -10;
                    repaint();
                }
                break;
            case 4:// Cuadrado
                g2d.scale(escaladoX, escaladoY);

                g2d.translate(X, Y);

                g2d.rotate(Math.toRadians(giro));

                switch (Colores1) {

                    case 1:
                        g2d.setColor(Color.red);
                        break;
                    case 2:
                        g2d.setColor(Color.green);
                        break;
                    case 3:
                        g2d.setColor(Color.blue);
                        break;
                    case 4:
                        g2d.setColor(Color.pink);
                        break;
                    case 5:
                        g2d.setColor(Color.black);
                        break;
                }
                g.fillRect(XCua, YCua, AnchoCua, AltoCua);
                repaint();
                jSpinner1.addChangeListener(new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        giro = (int) jSpinner1.getValue();
                        repaint();

                    }
                });

                // si jcheckbox esta seleccionado jspinner2 y jspinner3 se igualan
                if (jCheckBox1.isSelected()) {
                    jSpinner2.setValue(jSpinner3.getValue());
                    repaint();
                }

                // escalaremos 2 veces su tamaño en X y Y, es decir, se duplicara
                // su tamaño
                // jSpinner2 es el spinner que controla el escalado en X y jSpinner3 en Y
                if (jSpinner2.getValue() != null && (int) jSpinner2.getValue() <= 5) {// si el valor del spinner no es
                                                                                      // nulo se asigna a la variable
                                                                                      // escaladoX y se duplica el
                                                                                      // tamaño
                    escaladoX = (int) jSpinner2.getValue() + 1;
                    // mantener en el origen X
                    X = -10;
                    repaint();
                }
                if (jSpinner3.getValue() != null && (int) jSpinner3.getValue() <= 5) {
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    Y = -10;
                    repaint();
                }
                break;

            case 5:// Triangulo
                g2d.scale(escaladoX, escaladoY);

                g2d.translate(X, Y);

                g2d.rotate(Math.toRadians(giro));

                switch (Colores1) {

                    case 1:
                        g2d.setColor(Color.red);
                        break;
                    case 2:
                        g2d.setColor(Color.green);
                        break;
                    case 3:
                        g2d.setColor(Color.blue);
                        break;
                    case 4:
                        g2d.setColor(Color.pink);
                        break;
                    case 5:
                        g2d.setColor(Color.black);
                        break;
                }
                // se dibuja el triangulo relleno y que pueda tomar los valores AnchoTri y
                // AltoTri
                g.fillPolygon(new int[] { XTri, XTri + AnchoTri, XTri + AnchoTri / 2 },
                        new int[] { YTri, YTri, YTri + AltoTri }, 3);
                repaint();
                jSpinner1.addChangeListener(new ChangeListener() {// rotacion

                    @Override
                    public void stateChanged(ChangeEvent e) {// esta parte es para que se pueda girar el triangulo
                        giro = (int) jSpinner1.getValue();
                        repaint();

                    }
                });

                // si jcheckbox esta seleccionado jspinner2 y jspinner3 se igualan
                if (jCheckBox1.isSelected()) {
                    jSpinner2.setValue(jSpinner3.getValue());
                    repaint();
                }

                // escalaremos 2 veces su tamaño en X y Y, es decir, se duplicara
                // su tamaño
                // jSpinner2 es el spinner que controla el escalado en X y jSpinner3 en Y
                if (jSpinner2.getValue() != null && (int) jSpinner2.getValue() <= 5) {// si el valor del spinner no es
                                                                                      // nulo se asigna a la variable
                                                                                      // escaladoX y se duplica el
                                                                                      // tamaño
                    escaladoX = (int) jSpinner2.getValue() + 1;
                    // mantener en el origen X
                    if (X > 12)
                        X = X - 1;
                    X = X;
                    repaint();
                }
                if (jSpinner3.getValue() != null && (int) jSpinner3.getValue() <= 5) {
                    escaladoY = (int) jSpinner3.getValue() + 1;
                    // mantener en el origen Y
                    if (Y > 90)
                        Y = Y - 1;
                    Y = Y;
                    repaint();
                }
                break;
        }
        repaint();

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Colores;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    public static javax.swing.JTextField txtCor2x;
    public static javax.swing.JTextField txtCor2y;
    public static javax.swing.JTextField txtCorX;
    public static javax.swing.JTextField txtCorY;
    // End of variables declaration//GEN-END:variables
}
