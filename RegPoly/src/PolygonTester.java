
public class PolygonTester {
	public static void main(String[] args) {
		RegularPolygon poly = new RegularPolygon(5, 4);
		System.out.println(poly.getApothem());
		System.out.println(poly.getPerimeter());
		System.out.println(poly.getSideLength());
		System.out.println(poly.getSides());
		System.out.println(poly.getArea());
		System.out.println(poly.getRadius());
	}
}
