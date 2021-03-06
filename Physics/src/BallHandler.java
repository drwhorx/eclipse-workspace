import java.awt.*;
import java.util.Formatter;
import javax.swing.*;

public class BallHandler extends JPanel {
	private java.util.List<Ball> shapes = new java.util.ArrayList<Ball>();

	public BallHandler() {
		Thread thread = new Thread() {
			public void run() {
				while (true) {
					for (Ball s : shapes) {
						if (((s.x + (s.v.vx() * (1.0 / 60))) >= (s.width - s.diam)
								|| (s.x + (s.v.vx() * (1.0 / 60))) <= 0)) {
							if ((s.x <= 0 && -s.v.vx() >= 0) || (s.x >= (s.width - s.diam) && -s.v.vx() <= 0)) {
								s.v.setVX(-0.8 * s.v.vx());
							}
						}
						if ((s.y + (s.v.vy() * (1.0 / 60))) >= (s.height - (2 * s.diam))
								|| (s.y + (s.v.vy() * (1.0 / 60))) <= 0) {
							s.v.setVY(-(0.6 * s.v.vy()));
							s.v.setVX(0.8 * s.v.vx());
						} else {
							s.v.setVY(s.v.vy() + (s.a.vy() * (1.0 / 60)));
						}
						for (Ball c : shapes) {
							if (s.collide(c) && s != c) {
								Vector v1 = new Vector((c.x + (c.diam / 2)) - (s.x + (s.diam / 2)), (c.y + (c.diam / 2)) - (s.y + (s.diam / 2)));
								Vector v2 = new Vector((s.x + (s.diam / 2)) - (c.x + (c.diam / 2)), (s.y + (s.diam / 2)) - (c.y + (c.diam / 2)));
								System.out.println(v2.vx() + ", " + v2.vy());
								v1.setVX((c.x + (c.diam / 2.0)));
								v2.setVX((s.x + (s.diam / 2.0)));
								v1.setVY((s.y + (s.diam / 2.0)));
								v2.setVY((c.y + (c.diam / 2.0)));
								v1.setD(v1.d() - 90);
								v2.setD(v2.d() - 90);
								s.v.setVX(v1.vx());
								c.v.setVX(v2.vx());
								s.v.setVY(v1.vy());
								c.v.setVY(v2.vy());
							}
						}
						s.x += (s.v.vx() * (1.0 / 60));
						s.y += (s.v.vy() * (1.0 / 60));
						repaint();
					}
					try {
						Thread.sleep((long) (1000 / 60));
					} catch (InterruptedException ex) {
					}
				}
			}
		};
		thread.start();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Ball s : shapes) {
			g.setColor(Color.BLUE);
			g.fillOval((int) s.x, (int) s.y, 20, 20);
		}
	}

	public void addBall(int x0, int y0, double v0x, double v0y) {
		shapes.add(new Ball(x0, y0, v0x, v0y, 0, 0));
	}
}
