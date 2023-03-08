import javax.swing.*;
import java.awt.*;

public class Gui00 {
    public Gui00() {

        //constantes y componentes (objetos)
        JMenuBar menubar;
        JFrame fr = new JFrame("Menú");
        Container panel = fr.getContentPane();
        JPanel p = new JPanel();
        JButton boton = null;
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new GridLayout(2, 2));

        /*for(int i = 0; i<= 3; i++){
            panel.add(new JButton("Media Aritmética"));
            panel.add(new JButton("Media Ponderada"));
            panel.add(new JButton("Media Armónica"));
            panel.add(new JButton("Media Geométrica"));

        }*/

        panel.add(new JButton("Media Aritmética"));
        panel.add(new JButton("Media Ponderada"));
        panel.add(new JButton("Media Armónica"));
        panel.add(new JButton("Media Geométrica"));

        p.setLayout(new BorderLayout());
        p.add(new JTextField("Ingrese la población o muestra"), BorderLayout.NORTH);
        panel.add(p, BorderLayout.CENTER);
        fr.add(p, BorderLayout.EAST);
        fr.add(new Button("aqui la población o muestra"), BorderLayout.CENTER);
        fr.setSize(400, 250);
        fr.setVisible(true);
        //configurar componentes y añadirlos al panel del frame
        fr.pack();
        fr.setVisible(true);

    }

    public static void main(String[] args) {
        Gui00 aplicacion = new Gui00();
    }
}
