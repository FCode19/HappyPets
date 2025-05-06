
package vista;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import negocio.*;
import objetos.Mascota;
import objetos.Propietario;

public class VistaMenuEmp extends javax.swing.JFrame {

    public VistaMenuEmp() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMascota = new javax.swing.JTextField();
        txtTamano = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        dateNacimiento = new com.toedter.calendar.JDateChooser();
        cbxEspecie = new javax.swing.JComboBox<>();
        cbxSexo = new javax.swing.JComboBox<>();
        txtRaza = new javax.swing.JTextField();
        chRabia = new javax.swing.JCheckBox();
        chRefuerzos = new javax.swing.JCheckBox();
        chParvovirus = new javax.swing.JCheckBox();
        chPolivalentes = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNombrePro = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnAct = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel2.setText("TAMAÑO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 20));

        btnRegistrar.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 1040, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRE DE LA MASCOTA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setText("COLOR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("EDAD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("FECHA DE NACIMIENTO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("ESPECIE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("SEXO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("RAZA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("VACUNAS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));
        jPanel1.add(txtMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 250, -1));
        jPanel1.add(txtTamano, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 250, -1));
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 250, -1));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 250, -1));
        jPanel1.add(dateNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 250, -1));

        cbxEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PERRO", "GATO", "HAMSTER", "PEZ", "PAJARO" }));
        jPanel1.add(cbxEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 250, -1));

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Macho", "Hembra" }));
        jPanel1.add(cbxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 250, -1));
        jPanel1.add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 250, -1));

        chRabia.setText("RABIA");
        jPanel1.add(chRabia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        chRefuerzos.setText("REFUERZOS");
        jPanel1.add(chRefuerzos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, -1, -1));

        chParvovirus.setText("PARVOVIRUS");
        jPanel1.add(chParvovirus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, -1));

        chPolivalentes.setText("POLIVALENTES");
        jPanel1.add(chPolivalentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel12.setText("N° DE DNI DEL PROPIETARIO");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, -1));
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 230, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel13.setText("NOMBRE");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, -1, -1));
        jPanel1.add(txtNombrePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 230, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 230, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel14.setText("APELLIDO");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel15.setText("DIRECCIÓN");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, -1, 20));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 230, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel16.setText("CELULAR");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, -1, -1));
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 230, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel17.setText("CORREO ELECTRÓNICO");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, -1, 20));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 230, -1));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 340, 470));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 350, 470));

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel18.setText("ID MASCOTA");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        txtId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 220, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 220, 10));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/PERRO.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 260, 250));

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 200, -1));

        btnAct.setBackground(new java.awt.Color(102, 102, 255));
        btnAct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAct.setText("ACTUALIZAR");
        btnAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActActionPerformed(evt);
            }
        });
        jPanel1.add(btnAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 200, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 255));
        jLabel20.setText("DATOS DE PROPIETARIO");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 255));
        jLabel21.setText("DATOS DE PACIENTE");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 153));
        jButton4.setText("IR A PANEL DE CONSULTAS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 220, -1));

        jButton5.setBackground(new java.awt.Color(102, 102, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/flecha.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 30, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/limpiar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (validar()) {
            String nombre = txtMascota.getText();
            String tamano = txtTamano.getText();
            String color = txtColor.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            String fecha = ((JTextField) dateNacimiento.getDateEditor().getUiComponent()).getText();
            String especie = cbxEspecie.getSelectedItem().toString();
            String sexo = cbxSexo.getSelectedItem().toString();
            String raza = txtRaza.getText();
            String vacunas = vacunasSeleccionadas();

            DaoMascota daoM = new DaoMascota();
            int idMascota = daoM.registrar(nombre, tamano, color, edad, fecha, especie, sexo, raza, vacunas);

            if (idMascota != -1) {
                String dni = txtDni.getText();
                String nombrePro = txtNombrePro.getText();
                String apellido = txtApellido.getText();
                String direccion = txtDireccion.getText();
                String celular = txtCelular.getText();
                String correo = txtCorreo.getText();

                DaoPropietario daoP = new DaoPropietario();
                daoP.registrar(dni, nombrePro, apellido, direccion, celular, correo, idMascota);
                JOptionPane.showMessageDialog(this, "Registro exitoso.");
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Error al registrar mascota.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe rellenar todos los campos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int id = Integer.parseInt(txtId.getText());

        DaoMascota daoM = new DaoMascota();
        Mascota mascota = daoM.buscar(id);

        if (mascota != null) {
            txtMascota.setText(mascota.getNombre());
            txtTamano.setText(mascota.getTamano());
            txtColor.setText(mascota.getColor());
            txtEdad.setText(String.valueOf(mascota.getEdad()));
            ((JTextField) dateNacimiento.getDateEditor().getUiComponent()).setText(mascota.getFecNacimiento());
            cbxEspecie.setSelectedItem(mascota.getEspecie());
            cbxSexo.setSelectedItem(mascota.getSexo());
            txtRaza.setText(mascota.getRaza());

            String vacunas = mascota.getVacunas();
            chRabia.setSelected(vacunas.contains("Rabia"));
            chRefuerzos.setSelected(vacunas.contains("Refuerzos"));
            chParvovirus.setSelected(vacunas.contains("Parvovirus"));
            chPolivalentes.setSelected(vacunas.contains("Polivalentes"));

            DaoPropietario daoP = new DaoPropietario();
            Propietario prop = daoP.buscarPorIdMascota(id);

            if (prop != null) {
                txtDni.setText(prop.getDni());
                txtNombrePro.setText(prop.getNombre());
                txtApellido.setText(prop.getApellidos());
                txtDireccion.setText(prop.getDireccion());
                txtCelular.setText(prop.getCelular());
                txtCorreo.setText(prop.getCorreo());
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró mascota con ese ID.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActActionPerformed
        int id = Integer.parseInt(txtId.getText());
        String nombre = txtMascota.getText();
        String tamano = txtTamano.getText();
        String color = txtColor.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        String fecha = ((JTextField) dateNacimiento.getDateEditor().getUiComponent()).getText();
        String especie = cbxEspecie.getSelectedItem().toString();
        String sexo = cbxSexo.getSelectedItem().toString();
        String raza = txtRaza.getText();
        String vacunas = "";
        if (chRabia.isSelected()) {
            vacunas += "Rabia, ";
        }
        if (chRefuerzos.isSelected()) {
            vacunas += "Refuerzos, ";
        }
        if (chParvovirus.isSelected()) {
            vacunas += "Parvovirus, ";
        }
        if (chPolivalentes.isSelected()) {
            vacunas += "Polivalentes, ";
        }
        if (!vacunas.isEmpty()) {
            vacunas = vacunas.substring(0, vacunas.length() - 2);
        }
        String dni = txtDni.getText();
        String nombrePro = txtNombrePro.getText();
        String apellido = txtApellido.getText();
        String direccion = txtDireccion.getText();
        String celular = txtCelular.getText();
        String correo = txtCorreo.getText();
        DaoMascota daoM = new DaoMascota();
        daoM.actualizar(id, nombre, tamano, color, edad, fecha, especie, sexo, raza, vacunas);
        DaoPropietario daoP = new DaoPropietario();
        daoP.actualizar(dni, nombrePro, apellido, direccion, celular, correo, id);
        JOptionPane.showMessageDialog(this, "Datos actualizados correctamente.");
        limpiarCampos();
    }//GEN-LAST:event_btnActActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MasterLogin master = new MasterLogin();
        master.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        VistaPanelConsulta consulta = new VistaPanelConsulta();
        consulta.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
    private String vacunasSeleccionadas() {
        StringBuilder vacunas = new StringBuilder();
        if (chRabia.isSelected()) {
            vacunas.append("Rabia,");
        }
        if (chRefuerzos.isSelected()) {
            vacunas.append("Refuerzos,");
        }
        if (chParvovirus.isSelected()) {
            vacunas.append("Parvovirus,");
        }
        if (chPolivalentes.isSelected()) {
            vacunas.append("Polivalentes,");
        }
        if (vacunas.length() > 0) {
            vacunas.deleteCharAt(vacunas.length() - 1);
        }
        return vacunas.toString();
    }
    public void limpiarCampos() {
        txtId.setText("");
        txtMascota.setText("");
        txtTamano.setText("");
        txtColor.setText("");
        txtEdad.setText("");
        txtRaza.setText("");
        ((JTextField) dateNacimiento.getDateEditor().getUiComponent()).setText("");
        cbxEspecie.setSelectedIndex(0);
        cbxSexo.setSelectedIndex(0);
        chRabia.setSelected(false);
        chRefuerzos.setSelected(false);
        chParvovirus.setSelected(false);
        chPolivalentes.setSelected(false);
        txtDni.setText("");
        txtNombrePro.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtCelular.setText("");
        txtCorreo.setText("");
    }
    
    public boolean validar() {
        if (txtMascota.getText().trim().isEmpty() || txtTamano.getText().trim().isEmpty() || txtColor.getText().trim().isEmpty() || txtEdad.getText().trim().isEmpty() || ((JTextField) dateNacimiento.getDateEditor().getUiComponent()).getText().trim().isEmpty() || cbxEspecie.getSelectedIndex() == 0 || cbxSexo.getSelectedIndex() == 0 || txtRaza.getText().trim().isEmpty()) {
            return false;
        }
        String dni = txtDni.getText().trim();
        String celular = txtCelular.getText().trim();
        String correo = txtCorreo.getText().trim();
        if (dni.isEmpty() || txtNombrePro.getText().trim().isEmpty() || txtApellido.getText().trim().isEmpty() || txtDireccion.getText().trim().isEmpty() || celular.isEmpty() || correo.isEmpty()) {
            return false;
        }
        if (!dni.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(this, "El DNI debe tener exactamente 8 dígitos numéricos.");
            return false;
        }
        if (!celular.matches("\\d{9}")) {
            JOptionPane.showMessageDialog(this, "El número de celular debe tener exactamente 9 dígitos numéricos.");
            return false;
        }
        if (!correo.contains("@")
                || !(correo.endsWith(".com") || correo.endsWith(".pe"))) {
            JOptionPane.showMessageDialog(this, "El correo debe contener '@' y terminar en '.com' o '.pe'.");
            return false;
        }
        return true;
    }

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
            java.util.logging.Logger.getLogger(VistaMenuEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenuEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenuEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenuEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenuEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAct;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxEspecie;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JCheckBox chParvovirus;
    private javax.swing.JCheckBox chPolivalentes;
    private javax.swing.JCheckBox chRabia;
    private javax.swing.JCheckBox chRefuerzos;
    private com.toedter.calendar.JDateChooser dateNacimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMascota;
    private javax.swing.JTextField txtNombrePro;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtTamano;
    // End of variables declaration//GEN-END:variables
}
