
package vista;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.DaoHorario;
import negocio.DaoMedico;
public class VistaMenuMed extends javax.swing.JFrame {

    public VistaMenuMed() {
        initComponents();
        configurarSpinnerHora();
        cargarMedicosEnCombo();
        cargarTablaHorarios();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHorMed = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxMedico = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        dtFecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        spHora = new javax.swing.JSpinner();
        cbxConsultorio = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxEstado = new javax.swing.JComboBox<>();
        btnRegistrarHorario = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        cbxMedicoMod = new javax.swing.JComboBox<>();
        dtFechaMod = new com.toedter.calendar.JDateChooser();
        spHoraMod = new javax.swing.JSpinner();
        cbxConsultorioMod = new javax.swing.JComboBox<>();
        cbxEstadoMod = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("MODIFICAR HORARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        tblHorMed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N° Horario", "CMP", "Nombre del Médico", "Especialidad", "Fecha", "Hora", "Consultorio", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tblHorMed);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 970, 210));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("GESTIÓN DE HORARIOS MÉDICOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setText("Médico");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        cbxMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        jPanel1.add(cbxMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 210, -1));

        jLabel4.setText("Fecha");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));
        jPanel1.add(dtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 180, -1));

        jLabel5.setText("Hora");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));
        jPanel1.add(spHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 90, -1));

        cbxConsultorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "C100", "C101", "C102", "C103", "C104", "C105", "C106", "C107", "C108", "C109", "C110" }));
        jPanel1.add(cbxConsultorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 130, -1));

        jLabel6.setText("Consultorio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, -1));

        jLabel7.setText("Estado");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, -1, -1));

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Activo", "Cancelado" }));
        jPanel1.add(cbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 120, -1));

        btnRegistrarHorario.setBackground(new java.awt.Color(0, 153, 0));
        btnRegistrarHorario.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarHorario.setText("REGISTRAR");
        btnRegistrarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarHorarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 255, 204));
        jButton2.setText("MANTENIMIENTO MÉDICO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("VOLVER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("REGISTRAR NUEVO HORARIO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel9.setText("Médico");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

        jLabel10.setText("Fecha");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, -1));

        jLabel11.setText("Hora");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, -1, -1));

        jLabel12.setText("Consultorio");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, -1, -1));

        jLabel13.setText("Estado");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 440, -1, -1));

        jLabel14.setText("N° Horario");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 90, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 40, -1));

        cbxMedicoMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        jPanel1.add(cbxMedicoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 210, -1));
        jPanel1.add(dtFechaMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 180, -1));
        jPanel1.add(spHoraMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 100, -1));

        cbxConsultorioMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "C100", "C101", "C102", "C103", "C104", "C105", "C106", "C107", "C108", "C109", "C110" }));
        jPanel1.add(cbxConsultorioMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 130, -1));

        cbxEstadoMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Activo", "Cancelado" }));
        jPanel1.add(cbxEstadoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 460, 120, -1));

        btnModificar.setBackground(new java.awt.Color(255, 255, 51));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void configurarSpinnerHora() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();

        spHora.setModel(new javax.swing.SpinnerDateModel(calendar.getTime(), null, null, java.util.Calendar.HOUR_OF_DAY));
        javax.swing.JSpinner.DateEditor editor1 = new javax.swing.JSpinner.DateEditor(spHora, "HH:mm:ss");
        spHora.setEditor(editor1);

        spHoraMod.setModel(new javax.swing.SpinnerDateModel(calendar.getTime(), null, null, java.util.Calendar.HOUR_OF_DAY));
        javax.swing.JSpinner.DateEditor editor2 = new javax.swing.JSpinner.DateEditor(spHoraMod, "HH:mm:ss");
        spHoraMod.setEditor(editor2);
    }

    

    private void cargarMedicosEnCombo() {
        DaoMedico dao = new DaoMedico();
        ArrayList<String> listaMedicos = dao.obtenerListaMedicos();
        for (String med : listaMedicos) {
            cbxMedico.addItem(med);
            cbxMedicoMod.addItem(med);
        }
    }
    
    private void cargarTablaHorarios() {
        DaoHorario dao = new DaoHorario();
        DefaultTableModel modelo = dao.listarHorarios();
        tblHorMed.setModel(modelo);
    }
    
    private int obtenerIndiceComboMedico(String cmp) {
        for (int i = 0; i < cbxMedicoMod.getItemCount(); i++) {
            String item = cbxMedicoMod.getItemAt(i);
            if (item.startsWith(cmp + "-")) {
                return i;
            }
        }
        return -1;
    }

    private void limpiarCamposMod() {
        txtBuscar.setText("");
        cbxMedicoMod.setSelectedIndex(0);
        dtFechaMod.setDate(null);
        spHoraMod.setValue(new Date());
        cbxConsultorio.setSelectedIndex(0);
        cbxEstado.setSelectedIndex(0);
    }

    private void btnRegistrarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarHorarioActionPerformed
        String medicoSeleccionado = cbxMedico.getSelectedItem().toString();

        if (medicoSeleccionado.equals("-")) {
            JOptionPane.showMessageDialog(this, "Seleccione un médico válido.");
            return;
        }

        String cmp = medicoSeleccionado.split("-")[0];

        Date fechaDate = dtFecha.getDate();
        if (fechaDate == null) {
            JOptionPane.showMessageDialog(this, "Seleccione una fecha válida.");
            return;
        }
        String fecha = new SimpleDateFormat("yyyy-MM-dd").format(fechaDate);

        Date horaDate = (Date) spHora.getValue();
        String hora = new SimpleDateFormat("HH:mm:ss").format(horaDate);

        String consultorio = cbxConsultorio.getSelectedItem().toString();
        String estado = cbxEstado.getSelectedItem().toString();

        if (consultorio.equals("-") || estado.equals("-")) {
            JOptionPane.showMessageDialog(this, "Seleccione consultorio y estado válidos.");
            return;
        }

        DaoHorario dao = new DaoHorario();
        dao.registrar(Integer.parseInt(cmp), fecha, hora, consultorio, estado);

        JOptionPane.showMessageDialog(this, "Horario registrado correctamente.");
        cargarTablaHorarios();
    }//GEN-LAST:event_btnRegistrarHorarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VistaMantenimientoMed manteMed = new VistaMantenimientoMed();
        manteMed.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MasterLogin ml = new MasterLogin();
        ml.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String numHorStr = txtBuscar.getText().trim();
        if (numHorStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Primero busque un horario para modificar.");
            return;
        }

        try {
            int numHorario = Integer.parseInt(numHorStr);

            String medicoSeleccionado = cbxMedicoMod.getSelectedItem().toString();
            String cmp = medicoSeleccionado.split("-")[0];

            Date fechaDate = dtFechaMod.getDate();
            if (fechaDate == null) {
                JOptionPane.showMessageDialog(this, "Seleccione una fecha válida.");
                return;
            }
            String fecha = new SimpleDateFormat("yyyy-MM-dd").format(fechaDate);

            Date horaDate = (Date) spHoraMod.getValue();
            String hora = new SimpleDateFormat("HH:mm:ss").format(horaDate);

            String consultorio = cbxConsultorioMod.getSelectedItem().toString();
            String estado = cbxEstadoMod.getSelectedItem().toString();

            DaoHorario dao = new DaoHorario();
            boolean actualizado = dao.actualizarHorario(numHorario, Integer.parseInt(cmp), fecha, hora, consultorio, estado);

            if (actualizado) {
                JOptionPane.showMessageDialog(this, "Horario modificado correctamente.");
                cargarTablaHorarios();
                limpiarCamposMod();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo modificar el horario.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Número de horario inválido.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al modificar horario: " + e.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String numHorStr = txtBuscar.getText().trim();
        if (numHorStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un número de horario.");
            return;
        }

        try {
            int numHorario = Integer.parseInt(numHorStr);
            DaoHorario dao = new DaoHorario();
            String[] datos = dao.buscarHorarioPorNumero(numHorario);

            if (datos != null) {
                int indiceMedico = obtenerIndiceComboMedico(datos[0]);
                if (indiceMedico != -1) {
                    cbxMedicoMod.setSelectedIndex(indiceMedico);
                }

                Date fecha = new SimpleDateFormat("yyyy-MM-dd").parse(datos[1]);
                dtFechaMod.setDate(fecha);

                Date hora = new SimpleDateFormat("HH:mm:ss").parse(datos[2]);
                spHoraMod.setValue(hora);

                cbxConsultorioMod.setSelectedItem(datos[3]);
                cbxEstadoMod.setSelectedItem(datos[4]);

            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el horario.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Número de horario inválido.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar horario: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tblHorMed.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un horario de la tabla para eliminar.");
            return;
        }

        int numHorario = Integer.parseInt(tblHorMed.getValueAt(filaSeleccionada, 0).toString());

        int opcion = JOptionPane.showConfirmDialog(this,
                "¿Está seguro que desea eliminar el horario número " + numHorario + "?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            DaoHorario dao = new DaoHorario();
            boolean eliminado = dao.eliminarHorario(numHorario);

            if (eliminado) {
                JOptionPane.showMessageDialog(this, "Horario eliminado correctamente.");
                cargarTablaHorarios();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar el horario.");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaMenuMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenuMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenuMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenuMed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenuMed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrarHorario;
    private javax.swing.JComboBox<String> cbxConsultorio;
    private javax.swing.JComboBox<String> cbxConsultorioMod;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxEstadoMod;
    private javax.swing.JComboBox<String> cbxMedico;
    private javax.swing.JComboBox<String> cbxMedicoMod;
    private com.toedter.calendar.JDateChooser dtFecha;
    private com.toedter.calendar.JDateChooser dtFechaMod;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spHora;
    private javax.swing.JSpinner spHoraMod;
    private javax.swing.JTable tblHorMed;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
