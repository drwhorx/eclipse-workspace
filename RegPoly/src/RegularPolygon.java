
public class RegularPolygon {
	private int sides;
	private double length;
	/**
	 * Creates a Regular Polygon object
	 * @param s State an {@code int} number of sides
	 * @param l State an {@code int} side length
	 * @return void
	 */
	public RegularPolygon(int s, double l) {
		sides = s;
		length = l;
	}
	/**
	 * Get the number of sides in a Regular Polygon object
	 * @return {@code int}
	 */
	public int getSides() {
		return sides;
	}
	/**
	 * Get the side lengths of a Regular Polygon object
	 * @return {@code int}
	 */
	public double getSideLength() {
		return length;
	}
	/**
	 * Set the side lengths of a Regular Polygon object
	 * @param l State an {@code int} side length
	 */
	public void setSideLength(int l) {
		length = l;
	}
	/**
	 * Get the perimeter of a Regular Polygon object
	 * @return {@code int}
	 */
	public double getPerimeter() {
		return sides * length;
	}
	/**
	 * Get the apothem of a Regular Polygon object
	 * @return {@code double}
	 */
	public double getApothem() {
		double tan = Math.tan(Math.PI / sides);
		double apothem = length / (2 * tan);
		return apothem;
	}
	/**
	 * Get the area of a Regular Polygon object
	 * @return  {@code double}
	 */
	public double getArea() {
		double apothem = this.getApothem();
		double perimeter = this.getPerimeter();
		double num = apothem * perimeter;
		return num / 2;
	}
	/**
	 * Get the radius of a Regular Polygon object
	 * @return {@code double}
	 */
	public double getRadius() {
		double rad = Math.toRadians(180 / sides);
		double sin = Math.sin(rad);
		double radius = length / (2*sin);
		return radius;
	}
}
