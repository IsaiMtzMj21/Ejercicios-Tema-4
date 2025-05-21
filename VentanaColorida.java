import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaColorida extends JFrame {

    public VentanaColorida(String title) {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(300, 300, 500, 500);
        this.setLocationRelativeTo(null);
        iniciarPaneles();
    }

    protected void iniciarPaneles() {
        JPanel contenedor = new JPanel();
        this.getContentPane().add(contenedor);
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.X_AXIS));

        MiPanel panel1 = new MiPanel(new Color(0, 51, 102));
        MiPanel panel2 = new MiPanel(new Color(0, 102, 255));
        MiPanel panel3 = new MiPanel(new Color(255, 0, 255));

        contenedor.add(panel1);
        contenedor.add(panel2);
        contenedor.add(panel3);
    }
}
