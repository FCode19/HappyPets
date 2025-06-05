
package vista;
import com.toedter.calendar.JDateChooser;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRAR NUEVO HORARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        tblHorMed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N° Horario", "CMP", "Nombre del Médico", "Especialidad", "Fecha", "Hora", "Consultorio", "Estado", "Acciones"
            }
        ));
        jScrollPane1.setViewportView(tblHorMed);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 980, 210));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void configurarSpinnerHora() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        spHora.setModel(new javax.swing.SpinnerDateModel(calendar.getTime(), null, null, java.util.Calendar.HOUR_OF_DAY));
        javax.swing.JSpinner.DateEditor editor = new javax.swing.JSpinner.DateEditor(spHora, "HH:mm:ss");
        spHora.setEditor(editor);
    }

    private void cargarMedicosEnCombo() {
        DaoMedico dao = new DaoMedico();
        ArrayList<String> listaMedicos = dao.obtenerListaMedicos();
        cbxMedico.removeAllItems();
        for (String med : listaMedicos) {
            cbxMedico.addItem(med);
        }
    }

    
    private void cargarTablaHorarios() {
        DaoHorario dao = new DaoHorario();
        DefaultTableModel modelo = dao.listarHorarios();
        tblHorMed.setModel(modelo);
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
        VistaMenuMed manteMed = new VistaMenuMed();
        manteMed.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MasterLogin ml = new MasterLogin();
        ml.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JButton btnRegistrarHorario;
    private javax.swing.JComboBox<String> cbxConsultorio;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxMedico;
    private com.toedter.calendar.JDateChooser dtFecha;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spHora;
    private javax.swing.JTable tblHorMed;
    // End of variables declaration//GEN-END:variables
}
