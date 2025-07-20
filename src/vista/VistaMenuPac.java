
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import negocio.DaoCita;


public class VistaMenuPac extends javax.swing.JFrame {
    DaoCita dao = new DaoCita();
    public VistaMenuPac() {
        initComponents();
        setLocationRelativeTo(null);
        cargarCombos();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxPropietarioReg = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtMascotaReg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dtFechaEmer = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtHoraEmer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxConsultorioReg = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtEspecialidadReg = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnRegCita = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        cbxPropietarioEmer = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtMascotaEmer = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtMascotaEmerNoReg = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbxVeterinarioEmer = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtEspecialidadEmer = new javax.swing.JTextField();
        btnRegEmergencia = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnMantenimiento = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        txtPropietarioEmerNoReg = new javax.swing.JTextField();
        dtFechaReg = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        txtHoraReg = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cbxVeterinarioReg = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel1.setText("HORA (HH:MM:SS)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, -1, -1));

        cbxPropietarioReg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxPropietarioReg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxPropietarioRegItemStateChanged(evt);
            }
        });
        jPanel1.add(cbxPropietarioReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setText("CITA REGULAR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel1.add(txtMascotaReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 220, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel3.setText("PROPIETARIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel4.setText("MASCOTA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        jPanel1.add(dtFechaEmer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 220, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel5.setText("ESPECIALIDAD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, -1, -1));
        jPanel1.add(txtHoraEmer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 120, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel6.setText("FECHA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        cbxConsultorioReg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1001", "1002", "1003", "1004", "1005", "1006", "1007", "1008", "1009", "1010" }));
        jPanel1.add(cbxConsultorioReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 120, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel7.setText("VETERINARIO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));
        jPanel1.add(txtEspecialidadReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 180, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel8.setText("CONSULTORIO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        btnRegCita.setBackground(new java.awt.Color(153, 255, 102));
        btnRegCita.setText("REGISTRAR CITA");
        btnRegCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegCitaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 820, 10));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel9.setText("CITA DE EMERGENCIA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 300, 10));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel10.setText("¿Propietario registrado?");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        cbxPropietarioEmer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxPropietarioEmer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxPropietarioEmerItemStateChanged(evt);
            }
        });
        jPanel1.add(cbxPropietarioEmer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 220, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel11.setText("MASCOTA");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));
        jPanel1.add(txtMascotaEmer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 220, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel12.setText("PROPIETARIO");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel13.setText("MASCOTA");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));
        jPanel1.add(txtMascotaEmerNoReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 220, -1));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 10, 100));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel14.setText("PROPIETARIO");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel15.setText("VETERINARIO");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        cbxVeterinarioEmer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxVeterinarioEmer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxVeterinarioEmerItemStateChanged(evt);
            }
        });
        jPanel1.add(cbxVeterinarioEmer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 220, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel16.setText("ESPECIALIDAD");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, -1));
        jPanel1.add(txtEspecialidadEmer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 180, -1));

        btnRegEmergencia.setBackground(new java.awt.Color(255, 102, 102));
        btnRegEmergencia.setText("Registrar Cita de Emergencia");
        btnRegEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegEmergenciaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegEmergencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        btnMantenimiento.setBackground(new java.awt.Color(255, 255, 102));
        btnMantenimiento.setText("MANTENIMIENTO");
        btnMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenimientoActionPerformed(evt);
            }
        });
        jPanel1.add(btnMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 820, 10));
        jPanel1.add(txtPropietarioEmerNoReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 220, -1));
        jPanel1.add(dtFechaReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 220, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel17.setText("FECHA");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));
        jPanel1.add(txtHoraReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 120, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel18.setText("HORA (HH:MM:SS)");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        cbxVeterinarioReg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxVeterinarioReg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxVeterinarioRegItemStateChanged(evt);
            }
        });
        jPanel1.add(cbxVeterinarioReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void cargarCombos() {
        cbxPropietarioReg.removeAllItems();
        for (String[] propietario : dao.obtenerListaPropietarios()) {
            cbxPropietarioReg.addItem(propietario[1] + " - " + propietario[0]);
        }
        cbxPropietarioEmer.removeAllItems();
        for (String[] propietario : dao.obtenerListaPropietarios()) {
            cbxPropietarioEmer.addItem(propietario[1] + " - " + propietario[0]);
        }
        cbxVeterinarioReg.removeAllItems();
        for (String[] medico : dao.obtenerListaMedicos()) {
            cbxVeterinarioReg.addItem(medico[1] + " - " + medico[0]);
        }
        cbxVeterinarioEmer.removeAllItems();
        for (String[] medico : dao.obtenerListaMedicos()) {
            cbxVeterinarioEmer.addItem(medico[1] + " - " + medico[0]);
        }
        
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String horaActual = new SimpleDateFormat("HH:mm:ss").format(new Date());
                txtHoraEmer.setText(horaActual);
            }
        });
        timer.start();
    }
    
    private void btnRegCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegCitaActionPerformed
        try {
            String propietarioItem = cbxPropietarioReg.getSelectedItem().toString();
            int idPropietario = Integer.parseInt(propietarioItem.split(" - ")[1]);
            String mascota = txtMascotaReg.getText();
            String veterinarioItem = cbxVeterinarioReg.getSelectedItem().toString();
            int cmp = Integer.parseInt(veterinarioItem.split(" - ")[1]);
            Date fechaRaw = dtFechaReg.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = sdf.format(fechaRaw);
            String hora = txtHoraReg.getText();
            String especialidad = txtEspecialidadReg.getText();
            String consultorio = cbxConsultorioReg.getSelectedItem().toString();

            if (dao.registrarCitaRegular(idPropietario, mascota, cmp, fecha, hora, especialidad, consultorio)) {
                JOptionPane.showMessageDialog(this, "Cita registrada correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "Error al registrar la cita.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Datos inválidos: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnRegCitaActionPerformed

    private void btnRegEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegEmergenciaActionPerformed
        try {
            Integer idPropietario = null;
            String propietarioEmergencia = null;
            String mascota;

            if (!txtPropietarioEmerNoReg.getText().trim().isEmpty()) {
                propietarioEmergencia = txtPropietarioEmerNoReg.getText();
                mascota = txtMascotaEmerNoReg.getText();
            } else {
                String item = cbxPropietarioEmer.getSelectedItem().toString();
                idPropietario = Integer.parseInt(item.split(" - ")[1]);
                propietarioEmergencia = null;
                mascota = txtMascotaEmer.getText();
            }

            String veterinarioItem = cbxVeterinarioEmer.getSelectedItem().toString();
            int cmp = Integer.parseInt(veterinarioItem.split(" - ")[1]);
            Date fechaRaw = dtFechaEmer.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = sdf.format(fechaRaw);
            String hora = txtHoraEmer.getText();
            String consultorio = "C_Emergencia";
            String especialidad = txtEspecialidadEmer.getText();

            if (dao.registrarCitaEmergencia(idPropietario, propietarioEmergencia, mascota, cmp, fecha, hora, consultorio, especialidad)) {
                JOptionPane.showMessageDialog(this, "Cita de emergencia registrada correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "Error al registrar la cita de emergencia.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Datos inválidos: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnRegEmergenciaActionPerformed

    private void cbxVeterinarioRegItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxVeterinarioRegItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String item = cbxVeterinarioReg.getSelectedItem().toString();
            int cmp = Integer.parseInt(item.split(" - ")[1]);
            String especialidad = dao.obtenerEspecialidadPorCmp(cmp);
            txtEspecialidadReg.setText(especialidad);
        }
    }//GEN-LAST:event_cbxVeterinarioRegItemStateChanged

    private void cbxPropietarioRegItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxPropietarioRegItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String item = cbxPropietarioReg.getSelectedItem().toString();
            int animal = Integer.parseInt(item.split(" - ")[1]);
            String mascota = dao.obtenerMascotaPorPropietario(animal);
            txtMascotaReg.setText(mascota);
        }
    }//GEN-LAST:event_cbxPropietarioRegItemStateChanged

    private void cbxPropietarioEmerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxPropietarioEmerItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String item = cbxPropietarioEmer.getSelectedItem().toString();
            int animal = Integer.parseInt(item.split(" - ")[1]);
            String mascota = dao.obtenerMascotaPorPropietario(animal);
            txtMascotaEmer.setText(mascota);
        }
    }//GEN-LAST:event_cbxPropietarioEmerItemStateChanged

    private void cbxVeterinarioEmerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxVeterinarioEmerItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String item = cbxVeterinarioEmer.getSelectedItem().toString();
            int cmp = Integer.parseInt(item.split(" - ")[1]);
            String especialidad = dao.obtenerEspecialidadPorCmp(cmp);
            txtEspecialidadEmer.setText(especialidad);
        }
    }//GEN-LAST:event_cbxVeterinarioEmerItemStateChanged

    private void btnMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenimientoActionPerformed
        VistaPanelCita vpc = new VistaPanelCita();
        vpc.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMantenimientoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MasterLogin ml = new MasterLogin();
        ml.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(VistaMenuPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenuPac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMantenimiento;
    private javax.swing.JButton btnRegCita;
    private javax.swing.JButton btnRegEmergencia;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxConsultorioReg;
    private javax.swing.JComboBox<String> cbxPropietarioEmer;
    private javax.swing.JComboBox<String> cbxPropietarioReg;
    private javax.swing.JComboBox<String> cbxVeterinarioEmer;
    private javax.swing.JComboBox<String> cbxVeterinarioReg;
    private com.toedter.calendar.JDateChooser dtFechaEmer;
    private com.toedter.calendar.JDateChooser dtFechaReg;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtEspecialidadEmer;
    private javax.swing.JTextField txtEspecialidadReg;
    private javax.swing.JTextField txtHoraEmer;
    private javax.swing.JTextField txtHoraReg;
    private javax.swing.JTextField txtMascotaEmer;
    private javax.swing.JTextField txtMascotaEmerNoReg;
    private javax.swing.JTextField txtMascotaReg;
    private javax.swing.JTextField txtPropietarioEmerNoReg;
    // End of variables declaration//GEN-END:variables
}
