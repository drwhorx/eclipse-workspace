import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;
import java.awt.image.BufferedImage;
import java.awt.geom.Point2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.BevelBorder;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CartoonComponent extends JComponent {
	public JPopupMenu popup;

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		/*
		 * Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 100, 150); g2.draw(head);
		 * 
		 * // Draw a rectangle and fill it with color g2.setColor(Color.GREEN);
		 * Rectangle eye = new Rectangle(25, 70, 15, 15); g2.fill(eye);
		 * 
		 * // Draw a red line Line2D.Double mouth = new Line2D.Double(30, 110, 80, 110);
		 * g2.setColor(Color.RED); g2.draw(mouth);
		 * 
		 * // Draw a greeting message g2.setColor(Color.BLUE);
		 * g2.drawString("Hello, World!", 5, 175);
		 */
		popup = new JPopupMenu();
		ActionListener menuListener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("Popup menu item [" + event.getActionCommand() + "] was pressed.");
			}
		};
		JMenuItem item;
	}
}