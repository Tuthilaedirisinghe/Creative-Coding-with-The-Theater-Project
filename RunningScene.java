import org.code.theater.*;
import org.code.media.*;

public class RunningScene extends Scene {

  public void drawScene() {
    drawBackground();
    drawText("Scene 1", 100, 100);
    drawPlayer();
    
  }

  private void drawBackground() {
    clear("white");
    drawImage("running2.png", 0, 20, 400); // background;
    drawImage("ball-removebg-preview.png", 230, 250, 15);
    
  }
  
  private void drawPlayer() {
    int playerX = 100;
    while (playerX < 150) {
      drawBackground();
      drawImage("player_67f9a0850778d-(1).png", playerX, 200, 100);
      
      playerX += 10;

      pause(0.1);
    }
  }
}