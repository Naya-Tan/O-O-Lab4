package Naya_Tan_Lab4;

import javax.swing.*;

public class Tester {
	
	 public static void main(String[] args){
		 JFrame frame = new JFrame("Shapes");
		 
		 ShapeIcon[] shapes = {new Circle(50), 
				 		      new Triangle(100, 50), 
				              new Rectangle(100, 80),
				              new Rectangle(200, 80),
				              new Circle(100)
				              };
		
		 SizePanel panel = new SizePanel(shapes);
		
		 frame.add(panel);
         frame.setSize(800, 400);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
		 
	 }

}
