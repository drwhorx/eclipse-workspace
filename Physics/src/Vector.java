import java.awt.Point;

public class Vector {
	private double vx, vy, v, d, r;

	public Vector(Point pnt) {
		vx = pnt.getX();
		vy = pnt.getY();
		v = Math.sqrt((vx * vx) + (vy * vy));
		r = Math.atan(vy / vx);
		d = Math.toDegrees(r);
	}

	public Vector(double x, double y) {
		vx = x;
		vy = y;
		v = Math.sqrt((vx * vx) + (vy * vy));
		r = Math.atan(vy / vx);
		d = Math.toDegrees(r);
	}

	public Vector(Vector vec) {
		vx = vec.vx;
		vy = vec.vy;
		v = vec.v;
		r = vec.r;
		d = vec.d;
	}

	public Vector() {
		vx = 0;
		vy = 0;
		v = 0;
		r = 0;
		d = 0;
	}

	public void addVector(Vector vec) {
		this.vx += vec.vx;
		this.vy += vec.vy;
		this.v = Math.sqrt((vx * vx) + (vy * vy));
		r = Math.atan(vy / vx);
		d = Math.toDegrees(r);
	}

	public double vx() {
		return vx;
	}

	public double vy() {
		return vy;
	}

	public double v() {
		return v;
	}

	public double r() {
		return r;
	}

	public double d() {
		return d;
	}

	public void setVX(double vx) {
		this.vx = vx;
	}

	public void setVY(double vy) {
		this.vy = vy;
	}

	public void setV(double v) {
		this.v = v;
		vx = v * Math.cos(r);
		vy = v * Math.sin(r);
	}

	public void setR(double r) {
		this.r = r;
		vx = v * Math.cos(r);
		vy = v * Math.sin(r);
		d = Math.toDegrees(r);
	}

	public void setD(double d) {
		this.d = d;
		r = Math.toRadians(d);
		vx = v * Math.cos(r);
		vy = v * Math.sin(r);
	}
}
