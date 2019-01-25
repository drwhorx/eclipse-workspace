import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.Serializable;

import static java.lang.Math.*;
import javax.swing.*;

public class Test1 extends JPanel implements KeyListener, Serializable {
	double[][] nodes = { { -1, -1, -1 }, { -1, -1, 1 }, { -1, 1, -1 }, { -1, 1, 1 }, { 1, -1, -1 }, { 1, -1, 1 },
			{ 1, 1, -1 }, { 1, 1, 1 } };

	int[][] edges = { { 0, 1 }, { 1, 3 }, { 3, 2 }, { 2, 0 }, { 4, 5 }, { 5, 7 }, { 7, 6 }, { 6, 4 }, { 0, 4 },
			{ 1, 5 }, { 2, 6 }, { 3, 7 } };

	public Test1() {
		setPreferredSize(new Dimension(640, 640));
		setBackground(Color.white);

		scale(100);
		rotateCube(PI / 4, atan(sqrt(2)));
	}

	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		System.out.println(code);
		if (code == 39) {
			rotateCube(PI / 45, 0);
			repaint();
		} else if (code == 37) {
			rotateCube(PI / -45, 0);
			repaint();
		}
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}
	
	final void scale(double s) {
		for (double[] node : nodes) {
			node[0] *= s;
			node[1] *= s;
			node[2] *= s;
		}
	}

	final void rotateCube(double angleX, double angleY) {
		double sinX = sin(angleX);
		double cosX = cos(angleX);

		double sinY = sin(angleY);
		double cosY = cos(angleY);

		for (double[] node : nodes) {
			double x = node[0];
			double y = node[1];
			double z = node[2];

			node[0] = x * cosX - z * sinX;
			node[2] = z * cosX + x * sinX;

			z = node[2];

			node[1] = y * cosY - z * sinY;
			node[2] = z * cosY + y * sinY;
		}
	}

	void drawCube(Graphics2D g) {
		g.translate(getWidth() / 2, getHeight() / 2);

		for (int[] edge : edges) {
			double[] xy1 = nodes[edge[0]];
			double[] xy2 = nodes[edge[1]];
			g.drawLine((int) round(xy1[0]), (int) round(xy1[1]), (int) round(xy2[0]), (int) round(xy2[1]));
		}

		for (double[] node : nodes)
			g.fillOval((int) round(node[0]) - 4, (int) round(node[1]) - 4, 8, 8);
	}

	@Override
	public void paintComponent(Graphics gg) {
		super.paintComponent(gg);
		Graphics2D g = (Graphics2D) gg;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		drawCube(g);
	}
}