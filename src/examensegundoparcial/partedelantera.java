
package examensegundoparcial;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class partedelantera extends JFrame {

    public partedelantera() {
        setSize(530, 400);
        setTitle("Parte DELANTERA DE UNA INE ");
        setLocationRelativeTo(null);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public JPanel panel;
    public JButton guardarpdf;
    public JEditorPane editor;
    public JFileChooser seleccionar_archivo;

    public void iniciarComponentes() {
        PANEL();
        TEXTO();
        IMAGENES();
        BOTONES();

    }

    public void PANEL() {
        panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setLayout(null);
        this.getContentPane().add(panel);

    }

    public void IMAGENES() {

        ImageIcon imagen1 = new ImageIcon("fotoine.JPEG");
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setBounds(50, 148, 120, 140);
        etiqueta1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta1);

        ImageIcon imagen3 = new ImageIcon("firma.jpg");
        JLabel etiqueta3 = new JLabel();
        etiqueta3.setBounds(50, 290, 120, 50);
        etiqueta3.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(etiqueta3.getWidth(), etiqueta3.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta3);

        ImageIcon imagen2 = new ImageIcon("credencial.png");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(12, 70, 490, 310);
        etiqueta2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);

    }

    public void TEXTO() {
        String nombre, domicilio, clave, curp, localidad, estado, municipio, emision, vigencia;

        nombre = JOptionPane.showInputDialog("Digite su nombre");
        domicilio = JOptionPane.showInputDialog("Digite su domicilio");
        clave = JOptionPane.showInputDialog("Digite tu clave");
        curp = JOptionPane.showInputDialog("Digite tu curp ");
        localidad = JOptionPane.showInputDialog("Digite el Numero de tu Localidad");
        estado = JOptionPane.showInputDialog("Digite el Numero de tu Estado");
        municipio = JOptionPane.showInputDialog("Digite el Numero de tu Municipio");
        emision = JOptionPane.showInputDialog("Digite el Numero de la Fecha de Emision");
        vigencia = JOptionPane.showInputDialog("Digite el Numero de Vigencia");

        /*JOptionPane.showMessageDialog(null,"El Domicilio es "+domicilio);
        JOptionPane.showMessageDialog(null,"La Clave es "+clave);
        JOptionPane.showMessageDialog(null,"El curp es "+curp);
        JOptionPane.showMessageDialog(null,"El Numero de tu Localidad es "+localidad);
        JOptionPane.showMessageDialog(null,"El Numero de tu Estado es "+estado);
        JOptionPane.showMessageDialog(null,"El Numero de tu Municipio es "+municipio);
        JOptionPane.showMessageDialog(null,"El Numero de Emision es "+emision);
        JOptionPane.showMessageDialog(null,"La fecha de vigencia es "+vigencia);*/
        //ESTO ESTA BIEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEN
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setText(nombre);
        etiqueta1.setBounds(182, 155, 260, 25);
        etiqueta1.setForeground(Color.black);
        etiqueta1.setOpaque(false);
        etiqueta1.setFont(new Font("Montserrat bold", Font.PLAIN, 15));
        panel.add(etiqueta1);

        JLabel etiqueta2 = new JLabel();
        etiqueta2.setText(domicilio);
        etiqueta2.setBounds(182, 192, 290, 25);
        etiqueta2.setForeground(Color.black);
        etiqueta2.setOpaque(false);
        etiqueta2.setFont(new Font("Montserrat bold", Font.PLAIN, 15));
        panel.add(etiqueta2);

        JLabel etiqueta3 = new JLabel();
        etiqueta3.setText(clave);
        etiqueta3.setBounds(292, 216, 160, 25);
        etiqueta3.setForeground(Color.black);
        etiqueta3.setOpaque(false);
        etiqueta3.setFont(new Font("Montserrat bold", Font.PLAIN, 15));
        panel.add(etiqueta3);

        JLabel etiqueta4 = new JLabel();
        etiqueta4.setText(curp);
        etiqueta4.setBounds(216, 245, 170, 25);
        etiqueta4.setForeground(Color.black);
        etiqueta4.setOpaque(false);
        etiqueta4.setFont(new Font("Montserrat bold", Font.PLAIN, 15));
        panel.add(etiqueta4);

        JLabel etiqueta5 = new JLabel();
        etiqueta5.setText(localidad);
        etiqueta5.setBounds(190, 320, 40, 25);
        etiqueta5.setForeground(Color.black);
        etiqueta5.setOpaque(false);
        etiqueta5.setFont(new Font("Montserrat bold", Font.PLAIN, 15));
        panel.add(etiqueta5);

        JLabel etiqueta6 = new JLabel();
        etiqueta6.setText(estado);
        etiqueta6.setBounds(230, 274, 200, 25);
        etiqueta6.setForeground(Color.black);
        etiqueta6.setOpaque(false);
        etiqueta6.setFont(new Font("Montserrat bold", Font.PLAIN, 15));
        panel.add(etiqueta6);

        JLabel etiqueta7 = new JLabel();
        etiqueta7.setText(municipio);
        etiqueta7.setBounds(342, 274, 200, 25);
        etiqueta7.setForeground(Color.black);
        etiqueta7.setOpaque(false);
        etiqueta7.setFont(new Font("Montserrat bold", Font.PLAIN, 15));
        panel.add(etiqueta7);

        JLabel etiqueta8 = new JLabel();
        etiqueta8.setText(emision);
        etiqueta8.setBounds(290, 320, 200, 25);
        etiqueta8.setForeground(Color.black);
        etiqueta8.setOpaque(false);
        etiqueta8.setFont(new Font("Montserrat bold", Font.PLAIN, 15));
        panel.add(etiqueta8);

        JLabel etiqueta9 = new JLabel();
        etiqueta9.setText(vigencia);
        etiqueta9.setBounds(377, 320, 200, 25);
        etiqueta9.setForeground(Color.black);
        etiqueta9.setOpaque(false);
        etiqueta9.setFont(new Font("Montserrat bold", Font.PLAIN, 15));
        panel.add(etiqueta9);

    }

    public void BOTONES() {
        JButton boton = new JButton();
        boton.setBounds(50, 0, 60, 60);
        ImageIcon botoncito = new ImageIcon("botoncambio.jpg");
        boton.setIcon(new ImageIcon(botoncito.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH)));
        boton.setBackground(Color.PINK);
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                partetrasera pd = new partetrasera();
                pd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                pd.setVisible(true);

                setVisible(false);

            }
        });
        panel.add(boton);

        JButton boton1 = new JButton();
        boton1.setBounds(120, 0, 60, 60);
        ImageIcon botoncito2 = new ImageIcon("boton pdf.jpg");
        boton1.setIcon(new ImageIcon(botoncito2.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));
        boton1.setBackground(Color.PINK);
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                
              Document document = new Document();
              

              
              
              try {
                    PdfWriter writer = PdfWriter.getInstance(document,
                            new FileOutputStream("INE.pdf"));

                    document.open();

                    PdfContentByte cb = writer.getDirectContent();
                    Graphics g = cb.createGraphicsShapes(PageSize.LETTER.getWidth(), PageSize.LETTER.getHeight());              
                    
                } catch (DocumentException de) {
                    System.err.println(de.getMessage());
                } catch (FileNotFoundException ex) {
                    System.err.println(ex.getMessage());
                }
                document.close();

                JOptionPane.showMessageDialog(null, "Se CREO EL PDF CON LA INE ");

            }
        });
        panel.add(boton1);

    }

  
    public static void main(String[] args) {
        partedelantera cd = new partedelantera();
        cd.setVisible(true);

    }

}
