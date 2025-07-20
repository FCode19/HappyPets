
package objetos;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.awt.Desktop;
import java.io.File;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
public class Reporte {
    public void generarReportePDF(JTable tabla) {
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        try {
            String ruta = "src/reportes/reporte_consulta.pdf";
            PdfWriter.getInstance(document, new FileOutputStream(ruta));
            document.open();
            Font tituloFont = FontFactory.getFont("Arial", 18, Font.BOLD);
            Font subtituloFont = FontFactory.getFont("Arial", 14, Font.NORMAL);
            Font tablaFont = FontFactory.getFont("Arial", 12, Font.NORMAL);
            Paragraph titulo = new Paragraph("VETERINARIA HAPPY PETS", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);
            document.add(Chunk.NEWLINE);
            Paragraph subtitulo = new Paragraph("Reporte de consulta:", subtituloFont);
            subtitulo.setAlignment(Element.ALIGN_LEFT);
            document.add(subtitulo);
            document.add(Chunk.NEWLINE);
            TableModel model = tabla.getModel();
            PdfPTable pdfTable = new PdfPTable(model.getColumnCount());
            pdfTable.setWidthPercentage(100);
            for (int i = 0; i < model.getColumnCount(); i++) {
                PdfPCell cell = new PdfPCell(new Phrase(model.getColumnName(i), tablaFont));
                cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                pdfTable.addCell(cell);
            }
            for (int row = 0; row < model.getRowCount(); row++) {
                for (int col = 0; col < model.getColumnCount(); col++) {
                    pdfTable.addCell(new Phrase(String.valueOf(model.getValueAt(row, col)), tablaFont));
                }
            }
            document.add(pdfTable);
            document.close();
            JOptionPane.showMessageDialog(null, "PDF generado correctamente en: " + ruta);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void generarCitaPDF(Cita cita) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("cita_" + cita.getNumTicket() + ".pdf"));
            document.open();

            Font titleFont = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD);
            Font normalFont = new Font(Font.FontFamily.HELVETICA, 12);

            Paragraph title = new Paragraph("Detalle de Cita Veterinaria", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);
            document.add(new Paragraph(" "));

            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100);

            table.addCell("Ticket");
            table.addCell(cita.getNumTicket());

            table.addCell("Propietario");
            table.addCell(cita.getPropietario() != null ? cita.getPropietario() : "--VACIO--");

            table.addCell("Mascota");
            table.addCell(cita.getMascota());

            table.addCell("Veterinario");
            table.addCell(cita.getMedico());

            table.addCell("Fecha");
            table.addCell(cita.getFecha());

            table.addCell("Hora");
            table.addCell(cita.getHora());

            table.addCell("Consultorio");
            table.addCell(cita.getConsultorio());

            table.addCell("Especialidad");
            table.addCell(cita.getEspecialidad());

            document.add(table);
            document.close();

            Desktop.getDesktop().open(new File("cita_" + cita.getNumTicket() + ".pdf"));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar PDF: " + e.getMessage());
        }
    }
}
