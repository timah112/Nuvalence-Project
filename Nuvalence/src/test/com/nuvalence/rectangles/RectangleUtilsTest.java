package test.com.nuvalence.rectangles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.nuvalence.rectangles.Rectangle;
import com.nuvalence.rectangles.RectangleUtils;

class RectangleUtilsTest {
	static RectangleUtils rect;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		rect = new RectangleUtils();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Positive Test case where Rect2 intersects within rect1
	 */
	@Test
	void testDoIntersect() {
		Rectangle rect1 = new Rectangle(0,0,4,4);
		Rectangle rect2 = new Rectangle(1,1,5,5);
		assertTrue(RectangleUtils.doIntersect(rect1, rect2));
	}
	
	/**
	 * Positive Test where Rectangle 1 intersects with rectangle 2.
	 */
	@Test
	void testDoIntersect2() {
		Rectangle rect1 = new Rectangle(4,4,7,7);
		Rectangle rect2 = new Rectangle(0,0,6,6);
		assertTrue(RectangleUtils.doIntersect(rect1, rect2));
	}
	
	/**
	 * Negative Test where Rectangle 1 intersects with rectangle 2.
	 */
	@Test
	void testDoIntersectNegative() {
		Rectangle rect1 = new Rectangle(4,4,8,8);
		Rectangle rect2 = new Rectangle(8,8,12,12);
		assertFalse(RectangleUtils.doIntersect(rect1, rect2));
	}

	@Test
	void testAreContained() {
		Rectangle rect1 = new Rectangle(0,0,8,8);
		Rectangle rect2 = new Rectangle(2,2,5,5);
		assertTrue(RectangleUtils.areContained(rect1, rect2));
	}
	
	@Test
	void testAreContained2() {
		Rectangle rect1 = new Rectangle(2,2,4,4);
		Rectangle rect2 = new Rectangle(0,0,8,8);
		assertTrue(RectangleUtils.areContained(rect1, rect2));
	}
	
	/**
	 * Negative Test to see if the tests are contained within one another
	 * Should return false.
	 */
	@Test
	void testAreContainedNegative() {
		Rectangle rect1 = new Rectangle(0,0,8,8);
		Rectangle rect2 = new Rectangle(9,9,12,12);
		assertFalse(RectangleUtils.areContained(rect1, rect2));
	}

	@Test
	void testAreAdjacentSideBySide() {
		Rectangle rect1 = new Rectangle(0,0,4,4);
		Rectangle rect2 = new Rectangle(4,2,8,3);
		assertTrue(RectangleUtils.areAdjacentSideBySide(rect1, rect2));
	}
	
	@Test
	void testAreAdjacentSideBySideNegative() {
		Rectangle rect1 = new Rectangle(0,0,4,4);
		Rectangle rect2 = new Rectangle(5,2,8,3);
		assertFalse(RectangleUtils.areAdjacentSideBySide(rect1, rect2));
	}

}
