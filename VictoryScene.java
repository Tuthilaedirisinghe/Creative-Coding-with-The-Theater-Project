import org.code.theater.*;
import org.code.media.*;

public class VictoryScene extends Scene {

  public void drawScene() {
    clear("white");
    drawText("2008 Champions League Winners!!!", 50, 100);
    drawImage("Victory.jpeg",0, 100, 400); // background;

    pause(2);
}
}