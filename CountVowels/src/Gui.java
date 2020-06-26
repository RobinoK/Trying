import javax.swing.*;
import java.awt.*;

public class Gui {

    private JTextField pole;
    private JButton tlacitko;
    private JPanel panel1, panel2, okeni;

        private Gui() {
            //super("Count vowels");
            //okeni = new JPanel();
            JFrame frame = new JFrame("Nove okno");
            GridLayout layout = new GridLayout(2, 0);
            frame.setLayout(layout);


            panel1 = new JPanel();
            frame.add(panel1);


            panel2 = new JPanel();
            frame.add(panel2);



            pole = new JTextField("Zadej slovo");
            pole.setPreferredSize(new Dimension(100,40));
            panel1.add(pole);
            tlacitko = new JButton("Odešli");
            panel2.add(tlacitko);

            frame.setVisible(true);
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            //frame.pack();

        }
        public static void main(String[]args){

            Gui okno = new Gui();



        }
}
