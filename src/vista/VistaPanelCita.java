
package vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.DaoCita;
import objetos.Cita;
import objetos.Reporte;
import static objetos.Reporte.generarCitaPDF;

public class VistaPanelCita extends javax.swing.JFrame {
DaoCita dao = new DaoCita();
    public VistaPanelCita() {
        initComponents();
        setLocationRelativeTo(null);
        cargarTablas();
    }
    
    private void cargarTablas() {
        cargarEmergencias();
        cargarRegulares();
    }
    
    private void cargarRegulares() {
        DefaultTableModel modelo = (DefaultTableModel) tblCitasRegulares.getModel();
        modelo.setRowCount(0);
        List<String[]> regulares = dao.listarCitasRegulares();
        for (String[] fila : regulares) {
            modelo.addRow(fila);
        }
    }

    private void cargarEmergencias() {
        DefaultTableModel modelo = (DefaultTableModel) tblCitasEmergencia.getModel();
        modelo.setRowCount(0);
        List<String[]> emergencias = dao.listarCitasEmergencia();
        for (String[] fila : emergencias) {
            modelo.addRow(fila);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCitasEmergencia = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCitasRegulares = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtTicketImp = new javax.swing.JTextField();
        btnBuscarReg = new javax.swing.JButton();
        dtFechaRegAct = new com.toedter.calendar.JDateChooser();
        txtHoraRegAct = new javax.swing.JTextField();
        txtTicketReg = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtTicketEmer = new javax.swing.JTextField();
        btnEliEmer = new javax.swing.JButton();
        btnModificarReg = new javax.swing.JButton();
        btnEliReg = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel1.setText("HORA (HH:MM:SS)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel6.setText("Ticket");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setText("CITAS REGULARES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 810, 10));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel9.setText("CITAS DE EMERGENCIA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 810, 10));

        tblCitasEmergencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "# Ticket", "Propietario", "Mascota", "Veterinario", "Fecha", "Hora", "Consultorio", "Especialidad"
            }
        ));
        jScrollPane1.setViewportView(tblCitasEmergencia);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 810, 140));

        tblCitasRegulares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "# Ticket", "Propietario", "Mascota", "Veterinario", "Fecha", "Hora", "Consultorio", "Especialidad"
            }
        ));
        jScrollPane2.setViewportView(tblCitasRegulares);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 810, 210));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel3.setText("Buscar cita por Ticket");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));
        jPanel1.add(txtTicketImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 70, -1));

        btnBuscarReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lupa.png"))); // NOI18N
        btnBuscarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRegActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 30, -1));
        jPanel1.add(dtFechaRegAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 160, -1));
        jPanel1.add(txtHoraRegAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 120, -1));
        jPanel1.add(txtTicketReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 70, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel7.setText("FECHA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/reporte.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel1.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel8.setText("Ticket");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));
        jPanel1.add(txtTicketEmer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 70, -1));

        btnEliEmer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/borrar.png"))); // NOI18N
        btnEliEmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliEmerActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliEmer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, -1, -1));

        btnModificarReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/actualizar.png"))); // NOI18N
        btnModificarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarRegActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, -1, -1));

        btnEliReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/borrar.png"))); // NOI18N
        btnEliReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliRegActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        String ticketIngresado = txtTicketImp.getText().trim();
        Cita cita = null;

        for (int i = 0; i < tblCitasRegulares.getRowCount(); i++) {
            String ticketTabla = tblCitasRegulares.getValueAt(i, 0).toString();
            if (ticketTabla.equals(ticketIngresado)) {
                cita = new Cita();
                cita.setNumTicket(ticketTabla);
                cita.setPropietario(tblCitasRegulares.getValueAt(i, 1).toString());
                cita.setMascota(tblCitasRegulares.getValueAt(i, 2).toString());
                cita.setMedico(tblCitasRegulares.getValueAt(i, 3).toString());
                cita.setFecha(tblCitasRegulares.getValueAt(i, 4).toString());
                cita.setHora(tblCitasRegulares.getValueAt(i, 5).toString());
                cita.setConsultorio(tblCitasRegulares.getValueAt(i, 6).toString());
                cita.setEspecialidad(tblCitasRegulares.getValueAt(i, 7).toString());
                break;
            }
        }

        if (cita == null) {
            for (int i = 0; i < tblCitasEmergencia.getRowCount(); i++) {
                String ticketTabla = tblCitasEmergencia.getValueAt(i, 0).toString();
                if (ticketTabla.equals(ticketIngresado)) {
                    cita = new Cita();
                    cita.setNumTicket(ticketTabla);
                    cita.setPropietario(tblCitasEmergencia.getValueAt(i, 1).toString());
                    cita.setMascota(tblCitasEmergencia.getValueAt(i, 2).toString());
                    cita.setMedico(tblCitasEmergencia.getValueAt(i, 3).toString());
                    cita.setFecha(tblCitasEmergencia.getValueAt(i, 4).toString());
                    cita.setHora(tblCitasEmergencia.getValueAt(i, 5).toString());
                    cita.setConsultorio(tblCitasEmergencia.getValueAt(i, 6).toString());
                    cita.setEspecialidad(tblCitasEmergencia.getValueAt(i, 7).toString());
                    break;
                }
            }
        }

        if (cita != null) {
            txtTicketImp.setText("");
            generarCitaPDF(cita);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el ticket ingresado en ninguna tabla.");
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnBuscarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRegActionPerformed
        String ticket = txtTicketReg.getText();
        if (!ticket.isEmpty()) {
            DaoCita dao = new DaoCita();
            Object[] datos = dao.buscarCitaRegular(ticket);
            if (datos != null) {
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Date fecha = sdf.parse((String) datos[0]);
                    dtFechaRegAct.setDate(fecha);
                    txtHoraRegAct.setText((String) datos[1]);
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(this, "Error al convertir la fecha: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el ticket.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese el número de ticket a consultar.");
        }
    }//GEN-LAST:event_btnBuscarRegActionPerformed

    private void btnEliRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliRegActionPerformed
        String ticket = txtTicketReg.getText();
        if (!ticket.isEmpty()) {
            DaoCita dao = new DaoCita();
            boolean exito = dao.eliminarCitaRegular(ticket);
            if (exito) {
                JOptionPane.showMessageDialog(this, "Cita eliminada.");
                cargarTablas();
                txtTicketReg.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar la cita.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese el ticket a eliminar.");
        }
    }//GEN-LAST:event_btnEliRegActionPerformed

    private void btnModificarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarRegActionPerformed
        String ticket = txtTicketReg.getText().trim();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String fecha = sdf.format(dtFechaRegAct.getDate());
        String hora = txtHoraRegAct.getText().trim();

        DaoCita dao = new DaoCita();
        boolean exito = dao.modificarCitaRegular(ticket, fecha, hora);

        if (exito) {
            JOptionPane.showMessageDialog(this, "Cita modificada correctamente.");
            cargarTablas();
            txtTicketReg.setText("");
            txtHoraRegAct.setText("");
            dtFechaRegAct.setDate(null);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo modificar la cita. Verifique el número de ticket.");
        }
    }//GEN-LAST:event_btnModificarRegActionPerformed

    private void btnEliEmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliEmerActionPerformed
        String ticket = txtTicketEmer.getText();
        if (!ticket.isEmpty()) {
            DaoCita dao = new DaoCita();
            boolean exito = dao.eliminarCitaEmergencia(ticket);
            if (exito) {
                JOptionPane.showMessageDialog(this, "Cita de emergencia eliminada.");
                cargarTablas();
                txtTicketEmer.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar la cita.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese el ticket a eliminar.");
        }
    }//GEN-LAST:event_btnEliEmerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VistaMenuPac vmp = new VistaMenuPac();
        vmp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPanelCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPanelCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPanelCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPanelCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPanelCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarReg;
    private javax.swing.JButton btnEliEmer;
    private javax.swing.JButton btnEliReg;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificarReg;
    private com.toedter.calendar.JDateChooser dtFechaRegAct;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tblCitasEmergencia;
    private javax.swing.JTable tblCitasRegulares;
    private javax.swing.JTextField txtHoraRegAct;
    private javax.swing.JTextField txtTicketEmer;
    private javax.swing.JTextField txtTicketImp;
    private javax.swing.JTextField txtTicketReg;
    // End of variables declaration//GEN-END:variables
}
