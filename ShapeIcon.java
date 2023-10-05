package Naya_Tan_Lab4;

import javax.swing.*;

public abstract class ShapeIcon implements Icon, Measurable {
	 int width;
	 int height;

	 public ShapeIcon(int width, int height) {
	      this.width = width;
	      this.height = height;
	 }

	  // Icon Interface Methods
	  @Override
	  public int getIconWidth() {
	      return width;
	  }

	  @Override
	  public int getIconHeight() {
	      return height;
	  }
	    
	 
}
