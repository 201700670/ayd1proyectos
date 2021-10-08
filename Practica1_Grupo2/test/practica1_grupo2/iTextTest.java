package practica1_grupo2;

//import com.itextpdf.testutils.CompareTool;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.*;
import com.itextpdf.text.xml.XMLUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

/**
 *
 * @author diego
 */
public class iTextTest {
    
    
    @Test
    public void crearPDF() throws FileNotFoundException, DocumentException{
        System.out.println("--------Creando Documento----");
        Document documento = new Document();
        
        // El OutPutStream para el fichero donde crearemos el PDF
        FileOutputStream ficheroPDF = new FileOutputStream("Testeo.pdf");
        
        // Se asocia el documento de OutPutStream
        PdfWriter.getInstance(documento, ficheroPDF);
        
        // Se abre el documento
        documento.open();
        System.out.println("Realizano la primera prueba\n");
        // Parrafo
        Paragraph titulo = new Paragraph("Primera Prueba\n",
                FontFactory.getFont("arial",
                        22,
                        java.awt.Font.BOLD,
                        BaseColor.BLUE
                        )
        );
        // Añadimos el titulo al documento
        documento.add(titulo);
        documento.add(new Paragraph("Ejemplo de Parrafo sencillo:\n"
                + "La química es la ciencia natural que estudia la composición, estructura y propiedades de la materia ya sea en forma de elementos, compuestos, mezclas u otras especies, así como los cambios que esta experimenta durante las reacciones y su relación con la energía química.\n\n"));
        
        System.out.println("Realizando Segunda prueba\n");
        documento.add(new Paragraph("Segunda Prueba\n",
                FontFactory.getFont("arial",
                        20,
                        java.awt.Font.BOLD,
                        BaseColor.GREEN
                        )
        ));
        documento.add(new Paragraph("Ejemplo de lista:\n"));
        for(int i = 0 ; i < 5 ; i++) {
            documento.add(new Paragraph("- objeto"+i+"\n"));
        }
        
        System.out.println("Realizando Tercera Prueba");
        documento.add(new Paragraph("\nTercera Prueba\n",
                FontFactory.getFont("arial",
                        21,
                        java.awt.Font.BOLD,
                        BaseColor.ORANGE
                        )
        ));
        documento.add(new Paragraph("Ejemplo de Tabla:\n\n"));
        
        PdfPTable tabla = new PdfPTable(3);
        tabla.addCell("ID");
        tabla.addCell("NOMBRE");
        tabla.addCell("RESULTADO");
        
        for(int i = 0 ; i < 5 ; i++) {
            tabla.addCell("" + i);
            tabla.addCell("EJEM");
            tabla.addCell("PLO");
        }
        documento.add(tabla);
        
        System.out.println("Realizando Prueba Final");
        documento.add(new Paragraph("\nUltima Prueba\n",
                FontFactory.getFont("arial",
                        21,
                        java.awt.Font.BOLD,
                        BaseColor.RED
                        )
        ));
        documento.add(new Paragraph("Ejemplo de Imagen:\n\n"));

        try
        {
                Image foto = Image.getInstance("GhostofTsushima.jpg");
                foto.scaleToFit(100, 100);
                foto.setAlignment(Chunk.ALIGN_MIDDLE);
                documento.add(foto);
        }
        catch ( Exception e )
        {
                e.printStackTrace();
        }
        // Se cierra el documento
        documento.close();
        System.out.println("-----------Documento Creado-----------");
    }
    
    
}
