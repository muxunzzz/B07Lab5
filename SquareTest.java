package B07Lab5
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void testPerimeter() {
		Point a = new Point(3,5);
		double length l = 5;
		assertEquals(20.0, a.perimeter());
	}
	
	@Test
	void testArea() {
		Point a = new Point(3,5);
		double length l = 5;
		assertEquals(25.0, a.area());
	}
}
