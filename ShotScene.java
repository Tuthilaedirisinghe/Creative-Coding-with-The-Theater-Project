import org.code.theater.*;
import org.code.media.*;

public class ShotScene extends Scene {

  public void drawScene() {
    drawBackground();
    drawText("Scene 2", 100, 100);
    drawBall();
    pause(0.1);
}

  private void drawBackground() {
    clear("white");
    drawImage("shot.png",0, 100, 400); // background;
  }

  
  private void drawBall() {
    int ballX = 200;
    int ballY = 250;
    int size = 30;
    while (ballX > 100) {
    
      drawBackground();
      
      drawImage("ball-removebg-preview.png", ballX, ballY, size);
      ballX -= 10;
      ballY -= 10;
      size -= 2;
      pause(0.1);
      
    }
  }
}