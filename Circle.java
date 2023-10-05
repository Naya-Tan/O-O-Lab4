package Naya_Tan_Lab4;

import java.awt.Component;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Circle extends ShapeIcon{
	
	public Circle(int diameter) {
		super(diameter, diameter);
	}

	 @Override
	 public void paintIcon(Component c, Graphics g, int x, int y) {
		 Ellipse2D.Double circle = new Ellipse2D.Double(x, y, width, width);
		 ((Graphics2D) g).draw(circle);	 
	 }

	 @Override
	 public double measure() {
		 return Math.PI * (width/2) * (width/2);
	 }
	
}
