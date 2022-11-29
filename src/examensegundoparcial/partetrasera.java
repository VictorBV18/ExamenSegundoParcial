
package examensegundoparcial;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class partetrasera extends JFrame {

    public JPanel panel;

    public partetrasera() {
        setSize(530, 400);
        setTitle("Parte TRASERA DE UNA INE ");
        setLocationRelativeTo(null);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        PANEL();
        IMAGENES();
        BOTONES();
    }

    private void PANEL() {
        panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setLayout(null);
        this.getContentPane().add(panel);

    }

    private void IMAGENES() {

        ImageIcon imagen = new ImageIcon("inepartetrasera.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(12, 65, 490, 290);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);

    }

    private void BOTONES() {
        JButton boton = new JButton();
        boton.setBounds(200, 0, 60, 60);
        ImageIcon botoncito = new ImageIcon("botoncambio.jpg");
        boton.setIcon(new ImageIcon(botoncito.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH)));
        boton.setBackground(Color.PINK);
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                partedelantera pd = new partedelantera();
                pd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                pd.setVisible(true);

                setVisible(false);

            }
        }
        );
        panel.add(boton);

    }

}
