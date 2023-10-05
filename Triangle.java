package Naya_Tan_Lab4;

import java.awt.Component;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


public class Triangle extends ShapeIcon {
	
	 public Triangle(int base, int height) {
	        super(base, height);
	    }

	    @Override
	    public void paintIcon(Component c, Graphics g, int x, int y) {
	    	// vertex a 
	    	Point2D.Double va = new Point2D.Double(x, y);
	    	
	    	// vertex b 
	    	Point2D.Double vb = new Point2D.Double(x + width, y);
	        
	    	// vertex c 
	    	Point2D.Double vc = new Point2D.Double(x + width / 2, y + height);
	    	
	    	// draw lines to connect the vertices 
	    	Line2D.Double a_b = new Line2D.Double(va, vb);
	    	Line2D.Double b_c = new Line2D.Double(vb, vc);
	    	Line2D.Double c_a = new Line2D.Double(vc, va);
	    	
	        
	        ((Graphics2D) g).draw(a_b);
	        ((Graphics2D) g).draw(b_c);
	        ((Graphics2D) g).draw(c_a);
	    }

	    @Override
	    public double measure() {
	        return 0.5 * width * height;
	    }

}
