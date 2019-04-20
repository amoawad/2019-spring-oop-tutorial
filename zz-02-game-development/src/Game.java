import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import javax.swing.plaf.synth.SynthProgressBarUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Game extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600);

        Canvas canvas = new Canvas(600, 600);
        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        Sprite hero = new Sprite(new Image("hero.png"));
        hero.render(gc);

        Random random = new Random();
        List<Sprite> gems = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            Sprite gem = new Sprite(new Image("gem.png"));
            gem.setPositionX(100 + random.nextDouble() * 400);
            gem.setPositionY(100 + random.nextDouble() * 400);

            gems.add(gem);
            gem.render(gc);
        }

        List<String> inputs = new ArrayList<>();

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                String code = event.getCode().toString();
                if(!inputs.contains(code)) {
                    inputs.add(code);
                }
            }
        });

        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                inputs.remove(event.getCode().toString());
            }
        });

        new AnimationTimer() {

            @Override
            public void handle(long now) {

                // process input & change game state
                if(inputs.contains("RIGHT")) {
                    hero.addDeltaX(1);
                } else if (inputs.contains("LEFT")) {
                    hero.addDeltaX(-1);
                } else if (inputs.contains("UP")) {
                    hero.addDeltaY(-1);
                } else if (inputs.contains("DOWN")) {
                    hero.addDeltaY(1);
                }
                hero.update();

                Iterator<Sprite> iterator = gems.iterator();
                while(iterator.hasNext()) {
                    Sprite gem = iterator.next();
                    if(hero.intersects(gem)) {
                        iterator.remove();
                    }
                }

                // render
                gc.clearRect(0, 0, 600, 600);
                hero.render(gc);

                for(Sprite gem : gems) {
                    gem.render(gc);
                }
            }

        }.start();

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
