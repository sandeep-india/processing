import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_140618d extends PApplet {

    public void setup() {
       size(400, 400);
       stroke(255);
     }
      
     public void draw() {
       line(150, 25, mouseX, mouseY);
     }
     
     public void mousePressed() {
       background(192, 64, 0);
     }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_140618d" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
