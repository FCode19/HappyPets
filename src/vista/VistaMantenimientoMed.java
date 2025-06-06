
package vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.DaoMedico;

public class VistaMantenimientoMed extends javax.swing.JFrame {

    public VistaMantenimientoMed() {
        initComponents();
        setLocationRelativeTo(null);
        cargarTablaMedicos();
    }

    private void cargarTablaMedicos() {
        DaoMedico dao = new DaoMedico();
        DefaultTableModel modelo = dao.listarMedicos();
        tblMed.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMed = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCmp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCmpMod = new javax.swing.JTextField();
        txtNombreMod = new javax.swing.JTextField();
        txtApellidoMod = new javax.swing.JTextField();
        txtEspecialidadMod = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("MODIFICAR MÉDICO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        tblMed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CMP", "Nombre", "Apellido", "Especialidad"
            }
        ));
        jScrollPane1.setViewportView(tblMed);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 990, 180));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("MANTENIMIENTO DE MÉDICOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setText("CMP");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        jPanel1.add(txtCmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 120, -1));

        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 210, -1));

        jLabel5.setText("Apellido");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 220, -1));

        jLabel6.setText("Especialidad");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, -1, -1));
        jPanel1.add(txtEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 210, -1));

        btnRegistrar.setBackground(new java.awt.Color(0, 153, 0));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR MÉDICO");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("VOLVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("REGISTRAR NUEVO MÉDICO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel9.setText("Nombre");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        jLabel10.setText("Apellido");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));

        jLabel11.setText("Especialidad");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, -1, -1));
        jPanel1.add(txtCmpMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 120, -1));
        jPanel1.add(txtNombreMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 210, -1));
        jPanel1.add(txtApellidoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 220, -1));
        jPanel1.add(txtEspecialidadMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 210, -1));

        btnModificar.setBackground(new java.awt.Color(255, 255, 51));
        btnModificar.setText("MODIFICAR MÉDICO");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, -1, -1));

        jLabel12.setText("CMP");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 40, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String cmp = txtCmp.getText().trim();
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String especialidad = txtEspecialidad.getText().trim();

        if (cmp.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || especialidad.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
            return;
        }

        DaoMedico dao = new DaoMedico();
        boolean registrado = dao.registrar(cmp, nombre, apellido, especialidad);

        if (registrado) {
            JOptionPane.showMessageDialog(this, "Médico registrado correctamente.");
            cargarTablaMedicos();
            txtCmp.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            txtEspecialidad.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar médico. ¿Ya existe el CMP?");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tblMed.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un médico de la tabla para eliminar.");
            return;
        }

        String cmp = tblMed.getValueAt(fila, 0).toString();

        DaoMedico dao = new DaoMedico();
        boolean eliminado = dao.eliminar(cmp, false);

        if (eliminado) {
            JOptionPane.showMessageDialog(this, "Médico eliminado correctamente.");
            cargarTablaMedicos();
        } else {
            int opcion = JOptionPane.showConfirmDialog(
                    this,
                    "El médico tiene citas pendientes.\n¿Desea eliminarlo junto con sus horarios?",
                    "Confirmar eliminación forzada",
                    JOptionPane.YES_NO_OPTION
            );

            if (opcion == JOptionPane.YES_OPTION) {
                boolean eliminadoForzado = dao.eliminar(cmp, true);
                if (eliminadoForzado) {
                    JOptionPane.showMessageDialog(this, "Médico y sus horarios eliminados correctamente.");
                    cargarTablaMedicos();
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar al médico.");
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String cmp = txtCmpMod.getText().trim();
        String nombre = txtNombreMod.getText().trim();
        String apellido = txtApellidoMod.getText().trim();
        String especialidad = txtEspecialidadMod.getText().trim();

        if (cmp.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || especialidad.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos de modificación son obligatorios.");
            return;
        }

        DaoMedico dao = new DaoMedico();
        boolean modificado = dao.modificar(cmp, nombre, apellido, especialidad);

        if (modificado) {
            JOptionPane.showMessageDialog(this, "Datos del médico modificados correctamente.");
            cargarTablaMedicos();
            txtCmpMod.setText("");
            txtNombreMod.setText("");
            txtApellidoMod.setText("");
            txtEspecialidadMod.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Error al modificar médico. Verifique el CMP.");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VistaMenuMed vmm = new VistaMenuMed();
        vmm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String cmp = txtCmpMod.getText().trim();

        if (cmp.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el CMP del médico a buscar.");
            return;
        }

        DaoMedico dao = new DaoMedico();
        String[] datos = dao.buscarPorCmp(cmp);

        if (datos != null) {
            txtNombreMod.setText(datos[0]);
            txtApellidoMod.setText(datos[1]);
            txtEspecialidadMod.setText(datos[2]);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el médico con CMP: " + cmp);
            txtNombreMod.setText("");
            txtApellidoMod.setText("");
            txtEspecialidadMod.setText("");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaMantenimientoMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMantenimientoMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMantenimientoMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMantenimientoMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMantenimientoMed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMed;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoMod;
    private javax.swing.JTextField txtCmp;
    private javax.swing.JTextField txtCmpMod;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtEspecialidadMod;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreMod;
    // End of variables declaration//GEN-END:variables
}
