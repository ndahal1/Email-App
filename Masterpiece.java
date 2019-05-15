//Student Name: Nischal Dahal
//CSC 1301- Fall 2017
//Programming Assignment 4
//Due: 10/17/2017

import java.awt.*;

public class Masterpiece{
   public static void main(String[] args){
      DrawingPanel panel = new DrawingPanel(600, 300);
      panel.setBackground(Color.DARK_GRAY);
      Graphics g = panel.getGraphics();
      prism(g);
      lightRays(g);
      albumCover(g);
      fullMoon(g);  
      
   }
   public static void lightRays(Graphics g){
      for (int i=1; i<=7; i++){
         if(i == 1){
            g.setColor(Color.RED);
         }else if(i == 2){
            g.setColor(Color.ORANGE);
         }else if(i == 3){
            g.setColor(Color.YELLOW);
         }else if(i == 4){
            g.setColor(Color.GREEN);
         }else if(i == 5){
            g.setColor(Color.BLUE);
         }else if(i == 6){
            g.setColor(Color.CYAN);
         }else if(i == 7){
            g.setColor(Color.MAGENTA);
         }
         
         g.drawLine(10, 160, 420, 15 + 10*i);
         
         //g.setColor(Color.RED);
         //g.setColor(Color.ORANGE);
         //g.setColor(Color.YELLOW);
         //g.setColor(Color.GREEN);
         //g.setColor(Color.BLUE);
         //g.setColor(Color.CYAN);
         //g.setColor(Color.MAGENTA);
      }
      
   }
   
   
      // g.setColor(Color.RED);
      // g.drawLine(10,160,420,15);
      // g.setColor(Color.ORANGE);
      // g.drawLine(10,160,420,25);
      // g.setColor(Color.YELLOW);
      // g.drawLine(10,160,420,35);
      // g.setColor(Color.GREEN);
      // g.drawLine(10,160,420,45);
      // g.setColor(Color.BLUE);
      // g.drawLine(10,160,420,55);
      // g.setColor(Color.CYAN);
      // g.drawLine(10,160,420,65);
      // g.setColor(Color.MAGENTA);
      // g.drawLine(10,160,420,75);
   
   public static void prism(Graphics g){
      g.setColor(Color.BLACK);
      Polygon poly = new Polygon();
      poly.addPoint(110, 180);
      poly.addPoint(185, 20);
      poly.addPoint(270, 180);
      g.fillPolygon(poly);
      g.setColor(Color.RED);
      g.drawPolygon(poly);
   }
   
   public static void albumCover(Graphics g){
      g.setColor(Color.RED);
      g.drawString("PINK FLOYD: DARK SIDE OF THE MOON", 80, 220);
      
   }
   
   public static void fullMoon(Graphics g){
      g.setColor(Color.YELLOW);
      g.fillOval(475,30, 70, 70);
   }      
}