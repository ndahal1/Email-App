import java.awt.*;
public class Car {
 
   final static Color purple = new Color(180, 0, 255);
 
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(500, 300);
   
   //panel.setGridLines(true);
      panel.setBackground(Color.LIGHT_GRAY);
   
      Graphics graphics = panel.getGraphics();
   //  for (;true;) {
      while(true) {
         for (int i=1; i<=16; i++) {
         
            drawTruck(graphics, 10+30*(i-1)); 
            panel.sleep(50);
            eraseTruck(graphics, 10+30*(i-1));
         }
      }
   //  }
   }
 
   public static void eraseTruck(Graphics g, int x_position) {
      g.setColor(Color.LIGHT_GRAY);
      g.fillRect(x_position, 30, 100, 70);
   }
 
   public static void drawTruck(Graphics g, int x_position) {
      g.setColor(purple);
   
   // draw car body
      g.fillRect(/*10*/x_position, 30, 100, 50);
   
   // draw wheels
      g.setColor(Color.RED);
      g.fillOval(/*20*/x_position+10, 70, 20, 20);
      g.fillOval(/*80*/x_position+70, 70, 20, 20);
   
   // draw windshield
      g.setColor(Color.CYAN);
      g.fillRect(/*80*/x_position+70, 40, 30, 20);  
   }
}