package Naya_Tan_Lab4;

import java.awt.Component;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.Rectangle2D;

public class Rectangle extends ShapeIcon {

	public Rectangle(int width, int height) {
		super(width, height);
	}

	 @Override
	 public void paintIcon(Component c, Graphics g, int x, int y) {
	    Rectangle2D.Double rectangle = new Rectangle2D.Double(x, y, width, width);
	    ((Graphics2D) g).draw(rectangle);
	 }

	 @Override
	 public double measure() {
		 return width * height;
	 }
}
