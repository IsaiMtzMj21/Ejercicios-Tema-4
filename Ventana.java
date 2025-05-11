import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class Ventana extends JFrame {
    public Ventana(String title) throws HeadlessException {
        super(title);
        Dimension d = new Dimension(500, 500);
        this.setSize(d);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(300, 300, 500, 500);
        this.setLocationRelativeTo(null);
    }
}
