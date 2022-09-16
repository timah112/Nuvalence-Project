package com.nuvalence.rectangles;

public class RectangleUtils {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * This method checks if the rectangles passed in have one 
	 * or more intersecting lines. If so, output is true.
	 * 
	 * The algorithm - If the x1 and y1 of rect2 is greater than the x1 and y1 of rect1, 
	 * AND the x2 and y2 of rect2 is less than x2 and y2 of rect 1, then there is an overlap
	 * @param rect1
	 * @param rect2
	 * 
	 * 
	 * 
	 * @return
	 */
	public static boolean doIntersect(Rectangle rect1, Rectangle rect2) {
		return rect1.x1 < rect2.x2 && rect1.y1 < rect2.y2
			&& rect2.x1 < rect1.x2 && rect2.y1 < rect1.y2;
	}
	
	/**
	 * This method checks if the one of the rectangles is contained inside the other.
	 * If so, returns true.
	 * @param rect1
	 * @param rect2
	 * @return
	 */
	public static boolean areContained(Rectangle rect1, Rectangle rect2) {
		return ((rect2.x1 < rect1.x2 && rect2.y2 < rect1.y2
			&& rect2.x2 < rect1.x2 && rect2.y2 < rect1.y2)
			|| (rect1.x2 < rect2.x2 && rect2.x2 > rect2.x1 
			&& rect1.y2 < rect2.y2 && rect1.y2 > rect2.y1
			&& rect1.x2 < rect2.x2 && rect1.x2 > rect2.x1
			&& rect1.y2 < rect2.y2 && rect1.y2 > rect2.y1 ));
	}
	
	
	/**
	 * This method checks if the 2 rectangles are adjacent to each other.
	 * Basically, if they share at-least one side. If so, return true.
	 * If they are 
	 * @param rect1
	 * @param rect2
	 * @return
	 */
	public static boolean areAdjacentSideBySide(Rectangle rect1, Rectangle rect2) {
		return ((rect1.x2 == rect2.x1 && rect2.y1 <= rect1.y2 && rect2.y1 >= rect1.y1)
			|| (rect2.x2 == rect1.x1 && rect2.y2 <= rect1.y2 && rect2.y1 >= rect1.y1)); 
		
		
	}
	

}
