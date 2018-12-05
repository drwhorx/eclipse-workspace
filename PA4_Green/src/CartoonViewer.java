import javax.swing.JFrame;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Dimension;

public class CartoonViewer {
    public static void main(String[] args) {
        Image img = new ImageIcon("image.png").getImage();
        Dimension d = new Dimension();
        d.width = img.getWidth(null);
        d.height = img.getHeight(null);
        System.out.println(d);
        JFrame frame = new JFrame();
        frame.setSize((d.width), (d.height));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CartoonComponent component = new CartoonComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}