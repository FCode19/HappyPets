
package vista;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import negocio.*;
import objetos.Mascota;
import objetos.Propietario;
import objetos.Reporte;

public class VistaPanelConsulta extends javax.swing.JFrame {

    public VistaPanelConsulta() {
        initComponents();
        setLocationRelativeTo(null);
        btnGroup = new ButtonGroup();
        btnGroup.add(radBtnMascotas);
        btnGroup.add(radBtnPropietario);
        radBtnMascotas.addActionListener(e -> cargarDatos());
        radBtnPropietario.addActionListener(e -> cargarDatos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtNombreMascota = new javax.swing.JTextField();
        btnBuscarMascota = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        radBtnMascotas = new javax.swing.JRadioButton();
        radBtnPropietario = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtDniPropietario = new javax.swing.JTextField();
        btnBuscarPropietario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtNombreMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 220, -1));

        btnBuscarMascota.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnBuscarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMascotaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 30, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("NOMBRE DE MASCOTA");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        btnVolver.setBackground(new java.awt.Color(255, 255, 102));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/flecha.png"))); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 30, -1));

        radBtnMascotas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radBtnMascotas.setText("MASCOTAS");
        jPanel1.add(radBtnMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        radBtnPropietario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radBtnPropietario.setText("PROPIETARIO");
        jPanel1.add(radBtnPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 255));
        jLabel22.setText("CONSULTAR");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("DNI DEL PROPIETARIO");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, -1, 20));
        jPanel1.add(txtDniPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 220, -1));

        btnBuscarPropietario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarPropietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnBuscarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPropietarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 50, 30, -1));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1020, 460));

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/borrar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 30, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setForeground(new java.awt.Color(102, 102, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/actualizar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 30, -1));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

        btnReporte.setBackground(new java.awt.Color(153, 255, 153));
        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/reporte.png"))); // NOI18N
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 30, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/limpiar.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 30, -1));

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

    private void btnBuscarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMascotaActionPerformed
        String nombre = txtNombreMascota.getText().trim();
        if (!nombre.isEmpty()) {
            DaoConsultas dao = new DaoConsultas();
            DefaultTableModel modelo = dao.buscarMascotasPorNombre(nombre);
            tblDatos.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un nombre para buscar.");
        }
    }//GEN-LAST:event_btnBuscarMascotaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VistaMenuEmp emp = new VistaMenuEmp();
        emp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPropietarioActionPerformed
        String dni = txtDniPropietario.getText().trim();
        if (dni.matches("\\d{8}")) {
            DaoConsultas dao = new DaoConsultas();
            DefaultTableModel modelo = dao.buscarPropietarioPorDni(dni);
            tblDatos.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese un DNI válido de 8 dígitos.");
        }
    }//GEN-LAST:event_btnBuscarPropietarioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cargarDatos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tblDatos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila para eliminar.");
            return;
        }
        int confirmar = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar esta mascota?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirmar != JOptionPane.YES_OPTION) {
            return;
        }
        DefaultTableModel modeloActual = (DefaultTableModel) tblDatos.getModel();
        String nombrePrimeraCol = modeloActual.getColumnName(0);
        if (nombrePrimeraCol.equalsIgnoreCase("ID")) {
            int idMascota = (int) modeloActual.getValueAt(fila, 0);
            DaoConsultas dao = new DaoConsultas();
            boolean exito = dao.eliminarAmbos(idMascota);
            if (exito) {
                modeloActual.removeRow(fila);
                JOptionPane.showMessageDialog(this, "Mascota y su propietario eliminados correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar los datos.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Solo se puede eliminar desde el modelo de mascotas.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        Reporte reporte = new Reporte();
        reporte.generarReportePDF(tblDatos);
    }//GEN-LAST:event_btnReporteActionPerformed
    private void cargarDatos() {
        DaoConsultas dao = new DaoConsultas();

        if (radBtnMascotas.isSelected()) {
            DefaultTableModel modeloMascotas = dao.consultarMascotas();
            tblDatos.setModel(modeloMascotas);
        } else if (radBtnPropietario.isSelected()) {
            DefaultTableModel modeloPropietarios = dao.consultarPropietarios();
            tblDatos.setModel(modeloPropietarios);
        }
    }
    
    private void limpiar(){
        txtDniPropietario.setText("");
        txtNombreMascota.setText("");
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
            java.util.logging.Logger.getLogger(VistaPanelConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPanelConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPanelConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPanelConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPanelConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarMascota;
    private javax.swing.JButton btnBuscarPropietario;
    private javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radBtnMascotas;
    private javax.swing.JRadioButton radBtnPropietario;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtDniPropietario;
    private javax.swing.JTextField txtNombreMascota;
    // End of variables declaration//GEN-END:variables
}
