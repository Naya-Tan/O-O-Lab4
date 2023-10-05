package Naya_Tan_Lab4;

import javax.swing.*;
import java.awt.*;

public class SizePanel extends JPanel {

	 private final ShapeIcon[] shapes;
	 
	    public SizePanel(ShapeIcon[] shapes) {
	    	this.shapes = shapes;
	        //use the measure method to sort from largest to smallest
	        // bubble sort 
	        boolean swapped;
	        do {
	            swapped = false;
	            for (int i = 1; i < this.shapes.length; i++) {
	            	if (this.shapes[i-1].measure() < this.shapes[i].measure()) {
	            	    ShapeIcon temp = this.shapes[i-1];
	            	    this.shapes[i-1] = this.shapes[i];
	            	    this.shapes[i] = temp;
	            	    swapped = true;
	            	}
	            }
	        } while (swapped);     
	        
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        int x = 0;  
	        int y = 0;  
	        for (int i = 0; i < shapes.length; i++) {
	            ShapeIcon shape = shapes[i];
	            shape.paintIcon(this, g, x, y);
	            // adding space in between the shapes 
	            x += shape.getIconWidth() + 20;  
	        }
	    }
	    
	    
	
}
