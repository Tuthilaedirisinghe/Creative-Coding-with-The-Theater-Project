import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    RunningScene scene1 = new RunningScene();
    ShotScene scene2 = new ShotScene();
    GoalieScene scene3 = new GoalieScene();
    VictoryScene scene4 = new VictoryScene();

    scene1.drawScene();
    scene2.drawScene();
    scene3.drawScene();
    scene4.drawScene();

    Theater.playScenes(scene1, scene2, scene3, scene4);
    
  }
}